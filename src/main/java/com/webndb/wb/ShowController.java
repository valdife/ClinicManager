package com.webndb.wb;


import com.webndb.RepositoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowController {

    private final
    RepositoriesService rs;

    @Autowired
    public ShowController(RepositoriesService rs) {
        this.rs = rs;
    }

    @GetMapping("/patient-list")
    public String patientList(Model model) {
        List<Patient> list = new ArrayList<>();
        rs.findAll().forEach(list::add);
        model.addAttribute("list", list);
        return "patient-list";
    }
}