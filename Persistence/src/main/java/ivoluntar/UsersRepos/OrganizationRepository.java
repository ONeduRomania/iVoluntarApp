package ivoluntar.UsersRepos;

import ivoluntar.Users.Voluntar;
import ivoluntar.UsersRepos.interfaces.VoluntarRepoInterface;

import java.util.Optional;

public class OrganizationRepository implements VoluntarRepoInterface {
    @Override
    public Optional<Voluntar> findOne(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Iterable<Voluntar> findAll() {
        return null;
    }

    @Override
    public Optional<Voluntar> save(Voluntar entity) {
        return Optional.empty();
    }

    @Override
    public Optional<Voluntar> delete(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Optional<Voluntar> update(Voluntar entity) {
        return Optional.empty();
    }
}
