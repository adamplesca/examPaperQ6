// RESIT EXAM PAPER QUESTION
// Adam Plesca
// 10/5/23

import javax.swing.JOptionPane;

public class WordApp{
	public static void main(String args[]){
		//data variable
		String input;
		int result;
		//creating instantiable class object
		Word word = new Word();
		//user input for sentence
		input = JOptionPane.showInputDialog(null, "Type in a sentence: ");
		word.setInput(input);
		//calls methods from instan class
		word.compute();
		result = word.getResult();
		//gives the user desired output
		JOptionPane.showMessageDialog(null, "You have "+result+" words ending in 'ing' from that sentence you entered");
	}
}