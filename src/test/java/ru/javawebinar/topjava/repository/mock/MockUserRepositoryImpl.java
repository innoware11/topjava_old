package ru.javawebinar.topjava.repository.mock;

import org.springframework.stereotype.Repository;
import ru.javawebinar.topjava.LoggerWrapper;
import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.repository.UserRepository;
import ru.javawebinar.topjava.web.UserServlet;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Repository
public class MockUserRepositoryImpl implements UserRepository {
    private static final LoggerWrapper LOG = LoggerWrapper.get(UserServlet.class);

    @PostConstruct
    public void postConstruct() {
        LOG.info("PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        LOG.info("PreDestroy");
    }

    @Override
    public boolean delete(int id) {
        LOG.info("Delete " + id);
        return id != 0;
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
