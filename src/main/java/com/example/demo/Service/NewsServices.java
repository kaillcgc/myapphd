package com.example.demo.Service;

import com.example.demo.DAO.HdygDAO;
import com.example.demo.DAO.NewsDAO;
import com.example.demo.Do.HdygDo;
import com.example.demo.Do.NewsDo;
import com.example.demo.Do.NewstypeDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewsServices {
    @Autowired
    private NewsDAO newsDAO;
    @Autowired
    private HdygDAO hdygDAO;

    public void addnews(NewsDo newsDo) {
        newsDAO.insert(newsDo);
    }
    public void removenews(Long id) {
        newsDAO.delete(id);
    }
    public void editnews(NewsDo newsDo) {
        newsDAO.update(newsDo);
    }
    public List<NewsDo> getAllNews() {
        return newsDAO.selectAll();
    }

    // 获取所有新闻类型（用于前端下拉框）
    public List<NewstypeDo> getAllNewsTypes() {
        return newsDAO.getAllTypes();
    }

    public NewsDo getNewsById(Long id) {
        return newsDAO.select(id);
    }



    public void addhdyg(HdygDo hdygDo) {
        hdygDAO.insert(hdygDo);
    }

    public void removehdyg(Long id) {
        hdygDAO.delete(id);
    }

    public void edithdyg(HdygDo hdygDo) {
        hdygDAO.update(hdygDo);
    }

    public List<HdygDo> getAllHdyg() {
        return hdygDAO.selectAll();
    }

    public HdygDo getHdygById(Long id) {
        return hdygDAO.select(id);
    }

}