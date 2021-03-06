package kz.dilau.topjava.service;

import kz.dilau.topjava.model.User;
import kz.dilau.topjava.repository.UserRepository;
import org.springframework.stereotype.Service;

import static kz.dilau.topjava.util.ValidationUtil.checkNotFound;
import static kz.dilau.topjava.util.ValidationUtil.checkNotFoundWithId;
import java.util.List;
@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User create(User user) {
        return repository.save(user);
    }

    public void delete(int id) {
        repository.delete(id);
    }

    public User get(int id) {
        return checkNotFoundWithId(repository.get(id), id);
    }

    public User getByEmail(String email) {
        return checkNotFound(repository.getByEmail(email), "email=" + email);
    }

    public List<User> getAll() {
        return repository.getAll();
    }

    public void update(User user) {
        checkNotFoundWithId(repository.save(user), user.getId());
    }
}
