/**
 * Program utama sistem keanggotaan gym FitTrack.
 */
public class Main {

    public static void main(String[] args) {
        Member anggota = new Member(
                "Raisa",
                "081234567890",
                "29-10-2026",
                "Basic"
        );

        anggota.tampilkanInfo();

        // Menguji validasi nomor telepon
        try {
            anggota.setNoTelepon("123");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Menguji validasi jenis paket
        try {
            anggota.setJenisPaket("Gold");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
