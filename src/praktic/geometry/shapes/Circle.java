package praktic.geometry.shapes;

// kelas Circle merepresentasikan lingkaran dengan properti id dan radius
public class Circle {
    private int id; // atribut untuk menyimpan id lingkaran
    private double radius; // atribut untuk menyimpan radius lingkaran
    private final int pembilang = 22; // konstanta final untuk pembilang phi
    private final int penyebut = 7; // konstanta final untuk penyebut phi

    // konstruktor tanpa parameter
    public Circle() {
        this.id = 0;
        this.radius = 0.0;
    }

    // method setter untuk id
    public void setId(int id) {
        this.id = id;
    }

    // method setter untuk radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // method getter untuk menghitung keliling lingkaran
    public double getKeliling() {
        return (2 * (double)pembilang / penyebut) * radius;
    }

    // method getter untuk menghitung luas lingkaran
    public double getLuas() {
        return ((double)pembilang / penyebut) * radius * radius;
    }

    // method untuk mencetak deskripsi lingkaran
    public void printDeskripsi() {
        System.out.println("ID\t\t: " + id);
        System.out.println("Radius\t: " + radius);
        System.out.println("Keliling\t: " + getKeliling());
        System.out.println("Luas\t\t: " + getLuas());
    }
}
