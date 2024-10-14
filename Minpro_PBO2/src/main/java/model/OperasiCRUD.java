package model;

public interface OperasiCRUD {
    void tambahBarang(Barang b);
    void hapusBarang(int index);
    void updateBarang(int index, String nama, double harga, int stok);
    void tampilkanBarang();
}
