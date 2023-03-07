public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("so nguyen to nho hon 100");

        for (int i = 3; i < num; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + " ");
            }
        }
    }
}
