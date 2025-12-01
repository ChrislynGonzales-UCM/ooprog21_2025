public class ArraysDemo {

    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 7};  

        display("Original array values:", numbers);

        
        java.util.Arrays.fill(numbers, 8);
        display("Array after filling with 8:", numbers);

       
        numbers[0] = 3;
        numbers[2] = 10;
        display("Array after changing two elements:", numbers);

   
        java.util.Arrays.sort(numbers);
        display("Array after sorting:", numbers);
    }


    public static void display(String message, int array[]) {
        System.out.println(message);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}
