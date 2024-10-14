package model;

public abstract class Barang {

    public static String getTotalBarangTerjual() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private final String kategori;  // Final property
    private String nama;
    private double harga;
    private int stok;

    public Barang(String kategori, String nama, double harga, int stok) {
        this.kategori = kategori;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKategori() {
        return kategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Kategori: " + kategori + ", Nama: " + nama + ", Harga: " + harga + ", Stok: " + stok;
    }
}
