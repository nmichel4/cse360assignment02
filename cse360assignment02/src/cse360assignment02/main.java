package cse360assignment02;
//import AddingMachine.java;

public class main extends AddingMachine{

	public static void main(String[] args) {
		
		AddingMachine myInputs = new AddingMachine();
		
		myInputs.add (4); 
		myInputs.subtract (2); 
		myInputs.add(5);
		
		String out = myInputs.toString();
		System.out.println(out);
		System.out.println(myInputs.getTotal());
		myInputs.clear();
		out = myInputs.toString();
		System.out.println(out);
		System.out.println(myInputs.getTotal());

	}

}
