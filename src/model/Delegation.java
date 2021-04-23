package model;

import java.util.ArrayList;

public class Delegation {

    private String nameOfDelegation;
    private String originPlace;
    private int medalsGold = 0;
    private int medalsSilver = 0;
    private int medalsBronze = 0;
    private ArrayList<Competitor> competitors;

    public Delegation(String originPlace) {
        this.originPlace=originPlace;
        setMedals();

    }

    /**
     * Metodo que registra la cantidad de medallas de cada tipo por competidor
     */
    public void setMedals(){
        for (int i = 0; i < competitors.size(); i++) {
            if (competitors.get(i).getMedal() != null) {
                switch (Medal.valueOf(competitors.get(i).getMedal().toString())){
                    case GOLD:
                        medalsGold += 1;
                        break;
                    case SILVER:
                        medalsSilver += 1;
                        break;
                    case Bronze:
                        medalsBronze += 1;
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public String getNameOfDelegation() {
        return nameOfDelegation;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public ArrayList<Competitor> getCompetitors() {
        return competitors;
    }

    private int getMedalsQuantiti(){
        return medalsBronze + medalsGold + medalsSilver;

    }

    public int[] getMedalsOfDelegation(){
        return new int[]{medalsGold, medalsSilver, medalsBronze, getMedalsQuantiti()};
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
