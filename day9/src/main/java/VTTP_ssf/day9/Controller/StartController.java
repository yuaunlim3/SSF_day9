package VTTP_ssf.day9.Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import VTTP_ssf.day9.Model.Person;
import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping({ "/", "/index.html" })
public class StartController {
    @GetMapping({ "/", "/index.html" })
    public String start() {
        return "redirect:/mainpage";
    }

    @GetMapping("/mainpage")
    public String mainpage(HttpSession session){
        session.setAttribute("listofpp",new ArrayList<Person>());
        return "mainpage";
    }

    
    @PostMapping("/mainpage")
    public String backMainpage(HttpSession session){
        return "mainpage";
    }
}
