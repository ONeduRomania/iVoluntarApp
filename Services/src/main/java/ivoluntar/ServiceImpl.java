package ivoluntar;

import ivoluntar.Users.User;
import ivoluntar.UsersRepos.interfaces.AdminONGRepoInterface;
import ivoluntar.UsersRepos.interfaces.OrganizationRepoInterface;
import ivoluntar.UsersRepos.interfaces.UserRepoInterface;
import ivoluntar.UsersRepos.interfaces.VoluntarRepoInterface;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@RequiredArgsConstructor
@Service
@Transactional
public class ServiceImpl implements IServices {

    private UserRepoInterface userRepo;
    private VoluntarRepoInterface voluntarRepo;
    private OrganizationRepoInterface organizationRepo;
    private AdminONGRepoInterface adminONGRepo;

    @Autowired
    public ServiceImpl(UserRepoInterface userRepo, VoluntarRepoInterface voluntarRepo, OrganizationRepoInterface organizationRepo, AdminONGRepoInterface adminONGRepo) {
        this.userRepo = userRepo;
        this.voluntarRepo = voluntarRepo;
        this.organizationRepo = organizationRepo;
        this.adminONGRepo = adminONGRepo;
    }

    @Override
    public boolean login(User user) {
        Optional<User> userToFind = userRepo.findByEmail(user.getEmail());
        return userToFind.map(value -> value.getPassword().equals(user.getPassword())).orElse(false);
    }

    @Override
    public void logout(User user) {

    }

    @Override
    public void register(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }
}
