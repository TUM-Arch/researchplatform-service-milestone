package de.tum.ar.researchplatform.service.user;

import de.tum.ar.researchplatform.exception.CustomNotFoundException;
import de.tum.ar.researchplatform.model.User;
import de.tum.ar.researchplatform.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static de.tum.ar.researchplatform.util.Constants.USER_NOT_FOUND_MSG;

/**
 * Created by karthik on 9/9/2019
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> listAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(String id) throws CustomNotFoundException {
        User user = userRepository.findById(id).orElse(null);
        if(user == null) {
            throw new CustomNotFoundException(USER_NOT_FOUND_MSG);
        }
        return user;
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User saveOrUpdate(User user) {
        userRepository.save(user);
        log.info("Updated User: " + user);
        return user;
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
        log.info("Deleted User: " + user);
    }

    @Override
    public void deleteById(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public boolean existsById(String id) {
        if(userRepository.existsById(id)) {
            return true;
        }
        return false;
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
        log.info("Deleted All Users");
    }

    @Override
    public User findByTumId(String tumId) throws CustomNotFoundException {
        User user = userRepository.findByTumId(tumId);
        if(user == null) {
            throw new CustomNotFoundException(USER_NOT_FOUND_MSG);
        }
        return user;
    }

    @Override
    public void deleteByTumId(String tumId) throws CustomNotFoundException {
        User user = userRepository.findByTumId(tumId);
        if(user == null) {
            throw new CustomNotFoundException(USER_NOT_FOUND_MSG);
        }
        this.delete(user);
    }
}
