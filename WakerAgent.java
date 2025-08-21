import jade.core.Agent;
import jade.core.behaviours.*;
import java.util.Scanner;

public class WakerAgent extends Agent {

    protected void setup() {
        System.out.println("Agent " + getAID().getName() + " is ready.");

        // Creating and adding the waker behaviour
        addBehaviour(new My_Waker_Behaviour(this, 5000));
    }

    private class My_Waker_Behaviour extends WakerBehaviour {

        public My_Waker_Behaviour(Agent andra, long timeout) {
            super(andra, timeout);
        }

        protected void onWake() {
            // Performing some multiplication between two integer numbers when the waker behaviour
            System.out.println("Waker behaviour of agent " + getAID().getName() + " is up and running to perform multiplication operations:");

            //Input definition
            Scanner input = new Scanner(System.in);

            //inputting num1
            System.out.print("Please enter the first number: ");
            int num1 = input.nextInt();

            //inputting num2
            System.out.print("Please enter the second number: ");
            int num2 = input.nextInt();

            int product = num1 * num2;
            System.out.println("The product of " + num1 + " and " + num2 + " is " + product);

            // Terminate the activity of the agent
            myAgent.doDelete();
        }
    }
}
