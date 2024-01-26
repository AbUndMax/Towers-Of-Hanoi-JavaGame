package Towers_of_Hanoi.HanoiObjects;


// This class represents a Disc on a Hanoi Tower with a width and height
public class Disc {

    private Integer width;
    private Integer height;

    Disc(int width, int height){
        this.height = height;
        this.width = width;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }
}
