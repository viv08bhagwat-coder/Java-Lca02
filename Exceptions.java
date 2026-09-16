public class Exceptions {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            try {
                if (i == 1) {
                    int a = 10 / 0;
                } else {
                    int[] arr = {1};
                    int b = arr[5];
                }
            } 
            catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException");
            } 
            finally {
                System.out.println("Finally");
            }
        }
    }
}

