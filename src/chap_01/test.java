package chap_01;

import javax.swing.*;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = JOptionPane.showInputDialog("띄어쓰기로 구분해주세요");

        // 입력받은 문자열을 공백 기준으로 분리 반환은 배열
        String[] parts = input.split(" ");

        // 각각의 문자열을 배열 정수로 변환
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);


        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


