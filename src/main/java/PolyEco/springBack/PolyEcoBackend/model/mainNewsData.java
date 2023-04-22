package PolyEco.springBack.PolyEcoBackend.model;

import java.util.List;

public class mainNewsData {
    private List<String> imgName;
    private List<byte[]> img;
    public void setImgName(List<String> imgName) {
        this.imgName = imgName;
    }

    public void setImg(List<byte[]> img) {
        this.img = img;
    }
    public List<String> getImgName() {
        return imgName;
    }

    public List<byte[]> getImg() {
        return img;
    }
}
