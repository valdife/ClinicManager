package com.webndb.wb;

import com.webndb.RepositoriesService;
import com.webndb.address.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Set;

@Controller
public class MoreController {

    private final
    RepositoriesService rs;

    @Autowired
    public MoreController(RepositoriesService rs) {
        this.rs = rs;
    }

    @GetMapping("/more/{id}")
    public String patientShowMore(@PathVariable("id") Long id, Model model){
        Patient patient = rs.findPatientById(id);
//        Set<Address> patientAddresses = rs.findAddressById(id);
        model.addAttribute("patient", patient);
        return "more";
    }
}

