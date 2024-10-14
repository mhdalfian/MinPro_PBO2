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
  - `hapusBarang()`
  - `updateBarang()`
  - `tampilkanBarang()`
- Kelas **`MesinPenjual`** mengimplementasikan interface ini untuk menyediakan logika penanganan barang di mesin.

### 7. **Abstraksi dan Enkapsulasi**
- Kelas **`Barang`** sebagai abstract class menyediakan kerangka dasar untuk barang, dengan subclass **`Cemilan`** dan **`Minuman`** yang mengimplementasikan barang sesuai kategori.
- **Enkapsulasi** diterapkan melalui penggunaan getter dan setter untuk mengatur akses terhadap properti barang seperti `nama`, `harga`, dan `stok`.
