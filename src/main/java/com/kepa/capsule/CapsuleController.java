package com.kepa.capsule;

import com.kepa.client.CallRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CapsuleController {
    private CallRestService callRestService;

    @Autowired
    public CapsuleController(CallRestService callRestService) {
        this.callRestService = callRestService;
    }

    @GetMapping("/capsules")
    public String getAllCapsules(Model model){
        List<Capsule> Capsules= (List<Capsule>) callRestService.capsuleCall();
        model.addAttribute("capsules",Capsules);
        return "capsules";
    }

}
