/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaClass;

/**
 *
 * @author Alex
 */
public class AgentAvecEnfant extends Agent implements AgentInfos{
    private int nbEnfant;
    
    public AgentAvecEnfant(int unNumero, String unNom, boolean marie, int unSalaire, int unNbEnfant)
    {
        super(unNumero, unNom, marie, unSalaire);
        this.nbEnfant = unNbEnfant;
    }

    /**
     * @return the nbEnfant
     */
    public int getNbEnfant() {
        return nbEnfant;
    }
    
    @Override
    public String afficherInfo()
    {
        return super.afficherInfo() + this.nbEnfant;
    }
    
    @Override
    public double calculerImpot()
    {
        int nbPart = 0;
        if (isMarie())
        {
            nbPart = (this.nbEnfant/2) + 2;
        }
        else
        {
            nbPart = (this.nbEnfant/2) + 1;
        }
        double revenuImposable = 0.72 * getSalaire();
        double coefFamille = revenuImposable/nbPart;
        return coefFamille - 0.15*revenuImposable;
    }
}