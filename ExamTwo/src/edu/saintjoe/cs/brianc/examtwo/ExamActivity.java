
package edu.saintjoe.cs.brianc.examtwo;


import com.google.devtools.simple.runtime.components.Component;
import com.google.devtools.simple.runtime.components.HandlesEventDispatching;
import com.google.devtools.simple.runtime.components.android.Form;

import com.google.devtools.simple.runtime.components.android.Button;
import com.google.devtools.simple.runtime.components.android.Label;
import com.google.devtools.simple.runtime.components.android.HorizontalArrangement;
import com.google.devtools.simple.runtime.components.android.TextBox;

import com.google.devtools.simple.runtime.events.EventDispatcher;
// this imports all of the items we will need for the app

public class ExamActivity extends Form implements HandlesEventDispatching {

	// these are all of the items being first defined by their names
	private HorizontalArrangement line1, line2, line3;
	private Button dubButton;
	private Label resultLabel;
	private Label promptLabel;
	private TextBox inputBox;
	int temp;
	

 void $define() {
// in a bridger app, define takes the place of the main method
	 
     this.BackgroundColor(COLOR_WHITE);
     // This makes the background color white
     
     line1 = new HorizontalArrangement(this);
     line2 = new HorizontalArrangement(this);
     line3 = new HorizontalArrangement(this);
// These define the new Horizontal Arrangements (HA) and places them on the screen
     
     
     promptLabel = new Label(line1, "Enter a number:");
     // creates the prompt label, gives it text and places it in the first HA
     inputBox = new TextBox(line1);
     // creates the textBox that the user puts a number into and places it in the first HA
     inputBox.NumbersOnly(true);
     // Makes the textbox only accept numbers
   
     dubButton = new Button(line2,"Double it:"); 
     // creates the button used to double the number and places it in the second HA and then gives it text
     
     resultLabel = new Label(line3,"");
     // creates a new label where the results will show and puts it in the third HA
     
 
     EventDispatcher.registerEventForDelegation(this, "ButtonClick", "Click");
     // This gives the program an event to look for
    
 } 
 @Override
 public boolean dispatchEvent(Component component, String id, String eventName,
         Object[] args) {
 	
	    if (component.equals(dubButton) && eventName.equals("Click")){
	    	temp = Integer.parseInt(inputBox.Text());
	    	temp = temp * 2;
	    	resultLabel.Text(String.valueOf(temp));
	    }
	        return true;
	     } 
	    // This doubles the number given and then prints it out
	    
 
} 
