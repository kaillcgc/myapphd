package com.example.demo.DAO;

import com.example.demo.Do.NewsDo;
import com.example.demo.Do.NewstypeDo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsDAO {
    public int insert(NewsDo newsDo);
    public int delete(Long id);
    public int update(NewsDo newsDo);
    public NewsDo select(Long id);
    public List<NewsDo> selectAll();
    public List<NewstypeDo> getAllTypes();
}
