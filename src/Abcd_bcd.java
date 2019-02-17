import java.util.Scanner;

public class Abcd_bcd {
    Abcd_bcd()
    {
        System.out.println("constructor");
    }
    public void findAbc(String input) {
        int index = input.indexOf("abc");
        while (true) {
            if (index == -1) {
                break;
            }
            String found = input.substring(index+1, index+4);
            System.out.println(found);
            System.out.println(index);
            index = input.indexOf("abc", index+4);
        }
    }

    public static void main(String[] args) {
        Abcd_bcd g =new Abcd_bcd();
        Scanner b =new Scanner(System.in);
        String l =b.nextLine();
        g.findAbc(l);

    }
}
