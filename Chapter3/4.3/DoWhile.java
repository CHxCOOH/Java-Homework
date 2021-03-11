public class DoWhile {
    public static void main(String[] args) {
        double sum = 0.0;
        double pdt = 1.0;
        int i = 1;
        do {
            pdt *= i;
            sum += 1/pdt;
        } while ( i++ < 20 );
        System.out.println("sum = "+sum);
    }
}
