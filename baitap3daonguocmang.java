package LEC_7strings;
import java.util.Scanner;

public class baitap3daonguocmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        String daoNguoc = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            daoNguoc += s.charAt(i);
        }

        System.out.println("Chuoi dao nguoc: " + daoNguoc);
    }
}
