/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estime;

/**
 * @author Ndoja
 * La classe rappresenta e gestisce dati di tipo temporale
 */
public class Time {
    /**
     * le ore dell' oggetto
     */
    protected int ore;
    /**
     * i minuti dell' oggetto
     */
    protected int minuti;
    /**
     * i secondi dell' oggetto
     */
    protected int secondi;
    /**
     * Costruisce un oggetto Time dato in ingresso ore, minuti, secondi.
     * Se i parametri non sono validi tutto verrà inizializzato a 0.
     * @param ore ore da assegnare al nuovo oggetto
     * @param minuti minuti da assegnare al nuovo oggetto
     * @param secondi secondi da assegnare al nuovo oggetto
     */
    public Time(int ore,int minuti, int secondi)
    {
        if(ore < 0 || ore > 24 || minuti < 0 || minuti > 59 || 
        secondi < 0 || secondi > 59)
        {
            this.minuti = 0;
            this.ore = 0;
            this.minuti = 0;
        }
        else{
            this.minuti = minuti;
            this.ore = ore;
            this.minuti = minuti;
        }
    }
    /**
     * Costruisce un nuovo oggetto Time dati in ingresso il numero di secondi.
     * I secondi vengono automaticamente distribuiti.
     * @param secondi secondi da assegnare al nuovo oggetto
     */
    public Time(int secondi)
    {
        this.ore = secondiInOre(secondi);
        secondi %= 3600;
        this.minuti = secondiInMinuti(secondi);
        secondi %= 60;
        this.secondi = secondi;
    }

    private int secondiInOre(int secondi){
        int conta=0;
        while(secondi / 3600 >= 1)
        {
            secondi -= 3600;
            conta++;
        }
        return conta;
    }
    private int secondiInMinuti(int secondi){
        int conta=0;
        while(secondi / 60 >= 1)
        {
            secondi -= 60;
            conta++;
        }
        return conta;
    }
    /**
     * Dato i secondi li aggiunge distribuendoli automaticamente.
     * @param secondi secondi da aggiungere
     */
    public void addSecondi(int secondi)
    {
        ore += secondiInOre(secondi);
        secondi %= 3600;
        minuti += secondiInMinuti(secondi);
        secondi %= 60;
        this.secondi += secondi;
    }
    /**
     * Converte il tempo dell' oggetto Time in secondi
     * @return tempo convertito in secondi
     */
    public int convertiSecondi()
    {
        return ore*3600 + minuti*60 + secondi;
    }
    /**
     * Crea una stringa con i parametri dell' oggetto
     * @return i parametri convertiti in stringa
     */
    @Override
    public String toString() {
        return getOre()+":"+getMinuti()+":"+getSecondi();
    }

    /**
     * Restituisce i minuti dell' oggetto
     * @return i minuti dell' oggetto
     */
    public int getMinuti() {
        return this.minuti;
    }
    /**
     * @deprecated
     * @param minuti 
     */
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public int getOre() {
        return this.ore;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public int getSecondi() {
        return this.secondi;
    }

    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }
}
