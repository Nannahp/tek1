package com.example.newproject.controlllers;

import com.example.newproject.models.VacationPreferences;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShowPreferencesController {

    @PostMapping("/show-preferences")
    public String showPreferences(Model model, @RequestParam String name, @RequestParam String keywords, @RequestParam String destination, @RequestParam String typeOfTravel, @RequestParam String additionalFeatures){
        VacationPreferences vacationPreferences = new VacationPreferences(name, keywords, destination, typeOfTravel, additionalFeatures);
        model.addAttribute("vacationPreferences", vacationPreferences);
        return "home/show-preferences";
    }

}
