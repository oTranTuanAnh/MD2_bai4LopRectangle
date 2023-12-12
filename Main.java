import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double width, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        width = sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        height = sc.nextDouble();

        Rectangle rec = new Rectangle(width, height);
        String d = rec.display();
        System.out.println(d);
        System.out.println("Dien tich la: " + rec.getArea());
        System.out.println("Chu vi la: " + rec.getPerimeter());
    }
}
