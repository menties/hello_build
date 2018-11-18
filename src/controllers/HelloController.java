package controllers;

import facade.HelloFacade;
import facade.impl.DefaultHelloFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class HelloController {

    private static final String HELLO_PAGE = "hello";

    private HelloFacade helloFacade;

    @GetMapping("/")
    public String sayHello(final Model model) {
        final HelloFacade helloFacade = new DefaultHelloFacade();
        model.addAttribute("name", helloFacade.getMaksName());
        return HELLO_PAGE;
    }
}
