package PolyEco.springBack.PolyEcoBackend.model;

public class mainNewsData {
    private String imgName;
    private byte[] img;
    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
    public String getImgName() {
        return imgName;
    }

    public byte[] getImg() {
        return img;
    }
}
