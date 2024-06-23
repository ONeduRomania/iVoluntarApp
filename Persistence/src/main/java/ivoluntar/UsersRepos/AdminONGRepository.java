package ivoluntar.UsersRepos;

import ivoluntar.Users.AdminONG;
import ivoluntar.UsersRepos.interfaces.AdminONGRepoInterface;

import java.util.Optional;

public class AdminONGRepository implements AdminONGRepoInterface {

    @Override
    public Optional<AdminONG> findOne(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Iterable<AdminONG> findAll() {
        return null;
    }

    @Override
    public Optional<AdminONG> save(AdminONG entity) {
        return Optional.empty();
    }

    @Override
    public Optional<AdminONG> delete(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Optional<AdminONG> update(AdminONG entity) {
        return Optional.empty();
    }
}
