package org.inspladelestany.Models;

public class ModulProfessional {
    private int id;
    private String nom;
    private int id_professors;

    //Constructors
    /**
     *
     * @param id del modul
     * @param nom del modul
     * @param id_professors del professor encarregat
     */
    public ModulProfessional(int id, String nom, int id_professors) {
        this.id = id;
        this.nom = nom;
        this.id_professors = id_professors;
    }

    //Getters & Setters
    public int getId() {return id;}
    public void setId(int id) { this.id = id;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public int getId_professors() {return id_professors;}
    public void setId_professors(int id_professors) {this.id_professors = id_professors;}
}
