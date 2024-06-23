package ivoluntar;

import ivoluntar.Users.User;

public interface IServices {


    boolean login(User user);

    void logout(User user);

    void register(User user);

    void update(User user);

    void delete(User user);

}
