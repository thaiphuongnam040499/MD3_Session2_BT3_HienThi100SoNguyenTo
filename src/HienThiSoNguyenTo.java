public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;
        System.out.println("100 so nguyen to la");
        while (count < 100) {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
