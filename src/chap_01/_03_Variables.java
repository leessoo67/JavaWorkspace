package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
//        String name;
//        name = "쑤쑤쑤";
        String name = "쑤우";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다."+ hour + " 시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되엇습니다.");

        double score = 90.5;
        char grade ='A';
        name = "이름바뀜";
        System.out.println(name + "님의 평균 점수는" + score + "점입니다.");
        System.out.println("학점은" + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요"  +  pass);

        double d = 3.1444444445;
        float f = 3.1444444445f;
        System.out.println(d);
        System.out.println(f);

        long l = 10000000000000000l; //long~ 자료 호호
        l = 1_0000_000_000l;
        System.out.println(l);
    }
}
