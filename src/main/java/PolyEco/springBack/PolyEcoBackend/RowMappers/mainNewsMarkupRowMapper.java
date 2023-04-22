package PolyEco.springBack.PolyEcoBackend.RowMappers;

import PolyEco.springBack.PolyEcoBackend.model.mainNews;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class mainNewsMarkupRowMapper implements RowMapper<mainNews> {
    @Override
    public mainNews mapRow(ResultSet rs, int rowNum)throws SQLException {
        mainNews news = new mainNews();

        news.setId(rs.getInt("id"));
        news.setMainText(rs.getString("TextMark"));
        return news;
    }
}
