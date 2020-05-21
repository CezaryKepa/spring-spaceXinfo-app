package com.kepa.missions;

import com.kepa.client.CallRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MissionController {
    private CallRestService callRestService;

    @Autowired
    public MissionController(CallRestService callRestService) {
        this.callRestService = callRestService;
    }

    @GetMapping("/missions")
    public String getAllMissions(Model model){
        List<Mission> missions= (List<Mission>) callRestService.missionsCall();
        model.addAttribute("missions",missions);
        return "missions";
    }
}
