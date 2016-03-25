
import java.util.*;
public class BukuAlamat {

    Scanner scan = new Scanner(System.in);
    private String Nama;
    private String Alamat;
    private String NomorTelepon;
    private String Email;

    public BukuAlamat() {
        this.Nama = "";
        this.Alamat = "";
        this.NomorTelepon = "";
        this.Email = "";
    }

    public BukuAlamat(String nama, String alamat, String nomorTelepon, String email) {
        this.Nama = nama;
        this.Alamat = alamat;
        this.NomorTelepon = nomorTelepon;
        this.Email = email;
    }

    public void setNama() {
        System.out.print("Nama\t: ");
        this.Nama = scan.nextLine();
    }

    public void setAlamat() {
        System.out.print("Alamat\t: ");
        this.Alamat = scan.nextLine();
    }

    public void setNomorTelepon() {
        System.out.print("Telepon\t: ");
        this.NomorTelepon = scan.nextLine();
    }

    public void setEmail() {
        System.out.print("Email\t: ");
        this.Email = scan.nextLine();
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getNomorTelepon() {
        return NomorTelepon;
    }

    public String getEmail() {
        return Email;
    }

    public static void cetakBukuAlamat(BukuAlamat[] bukualamat) {
        System.out.println("\nNO\tNAMA\t\t\tALAMAT LENGKAP\t\t\tNOMOR TELEPON\t\tEMAIL");
        System.out.println("-------------------------------------------------------------------------------------------------");
        for (int x = 0; x < bukualamat.length; x++) {
            System.out.print((x+1)+"\t");
            if(bukualamat[x].getNama().equals(""))
                System.out.print("Dihapus\n");
            else{
            
            System.out.print(bukualamat[x].getNama() + "\t");
            System.out.print(bukualamat[x].getAlamat() + "\t");
            System.out.print(bukualamat[x].getNomorTelepon() + "\t");
            System.out.print(bukualamat[x].getEmail() + "\n");}
        }
        System.out.println("");
    }
    public static void inputBukuAlamat(BukuAlamat[] bukualamat, int x){
        System.out.println("\nINPUT DATA BARU");
        bukualamat[x] = new BukuAlamat();
        bukualamat[x].setNama();
        bukualamat[x].setAlamat();
        bukualamat[x].setNomorTelepon();
        bukualamat[x].setEmail();
        System.out.println("");
    }
    public static void deleteBukuAlamat(BukuAlamat[] bukualamat, int y){
        System.out.println("\nDATA BERHASIL DIDELETE");
        --y;
        bukualamat[y] = new BukuAlamat();
        System.out.println("");
    }
    public static void editBukuAlamat(BukuAlamat[] bukualamat, int y){
        System.out.println("\nEDIT DATA BUKU");
        --y;
        bukualamat[y] = new BukuAlamat();
        bukualamat[y].setNama();
        bukualamat[y].setAlamat();
        bukualamat[y].setNomorTelepon();
        bukualamat[y].setEmail();
        System.out.println("");
    }
}
   
  

