package perpustakaan;

class Buku {
    public String judulBuku;
    public String pengarang;
    public String nomorISBN;
    public boolean statusKetersediaan;

    public Buku(String judulBuku, String pengarang, String nomorISBN) {
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.nomorISBN = nomorISBN;
        this.statusKetersediaan = true;
    }

    public void tambahKeKoleksi() {
        System.out.println("Buku " + judulBuku + " ditambahkan ke koleksi.");
        System.out.println("-----------------------------");
    }

    public boolean cekKetersediaan() {
        return statusKetersediaan;
    }

    public void setKetersediaan(boolean ketersediaan) {
        this.statusKetersediaan = ketersediaan;
    }

    public String getJudulBuku() {
        return judulBuku;
    }
}
