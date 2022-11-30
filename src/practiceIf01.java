import java.util.Scanner;

public class practiceIf01 {
    public static void main(String[] args) {

        //Thực hành bài 2
        int mark = 85;

        if (mark >= 85) {
            System.out.println("A");
        } else if (70 <= mark && mark < 85) {
            System.out.println("B");
        } else if (40 <= mark && mark < 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        //Thực hành bài 1
        Scanner practice1 = new Scanner(System.in);

        System.out.print("Nhập height = ");
        float height = practice1.nextFloat();

        System.out.print("Nhập weight = ");
        float weight = practice1.nextFloat();

        float BMI = (float) (weight/Math.pow(height,2));
        System.out.printf("%s = %.2f", "BMI" , BMI );

        if (BMI <18.5){
            System.out.println("Thiếu cân");
        } else if (18.5 <= BMI && BMI <= 24.9 ) {
            System.out.println();
            System.out.println("Bình thường");
        }
        else {
            System.out.println("Thừa cân");
        }
    }
}
