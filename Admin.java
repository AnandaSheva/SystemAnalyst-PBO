package perpustakaan;

public class Admin {
    public String id;
    public String nama;
    public String alamat;
    public String nomorTelepon;
    
    public void login() {
        System.out.println("Admin " + nama + " telah berhasil login.");
        System.out.println("-----------------------------");
    }

    public void logout() {
        System.out.println("Admin " + nama + " telah berhasil logout.");
        System.out.println("-----------------------------");
    }
}

