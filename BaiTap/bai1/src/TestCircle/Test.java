package TestCircle;

import entity.Circle;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("ban kinh cua hinh tron: "+ c1.getRadius());
        System.out.println("dien tich cua hinh tron: "+ c1.getArea());
    }
}
