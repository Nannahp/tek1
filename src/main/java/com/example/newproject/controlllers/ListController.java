package com.example.newproject.controlllers;
import com.example.newproject.models.Something;
import com.example.newproject.utils.ListCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ListController {
    @Autowired
    private ListCreator listCreator;
    @GetMapping("/list")
        public String home(Model model){
        ArrayList<Something> list = listCreator.getList();
        model.addAttribute("list", list);
        return "home/list";
    }
}
