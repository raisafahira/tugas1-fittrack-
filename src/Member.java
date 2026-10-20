
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
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.tanggalDaftar = tanggalDaftar;
        this.jenisPaket = jenisPaket;
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
}
