package chap_01;
//


public class _Quiz_01 {
    public static void main(String[] args) {

        // 1. 버스 번호를 문자열로 받음. 숫자도 문자형으로 "문자 + 숫자(문자로 변경)"
        // 2. 60분이 넘어가면 안됨
        // 3. 거리는 실수로. double

        String bus_num = "상암08";
//        String a =  String.valueOf(08); // 08은 안됌. 실수를 문자로 변환.


        int time = 3;
        double c = 1.5;




        System.out.println( bus_num+"번 버스");
        System.out.println("약"+ time +"분 후 도착");
        System.out.println("남은 거리"+ c +"km");

    }
}
