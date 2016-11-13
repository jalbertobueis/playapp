package controllers;

import model.User;
import play.mvc.Controller;
import play.mvc.Result;
import services.UserService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by jesusbueis1 on 13/11/16.
 */
@Named
@Singleton
public class UserController extends Controller {


    private UserService userService;

    @Inject
    public UserController(UserService userService){
        this.userService = userService;
    }

    public Result addUser() {

        User user = new User();
        user.setName("Jesus");
        user.setName("de los Bueis");
        user.setFamily("de los Bueis");
        getUserService().addUser(user);
        return ok();
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
