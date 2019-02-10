package UserTest;
import java.util.ArrayList;
import java.util.List;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import domain.User;

    @Controller
    @RequestMapping(value="/user")
    public class UserController {

        private static List<User> userList;

        public UserController(){
            userList = new ArrayList<User>();
        }

        private static final Log logger =LogFactory.getLog(UserController.class);

        @RequestMapping(value="/registerForm",method=RequestMethod.GET)
        public String registerForm(){
            return "registerForm";
        }


        @RequestMapping(value="/register",method=RequestMethod.POST)
        public String register(@RequestParam("loginname")String loginname,
                               @RequestParam("password")String password,
                               @RequestParam("username")String username){
            User user = new User();
            user.setLoginname(loginname);
            user.setPassword(password);
            user.setUsername(username);
            userList.add(user);

            return "loginForm";
        }

        @RequestMapping(value="/login")
        public String login(
                @RequestParam("loginname")String loginname,
                @RequestParam("password")String password,
                Model model){
            logger.info("loginname:"+loginname+" password:"+password);

            for(User user : userList){
                if(user.getLoginname().equals(loginname)&&
                        user.getPassword().equals(password)){
                    model.addAttribute("user",user);
                    return "welcome";
                }
            }
            return "loginForm";
        }

    }
