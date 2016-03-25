
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BukuAlamat[] bukualamat = new BukuAlamat[0];
        String loop = "y";
        int x = 0, i = 0;
        do {
            cetakMenu();
            switch (scan.next()) {
                case "1":
                    bukualamat = Arrays.copyOf(bukualamat, bukualamat.length + 1);
                    BukuAlamat.inputBukuAlamat(bukualamat, x);
                    x++;
                    break;
                case "2":
                    BukuAlamat.cetakBukuAlamat(bukualamat);
                    edit();
                    i = scan.nextInt();
                    if((i-1)<bukualamat.length){
                    BukuAlamat.editBukuAlamat(bukualamat, i);}
                    else dataNull();
                    break;
                case "3":
                    BukuAlamat.cetakBukuAlamat(bukualamat);
                    hapus();
                    i = scan.nextInt();
                    yakinHapus();
                    if (scan.next().equals("y")&&(i-1)<bukualamat.length) {
                        BukuAlamat.deleteBukuAlamat(bukualamat, i);
                    }
                    else dataNull();
                    break;
                case "4":
                    BukuAlamat.cetakBukuAlamat(bukualamat);
                    break;
                case "0":
                    loop = "n";
                    break;
            }

        } while (loop.equals("y"));

    }

    public static void cetakMenu() {
        System.out.println("MENU UTAMA");
        System.out.println("1. Menambah Data");
        System.out.println("2. Mengubah Data");
        System.out.println("3. Menghapus Data");
        System.out.println("4. Melihat Data");
        System.out.println("0. Keluar");
        System.out.print("Pilih : ");
    }

    public static void hapus() {
        System.out.print("Hapus nomor ke? ");
    }

    public static void edit() {
        System.out.print("Edit nomor ke? ");
    }

    public static void yakinHapus() {
        System.out.print("Yakin data dihapus(y/n)?");
    }
    
    public static void dataNull(){
        System.out.println("Data tidak ada\n");
    }

}
