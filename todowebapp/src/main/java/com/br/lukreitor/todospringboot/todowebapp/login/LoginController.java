package com.br.lukreitor.todospringboot.todowebapp.login;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("username")
public class LoginController {
    private AuthenticationService authenticationService = new AuthenticationService();

    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }

    //login 
    //get, post
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home() {
        return "index";
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String username, @RequestParam String password, ModelMap model) {
        if(authenticationService.authenticate(username, password)) {
            model.put("username", username);
            return "welcome";
        } 
        model.put("errorMessage", "Incorrect <strong>username</strong> or <strong>password</strong>, please try again");
        return "login";
    }

    //logout for get and post
    @RequestMapping(value="/logout", method=RequestMethod.GET)
    public String gotoLogoutPage() {
        return "index";
    }

    // profile 
    @RequestMapping(value="/profile", method=RequestMethod.GET)
    public String gotoProfilePage() {
        return "profile";
    }

    //welcome 
    @RequestMapping(value="/welcome", method=RequestMethod.GET)
    public String gotoWelcomePage() {
        return "welcome";
    }

    /*login -> com.br.lukreitor.todospringboot.todowebapp.login.LoginController -> login.jsp
    //http://localhost:8080/login?name=luiz
    //model -> ModelMap
    private Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping("login")
    public String gotoLoginPage(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        logger.debug("Request param in debug level is {}", name);
        logger.info("Request param in info level is {}", name);
        logger.warn("Request param in warn level is {}", name);
        System.out.print("name: " + name);
        return "login";
    }

    // send mensage to terminal
    
    */
}
