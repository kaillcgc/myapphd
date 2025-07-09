package com.example.demo.DAO;

import com.example.demo.Do.NewstypeDo;

import java.util.List;

public interface NewstypeDAO {
    public int insert(NewstypeDo newstypeDo);
    public int delete(Long id);
    public int update(NewstypeDo newstypeDo);
    public List<NewstypeDo> selectAll();


}
