package chap_01;
import javax.swing.*;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;


public class Test_9_25_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("띄어쓰기로 구분해주세요");

        //라인을 한 줄로 받음
        String input = scanner.nextLine();

        String[] parts = input.split(" ");

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
