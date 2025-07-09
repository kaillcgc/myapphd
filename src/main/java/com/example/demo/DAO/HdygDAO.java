package com.example.demo.DAO;

import com.example.demo.Do.HdygDo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HdygDAO {
    public int insert(HdygDo hdygDo);
    public int update(HdygDo hdygDo);
    public int delete(Long id);
    public List<HdygDo> selectAll();
    public HdygDo select(Long id);
}
