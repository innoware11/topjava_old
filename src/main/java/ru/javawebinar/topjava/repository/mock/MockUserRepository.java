package ru.javawebinar.topjava.repository.mock;

import org.springframework.stereotype.Repository;
import ru.javawebinar.topjava.LoggerWrapper;
import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.repository.UserRepository;
import ru.javawebinar.topjava.web.UserServlet;

import java.util.List;

@Repository
public class MockUserRepository implements UserRepository {
    private static final LoggerWrapper LOG = LoggerWrapper.get(UserServlet.class);

    @Override
    public boolean delete(int id) {
        LOG.info("Delete " + id);
        return true;
    }

    @Override
    public User save(User user) {
        LOG.info("Save " + user);
        return user;
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public User getByEmail(String email) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
