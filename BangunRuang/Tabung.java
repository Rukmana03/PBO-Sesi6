package BangunRuang;
import BangunDatar.Lingkaran;

public class Tabung implements Geometri {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        Lingkaran lingkaran = new Lingkaran(jariJari);
        return (2 * lingkaran.hitungLuas()) + (lingkaran.hitungKeliling() * tinggi);
    }
}
