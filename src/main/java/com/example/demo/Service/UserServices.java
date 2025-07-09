package com.example.demo.Service;

import com.example.demo.DAO.UserDAO;
import com.example.demo.Do.UserDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    private UserDAO userDAO;
    public void adduser(UserDo userDo) {
        userDAO.insert(userDo);
    }
    public void removeuser(Long id) {
        userDAO.delete(id);
    }
    public void edituser(UserDo userDo) {
        userDAO.update(userDo);
    }
    public List<UserDo> getAllUsers() {
        return userDAO.selectAll();
    }
    public UserDo getUsersById(Long id) {
        return userDAO.select(id);
    }
}
