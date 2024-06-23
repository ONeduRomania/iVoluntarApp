package ivoluntar.UsersRepos.interfaces;

import ivoluntar.Repository;
import ivoluntar.Users.User;

import java.util.Optional;

public interface UserRepoInterface extends Repository<Long, User> {

    Optional<User> findByEmail(String email);
}
