# Sistem Pembayaran SPP 🎓

Aplikasi desktop Java sederhana untuk manajemen pembayaran SPP Siswa. Proyek ini dibuat untuk memenuhi tugas **Ujian Akhir Semester (UAS) Pemrograman Berorientasi Objek**.

## 📌 Tentang Proyek Ini

Ini adalah aplikasi berbasis Java Swing yang memiliki fitur:

- **Login Admin**: (Username: `admin`, Password: `123`).
- **CRUD Data Siswa**: Bisa Tambah, Edit, Hapus data siswa.
- **Transaksi SPP**: Input pembayaran bulanan.
- **Laporan Otomatis**: Mencetak kuitansi/laporan menggunakan **JasperReports**.
- **Database**: Menggunakan MySQL `dbProjectSiswa`.

---

## 📂 Struktur Penting

Agar tidak bingung saat clone atau download, perhatikan folder ini:

### 1. `dist/` (WAJIB ADA)

Folder ini **SANGAT PENTING**. Isinya adalah:

- `SistemPembayaranSPP.jar`: File aplikasi utama yang siap dijalankan (Executable).
- `lib/`: Folder berisi semua library pendukung (MySQL Driver, JasperReports, dll).

> **Catatan**: Jika ingin menjalankan aplikasi tanpa membuka NetBeans, Anda **HARUS** masuk ke folder `dist` ini. Jangan jalankan jar dari luar folder ini karena nanti error "Library not found".

### 2. `src/config/Connect.java`

Ini adalah file pengatur koneksi ke database.

- **Database**: `dbProjectSiswa`
- **User**: `root`
- **Password**: `root` (Sesuaikan dengan settingan XAMPP Anda di sini jika berbeda).

---

## 🛠 Cara Menjalankan Aplikasi

Ada dua cara untuk menjalankan aplikasi ini:

### Cara 1: Langsung Pakai (Tanpa Coding)

Cocok untuk Dosen atau Pengguna yang ingin langsung lihat hasilnya.

1.  Pastikan **Java (JDK 21 atau lebih baru)** sudah terinstall.
2.  Nyalakan **XAMPP (MySQL)**.
3.  Buka Terminal (CMD / PowerShell).
4.  Masuk ke folder `dist` di dalam proyek ini:
    ```bash
    cd dist
    ```
5.  Ketikan perintah ini:
    ```bash
    java -jar SistemPembayaranSPP.jar
    ```
    _(Akan muncul jendela Login. Masukkan `admin` / `123`)_

### Cara 2: Lewat NetBeans (Untuk Edit Kodingan)

1.  Buka **NetBeans**.
2.  Open Project -> Pilih folder `SistemPembayaranSPP`.
3.  Pastikan Library sudah terload (klik kanan `Libraries` -> `Resolve Missing Problems` jika ada seru merah).
4.  Tekan **Clean and Build** (Gambar Palu & Sapu).
5.  Tekan **Run** (Segitiga Hijau).

---

## 📦 Daftar Library & Download

Aplikasi ini menggunakan beberapa library eksternal. Semua library ini **SUDAH ADA di dalam folder `dist/lib`**, jadi Anda tidak perlu download manual lagi kalau cuma mau run.

Tapi kalau butuh referensi atau mau download ulang, ini link resminya (Maven Central):

1.  **MySQL Connector/J** (Driver Database)
    - Versi: 8.x / 9.x
    - [Download di sini](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j)
2.  **JasperReports** (Engine Laporan)
    - Versi: 6.20.0
    - [Download di sini](https://mvnrepository.com/artifact/net.sf.jasperreports/jasperreports/6.20.0)
3.  **Commons BeanUtils** (Pendukung Jasper)
    - Versi: 1.9.4
    - [Download di sini](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils/1.9.4)
4.  **Commons Collections**
    - Versi: 3.2.2
    - [Download di sini](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)
5.  **Commons Digester**
    - Versi: 2.1
    - [Download di sini](https://mvnrepository.com/artifact/commons-digester/commons-digester/2.1)
6.  **Commons Logging**
    - Versi: 1.2
    - [Download di sini](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)
7.  **iText** (PDF Generator untuk Jasper)
    - Versi: 2.1.7
    - [Download di sini](https://mvnrepository.com/artifact/com.lowagie/itext/2.1.7)

---

## ⚠️ Troubleshooting

**Q: Pas dijalankan muncul `UnsupportedClassVersionError`?**
A: Itu artinya Java di komputer Anda terlalu tua. Project ini pakai **Java 21**. Update JDK Anda atau install Java 21.

**Q: Pas dijalankan muncul `NoClassDefFoundError` / Gagal Konek Database?**
A: Pastikan Anda menjalankan jar dari **DALAM folder `dist`**. Kalau dijalankan dari luar folder dist, aplikasi gak bisa nemu folder `lib`.

---

_Selamat Mencoba! Jangan lupa kasih Bintang di GitHub ya! ⭐_
