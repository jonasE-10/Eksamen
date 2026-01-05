package util;

import java.util.Scanner;

public class TextUI {
    Scanner sc = new Scanner(System.in);

    public void dspMessage(String s){
        System.out.println(s);
    }
    public String inputMonth(String s){
        System.out.println(s);
        String a = sc.nextLine();
        return a;
    }
    public int inputNum(String s) {
        System.out.println(s);
        int a = Integer.parseInt(sc.nextLine());
        return a;
    }
    public boolean inputYN(String s){
        System.out.println(s+" (Y/N)");
        String a = sc.nextLine();
        if (a.equals("Y")){
            return true;
        }else {
            return false;
        }
    }
}
