package kz.dilau.topjava.web.user;

import kz.dilau.topjava.model.User;

import static kz.dilau.topjava.web.SecurityUtil.authUserId;

public class ProfileRestController extends AbstractUserController {
    public User get() {
        return super.get(authUserId());
    }

    public void delete() {
        super.delete(authUserId());
    }

    public void update(User user) {
        super.update(user, authUserId());
    }
}
