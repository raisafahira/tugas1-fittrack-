// Menyimpan objek ke dalam array
Member[] arrayMember = {
        member1, member2, member3, member4
};

System.out.println("\n=== PENGUJIAN VALIDASI SETTER ===");

// Menguji paket tidak valid
System.out.println(">> Mengubah paket menjadi SuperVIP:");
member1.setJenisPaket("SuperVIP");

// Menguji nama kosong
System.out.println(">> Mengubah nama menjadi kosong:");
member2.setNama("   ");

// Menguji nomor telepon tidak valid
System.out.println(">> Mengubah nomor telepon:");
member3.setNoTelepon("12345");

// Menguji tanggal tidak valid
System.out.println(">> Mengubah format tanggal:");
member4.setTanggalDaftar("18/10/2026");
