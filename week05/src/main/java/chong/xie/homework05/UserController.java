package chong.xie.homework05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource(name = "userService")
//    @Autowired
    UserService userService;

    public void saveUserInfo() {
        System.out.println("UserController --> saveUserInfo()");
        userService.save();
    }

}
