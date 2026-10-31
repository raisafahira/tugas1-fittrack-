
/**
 * Class TesFitTrack digunakan untuk menguji class Member.
 */
public class TesFitTrack {

    public static void main(String[] args) {

        System.out.println("=== PENGUJIAN 1: INSTANSIASI OBJEK ===");

        // Membuat objek anggota pertama
        Member member1 = new Member(
                "Farhan Akbar", "081298765432",
                "18-10-2026", "Basic");

        // Membuat objek anggota kedua
        Member member2 = new Member(
                "Nabila Putri", "082187654321",
                "19-10-2026", "Premium");

        // Membuat objek anggota ketiga dengan paket default
        Member member3 = new Member(
                "Rizky Pratama", "083176543210",
                "20-10-2026");

        // Membuat objek anggota keempat
        Member member4 = new Member(
                "Salsabila Azzahra", "084165432109",
                "21-10-2026", "VIP");
    }
}
