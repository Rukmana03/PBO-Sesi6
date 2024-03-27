package BangunRuang;
import BangunDatar.Persegi;

public class Kubus implements Geometri {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    @Override
    public double hitungLuasPermukaan() {
        Persegi persegi = new Persegi(sisi);
        return persegi.hitungLuas() * 6;
    }
}
