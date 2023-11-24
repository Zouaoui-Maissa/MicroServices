package com.esprit.microservices.msjob.DAO.Entities;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "Job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String service;
    private boolean etat;

    public Job(int id, String service, boolean etat) {
        this.id = id;
        this.service = service;
        this.etat = etat;
    }

    public Job(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
}
