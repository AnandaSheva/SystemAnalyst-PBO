package perpustakaan;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Notifikasi {
    private String id;
    private Date tanggal;
    private String pesan;
    private AnggotaPerpustakaan anggota;

    public Notifikasi(String id, Date tanggal, String pesan, AnggotaPerpustakaan anggota) {
        this.id = id;
        this.tanggal = tanggal;
        this.pesan = pesan;
        this.anggota = anggota;
    }

    public void kirimNotifikasiPeminjaman() {
        System.out.println("Notifikasi Peminjaman - ID: " + id);
        System.out.println("Tanggal : " + formatDate(tanggal));
        System.out.println("Pesan : " + pesan);
        System.out.println("Dikirim kepada Anggota : " + anggota.getNama());
        System.out.println("-----------------------------");
    }

    public void kirimNotifikasiPengembalian() {
        System.out.println("Notifikasi Pengembalian - ID: " + id);
        System.out.println("Tanggal : " + formatDate(tanggal));
        System.out.println("Pesan : " + pesan);
        System.out.println("Dikirim kepada Anggota : " + anggota.getNama());
        System.out.println("-----------------------------");
    }

    private String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        try {
            return sdf.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return "Tanggal Invalid";
        }
    }
}

