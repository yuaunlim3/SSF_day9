package VTTP_ssf.day9.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import VTTP_ssf.day9.Model.Person;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping
public class CreateController {
    
    @PostMapping("/create")
    public String createPage(Model model){
        model.addAttribute("person",new Person());
        return "addInfo";
    }

    @PostMapping("/list")
    public String create(@ModelAttribute("person") Person person, HttpSession session, Model model){
        List<Person> personlist = (List<Person>) session.getAttribute("listofpp");
        if(null == personlist){
            personlist = new ArrayList<>();
            personlist.add(person);
            session.setAttribute("listofpp",personlist);
            model.addAttribute("ppList",personlist);
            return "list";
        }
        personlist.add(person);
        session.setAttribute("listofpp",personlist);
        model.addAttribute("ppList",personlist);
        return "list";
        
    }
}
