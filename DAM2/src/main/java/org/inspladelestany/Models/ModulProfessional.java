package org.inspladelestany.Models;

public class ModulProfessional {
    private int id;
    private String nom;
    private int id_professor;

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
        this.id_professor = id_professors;
    }

    public ModulProfessional(String nom){
        this.nom = nom;
    }

    //Getters & Setters
    public int getId() {return id;}
    public void setId(int id) { this.id = id;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public int getId_professor() {return id_professor;}
    public void setId_professor(int id_professor) {this.id_professor = id_professor;}

    @Override
    public String toString() {
        return "[ " + "Id: " + id + " Nom: " + nom + "IdProfessor: " + id_professor + " ]";
    }
}
