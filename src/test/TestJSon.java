package test;

import jdk.nashorn.internal.parser.JSONParser;
import model.AthleticsCompetition;
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
        ArrayList<Competitor> competition = new ArrayList<>();
        JsonArray list;
        try {
            list = (JsonArray) Jsoner.deserialize(new FileReader("resources/prueba.json"));
            for (int i=0; i<list.size(); i++){
                JsonObject temp =(JsonObject) list.get(i);
                competition.add(new Competitor(i+1, (String) temp.get("first_name"), (String) temp.get("last_name"), (String) temp.get("country"),
                        extractGender((String) temp.get("gender")),getLocalDate((String) temp.get("date_birth")), null));
            }
            for (int i=0; i<competition.size(); i++){
                System.out.println(Arrays.toString(competition.get(i).getCompetitorInfoForTest()));
                System.out.println(obtainCompetence(i));
            }
        } catch (DeserializationException | IOException e) {
            e.printStackTrace();
        }
    }

    public static int obtainCompetence(int index) throws IOException, DeserializationException {
            JsonArray array = (JsonArray)  Jsoner.deserialize(new FileReader("resources/competenceJson.json"));
            JsonObject temp = (JsonObject) array.get(index);
            return temp.getInteger("competence");
    }
}
