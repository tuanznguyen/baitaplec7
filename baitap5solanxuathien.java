package LEC_7strings;
import java.util.Scanner;

public class baitap5solanxuathien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap chuoi: ");
        String s = sc.nextLine();

        System.out.print("nhap ky tu can dem: ");
        char c = sc.next().charAt(0);

        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                dem++;
            }
        }

        System.out.println("so lan xuat hien cua " + c + " la: " + dem);
    }
}
