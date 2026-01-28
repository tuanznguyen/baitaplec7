package LEC_7strings;

public class baitap2demsotutrongkhoangcach {

    public static void main(String[] args) {
        String s = "I love Java";
        String[] words = s.trim().split("\\s+");
        System.out.println("in ra so ky tu:" + words.length);
    }
}