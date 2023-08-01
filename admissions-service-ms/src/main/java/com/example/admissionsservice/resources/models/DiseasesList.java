package com.example.admissionsservice.resources.models;

import java.util.List;

public class DiseasesList {
    public List<Disease> diseases;

    public DiseasesList(List<Disease> diseasesLists) {
        this.diseases = diseasesLists;
    }

    public DiseasesList() {
    }

    public List<Disease> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<Disease> diseases) {
        this.diseases = diseases;
    }
}
