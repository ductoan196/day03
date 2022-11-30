public class HomworkDay03 {
    public static void main(String[] args) {
//        Scanner practice1 = new Scanner(System.in);
//
//        int a = 10;
//
//        int b = 3;
//
//        System.out.printf("%d + %d = %d\n", a,b, a+b );
//        System.out.printf("%d - %d = %d\n", a,b, a-b );
//        System.out.printf("%d / %d = %.2f", a,b, (double)a/b);
//
//    }
        System.out.println(repeatString("a"));
        System.out.println(repeatString1("a"));

        System.out.println(repeatStrin2("a", 5));

        System.out.println(sumNumber(100));

        System.out.println(listNumber(100));
    }
    //Bài 1
    public static String repeatString(String str1) {
        String total = "";
        for (int i = 0; i < 10; i++) {
            total += str1;
        }
        return total;
    }

    //Bài 2
    public static String repeatString1(String str2) {
        String total = str2;
        for (int i = 0; i < 9; i++) {
            total += "-" + str2;
        }
        return total;
    }

    //Bài 3
    public static String repeatStrin2(String str3, int number) {
        String total = str3;
        for (int i = 1; i < number; i++) {
            total += "-" + str3;

        }
        return total;
    }
    //Bài 4. Viết method tính tổng các số chia hết cho 5 từ 0 -> 100

    public static int sumNumber(int number1){
        int total = 0;
        for (int i = 0; i <= (number1); i++) {
            if (i % 5 == 0){
                total += i;
            }
        }
        return total;
    }

    //Bài 6: Viết method để in ra các số từ 1 đến 100.

    public static int listNumber(int number2) {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            }
            System.out.println(i);
        }
        return i;
    }
}