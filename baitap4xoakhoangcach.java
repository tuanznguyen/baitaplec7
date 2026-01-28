package LEC_7strings;

public class baitap4xoakhoangcach {
    public static void main(String[] args) {
        String s = " Hello  World ! ";

        s = s.trim(); 

        s = s.replaceAll("\\s+", " "); 

        System.out.println("xoa khoang cach trang: "+s);
    }
}