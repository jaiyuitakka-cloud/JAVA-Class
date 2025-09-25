public class method1 {
    public static void main(String[]args){
       
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;

        System.out.println("\n=== 간단한 계산 ===");
        System.out.println(num1 + " + " + num2 + " = " + sum);

        printCalculation(num1, num2, sum);
        printCalculation1(num1, num2, sum);
        sum_printresult(num1, num2);
    }

    private static void printCalculation(int number1, int number2, int result) {
        System.out.println("\\n=== 간단한 계산 ===");
        System.out.println(number1 + " + " + number2 + " = " + result);
    }

    public static void sum_printresult(int number1, int number2) {
        int result = number1 + number2;

        System.out.println("\\n=== 간단한 계산 ===");
        System.out.println(number1 + " + " + number2 + " = " + result);
    }

    private static void printCalculation1(int number1, int number2, int result) {
        System.out.println("\\n=== 간단한 계산 ===");
        System.out.println(number1 + " + " + number2 + " = " + result);
    }
}
