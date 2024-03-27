import BangunDatar.*;
import BangunRuang.*;

public class Main {
    public static void main(String[] args) {
        // Pengujian Bangun Datar
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 4);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());

        Persegi persegi = new Persegi(3);
        System.out.println("\nLuas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());

        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("\nLuas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());

        // Pengujian Bangun Ruang
        Kubus kubus = new Kubus(5);
        System.out.println("\nVolume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());

        Balok balok = new Balok(4, 6, 8);
        System.out.println("\nVolume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());

        Bola bola = new Bola(7);
        System.out.println("\nVolume Bola: " + bola.hitungVolume());
        System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaan());

        Tabung tabung = new Tabung(5, 10);
        System.out.println("\nVolume Tabung: " + tabung.hitungVolume());
        System.out.println("Luas Permukaan Tabung: " + tabung.hitungLuasPermukaan());
    }
}
