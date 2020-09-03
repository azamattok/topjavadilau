package kz.dilau.topjava.web.user;

import kz.dilau.topjava.model.User;
import kz.dilau.topjava.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static kz.dilau.topjava.util.ValidationUtil.checkNew;
import static kz.dilau.topjava.util.ValidationUtil.assureIdConsistent;
import java.util.List;

public abstract class AbstractUserController {

    protected final Logger log = LoggerFactory.getLogger(getClass());
    private UserService service;

    public List<User> getAll() {
        log.info("getAll");
        return service.getAll();
    }

    public User get(int id) {
        log.info("get {}", id);
        return service.get(id);
    }

    public User create(User user) {
        log.info("create {}", user);
        checkNew(user);
        return service.create(user);
    }

    public void delete(int id) {
        log.info("delete {}", id);
        service.delete(id);
    }

    public void update(User user, int id) {
        log.info("update {} with id{}", user, id);
        assureIdConsistent(user, id);
        service.update(user);
    }

    public User getByMail(String email) {
        log.info("getByMail {}", email);
        return service.getByEmail(email);
    }

}