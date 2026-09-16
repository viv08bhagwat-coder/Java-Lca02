public class Exceptions { 
    public static void main(String[] args) { 
        try { 
            int a = 10; 
            int b = 0; 
            int result = a / b; 
            System.out.println(result); 
            
            int[] numbers = {1, 2, 3}; 
            System.out.println(numbers[1]); 
        } catch (ArithmeticException e) { 
            System.out.println("Math error"); 
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Array error"); 
        } finally {
            System.out.println("Done");
        }
    } 
}

