import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng chọn điều kiện: ");
        int a = sc.nextInt();
        System.out.print("Nhập số tiền cần đổi: ");
        int b =sc.nextInt();
        switch (a){
            case 1:
                System.out.print(b + "VND =" + b/23000 + "USD");
                break;
            case 2:
                System.out.print(b + "USD = " + b*23000 + "VND");
                break;
            default:
                System.out.print("Kết thúc chương trình!");
        }
    }
}
