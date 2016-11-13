package services;

import model.User;
import repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.List;

/**
 * Created by jesusbueis1 on 13/11/16.
 */
@Named("userService")
@Singleton
public class UserService {


    private UserRepository userRepository;

    @Inject()
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public List<User> getAllUser() {
        return null;
    }

    public User addUser(User user) {
        User userSaved = getUserRepository().save(user);
        return userSaved;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
