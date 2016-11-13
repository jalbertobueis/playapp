package repository;

import model.User;
import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by jesusbueis1 on 13/11/16.
 */
@Named("userRepository")
@Singleton
public interface UserRepository extends CrudRepository<User, Long> {
}
