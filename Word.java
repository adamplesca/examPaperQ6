// RESIT EXAM PAPER QUESTION
// Adam Plesca
// 10/5/23

import java.lang.StringBuffer;

public class Word{
	//data members
	private String input;
	private int result;
	//constructor
	public Word(){
		input = "";
		result = 0;
	}
	//setters
	public void setInput(String input){
		this.input = input;
	}
	//compute
	public void compute() {
		String substring = "ing"; //created string variable
	    int index = 0; //created int variable to keep track of ing's wrote by user
	    while (true) {
	    	index = input.indexOf(substring, index); //will find any occurance of "ing" in the sentence and add to it, if and the operation will continue until index shows -1 then it stops
	        if (index != -1) {
	        	result++;
	            index += substring.length();
	        }else{
	            break;
	        }
	    }
	 }
	//getters
	public String getInput(){
		return input;
	}
	public int getResult(){
		return result;
	}
}