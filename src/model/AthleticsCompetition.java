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
    public int[] medalForDelegation(String delegation){
        int[] aux = null;
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
            if (competitor.getDelegation().equals(delegations.get(i).getNameOfDelegation())){
                delegations.get(i).addPlayerToDelegation(competitor);
                break;
            }
        }
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
            }
        }
        return competitors;
    }


}
