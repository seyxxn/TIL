package oop.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea(){
        return width * height;
    }

    int calulatePerimeter(){
        return 2*(width + height);
    }

    boolean isSquare(){
        return width == height;
    }
}
