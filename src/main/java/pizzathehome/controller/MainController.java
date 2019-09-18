package pizzathehome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/blog")
    public String mainPage(Model model){
        model.addAttribute("message");
        return "index";
    }

    @RequestMapping("/menu")
    public String menuPage(Model model){
        model.addAttribute("menu");
        return "menu";
    }

    @RequestMapping("/contact")
    public  String contactPage(Model model){
        model.addAttribute("contact");
        return "contact";
    }

    @RequestMapping("/about")
    public  String aboutPage(Model model){
        model.addAttribute("about");
        return "about";
    }

//
//    @RequestMapping(value = "/contact")
//    public String contactPage(Model model){
//        model.addAttribute("test");
//        return  "contact";
//    }
//@RequestMapping(value = "/blog/menu")
//public String menuPage(Model model){
//    model.addAttribute("article");
//    return  "menu";
//}
}

