
public class StringBuilderDemo {

    public static void main(String[] args) {
       
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("StringBuilder Demo");

        
        System.out.println("Initial sb1: " + sb1);
        System.out.println("sb1 Capacity: " + sb1.capacity());

        System.out.println("\nInitial sb2: " + sb2);
        System.out.println("sb2 Capacity: " + sb2.capacity());

      
        sb1.setLength(10);  
        System.out.println("\nAfter setLength(10):");
        System.out.println("sb1 (with null chars): \"" + sb1 + "\"");
        System.out.println("sb1 New Length: " + sb1.length());

        
        sb2.setLength(6); 
        System.out.println("\nAfter setLength(6):");
        System.out.println("sb2 Trimmed: \"" + sb2 + "\"");
        System.out.println("sb2 New Length: " + sb2.length());
    }
}


