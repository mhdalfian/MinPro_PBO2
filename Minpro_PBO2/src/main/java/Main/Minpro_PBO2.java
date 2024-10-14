package Main;

import model.Barang;
import model.Cemilan;
import model.Minuman;
import java.util.Scanner;
import model.MesinPenjual;

public class Minpro_PBO2 {
    public static void main(String[] args) {
        MesinPenjual mesinPenjual = new MesinPenjual();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("== Mesin Penjual Otomatis ==");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Tambah Barang");
            System.out.println("3. Hapus Barang");
            System.out.println("4. Update Barang");
            System.out.println("5. Tampilkan Total Penjualan");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    mesinPenjual.tampilkanBarang();
                    break;
                case 2:
                    System.out.print("Masukkan kategori barang (1=Cemilan, 2=Minuman): ");
                    int jenis = scanner.nextInt();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.next();
                    System.out.print("Masukkan harga barang: ");
                    double harga = scanner.nextDouble();
                    System.out.print("Masukkan stok barang: ");
                    int stok = scanner.nextInt();

                    if (jenis == 1) {
                        mesinPenjual.tambahBarang(new Cemilan(nama, harga, stok));
                    } else {
                        mesinPenjual.tambahBarang(new Minuman(nama, harga, stok));
                    }
                    break;
                case 3:
                    System.out.print("Masukkan index barang yang ingin dihapus: ");
                    int indexHapus = scanner.nextInt();
                    mesinPenjual.hapusBarang(indexHapus - 1); // -1 untuk index 0-based
                    break;
                case 4:
                    System.out.print("Masukkan index barang yang ingin diupdate: ");
                    int indexUpdate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan harga baru: ");
                    double hargaBaru = scanner.nextDouble();
                    System.out.print("Masukkan stok baru: ");
                    int stokBaru = scanner.nextInt();
                    mesinPenjual.updateBarang(indexUpdate - 1, namaBaru, hargaBaru, stokBaru); // -1 untuk index 0-based
                    break;
                case 5:
                    System.out.println("Total penjualan barang: " + MesinPenjual.getTotalBarangTerjual());
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan Mesin Penjual Otomatis.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 6);

        scanner.close();
    }
}
