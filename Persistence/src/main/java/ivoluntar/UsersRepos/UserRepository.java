package ivoluntar.UsersRepos;

import ivoluntar.Users.User;
import ivoluntar.Utils.HibernateUtils;
import org.hibernate.Session;

import java.util.Optional;

public class UserRepository implements ivoluntar.UsersRepos.interfaces.UserRepoInterface {
    @Override
    public Optional<User> findOne(Long aLong) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return Optional.ofNullable(session.get(User.class, aLong));
        }
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> save(User entity) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();

            User existingEntity = session.createQuery("from User where email = :email", User.class)
                    .setParameter("email", entity.getEmail())
                    .uniqueResult();
            if (existingEntity != null) {
                return Optional.empty();
            }

            Long id = (Long) session.save(entity);
            session.getTransaction().commit();
            return findOne(id);
        }
    }

    @Override
    public Optional<User> delete(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Optional<User> update(User entity) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByEmail(String email) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            User user = session.createQuery("from User where email = :email", User.class)
                    .setParameter("email", email)
                    .uniqueResult();
            if (user == null) {
                return Optional.empty();
            }

            return Optional.of(user);

        }
    }
}
