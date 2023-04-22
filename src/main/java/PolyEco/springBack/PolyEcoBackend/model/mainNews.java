package PolyEco.springBack.PolyEcoBackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class mainNews {
    private int id;
    //@JsonProperty("textmark")
    private String mainText;
    public mainNews() {
    }
    public mainNews(int id, String mainText, List<String> imgName, List<byte[]> img) {
        this.id = id;
        this.mainText = mainText;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setMainText(String mainText) {
        this.mainText = mainText;
    }
    public int getId() {
        return id;
    }
    public String getMainText() {
        return mainText;
    }
}
