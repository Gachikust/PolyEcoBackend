package PolyEco.springBack.PolyEcoBackend.DAO;

import PolyEco.springBack.PolyEcoBackend.RowMappers.mainNewsMarkupRowMapper;
import PolyEco.springBack.PolyEcoBackend.model.mainNews;
import PolyEco.springBack.PolyEcoBackend.model.newsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
public class NewsDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<newsData> allNews() {
       return jdbcTemplate.query("SELECT * FROM NewTable", BeanPropertyRowMapper.newInstance(newsData.class));
    }

    public  List<newsData> fewNews(int startid, int count){
        String select = "SELECT * FROM NewTable WHERE id BETWEEN " + Integer.toString(startid) + " AND " + Integer.toString(startid+count);
        return jdbcTemplate.query(select, BeanPropertyRowMapper.newInstance(newsData.class));
    }

    public List<mainNews> getMainNewsMarkup(int id){
        String select = "SELECT * FROM ExtendedNews WHERE id = " + Integer.toString(id);
        return jdbcTemplate.query(select, new mainNewsMarkupRowMapper());
    }
}
