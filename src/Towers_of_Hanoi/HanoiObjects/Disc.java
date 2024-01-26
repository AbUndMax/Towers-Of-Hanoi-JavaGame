package Towers_of_Hanoi.HanoiObjects;

public class Disc {
    private Integer xPos;
    private Integer yPos;
    private Integer width;
    private Integer height;

    Disc(int width, int height){
        this.height = height;
        this.width = width;
    }


    public Integer getXPos() {
        return xPos;
    }

    public void setXPos(Integer xPos) {
        this.xPos = xPos;
    }

    public Integer getYPos() {
        return yPos;
    }

    public void setYPos(Integer yPos) {
        this.yPos = yPos;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
