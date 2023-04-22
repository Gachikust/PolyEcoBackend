package PolyEco.springBack.PolyEcoBackend.controllers;


import PolyEco.springBack.PolyEcoBackend.DAO.NewsDAO;
import PolyEco.springBack.PolyEcoBackend.model.mainNews;
import PolyEco.springBack.PolyEcoBackend.model.mainNewsData;
import PolyEco.springBack.PolyEcoBackend.model.newsData;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AndroidDataTest {
    @Autowired
    NewsDAO dao;
    @GetMapping("/androidTest")
    public List<newsData> test(@RequestParam(defaultValue = "1") int startid, @RequestParam(defaultValue = "1") int count){

        //return dao.allNews();
        return dao.fewNews(startid,count);
    }
    @Autowired
    JdbcTemplate jdbcTemplate;
    @GetMapping("/test")
    public List<newsData> test2(){
        return jdbcTemplate.query("SELECT * FROM NewTable WHERE id = 1", BeanPropertyRowMapper.newInstance(newsData.class));
    }

    @GetMapping("/android/textmarkup")
    public mainNews getMainNews(@RequestParam(defaultValue = "0") int id){
        return dao.getMainNewsMarkup(id).get(0);
    }
    @GetMapping("/android/newsdata")
    public List<mainNewsData> getMainNewsData(@RequestParam(defaultValue = "0") int id) throws JsonProcessingException {
        return dao.getMainNewsData(id);
    }
}
