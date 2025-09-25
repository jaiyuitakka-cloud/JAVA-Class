import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 자기소개 프로그램 ===");


        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.print("키(cm)를 입력하세요: ");
        double height = scanner.nextDouble();

        System.out.println("\n=== 당신의 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
        System.out.println("키: " + height + "cm");

        System.out.println("\n안녕하세요, " + name + "님! 반갑습니다! 🎉");

        scanner.close();
        
    }
}