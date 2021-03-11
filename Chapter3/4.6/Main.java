public class Main {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        while ( sum < 8888 )    {
            sum += ++i;
        }
        System.out.println(--i);
    }
}
