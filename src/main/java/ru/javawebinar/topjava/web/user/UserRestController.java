package ru.javawebinar.topjava.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ru.javawebinar.topjava.service.UserService;

@Controller
public class UserRestController {

    @Qualifier("UserServiceImpl")
    @Autowired
    private UserService service;
}
