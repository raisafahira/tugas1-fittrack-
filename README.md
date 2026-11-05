# FitTrack - Sistem Keanggotaan Gym

## Judul dan Identitas

- **Nama Tugas:** Remedial UTS / Tugas 1 - Sistem Keanggotaan Gym FitTrack
- **Nama:** Raisa Fahira
- **NPM:** 250810701100093
- **Kelas:** Praktikum PBO A
- **Periode Pengerjaan:** 16 Oktober 2026 sampai 5 November 2026

## Deskripsi Singkat

FitTrack merupakan program pendataan anggota gym berbasis Java console. Program ini digunakan untuk mencatat informasi anggota, seperti nama, nomor telepon, tanggal pendaftaran, dan jenis paket keanggotaan. Program menerapkan validasi input agar data yang disimpan sesuai dengan ketentuan dan mempertahankan data sebelumnya apabila terjadi kesalahan saat pengubahan data.

## Fitur Utama

- **Pendaftaran Anggota:** Membuat objek anggota dengan paket yang dipilih atau menggunakan paket default `Basic`.
- **Validasi Nama:** Menolak nama yang kosong atau hanya berisi spasi.
- **Validasi Nomor Telepon:** Memastikan nomor telepon diawali angka `0` dan memiliki minimal 10 digit.
- **Validasi Tanggal:** Memastikan tanggal pendaftaran menggunakan format `dd-MM-yyyy`.
- **Validasi Jenis Paket:** Hanya menerima paket `Basic`, `Premium`, dan `VIP`.
- **Menjaga Data Anggota:** Jika input setter tidak valid, nilai baru ditolak dan data sebelumnya tetap dipertahankan.
- **Penyimpanan Data dalam Array:** Menyimpan beberapa objek anggota dalam satu array.
- **Menampilkan Informasi Anggota:** Menampilkan informasi seluruh anggota menggunakan perulangan `for` dan method `toString()`.

## Konsep OOP yang Diterapkan

| Konsep OOP | Lokasi Penerapan | Alasan Penerapan |
|---|---|---|
| **Encapsulation** | Class `Member`, atribut `private`, getter, dan setter | Melindungi atribut agar tidak diubah secara langsung dari luar class. Perubahan data dilakukan melalui setter yang memiliki validasi. |
| **Constructor Overloading** | Class `Member`, constructor 3 dan 4 parameter | Memberikan pilihan pembuatan objek dengan paket khusus atau menggunakan paket default `Basic`. |
| **Method Overriding** | Method `toString()` pada class `Member` | Mengubah perilaku bawaan `Object.toString()` agar menampilkan informasi anggota dalam format teks yang sesuai. |
| **Class & Object** | `Member.java` dan `TesFitTrack.java` | Class `Member` menjadi cetak biru data anggota, sedangkan `TesFitTrack` digunakan untuk membuat dan menguji objek. |
| **DRY (Don't Repeat Yourself)** | Constructor memanggil setter | Memusatkan validasi pada setter sehingga pemeriksaan data tidak perlu ditulis ulang di dalam constructor. |
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

## Prasyarat

- **JDK:** JDK 21
- **IDE yang digunakan:** Visual Studio Code
- **IDE alternatif:** IntelliJ IDEA
- **Terminal:** Command Line atau terminal bawaan IDE

Pastikan JDK sudah terpasang. Versi Java dapat diperiksa dengan perintah:

```bash
java -version
javac -version
```

## Nilai Default

Program menggunakan nilai default `Basic` untuk jenis paket apabila objek dibuat melalui constructor dengan tiga parameter.

Jika data yang dimasukkan melalui setter tidak valid, program tidak mengganti data tersebut dengan nilai default. Program akan menampilkan pesan kesalahan dan mempertahankan nilai sebelumnya.

## Cara Menjalankan Program

### 1. Melalui Command Line (Terminal)

1. Buka terminal pada folder utama project `tugas1-fittrack`.
2. Kompilasi program dengan perintah:

   ```bash
   javac src/*.java
   ```

3. Jalankan program dengan perintah:

   ```bash
   java -cp src TesFitTrack
   ```

### 2. Melalui Visual Studio Code

1. Buka folder project `tugas1-fittrack` di Visual Studio Code.
2. Pastikan JDK sudah terpasang.
3. Buka terminal melalui menu **Terminal → New Terminal**.
4. Jalankan perintah kompilasi dan eksekusi seperti langkah command line di atas.

### 3. Melalui IntelliJ IDEA

1. Buka IntelliJ IDEA.
2. Pilih **Open**, lalu pilih folder project `tugas1-fittrack`.
3. Pastikan JDK sudah dikonfigurasi pada project.
4. Buka file `TesFitTrack.java`.
5. Jalankan program melalui tombol **Run** pada class tersebut.

## Contoh Output Program

Program diuji dengan membuat beberapa objek anggota, melakukan pengujian validasi setter, dan menampilkan data anggota melalui array.

Contoh output pengujian:

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

## Batasan dan Pengembangan Lanjutan

- Program masih berbasis console dan belum memiliki antarmuka grafis.
- Data anggota disimpan dalam array dan belum disimpan secara permanen ke database atau file.
- Validasi tanggal saat ini memeriksa format `dd-MM-yyyy`, tetapi belum memastikan bahwa tanggal tersebut benar-benar valid dalam kalender.
- Pengembangan selanjutnya dapat mencakup penyimpanan data permanen, fitur pencarian anggota, serta antarmuka grafis yang lebih mudah digunakan.

## Kesimpulan

Program FitTrack menerapkan konsep dasar Pemrograman Berorientasi Objek, seperti class, object, encapsulation, constructor overloading, dan method overriding. Program dapat membuat dan memvalidasi data anggota serta menampilkan informasi anggota melalui array dan perulangan.
