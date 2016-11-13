package services;

import model.User;

import java.util.List;

/**
 * Created by jesusbueis1 on 13/11/16.
 */
public interface UserService {

    public List<User> getAllUser();
    public User addUser(User user);

}
