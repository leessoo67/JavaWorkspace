package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        int score = 93;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        //정수 + 실수 연산
        score = 93 + (int)98.8; // 93 +93
        System.out.println(score);//191

        score_d = (double) 93 + 98.8; // 93 +98.8
        System.out.println(score_d);

        //변수에 형변환된 데이터 집어 넣기
        double convertedScoreDouble = score; //191 > 191.0
        // int > long > float > double (자동 형변환)
        System.out.println(convertedScoreDouble);

        int convertedScoreInt = (int)score_d; //191.8 > 191
        System.out.println(convertedScoreInt);
        //double >float > long > int (수동 형변환)

        //숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);



        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);


        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);



    }

}
