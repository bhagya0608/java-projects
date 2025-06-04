package javproject;
import java.util.Stack;
public class Burgerstack{
	public static void main(String[] args) {
		Stack<String> burgerstack = new Stack<String>();
		burgerstack.push("Burger 1");
		burgerstack.push("Burger 2");
		burgerstack.push("Burgrer 3");
		
		System.out.println("Top burger is"+burgerstack.peek());
		System.out.println("Serving"+burgerstack.pop());
		if(burgerstack.isEmpty()) {
			System.out.println("All burgers are served");
		}
	}
}

