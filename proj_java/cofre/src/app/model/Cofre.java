package app.model;

import java.util.*;


public class Cofre {
    private static List <Moeda> liCofre = new ArrayList<Moeda>();
    private Moeda maiorMoeda;
    private static float total = 0.0f;

    public void ReceberMoeda(Moeda moeda) {
        if (liCofre.isEmpty()) {
            maiorMoeda = moeda;
        }
        if (moeda.getValor() > maiorMoeda.getValor()) {
            maiorMoeda = moeda;
        }
        total += moeda.getValor();
        liCofre.add(moeda);
    }
    public Moeda getMaiorMoeda(){
        return maiorMoeda;
    }

    public List<Moeda> getMoedas() {
        return liCofre;
    }
    public int TotalMoedas(){
        return liCofre.size();
    }
    public float TotalDepositado(){
        return total;
    }
}