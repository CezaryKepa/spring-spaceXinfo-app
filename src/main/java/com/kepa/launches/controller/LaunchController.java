package com.kepa.launches.controller;

import com.kepa.client.CallRestService;
import com.kepa.launches.model.Launch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LaunchController {
    private CallRestService callRestService;

    @Autowired
    public LaunchController(CallRestService callRestService) {
        this.callRestService = callRestService;
    }

    @GetMapping("/launches")
    public String getAlllaunches(Model model){
        List<Launch> launches= (List<Launch>) callRestService.launchesCall();
        model.addAttribute("launches",launches);
        return "launches";
    }

}