package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN] : ");
        String enter = sc.next(); // 입력받기

        AuthGrade myGrade = AuthGrade.valueOf(enter); // 입력받은 등급을 열거형으로 변환

        greeting(myGrade);
        menuList(myGrade);
    }

    public static void greeting(AuthGrade grade){
        System.out.println("당신의 등급은 " + grade.getDescription() + "입니다.");
    }


    public static void menuList(AuthGrade grade){
        System.out.println("==메뉴 목록==");
//        if (grade == AuthGrade.GUEST){
//            System.out.println("- 메인 화면");
//        }else if (grade == AuthGrade.LOGIN){
//            System.out.println("- 메인 화면");
//            System.out.println("- 이메일 관리 화면");
//        }else if (grade == AuthGrade.ADMIN){
//            System.out.println("- 메인 화면");
//            System.out.println("- 이메일 관리 화면");
//            System.out.println("- 관리자 화면");
//        }else{
//            System.out.println("잘못된 입력");
//        }

        if (grade.getLevel() > 0){
            System.out.println("- 메인 화면");
        }
        if (grade.getLevel() > 1){
            System.out.println("- 이메일 관리 화면");
        }
        if (grade.getLevel() > 2){
            System.out.println("- 관리자 화면");
        }
    }
}
