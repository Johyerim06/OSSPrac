import java.util.Scanner; // 입력을 받기 위해 Scanner 클래스 사용

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("학번을 입력하세요: ");
        String studentId = sc.nextLine();

        System.out.println("\n<출력>");
        System.out.println("이름: " + name);
        System.out.println("학번: " + studentId);

        sc.close();
    }
}
