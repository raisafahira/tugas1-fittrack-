/**
 * Program utama sistem keanggotaan gym FitTrack.
 */
public class Main {

    public static void main(String[] args) {
        Member anggota = new Member(
                "Raisa",
                "081234567890",
                "28-10-2026",
                "Basic"
        );

        anggota.tampilkanInfo();
    }
}
