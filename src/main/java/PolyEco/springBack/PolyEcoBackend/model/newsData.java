package PolyEco.springBack.PolyEcoBackend.model;


import java.util.Arrays;

public class newsData {

    private int id;
    private String title;

    private String maintext;

    private byte[] titleimg;

    private byte[] mainimg;

    public String getTitle() {
        return title;
    }

    public String getMaintext() {
        return maintext;
    }

    public byte[] getTitleimg() {
        return titleimg;
    }

    public byte[] getMainimg() {
        return mainimg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMaintext(String maintext) {
        this.maintext = maintext;
    }

    public void setTitleimg(byte[] titleimg) {
        this.titleimg = titleimg;
    }

    public void setMainimg(byte[] mainimg) {
        this.mainimg = mainimg;
    }

    @Override
    public String toString() {
        return "newsData{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", maintext='" + maintext + '\'' +
                ", titleimg=" + Arrays.toString(titleimg) +
                ", mainimg=" + Arrays.toString(mainimg) +
                '}';
    }
}
