package PolyEco.springBack.PolyEcoBackend.RowMappers;

import PolyEco.springBack.PolyEcoBackend.model.mainNews;
import PolyEco.springBack.PolyEcoBackend.model.mainNewsData;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mainNewsDataRowMapper implements RowMapper<mainNewsData> {
    @Override
    public mainNewsData mapRow(ResultSet rs, int rowNum)throws SQLException {
        mainNewsData newsData = new mainNewsData();
        newsData.setImgName(rs.getString("TextMark"));
        newsData.setImg(rs.getBytes("Images"));
        return newsData;
    }
}
