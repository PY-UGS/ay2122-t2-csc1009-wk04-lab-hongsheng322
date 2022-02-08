import java.util.Scanner;

public class Main {
   public static void main(String[] args){
        BMI myself = new BMI();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        myself.setPounds(scanner.nextDouble());

        System.out.println("Enter height in inches: ");
        myself.setInches(scanner.nextDouble());

        System.out.println("BMI is "+ myself.getBMI());

        scanner.close();

        System.out.println(myself.Interpretate());

        StackOfIntegers stack = new StackOfIntegers();
        
        for (int i=0; i< 10; i++)
            stack.push(i);
        while(!stack.empty())
            System.out.print(stack.pop() + " ");

   } 
}
