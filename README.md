# Dokumentasi MinPro 2 PBO Tema Vending Machine

#### Nama: Muhammad Alfian Adien  
#### NIM 2309116034 Sistem Informasi A'23

## Cara Kerja Program

### 1. **Fitur Utama**
Program ini merupakan simulasi mesin penjual otomatis (vending machine) yang memungkinkan pengguna untuk:
- Menampilkan daftar barang yang tersedia (cemilan dan minuman).
- Menambahkan barang baru ke mesin.
- Menghapus barang dari daftar.
- Memperbarui informasi barang (nama, harga, dan stok).
- Menampilkan total penjualan barang.

### 2. **Struktur Program**
Program ini dibagi ke dalam dua package utama, yaitu:
- **Package `Main`:**
  - Berisi kelas `Minpro_PBO2`, yang mengatur alur utama program dengan menampilkan menu kepada pengguna dan menangani input melalui scanner.
- **Package `Model`:**
  - Berisi kelas-kelas yang mewakili entitas-entitas dalam vending machine, seperti `Barang`, `Cemilan`, `Minuman`, serta kelas `MesinPenjual` yang mengimplementasikan logika CRUD untuk barang-barang dalam mesin penjual otomatis.
  - Interface `OperasiCRUD` juga berada di package ini untuk mendefinisikan metode CRUD yang harus diimplementasikan.

### 3. **Kelas dan Properti Utama**
- **Kelas `Barang` (Abstract Class)**:
  - Mewakili item yang dijual dalam mesin (baik cemilan maupun minuman).
  - Properti: `kategori`, `nama`, `harga`, `stok`.
  - Menggunakan getter dan setter untuk enkapsulasi.
  - Subclass: `Cemilan` dan `Minuman` yang mengimplementasikan jenis barang.

- **Kelas `MesinPenjual`**:
  - Mengelola daftar barang yang ada dalam vending machine dengan menggunakan **ArrayList**.
  - Metode CRUD (tambah, hapus, update, tampilkan) diimplementasikan sesuai dengan interface `OperasiCRUD`.
  - Properti `totalBarangTerjual` untuk melacak total barang yang terjual di mesin penjual otomatis, yang disimpan secara **static**.

### 4. **Penggunaan Static dan Final Keyword**
- Kelas **`MesinPenjual`** dideklarasikan sebagai `final`, sehingga tidak bisa diwariskan oleh kelas lain.
- Properti `totalBarangTerjual` dan daftar barang (`ArrayList`) dideklarasikan sebagai **static** karena properti ini merupakan milik kelas secara global.
- Kategori barang di kelas **`Barang`** dideklarasikan sebagai `final`, sehingga tidak dapat diubah setelah diinisialisasi.

### 5. **Percabangan dan Perulangan**
- Program menggunakan **percabangan switch-case** untuk menangani berbagai pilihan menu yang dimasukkan oleh pengguna.
- **Perulangan for-each** digunakan untuk menampilkan daftar barang yang tersedia di dalam vending machine.

### 6. **Interface CRUD**
- **Interface `OperasiCRUD`** mendefinisikan metode untuk operasi CRUD:
  - `tambahBarang()`

## Alur Program

1. **Inisialisasi Mesin Penjual Otomatis**
   - Program dimulai dari kelas **`Minpro_PBO2`**, yang berfungsi sebagai program utama.
   - Objek **`MesinPenjual`** diinisialisasi, di mana vending machine langsung diisi dengan beberapa barang default seperti cemilan dan minuman. Barang-barang ini disimpan di dalam **ArrayList**.

2. **Menampilkan Menu**
   - Program kemudian menampilkan **menu utama** kepada pengguna, yang berisi beberapa pilihan:
     1. Tampilkan barang yang ada di vending machine.
     2. Tambah barang baru ke vending machine.
     3. Hapus barang dari vending machine.
     4. Update (perbarui) barang di vending machine.
     5. Tampilkan total penjualan barang.
     6. Keluar dari program.

![Screenshot 2024-10-14 223001](https://github.com/user-attachments/assets/ccc79651-e063-4fe6-b0b0-a4e159073373)

4. **Input Pengguna dan Percabangan**
   - Pengguna memasukkan pilihan angka dari menu.
   - **Percabangan `switch-case`** digunakan untuk menangani input dari pengguna sesuai dengan pilihan yang dimasukkan.

5. **Tampilkan Barang (Case 1)**
   - Jika pengguna memilih opsi 1, metode **`tampilkanBarang()`** dipanggil dari objek `MesinPenjual`.
   - Program menampilkan daftar barang yang ada di mesin beserta informasi detailnya (kategori, nama, harga, dan stok) menggunakan **perulangan**.
![Screenshot 2024-10-14 215023](https://github.com/user-attachments/assets/d831b2d9-dbca-497c-91d8-da03c13de0a6)


6. **Tambah Barang (Case 2)**
   - Jika pengguna memilih opsi 2, program meminta detail barang baru (kategori, nama, harga, dan stok) melalui input dari pengguna.
   - Barang kemudian ditambahkan ke dalam daftar menggunakan metode **`tambahBarang()`**.
   - Program akan meminta pengguna memilih kategori barang (cemilan atau minuman) dan membuat objek **`Cemilan`** atau **`Minuman`** sesuai kategori yang dipilih.
![Screenshot 2024-10-14 215159](https://github.com/user-attachments/assets/09aa51b9-10b1-40a2-9295-f5bb7d3ea269)


7. **Hapus Barang (Case 3)**
   - Jika pengguna memilih opsi 3, program meminta pengguna untuk memasukkan **index** barang yang ingin dihapus dari vending machine.
   - Barang tersebut dihapus dari daftar menggunakan metode **`hapusBarang()`**.
![Screenshot 2024-10-14 215241](https://github.com/user-attachments/assets/365b7604-6a97-4620-b4a0-9129a0f1b86d)


8. **Update Barang (Case 4)**
   - Jika pengguna memilih opsi 4, program meminta pengguna untuk memasukkan **index** barang yang ingin di-update serta detail baru (nama, harga, stok) dari barang tersebut.
   - Barang di-update dengan informasi baru menggunakan metode **`updateBarang()`**.
![Screenshot 2024-10-14 222535](https://github.com/user-attachments/assets/bdb42451-866d-4266-af35-4d82b6a1c607)


9. **Tampilkan Total Penjualan (Case 5)**
   - Jika pengguna memilih opsi 5, program menampilkan **total barang yang terjual** di mesin penjual, yang dihitung menggunakan metode **`getTotalBarangTerjual()`**.
   - Total penjualan ini disimpan dalam variabel `totalBarangTerjual` yang bersifat **static**, sehingga setiap kali barang terjual, nilai total ini diperbarui.
![Screenshot 2024-10-14 222651](https://github.com/user-attachments/assets/6b115360-2e34-42b6-8d73-a904a9fa2efa)

10. **Keluar dari Program (Case 6)**
   - Jika pengguna memilih opsi 6, program akan mengakhiri perulangan dan menampilkan pesan perpisahan, kemudian keluar.
![Screenshot 2024-10-14 222704](https://github.com/user-attachments/assets/4f427cf1-8c2b-465f-9e58-f9503a50a51f)

11. **Pengulangan Program**
   - Program akan terus mengulang menampilkan menu dan memproses input pengguna sampai pengguna memilih untuk keluar (Case 6).
   - Setiap operasi (tambah, hapus, update) menyebabkan perubahan dalam daftar barang, yang diperbarui secara dinamis di dalam **ArrayList**.


  - `hapusBarang()`
  - `updateBarang()`
  - `tampilkanBarang()`
- Kelas **`MesinPenjual`** mengimplementasikan interface ini untuk menyediakan logika penanganan barang di mesin.

### 7. **Abstraksi dan Enkapsulasi**
- Kelas **`Barang`** sebagai abstract class menyediakan kerangka dasar untuk barang, dengan subclass **`Cemilan`** dan **`Minuman`** yang mengimplementasikan barang sesuai kategori.
- **Enkapsulasi** diterapkan melalui penggunaan getter dan setter untuk mengatur akses terhadap properti barang seperti `nama`, `harga`, dan `stok`.
