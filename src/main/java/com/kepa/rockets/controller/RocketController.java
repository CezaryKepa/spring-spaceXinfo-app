package com.kepa.rockets.controller;

import com.kepa.client.CallRestService;
import com.kepa.rockets.model.Rocket;
import com.kepa.rockets.model.Rocket_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
public class RocketController {
    private CallRestService callRestService;

    @Autowired
    public RocketController(CallRestService callRestService) {
        this.callRestService = callRestService;
    }

    @GetMapping("/rockets")
    public String getAllRockets(Model model){
        List<Rocket_> rockets= (List<Rocket_>) callRestService.rocketsCall();
        model.addAttribute("rockets",rockets);
        return "rockets";
    }
    @GetMapping("/rocket")
    public String rocket(@RequestParam String rocket_id, Model model) {
        Rocket rocket= callRestService.rocketCall(rocket_id);
        System.out.println(rocket);
        rocket.setImgUrl("/img/"+rocket_id+".jpg");
        model.addAttribute("rocket", rocket);
        return "rocket";
    }
}
