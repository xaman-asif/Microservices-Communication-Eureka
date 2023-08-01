package com.example.pathologyservice.resources.model;

public class Disease {
    private String Id;
    private String disease;
    private String treatment;

    public Disease(String id, String disease, String treatment) {
        Id = id;
        this.disease = disease;
        this.treatment = treatment;
    }

    public Disease() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
