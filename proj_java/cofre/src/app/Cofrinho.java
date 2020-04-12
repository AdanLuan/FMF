package app;

import java.util.*;


public class Cofrinho {
    private List <Moeda> moeda = new ArrayList<Moeda>();
    private Moeda maiorMoeda;
    private double total = 0;
    public void ReceberMoeda(Moeda moeda){
        this.moeda.add(moeda);
        try{
            if(moeda.getValor()> maiorMoeda.getValor()){
                maiorMoeda = moeda;
                total += moeda.getValor();
            }
        }finally{
            maiorMoeda = moeda;
        }
    }
    public Moeda getMaiorMoeda(){
        return maiorMoeda;
    }
    public int TotalMoedas(){
        return moeda.size();
    }
    public double TotalDepositado(){
        return total;
    }
}