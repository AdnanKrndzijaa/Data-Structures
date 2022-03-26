package ibu.edu;

import java.util.Scanner;

public class hw1 {
  private static Scanner reader;

public static void main(String[] args) {
    Stack<Integer> values = new Stack<Integer>();			//creating value stack
    Stack<Character> operators = new Stack<Character>();	//creating operators stack
    
    reader = new Scanner(System.in);
    
    System.out.println("Enter your formula: ");				//entering the formula
    String formula = reader.nextLine();
    
    int i;
    char[] formulaArr = new char[formula.length()];
    for (i = 0; i < formula.length(); i++){					//entered formula -> formulaArr
    	formulaArr[i] = formula.charAt(i);
    }
    
    //for loop, that checks each character entered
    for (i = 0; i < formulaArr.length; i++) {				
    	if (formulaArr[i] == '+' || formulaArr[i] == '-' || formulaArr[i] == '*' || formulaArr[i] == '/' || formulaArr[i] == '%'){
    		operators.push(formulaArr[i]);
    	} else if (formulaArr[i] == '0' || formulaArr[i] == '1' || formulaArr[i] == '2' || formulaArr[i] == '3' || formulaArr[i] == '4' || formulaArr[i] == '5' || formulaArr[i] == '6' || formulaArr[i] == '7' || formulaArr[i] == '8' || formulaArr[i] == '9') {
    		values.push(Character.getNumericValue(formulaArr[i]));
    	} else if (formulaArr[i] == ')') {
    		int a = values.pop();
    		int b = values.pop();
    		char o = operators.pop();
    		
    		switch(o) {
    		case '+':
    			a = b + a; 
    			values.push(a);
    			break;   			
    		case '-':
    			a = b - a; 
	    		values.push(a);
	    		break;    		
    		case '*': 
	    		a = b * a; 
	    		values.push(a);
	    		break;    
    		case '/':
	    		a = b / a; 
	    		values.push(a);
	    		break;  
    		case '%':
	    		a = b % a; 
	    		values.push(a);
	    		break;
    		} 
    	}
    }
    
    int result = values.pop();
    System.out.println("Result is: "+ result);				//printing the result
  }
}