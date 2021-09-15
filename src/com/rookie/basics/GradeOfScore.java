package com.rookie.basics;

/**
 * 2、输入一个成绩a，使用switch结构求出a的等级。A：90-100，B：80-89，C：70-79，D：60-69，E：0~59（知识点：条件语句switch）
 */
public class GradeOfScore {
    public char getGrade(int score){
        switch (score/=10){
            case 10:
            case 9:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            default:
                return 'E';
        }
    }

    public static void main(String[] args){
        GradeOfScore gradeOfScore = new GradeOfScore();
        System.out.println(gradeOfScore.getGrade(67));
    }
}
