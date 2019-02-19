package com.webndb.wb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;


@Controller
public class AddController {

    @Autowired
    CustomerRepository repository;

    @GetMapping("/add-patient-form")
    public String addPatient(Model model) {

        return "add-patient-form";
    }




    private static final String AJAX_HEADER_NAME = "X-Requested-With";
    private static final String AJAX_HEADER_VALUE = "XMLHttpRequest";

    @GetMapping(path = {"/order", "/order/{id}"})
    public String showOrder(@PathVariable(required = false) Long id, Model model) {
//        Order order = orderService.load();
//        model.addAttribute(order);
        return "order";
    }

    // Request is accepted by the endpoint only if contains "save" parameter.
    @PostMapping(params = "save", path = {"/order", "/order/{id}"})
    public String saveOrder(Order order) {
//        orderService.save(order);
        return "order";
    }

    @PostMapping(params = "addItem", path = {"/order", "/order/{id}"})
    public String addOrder(Order order, HttpServletRequest request) {
        order.items.add(new Item());
        if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {
            // It is an Ajax request, render only #items fragment of the page.
            return "order::#items";
        } else {
            // It is a standard HTTP request, render whole page.
            return "order";
        }
    }

    // "removeItem" parameter contains index of a item that will be removed.
    @PostMapping(params = "removeItem", path = {"/order", "/order/{id}"})
    public String removeOrder(Order order, @RequestParam("removeItem") int index, HttpServletRequest request) {
        order.items.remove(index);
        if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {
            return "order::#items";
        } else {
            return "order";
        }
    }

    public static class Order {
        private Date date; // Just some field.
        private List<Item> items;

        // Getters and setters are omitted.
    }

    public static class Item {
        private String name;

        // Getters and setters are omitted.
    }
}
