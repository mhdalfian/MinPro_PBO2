package model;

import java.util.ArrayList;

public final class MesinPenjual implements OperasiCRUD {
    private static final ArrayList<Barang> barang = new ArrayList<>();  // Static ArrayList
    private static int totalBarangTerjual = 0;  // Static counter untuk total barang terjual

    public MesinPenjual() {
        barang.add(new Cemilan("Keripik", 5000, 10));
        barang.add(new Cemilan("Cokelat", 8000, 5));
        barang.add(new Minuman("Coca-Cola", 8000, 8));
        barang.add(new Minuman("Air Mineral", 3000, 20));
    }

    @Override
    public void tambahBarang(Barang b) {
        barang.add(b);
        System.out.println("Barang berhasil ditambahkan.");
    }

    @Override
    public void hapusBarang(int index) {
        if (index >= 0 && index < barang.size()) {
            barang.remove(index);
            System.out.println("Barang berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    @Override
    public void updateBarang(int index, String nama, double harga, int stok) {
        if (index >= 0 && index < barang.size()) {
            Barang b = barang.get(index);
            b.setNama(nama);
            b.setHarga(harga);
            b.setStok(stok);
            System.out.println("Barang berhasil diupdate.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    @Override
    public void tampilkanBarang() {
        if (barang.isEmpty()) {
            System.out.println("Tidak ada barang tersedia.");
        } else {
            System.out.println("Daftar Barang di Mesin Penjual:");
            for (int i = 0; i < barang.size(); i++) {
                System.out.println((i + 1) + ". " + barang.get(i));
            }
        }
    }

    public static void tambahTotalBarangTerjual(int jumlah) {  // Static method
        totalBarangTerjual += jumlah;
    }

    public static int getTotalBarangTerjual() {  // Static getter method
        return totalBarangTerjual;
    }
}
