package model;

import java.util.ArrayList;

public class Delegation {

    private String originPlace;
    private int medalsGold = 0;
    private int medalsSilver = 0;
    private int medalsBronze = 0;
    private ArrayList<Competitor> competitors;

    public Delegation(String originPlace) {
        this.competitors = new ArrayList();
        this.originPlace=originPlace;
        setMedals();

    }

    /**
     * Metodo que registra la cantidad de medallas de cada tipo por competidor
     */
    public void setMedals(){
        for (int i = 0; i < competitors.size(); i++) {
            if (competitors.get(i).getMedal() != null) {
                switch (competitors.get(i).getMedal().getNameMedal()){
                    case ModelConstants.GOLD:
                        medalsGold += 1;
                        break;
                    case ModelConstants.SILVER:
                        medalsSilver += 1;
                        break;
                    case ModelConstants.BRONZE:
                        medalsBronze += 1;
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public ArrayList<Competitor> getCompetitors() {
        return competitors;
    }

    public int getMedalsQuantiti(){
        return medalsBronze + medalsGold + medalsSilver;

    }

    public Object[] getMedalsOfDelegation(){
        setMedals();
        return new Object[]{medalsGold, medalsSilver, medalsBronze, getMedalsQuantiti()};
    }

    public void addPlayerToDelegation(Competitor competitor){
        this.competitors.add(competitor);
    }

    public int getSizeOfDelegation(){
        return this.competitors.size();
    }

    public Competitor getIndexCompetitor(int index){
        return this.competitors.get(index);
    }

}
