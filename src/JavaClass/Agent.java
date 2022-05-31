/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaClass;

/**
 *
 * @author Alex
 */
public class Agent implements AgentInfos, Comparable<Agent>{
    private int numero;
    private String nom;
    private boolean marie;
    private int salaire;
    
    
    public Agent(int unNumero, String unNom, boolean marie, int unSalaire)
    {
        this.numero = unNumero;
        this.nom = unNom;
        this.marie = marie;
        this.salaire = unSalaire;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the marie
     */
    public boolean isMarie() {
        return marie;
    }

    /**
     * @param marie the marie to set
     */
    public void setMarie(boolean marie) {
        this.marie = marie;
    }

    /**
     * @return the salaire
     */
    public int getSalaire() {
        return salaire;
    }

    /**
     * @param salaire the salaire to set
     */
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    
    public String afficherInfo()
    {
        String infoNumero =  String.valueOf(this.numero);
        String infoMarie = String.valueOf(this.marie);
        String infoSalaire = String.valueOf(this.salaire);
        
        return infoNumero + " " + this.nom + " " + infoMarie + " " + infoSalaire;
    }
    
    public double calculerImpot()
    {
        int nbPart = 0;
        if (this.marie)
        {
            nbPart = 2;
        }
        else
        {
            nbPart = 1;
        }
        double revenuImposable = 0.72 * this.salaire;
        double coefFamille = revenuImposable / nbPart;
        return coefFamille - 0.15 * revenuImposable;
    }

    @Override
    public int compareTo(Agent o) {
        return Double.compare(this.salaire, o.salaire);
    }
    
    
}
