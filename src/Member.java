/**
 * Data anggota gym FitTrack.
 */
public class Member {

    // Batas digit telepon
    private static final int BATAS_DIGIT_TELEPON = 10;

    // Paket default
    private static final String PAKET_AWAL = "Basic";

    // Atribut anggota
    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    /**
     * Membuat data anggota baru.
     *
     * @param nama nama anggota
     * @param noTelepon nomor telepon
     * @param tanggalDaftar tanggal daftar
     * @param jenisPaket paket gym
     */
    public Member(String nama, String noTelepon,
              String tanggalDaftar, String jenisPaket) {
    setNama(nama);
    setNoTelepon(noTelepon);
    setTanggalDaftar(tanggalDaftar);
    setJenisPaket(jenisPaket);
}
    /**
     * Membuat anggota dengan paket Basic.
     *
     * @param nama nama anggota
     * @param noTelepon nomor telepon
     * @param tanggalDaftar tanggal pendaftaran
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, PAKET_AWAL);
    }

    /**
     * Mengambil nama anggota.
     *
     * @return nama anggota
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil nomor telepon anggota.
     *
     * @return nomor telepon
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengambil tanggal pendaftaran.
     *
     * @return tanggal pendaftaran
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengambil jenis paket anggota.
     *
     * @return jenis paket
     */
    public String getJenisPaket() {
        return jenisPaket;
    }
    
    // Mengubah nama anggota
    public void setNama(String nama) {
       if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama.trim();
        } else {
            throw new IllegalArgumentException(
                "Nama tidak boleh kosong."
            );
        }
    }

    // Mengubah nomor telepon
public void setNoTelepon(String noTelepon) {
    if (noTelepon != null
            && noTelepon.matches("0\\d{" + (BATAS_DIGIT_TELEPON - 1) + ",}")) {
        this.noTelepon = noTelepon;
    } else {
        throw new IllegalArgumentException(
            "Nomor telepon harus diawali 0 dan minimal "
            + BATAS_DIGIT_TELEPON + " digit."
        );
    }
}

    // Mengubah tanggal pendaftaran dengan validasi format
public void setTanggalDaftar(String tanggalDaftar) {
    if (tanggalDaftar != null
            && tanggalDaftar.matches("\\d{2}-\\d{2}-\\d{4}")) {
        this.tanggalDaftar = tanggalDaftar;
    } else {
        throw new IllegalArgumentException(
                "Format tanggal harus dd-MM-yyyy."
        );
    }
}
    
// Mengubah paket dengan validasi
public void setJenisPaket(String jenisPaket) {
    if (jenisPaket == null || jenisPaket.trim().isEmpty()) {
        throw new IllegalArgumentException(
                "Jenis paket tidak boleh kosong."
        );
    }

    String paket = jenisPaket.trim();

    if (paket.equalsIgnoreCase("Basic")
            || paket.equalsIgnoreCase("Premium")
            || paket.equalsIgnoreCase("VIP")) {
        this.jenisPaket = paket;
    } else {
        throw new IllegalArgumentException(
                "Paket harus Basic, Premium, atau VIP."
        );
    }
}
    
public void tampilkanInfo() {
    System.out.println("Nama: " + nama);
    System.out.println("Nomor Telepon: " + noTelepon);
    System.out.println("Tanggal Daftar: " + tanggalDaftar);
    System.out.println("Jenis Paket: " + jenisPaket);
}
/**
 * Memeriksa apakah anggota menggunakan paket tertentu.
 *
 * @param paket nama paket yang diperiksa
 * @return true jika paket sesuai
 */
public boolean memilikiPaket(String paket) {
    return paket != null
            && jenisPaket.equalsIgnoreCase(paket.trim());
}
/**
 * Menggabungkan informasi anggota menjadi satu teks.
 *
 * @return informasi anggota
 */
public String getInfoAnggota() {
    return "Nama: " + nama
            + ", Nomor Telepon: " + noTelepon
            + ", Tanggal Daftar: " + tanggalDaftar
            + ", Jenis Paket: " + jenisPaket;
}
}
