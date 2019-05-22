package Calculator;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		boolean loopProgram = true;
		boolean inputloop = true;

		while (loopProgram == true){//Loops program
			Scanner num = new Scanner(System.in);
			Scanner opr = new Scanner(System.in);
			double num1;
			do {	
				System.out.println("Enter Your First Number: ");
				while (!num.hasNextDouble()) {
					System.out.println("That Is Not a Valid Number.");
					System.out.println("Enter Your First Number: ");
					num.next();
					continue;
					}
					num1 = num.nextDouble();
				} while (num1 <= 0);
		
			double num2;
			do {
					System.out.println("Enter Your Second Number: ");
				while (!num.hasNextDouble()) {
					System.out.println("That Is Not a Valid Number.");
					System.out.println("Enter Your Second Number: ");
					num.next();
					continue;
					}
					num2 = num.nextDouble();
				} while (num2 <= -1);
		
					inputloop = true;
					while (inputloop) {//Loops Help Menu
					System.out.println("Enter Your Operation: (Enter help for list.)");
					String Usrin = opr.nextLine();
		
					switch(Usrin){
						case "add":
							String res = String.valueOf(num1+num2);
							System.out.println("Result: "+res);
							System.out.println("");
							inputloop = false;
							break;
						case "sub":
							res = String.valueOf(num1-num2);
							System.out.println("Result: "+res);
							System.out.println("");
							inputloop = false;
							break;
						case "mult":
							res = String.valueOf(num1*num2);
							System.out.println("Result: "+res);
							System.out.println("");
							inputloop = false;
							break;
						case "div":
							res = String.valueOf(num1/num2);
							System.out.println("Result: "+res);
							System.out.println("");
							inputloop = false;
							break;
						case "rem":
							res = String.valueOf(num1%num2);
							System.out.println("Result: "+res);
							System.out.println("");
							inputloop = false;
							break;
						case "sqrt":
							res = String.valueOf(Math.sqrt(num1));
							System.out.println("Result: "+res);
							System.out.println(" ");
							inputloop = false;
							break;
						case "abs":
							res = String.valueOf(Math.abs(num1));
							System.out.println("Result: "+res);
							System.out.println(" ");
							inputloop = false;
							break;
						case "sin":
							res = String.valueOf(Math.sin(num1));
							System.out.println("Result: "+res);
							System.out.println(" ");
							inputloop = false;
							break;
						case "cos":
							res = String.valueOf(Math.cos(num1));
							System.out.println("Result: "+res);
							System.out.println(" ");
							inputloop = false;
							break;
						case "tan":
							res = String.valueOf(Math.tan(num1));
							System.out.println("Result: "+res);
							System.out.println(" ");
							inputloop = false;
							break;
						case "pow":
							res = String.valueOf(Math.pow(num1,num2));
							System.out.println("Result: "+res);
							System.out.println(" ");
							inputloop = false;
							break;
						case "help":
							System.out.println("Available Operations Are: add(Add),sub(Subtract),mult(Multiply),div(Divide),rem(Remainder), sqrt(Square Root), abs(Absolute Value), sin(Sine), cos(Cosine), tan(Tangent), pow(Power)");
							break;
					}
					if (Usrin == "help") {
						inputloop = false;
					}
			}
		}
	}
}
