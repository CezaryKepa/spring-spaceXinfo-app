package com.kepa.core.controller;

import com.kepa.client.CallRestService;
import com.kepa.core.model.Core;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CoreController {
    private CallRestService callRestService;

    @Autowired
    public CoreController(CallRestService callRestService) {
        this.callRestService = callRestService;
    }

    @GetMapping("/cores")
    public String getAllCores(Model model){
        List<Core> cores= (List<Core>) callRestService.coreCall();
        model.addAttribute("cores",cores);
        return "cores";

    }
}
