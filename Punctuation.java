/* Ritik Shenoy P7
 * Punctuation.java

 Pseudocode
	Class Header
	No FV's/Scanner FV's

	Punctuation()
		empty constructor

	Main()
		Create a new instance of the class pn
		Call pn.searchIt()
	
	void searchIt()
		Call getPunctuationWords() to get words with punctuation
		Call printWords(String words) to display the result
	
	String getPunctuationWords()
		Declare text as the paragraph input
		Declare finalOutput as an empty string
		Declare word as an empty string
		For each character in text:
			If: character is a space or newline:
				Check if checkForPunctuation(String word) returns true:
				Add word to finalOutput
				Reset word to an empty string
			Else:
				Add character to word
	
		After loop:

		Check if checkForPunctuation(String word) returns true for the last word:
		Add word to finalOutput
		Return finalOutput

	boolean checkForPunctuation(String word)
		For each character in word:
		If character is in the list of punctuation marks:
		Return true
		Return false
	
	void printWords(String words)
		Print words
 
 
 
 
 * This code words on utilizing String methods to do a task
 * We will use charAt, length and indexOf
 * 
 * This program will take some text, 
 * read it word by word and print all of the words that have some punctuation in it. 
 * There will be no field variables. 
 * You will have a variable for the text. 
 * You can copy and paste the entire text at the end as the value of the variable. 
 * There is a method called searchIt, which is called from main. 
 * searchIt will call the methods getPunctuationWords, and printWords 
 * getPunctuationWords will call checkForPunctuation.
 * 
 * 
 * 
 */ 

public class Punctuation
{
	public Punctuation()
	{ //Blank Constructor
	}
	
	public static void main (String[] args)
	{
		Punctuation pn = new Punctuation();
		pn.searchIt();
	}
	
	public void searchIt()
	{
		String words = getPunctuationWords();
		printWords(words); //call print method
	}
	
	public String getPunctuationWords()
	{
		String text = "Blood, Sweat, and Tears by Winston Churchill " + "\nMay 13, 1940" + "\nMr. Speaker:" + "On Friday evening last I received His Majesty’s commission to form a new " + "Administration. It was the evident wish and will of Parliament and the nation that this should be conceived on the broadest possible basis and that it should include all parties, both those who supported the late Government and also the parties of the Opposition." + "I have completed the most important part of this task. A War Cabinet has been formed of five Members, representing, with the Liberal Opposition, the unity of the nation. The three party Leaders have agreed to serve, either in the War Cabinet or in high executive office. The three Fighting Services have been filled. It was necessary that this should be done in one single day, on account of the extreme urgency and rigour of events. A number of other key positions were filled yesterday, and I am submitting a further list to His Majesty tonight. I hope to complete the appointment of the principal Ministers during tomorrow. The appointment of the other Ministers usually takes a little longer, but I trust that, when Parliament meets again, this part of my task will be completed, and that the Administration will be complete in all respects." + "Sir, I considered it in the public interest to suggest that the House should be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in accordance with the powers conferred upon him by the Resolution of the House. At the end of the proceedings today, the Adjournment of the House will be proposed until Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The business to be considered during that week will be notified to Members at the earliest opportunity. I now invite the House, by the Resolution which stands in my name, to record its approval of the steps taken and to declare its confidence in the new Government." + "Sir, to form an Administration of this scale and complexity is a serious undertaking in itself, but it must be remembered that we are in the preliminary stage of one of the greatest battles in history, that we are in action at many points in Norway and in Holland, that we have to be prepared in the Mediterranean, that the air battle is continuous and that many preparations have to be made here at home. In this crisis I hope I may be pardoned if I do not address the House at any length today. I hope that any of my friends and colleagues, or former colleagues, who are affected by the political reconstruction, will make all allowances for any lack of ceremony with which it has been necessary to act. I would say to the House, as I said to those who’ve joined this government: \"I have nothing to offer but blood, toil, tears and sweat.\"" + "We have before us an ordeal of the most grievous kind. We have before us many, many long months of struggle and of suffering. You ask, what is our policy? I will say: It is to wage war, by sea, land and air, with all our might and with all the strength that God can give us; to wage war against a monstrous tyranny, never surpassed in the dark and lamentable catalogue of human crime. That is our policy. You ask, what is our aim? I can answer in one word: victory. Victory at all costs, victory in spite of all terror, victory, however long and hard the road may be; for without victory, there is no survival. Let that be realised; no survival for the British Empire, no survival for all that the British Empire has stood for, no survival for the urge and impulse of the ages, that mankind will move forward towards its goal. " + "But I take up my task with buoyancy and hope. I feel sure that our cause will not be suffered to fail among men. At this time I feel entitled to claim the aid of all, and I say, \"Come then, let us go forward together with our united strength.\"";
		String finalOutput = "";
		String word = "";
	
		for (int x = 0; x < text.length(); x++)
		{
			char y = text.charAt(x);	
			if(y == ' '|| y == '\n') //check for space or newline
			{	
				if (checkForPunctuation(word))
				{
				{
					finalOutput += word + " "; //adds word to the end of final output, which we print later
					
				}
				word = ""; //reset
			}
			else
				word += y;	//otherwise will create a word out of the characters
		}
		
		if (checkForPunctuation(word))
			finalOutput += word; //It will do this for the final word
		
		return finalOutput; //returns string to print
	}
	
	public boolean checkForPunctuation(String wordIn)
	{
		for (int x = 0; x < wordIn.length(); x++)
		{
			char y = wordIn.charAt(x);
				if("!@#$%^&*{}\",.'|:<>?-=+_".indexOf(y) != -1) //list of all punctuation, checks for error
				{	
					return true;
					
				}
		}
		return false; // if theres no puncutation
	}
	
	
	public void printWords(String wordsIn)
	{
		System.out.print(wordsIn); //print output
	}

}
