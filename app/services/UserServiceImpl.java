package services;

import model.User;
import repository.UserRepository;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.List;

/**
 * Created by jesusbueis1 on 13/11/16.
 */
@Named
@Singleton
public class UserServiceImpl implements UserService{


    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
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
