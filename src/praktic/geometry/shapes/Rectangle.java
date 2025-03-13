package praktic.geometry.shapes; 

// kelas Rectangle merepresentasikan persegi panjang dengan panjang dan lebar
public class Rectangle {
    private int id; // atribut untuk menyimpan id persegi panjang
    private double panjang; // atribut untuk menyimpan panjang
    private double lebar; // atribut untuk menyimpan lebar

    // konstruktor dengan parameter
    public Rectangle(int id, double panjang, double lebar) {
        this.id = id;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // method getter untuk id
    public int getId() {
        return id;
    }

    // method getter untuk panjang
    public double getPanjang() {
        return panjang;
    }

    // method getter untuk lebar
    public double getLebar() {
        return lebar;
    }

    // method getter untuk menghitung keliling persegi panjang
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    // method getter untuk menghitung luas persegi panjang
    public double getLuas() {
        return panjang * lebar;
    }

    // method untuk mencetak deskripsi persegi panjang
    public void printDeskripsi() {
        System.out.println("ID\t\t: " + id);
        System.out.println("Panjang\t: " + panjang);
        System.out.println("Lebar\t\t: " + lebar);
        System.out.println("Keliling\t: " + getKeliling());
        System.out.println("Luas\t\t: " + getLuas());
    }
}
