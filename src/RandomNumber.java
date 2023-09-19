public class RandomNumber {

    public static void main(String[] args) {
        int min=1000;
        int max=9999;
        System.out.println("THE RANDOM NUMBER IS:");
        int a=(int)(Math.random()*(max-min+1)+min);
        System.out.println(a);
    }
}
