package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getWidth(){return width;}
    public double getHeight(){return height;}

    public void setWidth(double width){this.width = width > 0 ? width : 0;}

    public void setHeight(double height){this.height = height > 0 ? height : 0;}
    public double getArea(){return height * width;}

}
