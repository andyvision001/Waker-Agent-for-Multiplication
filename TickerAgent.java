import jade.core.Agent;
import jade.core.behaviours.*;
import java.util.Scanner;

public class TickerAgent extends Agent {

    protected void setup() {

        System.out.println("All is set for Addition Agent " + getLocalName() + " to get started...");
        addBehaviour(new TickerBehaviour(this, 10) {
            protected void onTick() {
                // Perform the task that needs to be done every second
                System.out.println("Agent " + getLocalName() + " is already up and ready to sum the numbers: ");

                Scanner input = new Scanner(System.in);

                System.out.print("Enter the first number: ");
                int num1 = input.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = input.nextInt();

                int sum = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

            }
        });
    }
}
