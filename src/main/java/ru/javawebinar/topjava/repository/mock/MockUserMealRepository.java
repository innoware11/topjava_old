package ru.javawebinar.topjava.repository.mock;

import org.springframework.stereotype.Repository;
import ru.javawebinar.topjava.LoggerWrapper;
import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.repository.UserMealRepository;
import ru.javawebinar.topjava.web.UserServlet;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class MockUserMealRepository implements UserMealRepository {
    private static final LoggerWrapper LOG = LoggerWrapper.get(UserServlet.class);

    @Override
    public boolean delete(int id, int userId) {
        LOG.info("Delete meal " + id + " from user " + userId);
        return true;
    }

    @Override
    public UserMeal save(UserMeal userMeal, int userId) {
        LOG.info("Save meal " + userMeal + " from user " + userId);
        return userMeal;
    }

    @Override
    public UserMeal get(int id, int userId) {
        return null;
    }

    @Override
    public List<UserMeal> getAll(int userId) {
        return null;
    }

    @Override
    public void deleteAll(int userId) {

    }

    @Override
    public List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId) {
        return null;
    }
}
