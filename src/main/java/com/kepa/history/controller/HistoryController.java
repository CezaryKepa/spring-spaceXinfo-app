package com.kepa.history.controller;

import com.kepa.client.CallRestService;
import com.kepa.history.model.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HistoryController {
    private CallRestService callRestService;

    @Autowired
    public HistoryController(CallRestService callRestService) {
        this.callRestService = callRestService;
    }

    @GetMapping("/history")
    public String getHistory(Model model){
        List<History> history= (List<History>) callRestService.historyCall();
        model.addAttribute("events",history);
        return "history";

    }
}
