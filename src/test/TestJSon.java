package test;

import jdk.nashorn.internal.parser.JSONParser;
import model.Competitor;
import model.Gender;
import org.json.simple.DeserializationException;
import org.json.simple.JsonArray;
import org.json.simple.JsonObject;
import org.json.simple.Jsoner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class TestJSon {

    public static Gender extractGender(String s){
        Gender gender =null;
        switch (s){
            case "Female":
                gender = Gender.FEMALE;
                break;
            case "Male":
                gender = Gender.MALE;
                break;
        }
        return gender;
    }

    public static LocalDate getLocalDate(String s){
      String[] camps = s.split("/");
      return LocalDate.of(Integer.parseInt(camps[2]), Integer.parseInt(camps[0]), Integer.parseInt(camps[1]));
    }


    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Competitor> competitors = new ArrayList();
        JsonArray list;
        try {
            //int dorsal, String name, String lastName, String delegation,Gender gender, LocalDate dateOfBirth, Competence competence
            list = (JsonArray) Jsoner.deserialize(new FileReader("resources/prueba.json"));
            for (int i=0; i<list.size(); i++){
                JsonObject temp = (JsonObject) list.get(i);
                competitors.add(new Competitor(i+1, (String) temp.get("first_name"), (String) temp.get("last_name"), (String) temp.get("country"),
                        extractGender((String) temp.get("gender")), getLocalDate((String) temp.get("date_birth")), null));
            }

            for (int i=0; i<competitors.size(); i++){
                System.out.println(Arrays.toString(competitors.get(i).getCompetitorInfoForSearch()));
            }
        } catch (DeserializationException | IOException e) {
            e.printStackTrace();
        }
    }
}
