class MultiTryDemo {
    public static void main(String[] args) {
        try {
            int a = 10, b = 5;
            int c = a / b; // Division operation
            int[] d = {0, 1}; // Array with two elements
            System.out.println(d[10]); // This will throw exception
            System.out.println(c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block always executes");
        }

        System.out.println("After the catch statements");
    }
}
