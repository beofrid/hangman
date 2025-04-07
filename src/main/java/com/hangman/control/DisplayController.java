package com.hangman.control;
import com.hangman.model.GameInstance;
import com.hangman.view.MainView;

public class DisplayController {
    
    public void updateMemory (GameInstance gm)
    {  
        int length = gm.getWord().length();
        String displayedString =  "";

        System.out.println(gm.getCategory() + " " + gm.getDifficulty());
        
        for(int i=0;i<length; i++){
            displayedString = displayedString.concat("▯");
        }
        System.out.println("displayedString: ");
        System.out.println(displayedString);

        MainView.mainView(displayedString,"cate","A S D F");

    
    
    
    }
 
    
       
}
