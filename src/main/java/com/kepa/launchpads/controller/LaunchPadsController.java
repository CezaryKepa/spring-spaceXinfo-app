package com.kepa.launchpads.controller;

import com.kepa.client.CallRestService;
import com.kepa.launchpads.model.LaunchPad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LaunchPadsController {
    private CallRestService callRestService;

    @Autowired
    public LaunchPadsController(CallRestService callRestService) {
        this.callRestService = callRestService;
    }

    @GetMapping("/launchpads")
    public String getAllLaunchPads(Model model) {
        List<LaunchPad> launchPads = (List<LaunchPad>) callRestService.launchPadsCall();
        model.addAttribute("launchepads", launchPads);
        return "launchepads";
    }

}