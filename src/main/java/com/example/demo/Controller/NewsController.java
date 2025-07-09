package com.example.demo.Controller;

import com.example.demo.Do.HdygDo;
import com.example.demo.Do.NewsDo;
import com.example.demo.Do.NewstypeDo;
import io.swagger.v3.oas.annotations.Operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api")
public class NewsController {

    @Autowired
    private com.example.demo.Service.NewsServices NewsServices;

    // ========== hdyg表接口 ==========

    @GetMapping("/hdyg/{id}")
    @Operation(summary = "获取活动预告信息", description = "使用id获取活动预告信息")
    public HdygDo getHdygById(@PathVariable("id") long id) {
        return NewsServices.getHdygById(id);
    }

    @GetMapping("/hdyg")
    @Operation(summary = "获取所有活动预告", description = "获取所有活动预告列表")
    public List<HdygDo> getHdygList() {
        return NewsServices.getAllHdyg();
    }

    @PostMapping("/hdyg")
    @Operation(summary = "添加活动预告", description = "添加新的活动预告")
    public void addHdyg(@RequestBody HdygDo hdyg) {
        NewsServices.addhdyg(hdyg);
    }

    @PutMapping("/hdyg/{id}")
    @Operation(summary = "修改活动预告", description = "使用id修改活动预告信息")
    public void updateHdyg(@PathVariable("id") long id, @RequestBody HdygDo hdyg) {
        hdyg.setId(id);
        NewsServices.edithdyg(hdyg);
    }

    @DeleteMapping("/hdyg/{id}")
    @Operation(summary = "删除活动预告", description = "使用id删除活动预告")
    public void deleteHdyg(@PathVariable("id") long id) {
        NewsServices.removehdyg(id);
    }

    // ========== news表接口 ==========

    @GetMapping("/news/{id}")
    @Operation(summary = "获取新闻信息", description = "使用id获取新闻信息")
    public NewsDo getNewsById(@PathVariable("id") long id) {
        return NewsServices.getNewsById(id);
    }

    @GetMapping("/news")
    @Operation(summary = "获取所有新闻", description = "获取所有新闻列表")
    public List<NewsDo> getNewsList() {
        return NewsServices.getAllNews();
    }

    @GetMapping("/news/types")
    @Operation(summary = "获取新闻类型", description = "获取所有新闻类型列表")
    public List<NewstypeDo> getNewsTypes() {
        return NewsServices.getAllNewsTypes();
    }

    @PostMapping("/news")
    @Operation(summary = "添加新闻", description = "添加新的新闻")
    public void addNews(@RequestBody NewsDo news) {
        NewsServices.addnews(news);
    }

    @PutMapping("/news/{id}")
    @Operation(summary = "修改新闻", description = "使用id修改新闻信息")
    public void updateNews(@PathVariable("id") long id, @RequestBody NewsDo news) {
        news.setId(id);
        NewsServices.editnews(news);
    }

    @DeleteMapping("/news/{id}")
    @Operation(summary = "删除新闻", description = "使用id删除新闻")
    public void deleteNews(@PathVariable("id") long id) {
        NewsServices.removenews(id);
    }
}