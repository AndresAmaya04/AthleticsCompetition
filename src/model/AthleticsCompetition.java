package model;

import java.util.ArrayList;

public class AthleticsCompetition {

    private ArrayList<Delegation> delegations;

    public AthleticsCompetition() {
        this.delegations= new ArrayList();
    }

    /**
     * Metodo que busca la cantidad de medallas por delegacion
     * @param delegation nombre de la delegacion
     * @return texto con cantidad de medallas de la delegacion
     */
    public String medalForDelegation(String delegation){
        int totalGold = 0;
        int totalSilver = 0;
        int totalBronze = 0;
        int finalTotal = 0;
        for (int i = 0; i < delegations.size(); i++) {
            if (delegation.equals(delegations.get(i).getNameOfDelegation())) {
                totalGold = delegations.get(i).getMedalsGold();
                totalSilver = delegations.get(i).getMedalsSilver();
                totalBronze = delegations.get(i).getMedalsBronze();
                finalTotal = delegations.get(i).getMedalsQuantiti();
            }else {
                System.out.println("No ganaron medallas");
            }
        }
        return "Total medallas de oro: " + totalGold + "\nTotal medallas de plata: " + totalSilver + "\nTotal medallas de bronce: " + totalBronze + "\nTotal medallas: " + finalTotal;
    }

}
