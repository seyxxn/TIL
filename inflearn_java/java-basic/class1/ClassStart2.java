package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int [] studentAges = {15, 16};
        int [] studentGrade = {90, 80};

        for(int i = 0; i < studentNames.length; i++){
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrade[i]);
        }

        // 배열을 사용하여 코드 변경 최소화는 성공했지만,
        // 한 학생의 데이터가 3개의 배열에 나누어져 저장되어있다는 한계가 존재
    }
}
