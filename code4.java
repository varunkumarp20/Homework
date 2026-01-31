public class code4{
    public static void reverseNumber(int number) {
        if (number == 0) {
            return;
        }
        System.out.print(number % 10);
        reverseNumber(number / 10);
    }
    public static void main(String[] args) {
        int num = 4567;
        System.out.print("Reversed Number: ");
        reverseNumber(num);
    }
}
