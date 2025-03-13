package praktic.geometry.mains;

import java.util.Scanner;
import praktic.geometry.shapes.Circle;
import praktic.geometry.shapes.Rectangle;

// kelas utama untuk menjalankan program
public class Main {
    static String pewarna = "====================================="; // atribut static untuk garis pembatas

    // method static untuk mencetak garis pembatas
    public static void printGaris() {
        System.out.println(pewarna);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // mencetak header informasi nama dan nim
        printGaris();
        System.out.println("Nama\t: Angeliani Junitaviana Herman");
        System.out.println("NIM\t: 245150700111021");
        printGaris();

        // proses input dan output untuk lingkaran
        System.out.println("Circle");
        printGaris();
        System.out.print("Isikan ID\t: ");
        int circleId = scanner.nextInt();
        System.out.print("Isikan Radius\t: ");
        double radius = scanner.nextDouble();
        printGaris();

        // membuat objek circle
        Circle circle = new Circle();
        circle.setId(circleId);
        circle.setRadius(radius);
        circle.printDeskripsi();
        printGaris();

        // proses input dan output untuk persegi panjang
        System.out.println("Rectangle");
        printGaris();
        System.out.print("Isikan ID\t: ");
        int rectId = scanner.nextInt();
        System.out.print("Isikan Panjang\t: ");
        double panjang = scanner.nextDouble();
        System.out.print("Isikan Lebar\t: ");
        double lebar = scanner.nextDouble();
        printGaris();

        // membuat objek rectangle
        Rectangle rectangle = new Rectangle(rectId, panjang, lebar);
        rectangle.printDeskripsi();
        printGaris();

        scanner.close();
}
    }
