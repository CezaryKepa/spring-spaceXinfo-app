package com.kepa.ships.controller;

import com.kepa.client.CallRestService;
import com.kepa.ships.model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class ShipContoller {
    private CallRestService callRestService;

    @Autowired
    public ShipContoller(CallRestService callRestService) {
        this.callRestService = callRestService;
    }

    @GetMapping("/ships")
    public String getAllShips(Model model){
        List<Ship> ships= (List<Ship>) callRestService.shipsCall();
        System.out.println(ships);
        model.addAttribute("ships",ships);
        return "ships";
    }

}
