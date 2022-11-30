public class forDemo {
    public static void main(String[] args) {

        // begin : Khởi tạo giá trị ban đầu cho vòng lặp
        // condition : Điều kiện để tiếp tục chạy vòng lặp
        // step : Cập nhật giá trị sau mỗi lần lặp

        // Thực hiện cv thức dậy lúc 5h sáng
        // day++
        // day += 1
//        for(int day = 1; day <= 30; day = day + 1){
//            System.out.println("Ngày " + day +" thức dậy lúc 5h");
//        }

        //Ví dụ 2: ngày chẵn dậy lúc 5h, ngày lẻ dậy lúc 7h
//        for (int day = 1; day <= 30; day = day + 1) {
//            if (day % 2 == 0) {
//                System.out.println("Ngày " + day + " thức dậy lúc 5h");
//            } else {
//                System.out.println("Ngày " + day + " thức dậy lúc 7h");
//            }
//        }

        //ví dụ 3; Thực hiện đến ngày số 20 -> Chán quá không thực hiện nữa
//        for (int day = 1; day <= 30; day = day + 1) {
//            if (day == 20) {
//                System.out.println("Ngày " + day + "chán quá, từ bỏ");
//                break;
//            } else {
//                System.out.println("Ngày " + day + " thức dậy lúc 5h");
//            }
//        }
//
        // Ví dụ 4: Vẫn thực hiện cv nhưng cuối tuần không thực hiện

//        for (int day = 1; day <= 30; day = day + 1) {
//            if (day % 7== 0) {
//                System.out.println("Nghỉ xả hơi đi nhậu");
//                continue;
//                // continue: Bỏ qua vòng lặp hiện tại
//            } else {
//                System.out.println("Ngày " + day + " thức dậy lúc 5h");
//            }
////        }
//
//        // Tính tổng tiền tiết kiệm: Tiết kiệm tiền trong 10 ngày, mỗi ngày tiết kiệm 100k
//        int total = 0;
////        for (int day = 1; day <=10; day++ ){
////            total = total + 100_000; //total += 100_000;
////        }
//
//        for (int day = 1; day <=10; day++ ){
//            if(day>=5){
//                total += 200_000;
//            }
//            else {
//                total += 100_000;
//            }
//        }
//
//        System.out.println("Tổng tiền : " + total);

        System.out.println(repeatString("a"));
    }
    public static String repeatString(String str){

        String rs = "";
        for (int i = 0; i <10; i++) {
            rs += str;
        }
        return rs;

    }
}

