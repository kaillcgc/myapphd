package com.example.demo.DAO;

import com.example.demo.Do.UserDo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO {
    public int insert(UserDo userDo);
    public int delete(Long id);
    public int update(UserDo userDo);
    public UserDo select(Long id);
    public List<UserDo> selectAll();
}
