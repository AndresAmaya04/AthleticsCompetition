package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class AthleticsCompetition {

    private ArrayList<Delegation> delegations;

    public AthleticsCompetition() {
        this.delegations= new ArrayList();
        generateDelegations();
    }

    public void fillDelegations(ArrayList<Competitor> competitors){
        for (int i=0; i<competitors.size(); i++){
            addCompetitor(competitors.get(i));
        }
    }

    public void showDelegations(){
        for (int i=0; i<delegations.size(); i++){
            
        }
    }

    private void generateDelegations(){
        for (int i=0; i<ModelConstants.delegationsNames.length; i++){
            delegations.add(new Delegation(ModelConstants.delegationsNames[i]));
        }
    }

    /**
     * Metodo que busca la cantidad de medallas por delegacion
     * @param delegation nombre de la delegacion
     * @return texto con cantidad de medallas de la delegacion
     */
    public Object[] medalForDelegation(String delegation){
        Object[] aux = null;
        for (int i=0; i<delegations.size(); i++){
            if (delegations.get(i).getOriginPlace().equals(delegation)){
                aux = delegations.get(i).getMedalsOfDelegation();
            }
        }
        return aux;
    }

    /**
     * Metodo que agrega un corredor a una delegacion
     * @param competitor competidor a agregar
     */
    public void addCompetitor(Competitor competitor){
        for (int i=0; i< delegations.size(); i++){
            if (competitor.getDelegation().equals(delegations.get(i).getOriginPlace())){
                delegations.get(i).addPlayerToDelegation(competitor);
                break;
            }
        }
    }

    public ArrayList<Competitor> getOrderOfCompetition(String competition, String gender){
        ArrayList<Competitor> competitors = new ArrayList<>();
        for (int i=0; i<delegations.size(); i++){
            ArrayList<Competitor> temList = delegations.get(i).getCompetitors();
            for (int j=0; j<temList.size(); j++){
                if (temList.get(j).getCompetence().getNameCompetence().equalsIgnoreCase(competition) && temList.get(j).getGender().getGender().equalsIgnoreCase(gender)){
                    competitors.add(temList.get(j));
                }
            }
        }
        switch (extractScoreType(competition)){
            case ModelConstants.TIME:
                Collections.sort(competitors, Comparator.comparing(Competitor::getTimeResult));
                break;
            case ModelConstants.METERS:
                Collections.sort(competitors, Comparator.comparing(Competitor::getMeterResult).reversed());
                break;
        }
        return competitors;
    }

    public ArrayList<Competitor> getListCompetitorByCompetenceFemale(String competence){
        ArrayList<Competitor> competenceList = new ArrayList();
        for (int i=0; i<delegations.size(); i++){
            ArrayList<Competitor> tem = delegations.get(i).getCompetitors();
            for (int j=0; j<tem.size(); j++){
                if (tem.get(j).getCompetence().getNameCompetence().equals(competence) && tem.get(j).getGender().getGender().equals("Femenino")){
                    competenceList.add(tem.get(j));
                }
            }
        }
        return competenceList;
    }

    public ArrayList<Competitor> getListCompetitorByCompetenceMale(String competence){
        ArrayList<Competitor> competenceList = new ArrayList();
        for (int i=0; i<delegations.size(); i++){
            ArrayList<Competitor> tem = delegations.get(i).getCompetitors();
            for (int j=0; j<tem.size(); j++){
                if (tem.get(j).getCompetence().getNameCompetence().equals(competence) && tem.get(j).getGender().getGender().equals("Masculino")){
                    competenceList.add(tem.get(j));
                }
            }
        }
        return competenceList;
    }

    /**
     * Metodo que lista de competidores por una delegacion
     * @param delegation nombre de la delegacion
     * @return lista de competidores de una delegacion especifica
     */
    public ArrayList<Object[]> getListOfCompetitorsByDelegation(String delegation){
        ArrayList<Object[]> competitors = new ArrayList();
        for (int i=0; i<delegations.size(); i++){
            Delegation tem = delegations.get(i);
            if (tem.getOriginPlace().equals(delegation)){
                for (int j=0; j<tem.getSizeOfDelegation(); j++){
                    competitors.add(tem.getIndexCompetitor(j).getCompetitorInfoForSearch());
                }
                break;
            }
        }
        return competitors;
    }

    public void setMedalByCompetenceFemale(){
        ArrayList<Competitor> competitors;
        for (int i=0; i<ModelConstants.COMPETENCE_LIST.length; i++){
            competitors = getListCompetitorByCompetenceFemale(ModelConstants.COMPETENCE_LIST[i]);
            switch (extractScoreType(ModelConstants.COMPETENCE_LIST[i])){
                case ModelConstants.TIME:
                    Collections.sort(competitors, Comparator.comparing(Competitor::getTimeResult));
                    break;
                case ModelConstants.METERS:
                    Collections.sort(competitors, Comparator.comparing(Competitor::getMeterResult).reversed());
                    break;
            }
            competitors.get(0).setMedal(Medal.GOLD);
            competitors.get(1).setMedal(Medal.SILVER);
            competitors.get(2).setMedal(Medal.BRONZE);
        }
    }

    public void setMedalByCompetenceMale(){
        ArrayList<Competitor> competitors;
        for (int i=0; i<ModelConstants.COMPETENCE_LIST.length; i++){
            competitors = getListCompetitorByCompetenceMale(ModelConstants.COMPETENCE_LIST[i]);
            switch (extractScoreType(ModelConstants.COMPETENCE_LIST[i])){
                case ModelConstants.TIME:
                    Collections.sort(competitors, Comparator.comparing(Competitor::getTimeResult));
                    break;
                case ModelConstants.METERS:
                    Collections.sort(competitors, Comparator.comparing(Competitor::getMeterResult).reversed());
                    break;
            }
            competitors.get(0).setMedal(Medal.GOLD);
            competitors.get(1).setMedal(Medal.SILVER);
            competitors.get(2).setMedal(Medal.BRONZE);
        }
    }

    private String extractScoreType(String string){
        switch (string){
            case ModelConstants.METERS_100:
            case ModelConstants.METERS_100_HURDELS:
            case ModelConstants.METERS_200:
            case ModelConstants.METERS_200_HURDELS:
            case ModelConstants.METERS_400_HURDELS:
            case ModelConstants.METERS_400:
                return ModelConstants.TIME;
            default:
                return ModelConstants.METERS;
        }
    }

    public Competitor[] getGoldenGayAndExperiencePrice(){
        ArrayList<Competitor> competitors = new ArrayList();
        for (int i=0; i<delegations.size(); i++){
            ArrayList<Competitor> temp = delegations.get(i).getCompetitors();
            for (int j=0; j<temp.size(); j++){
                if (temp.get(j).getMedal() != null && temp.get(j).getMedal().getNameMedal().equals(ModelConstants.GOLD)){
                    competitors.add(temp.get(j));
                }
            }
        }
        Collections.sort(competitors, Comparator.comparing(Competitor::getDateOfBirth));
        return new Competitor[]{competitors.get(0), competitors.get(competitors.size()-1)};
    }

    public ArrayList<Competitor> extractGoldWinners(){
        ArrayList<Competitor>competitors = new ArrayList();
        for (int i=0; i<delegations.size(); i++){
            ArrayList<Competitor> temp = delegations.get(i).getCompetitors();
            for (int j=0; j<temp.size(); j++){
                if (temp.get(j).getMedal() != null && temp.get(j).getMedal().getNameMedal().equals(ModelConstants.GOLD)){
                    competitors.add(temp.get(j));
                }
            }
        }
        return competitors;
    }

    public ArrayList<Competitor> extractSilverWinners(){
        ArrayList<Competitor>competitors = new ArrayList();
        for (int i=0; i<delegations.size(); i++){
            ArrayList<Competitor> temp = delegations.get(i).getCompetitors();
            for (int j=0; j<temp.size(); j++){
                if (temp.get(j).getMedal() != null && temp.get(j).getMedal().getNameMedal().equals(ModelConstants.SILVER)){
                    competitors.add(temp.get(j));
                }
            }
        }
        return competitors;
    }

    public ArrayList<Competitor> extractBronzeWinners(){
        ArrayList<Competitor>competitors = new ArrayList();
        for (int i=0; i<delegations.size(); i++){
            ArrayList<Competitor> temp = delegations.get(i).getCompetitors();
            for (int j=0; j<temp.size(); j++){
                if (temp.get(j).getMedal() != null && temp.get(j).getMedal().getNameMedal().equals(ModelConstants.BRONZE)){
                    competitors.add(temp.get(j));
                }
            }
        }
        return competitors;
    }

    public ArrayList<Object[]> findCompetitor(String name){
        ArrayList<Object[]> competitors = new ArrayList();
        for (int i=0; i<delegations.size(); i++){
            ArrayList<Competitor> temp = delegations.get(i).getCompetitors();
            for (int j=0; j<temp.size(); j++){
                Competitor aux = temp.get(j);
                if (aux.getName().contains(name) || aux.getLastName().contains(name)){
                    competitors.add(aux.getCompetitorInfoForSearch());
                }
            }
        }
        return competitors;
    }

    public ArrayList<Delegation> getDelegations() {
        return delegations;
    }

    public void setMedalsToAllDelegations(){
        for (int i=0; i<delegations.size(); i++){
            delegations.get(i).setMedals();
        }
    }
}
