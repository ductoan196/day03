public class switchCase {
    public static void main(String[] args) {

        //Bài 1
        int day = 5;

        switch (day) {
            case 0: {
                System.out.println("Hôm nay là chủ nhật");
                break;
            }
            case 1: {
                System.out.println("Hôm nay là thứ hai");
                break;
            }
            case 2: {
                System.out.println("Hôm nay là thứ 3");
                break;
            }
            case 3: {
                System.out.println("Hôm nay là thứ 4");
                break;
            }
            case 4: {
                System.out.println("Hôm nay là thứ 5");
                break;
            }
            case 5: {
                System.out.println("Hôm nay là thứ 6");
                break;
            }
            case 6: {
                System.out.println("Hôm nay là thứ 7");
                break;
            }
        }

        //Bài 2
        int month = 5;

        switch (month) {
            case 1:
            case 2:
            case 3: {
                System.out.println("Mùa xuân");
                break;
            }
            case 4:
            case 5:
            case 6: {
                System.out.println("Mùa hạ");
                break;
            }
            case 7:
            case 8:
            case 9: {
                System.out.println("Mùa thu");
                break;
            }
            case 10:
            case 11:
            case 12: {
                System.out.println("Mùa đông");
                break;
            }
        }
    }
}
