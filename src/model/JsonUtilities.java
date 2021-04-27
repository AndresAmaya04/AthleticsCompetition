package model;

import org.json.simple.DeserializationException;
import org.json.simple.JsonArray;
import org.json.simple.JsonObject;
import org.json.simple.Jsoner;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class JsonUtilities {

    private static Gender extractGender(String genderString){
        Gender gender =null;
        switch (genderString){
            case ModelConstants.FEMALE_STRING:
                gender = Gender.FEMALE;
                break;
            case ModelConstants.MALE_STRING:
                gender = Gender.MALE;
                break;
        }
        return gender;
    }

    private static LocalDate getLocalDate(String s){
        String[] camps = s.split("/");
        return LocalDate.of(Integer.parseInt(camps[2]), Integer.parseInt(camps[0]), Integer.parseInt(camps[1]));
    }

    private static LocalTime convertToLocalTime(String s){
        String[] parts = s.split(":");
        return LocalTime.of(0, Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
    }

    public static ArrayList<Competitor> readJson(String fileJson){
        ArrayList<Competitor> competition = new ArrayList<>();
        JsonArray list;
        try {
            list = (JsonArray) Jsoner.deserialize(new FileReader(fileJson));
            for (int i=0; i<list.size(); i++){
                JsonObject temp =(JsonObject) list.get(i);
                Competitor competitor = new Competitor(i+1, (String) temp.get(ModelConstants.NAME), (String) temp.get(ModelConstants.LAST_NAME), (String) temp.get(ModelConstants.COUNTRY),
                        extractGender((String) temp.get(ModelConstants.GENDER)),getLocalDate((String) temp.get(ModelConstants.DATE)), getCompetence(obtainCompetence(i, ModelConstants.PATH_COMPETENCES)));
                competition.add(completeScoreCompetitor(competitor, temp.getInteger(ModelConstants.METERS), (String) temp.get(ModelConstants.TIME)));
            }
        } catch (DeserializationException | IOException e) {
            e.printStackTrace();
        }
        return competition;
    }

    private static Competitor completeScoreCompetitor(Competitor competitor, int meters, String time){
        switch (competitor.getCompetence().getNameCompetence()){
            case ModelConstants.METERS_100:
            case ModelConstants.METERS_200:
            case ModelConstants.METERS_400:
            case ModelConstants.METERS_100_HURDELS:
            case ModelConstants.METERS_200_HURDELS:
            case ModelConstants.METERS_400_HURDELS:
                competitor.setTimeResult(convertToLocalTime(time));
                break;
            default:
                competitor.setMeterResult(meters);
        }
        return competitor;
    }

    private static int obtainCompetence(int index, String pathJson) throws IOException, DeserializationException {
        JsonArray array = (JsonArray)  Jsoner.deserialize(new FileReader(pathJson));
        JsonObject temp = (JsonObject) array.get(index);
        return temp.getInteger(ModelConstants.COMPETENCE);
    }

    private static Competence getCompetence(int index){
        Competence competence = null;
        switch (index){
            case 1:
                competence = new TrackCompetence(Distance.METERS_100.getDistance());
                break;
            case 2:
                competence = new TrackCompetence(Distance.METERS_200.getDistance());
                break;
            case 3:
                competence = new TrackCompetence(Distance.METERS_400.getDistance());
                break;
            case 4:
                competence = new TrackCompetence(Distance.METERS_100_HURDLES.getDistance());
                break;
            case 5:
                competence = new TrackCompetence(Distance.METERS_200_HURDLES.getDistance());
                break;
            case 6:
                competence = new TrackCompetence(Distance.METERS_400_HURDLES.getDistance());
                break;
            case 7:
                competence = new JumpCompetence(JumpType.TRIPLE_JUMP.getJumpType());
                break;
            case 8:
                competence = new JumpCompetence(JumpType.LONG_JUMP.getJumpType());
                break;
            case 9:
                competence = new ThrowCompetence(ThrowType.DISK.getObjectToThrow());
                break;
            case 10:
                competence = new ThrowCompetence(ThrowType.JAVELIN.getObjectToThrow());
                break;
            case 11:
            default:
                competence = new ThrowCompetence(ThrowType.HAMMER.getObjectToThrow());
                break;
        }
        return competence;
    }

    public static void main(String[] args) {
        JsonUtilities.readJson(ModelConstants.PATH_JSON);
    }
}
