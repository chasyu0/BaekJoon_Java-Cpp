import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // 점수 배열, 등급 배열
        double[] score = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        
        double totalScore = 0.0; 	// 학점 * 점수
        double totalCredit = 0.0;	// 학점 합
        
        // P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외
        for(int i=0; i<20; i++) {
        	
        	//과목명, 학점, 등급
			String subjects = sc.next();
			double credit = sc.nextDouble();
			String inputGrade = sc.next();
		
        	if(inputGrade.equals("P")) continue;
        	
        	for(int j=0; j<grade.length; j++) {
        		if(grade[j].equals(inputGrade)) {
        		totalScore += credit * score[j];
        			totalCredit += credit;
        			break;
        		}
        	}
        }
        
        // 전공평점 = (학점 * 과목평점)의 합 
        System.out.printf("%.5f\n", totalScore/totalCredit);
        	 sc.close();
        	}
        } 
