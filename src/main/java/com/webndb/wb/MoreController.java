package com.webndb.wb;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoreController {

    @Autowired
    CustomerRepository repository;

    @GetMapping("/more/{id}")
    public ModelAndView editUserView(@PathVariable Long userId) throws NotFoundException {

        Object patient = repository.findById(userId);

        if (patient == null) {
            throw new NotFoundException("Not found user with ID " + userId);
        }

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("patient.edit");
        modelAndView.addObject("patient", patient);

        return modelAndView;
    }
}

