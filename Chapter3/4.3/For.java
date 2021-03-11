public class For {
    public static void main(String[] args) {
        double pdt = 1.0, sum = 0.0;
        for ( int i = 1; i <= 20; i++ ) {
            pdt *= i;
            sum += 1/pdt;
        }
        System.out.println(sum);
    }
}
