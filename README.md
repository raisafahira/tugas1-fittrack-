# FitTrack - Sistem Keanggotaan Gym


- **Nama Tugas:** Remedial UTS / Tugas 1 - Sistem Keanggotaan Gym FitTrack
- **Nama:** Raisa Fahira
- **NPM:** 250810701100093
- **Kelas:** Praktikum PBO A

## Deskripsi Singkat

Sistem pendataan anggota berbasis Java console untuk gym FitTrack. Program ini digunakan untuk mencatat data anggota, seperti nama, nomor telepon, tanggal pendaftaran, dan jenis paket. Program juga menerapkan validasi input untuk mengurangi kesalahan data serta mempertahankan data sebelumnya apabila terjadi kesalahan saat pengubahan data.

## Fitur Utama

- **Pendaftaran Member Fleksibel:** Mendukung pembuatan anggota dengan paket khusus maupun menggunakan paket default `Basic`.
- **Validasi Data Member:** Menolak nama kosong, nomor telepon yang tidak diawali angka 0 atau kurang dari 10 digit, serta tanggal dengan format yang tidak sesuai.
- **Validasi Jenis Paket:** Hanya menerima paket `Basic`, `Premium`, dan `VIP`.
- **Pencegahan Data Tidak Valid:** Jika terjadi kesalahan input pada setter, sistem menolak nilai baru dan mempertahankan data sebelumnya.
- **Penyimpanan Data dalam Array:** Menyimpan beberapa objek anggota ke dalam satu array.
- **Menampilkan Informasi Member:** Menampilkan seluruh informasi anggota menggunakan perulangan `for` dan method `toString()`.

## Konsep OOP yang Diterapkan

| **Konsep OOP** | **Lokasi Penerapan** | **Alasan Penerapan** |
|---|---|---|
| **Encapsulation** | Class `Member` (atribut `private`, getter, dan setter) | Melindungi atribut agar tidak diubah secara langsung dari luar class. Perubahan data dilakukan melalui setter yang memiliki validasi. |
| **Constructor Overloading** | Class `Member` (constructor 3 dan 4 parameter) | Memberikan pilihan pembuatan objek dengan paket khusus atau menggunakan paket default `Basic`. |
| **Method Overriding** | Method `toString()` pada class `Member` | Mengubah perilaku bawaan `Object.toString()` agar menampilkan informasi anggota dalam format teks yang rapi. |
| **Class & Object** | `Member.java` dan `TesFitTrack.java` | Memisahkan class sebagai cetak biru anggota dengan class yang digunakan untuk menguji objek. |
| **DRY (Don't Repeat Yourself)** | Constructor memanggil setter | Memusatkan validasi data pada setter sehingga pemeriksaan tidak perlu ditulis ulang di dalam constructor. |
| **Array** | Class `TesFitTrack` | Menyimpan beberapa objek anggota dalam satu array. |
| **Iteration** | Perulangan `for` pada class `TesFitTrack` | Menampilkan seluruh informasi anggota yang tersimpan dalam array. |

## Struktur Proyek

```text
tugas1-fittrack/
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
├── .gitignore
└── README.md
```

## Validasi Data Member

| **Atribut** | **Kriteria Validasi** | **Ketentuan** |
|---|---|---|
| **Nama Member** | Tidak boleh `null`, kosong, atau hanya berisi spasi. | Nama yang valid disimpan setelah spasi di awal dan akhir dihapus. |
| **Nomor Telepon** | Wajib diawali angka `0` dan memiliki minimal 10 digit. | Hanya menerima angka sesuai ketentuan. |
| **Tanggal Daftar** | Wajib berformat `dd-MM-yyyy`. | Memeriksa kesesuaian format tanggal. |
| **Jenis Paket** | Hanya menerima `Basic`, `Premium`, atau `VIP`. | Paket default adalah `Basic` jika menggunakan constructor 3 parameter. |

Jika data yang dimasukkan tidak valid melalui setter, program akan menampilkan pesan kesalahan dan mempertahankan data sebelumnya.

## Cara Menjalankan Program

### 1. Melalui Command Line (Terminal)

1. Buka terminal pada folder utama project.
2. Kompilasi program Java dengan perintah:

   ```bash
   javac src/*.java
   ```

3. Jalankan program dengan perintah:

   ```bash
   java -cp src TesFitTrack
   ```

### 2. Melalui Visual Studio Code

1. Buka folder project `tugas1-fittrack` di Visual Studio Code.
2. Pastikan Java Development Kit (JDK) sudah terpasang.
3. Buka terminal melalui menu **Terminal → New Terminal**.
4. Jalankan perintah kompilasi dan program seperti langkah di atas.

## Contoh Output Program

Berikut merupakan hasil pengujian program FitTrack yang dijalankan melalui terminal.

```text
=== PENGUJIAN 1: INSTANSIASI OBJEK ===

=== PENGUJIAN VALIDASI SETTER ===
>> Mengubah paket menjadi SuperVIP:
Paket harus Basic, Premium, atau VIP.
>> Mengubah nama menjadi kosong:
Nama tidak boleh kosong.
>> Mengubah nomor telepon:
Nomor telepon harus diawali 0 dan minimal 10 digit.
>> Mengubah format tanggal:
Format tanggal harus dd-MM-yyyy.

=== PENGUJIAN CETAK DATA ARRAY ===
Nama: Farhan Akbar, Nomor Telepon: 081298765432, Tanggal Daftar: 18-10-2026, Jenis Paket: Basic
Nama: Nabila Putri, Nomor Telepon: 082187654321, Tanggal Daftar: 19-10-2026, Jenis Paket: Premium
Nama: Rizky Pratama, Nomor Telepon: 083176543210, Tanggal Daftar: 20-10-2026, Jenis Paket: Basic
Nama: Salsabila Azzahra, Nomor Telepon: 084165432109, Tanggal Daftar: 21-10-2026, Jenis Paket: VIP
```

## Kesimpulan

Program FitTrack telah menerapkan konsep dasar Pemrograman Berorientasi Objek, seperti class, object, encapsulation, constructor overloading, dan method overriding. Program juga dapat melakukan validasi data anggota serta menampilkan informasi anggota melalui array dan perulangan.

