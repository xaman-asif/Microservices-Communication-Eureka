package com.example.admissionsservice.resources;

import com.example.admissionsservice.resources.models.DiseasesList;
import com.example.admissionsservice.resources.models.EmployeesList;
import com.example.admissionsservice.resources.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/admission")
public class AdmissionResource {

    @Autowired
//    @LoadBalanced
    private RestTemplate restTemplate;

    @RequestMapping("/physicians")
    public EmployeesList getPhysicians() {
        EmployeesList employeesList =
                restTemplate.getForObject("http://hr-service/hr/employees", EmployeesList.class);

        return employeesList;
    }

    @RequestMapping("/diseases")
    public DiseasesList getDiseases() {
        DiseasesList diseasesList =
                restTemplate.getForObject("http://pathology-service/pathology/diseases", DiseasesList.class);

        return diseasesList;
    }

    List<Patient> patients = Arrays.asList(
            new Patient("P1", "Gabor", "Hungarian"),
            new Patient("P2", "Emeka", "Nigerian"),
            new Patient("P3", "Emily", "American")
    );

    @RequestMapping("/patients")
    public List<Patient> getPatients() {
        return patients;
    }

    @RequestMapping("/patients/{Id}")
    public Patient getPatientById(@PathVariable("Id") String Id) {
        return patients.stream().filter(patient -> Id.equalsIgnoreCase(patient.getId())).findAny().orElse(null);
    }


}
