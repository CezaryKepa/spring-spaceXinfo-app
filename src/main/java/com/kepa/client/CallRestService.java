package com.kepa.client;


import com.kepa.info.model.Info;
import com.kepa.launchpads.model.LaunchPad;
import com.kepa.rockets.model.Rocket;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class CallRestService {
    private RestTemplate restTemplate =new RestTemplate();

    public Object coreCall(){
        return restTemplate.getForObject("https://api.spacexdata.com/v3/cores", Object.class);
    }
    public Object capsuleCall(){
        return restTemplate.getForObject("https://api.spacexdata.com/v3/capsules", Object.class);
    }
    public Object historyCall(){
        return restTemplate.getForObject("https://api.spacexdata.com/v3/history", Object.class);
    }
    public Info infoCall(){
        return restTemplate.getForObject("https://api.spacexdata.com/v3/info", Info.class);
    }
    public Object launchesCall(){
        return restTemplate.getForObject("https://api.spacexdata.com/v3/launches", Object.class);
    }
    public LaunchPad launchPadsCall(){
        return restTemplate.getForObject("https://api.spacexdata.com/v3/launchpads", LaunchPad.class);
    }
    public Object missionsCall(){
        return restTemplate.getForObject("https://api.spacexdata.com/v3/missions", Object.class);
    }
    public Object rocketsCall(){
        return restTemplate.getForObject("https://api.spacexdata.com/v3/rockets", Object.class);
    }
    public Rocket rocketCall(String rocket_id){
        return restTemplate.getForObject("https://api.spacexdata.com/v3/rockets/"+rocket_id, Rocket.class);
    }
    public Object shipsCall(){
        return restTemplate.getForObject("https://api.spacexdata.com/v3/ships", Object.class);
    }


}
