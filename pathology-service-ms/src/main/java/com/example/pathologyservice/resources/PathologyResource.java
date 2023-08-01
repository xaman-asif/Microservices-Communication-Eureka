package com.example.pathologyservice.resources;

import com.example.pathologyservice.resources.model.Disease;
import com.example.pathologyservice.resources.model.DiseasesList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {
    List<Disease> diseases = Arrays.asList(
            new Disease("D1", "Ashma", "Meds#1"),
            new Disease("D2", "Fever", "Meds#2")
    );

    @RequestMapping("/diseases")
    public DiseasesList getDiseases() {
        DiseasesList diseasesList = new DiseasesList();

        diseasesList.setDiseases(diseases);

        return diseasesList;
    }

    @RequestMapping("/diseases/{Id}")
    public Disease getDiseaseById(@PathVariable("Id")String Id) {
        return diseases.stream().filter(disease -> Id.equalsIgnoreCase(disease.getId())).findAny().orElse(null);
    }
}
