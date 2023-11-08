public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        multipleOfThree(array);
    }
    public static void multipleOfThree(int[] array) {
        for (int a : array) {
            if (a%3 == 0) {
                System.out.print(a + " ");
            }
        }
    }
}
