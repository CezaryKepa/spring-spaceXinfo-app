package com.kepa.info.controller;

import com.kepa.client.CallRestService;
import com.kepa.info.model.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class InfoController {
    private CallRestService callRestService;

    @Autowired
    public InfoController(CallRestService callRestService) {
        this.callRestService = callRestService;
    }

    @GetMapping("/")
    public String getInfo(Model model){
        Info info= callRestService.infoCall();

        System.out.println(info);
        model.addAttribute("info",info);
        return "index";
    }

}
