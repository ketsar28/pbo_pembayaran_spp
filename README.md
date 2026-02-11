# Sistem Pembayaran SPP 🎓

Aplikasi desktop Java Swing sederhana untuk manajemen pembayaran SPP Siswa. Proyek ini dibuat untuk memenuhi tugas **Ujian Akhir Semester (UAS) Pemrograman Berorientasi Objek**.

## 🚀 Fitur Utama

- **Login & Logout**: Akses aman (Default: admin/123).
- **CRUD Data Siswa**: Tambah, Edit, Hapus data siswa.
- **Transaksi Pembayaran**: Input pembayaran SPP per bulan.
- **Laporan (JasperReports)**: Cetak bukti pembayaran atau laporan data siswa (PDF/Preview).
- **Auto-Increment ID**: ID Siswa otomatis terisi.

---

## 🛠 Teknologi yang Digunakan

- **Bahasa**: Java (Disarankan **JDK 21** atau lebih baru).
- **IDE**: NetBeans / IntelliJ IDEA.
- **Database**: MySQL (via XAMPP/WAMP).
- **Reporting**: JasperReports 6.20.0.
- **Build Tool**: Ant (Default NetBeans).

---

## 📦 Library & Dependencies (Wajib)

Berikut adalah daftar library eksternal yang digunakan. Pastikan semua file `.jar` ini ada di folder `dist/lib` atau `lib` agar aplikasi berjalan lancar.

| Library                         | Versi     | Link Download (Maven Repo)                                                                   |
| :------------------------------ | :-------- | :------------------------------------------------------------------------------------------- |
| **MySQL Connector/J**           | 9.x / 8.x | [Download](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j)                   |
| **JasperReports**               | 6.20.0    | [Download](https://mvnrepository.com/artifact/net.sf.jasperreports/jasperreports/6.20.0)     |
| **Apache Commons BeanUtils**    | 1.9.4     | [Download](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils/1.9.4)     |
| **Apache Commons Collections**  | 3.2.2     | [Download](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2) |
| **Apache Commons Collections4** | 4.4       | [Download](https://mvnrepository.com/artifact/org.apache.commons/commons-collections4/4.4)   |
| **Apache Commons Digester**     | 2.1       | [Download](https://mvnrepository.com/artifact/commons-digester/commons-digester/2.1)         |
| **Apache Commons Logging**      | 1.2       | [Download](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)           |
| **iText** (PDF Generator)       | 2.1.7     | [Download](https://mvnrepository.com/artifact/com.lowagie/itext/2.1.7)                       |

---

## ⚙️ Cara Install & Setup

### 1. Persiapan Database

1. Nyalakan **MySQL** di XAMPP.
2. Buka **phpMyAdmin** atau tool database lainnya.
3. Buat database baru (misal: `db_spp`).
4. Pastikan nama database sesuai dengan konfigurasi di file `src/config/Koneksi.java`.
5. Import file SQL (jika disertakan) atau buat tabel sesuai kebutuhan aplikasi.

### 2. Cara Menjalankan via File JAR (Produksi)

Ini cara paling gampang buat demo ke Dosen atau User lain tanpa buka kodingan.

1. Buka terminal (CMD atau PowerShell).
2. Masuk ke folder `dist` di dalam folder proyek ini.
   ```bash
   cd dist
   ```
3. Jalankan perintah berikut:

   ```bash
   java -jar SistemPembayaranSPP.jar
   ```

   > **PENTING**: Jangan jalankan file `.jar` dari luar folder `dist`, karena nanti error "Library Not Found". File `.jar` harus berteman dengan folder `lib` yang ada di sebelahnya.

### 3. Cara Menjalankan via NetBeans (Development)

1. Buka **NetBeans**.
2. File -> **Open Project** -> Pilih folder `SistemPembayaranSPP`.
3. Klik Kanan nama Project -> **Clean and Build**.
4. Klik tombol **Run Project** (Segitiga Hijau) atau tekan `F6`.

---

## 📝 Catatan Tambahan

- **Versi Java**: Project ini dikompilasi menggunakan target **Java 21**. Jika komputer Anda menggunakan Java versi lama (misal Java 8), silakan update Java Anda atau ubah setting `javac.source` di `nbproject/project.properties`.
- **Koneksi Gagal?**: Cek username dan password MySQL Anda di `src/config/Koneksi.java`. Default XAMPP biasanya user: `root`, password: (kosong).

---

_Dibuat oleh Muhammad Ketsar Ali Abi Wahid - 2026_
