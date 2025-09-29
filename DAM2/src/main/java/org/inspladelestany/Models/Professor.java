package org.inspladelestany.Models;

public class Professor{
    private int id;
    private String nom;
    private String cognom;

    //Constructor

    /**
     *
     * @param id del professor
     * @param nom del professor
     * @param cognom del professor
     */
    public Professor(Integer id, String nom, String cognom) {
        this.id=id;
        this.nom = nom;
        this.cognom = cognom;
    }

    //Getters & Setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public String getCognom() {return cognom;}
    public void setCognom(String cognom) {this.cognom = cognom;}

}
