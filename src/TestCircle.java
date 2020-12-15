import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        System.out.println("Nhap ban kinh");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        Circle circle = new Circle();
        System.out.println("dien tich hinh tron la:");
        System.out.println(circle.getArea());
    }
}
