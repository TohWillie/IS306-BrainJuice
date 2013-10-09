package com.example.brainjuice;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.*;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class HomePage extends Activity implements OnClickListener {

	
	Button faq;
	Button logout;
	Button ask;
	ImageButton notification;
	ImageButton questionbank;
	ImageButton setting;
	Button btnOpenPopup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
  
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_page);
       
        faq = (Button)this.findViewById(R.id.FAQ);
        faq.setOnClickListener(this);
        
        
        logout = (Button)this.findViewById(R.id.Logout);
        logout.setOnClickListener(this);
        
        ask = (Button)this.findViewById(R.id.Ask);
        ask.setOnClickListener(this);
        
        notification = (ImageButton)this.findViewById(R.id.Asking);
        notification.setOnClickListener(this);
        
        questionbank = (ImageButton)this.findViewById(R.id.widget42);
        questionbank.setOnClickListener(this);
        
        setting = (ImageButton)this.findViewById(R.id.widget43);
        setting.setOnClickListener(this);
        	
        btnOpenPopup = (Button)findViewById(R.id.Ask);
        
    }

    
    
    @SuppressWarnings("deprecation")
	public void onClick(View v){
    	final Context context = this;
                
                
    	
    	 switch (v.getId()) {
         case R.id.Ask: 
        	 
        	 btnOpenPopup.setOnClickListener(new Button.OnClickListener(){
        		 
        		   @Override
        		   public void onClick(View arg0) {
        		    LayoutInflater layoutInflater 
        		     = (LayoutInflater)getBaseContext()
        		      .getSystemService(LAYOUT_INFLATER_SERVICE);  
        		    View popupView = layoutInflater.inflate(R.layout.activity_askquestionpopup, null);  
        		             final PopupWindow popupWindow = new PopupWindow(
        		               popupView, 
        		               LayoutParams.WRAP_CONTENT,  
        		                     LayoutParams.WRAP_CONTENT);  
        		             
        		             Button btnDismiss = (Button)popupView.findViewById(R.id.button2);
        		             btnDismiss.setOnClickListener(new Button.OnClickListener(){

        		     @Override
        		     public void onClick(View v) {
        		      // TODO Auto-generated method stub
        		      popupWindow.dismiss();
        		     }});
        		               
        		             popupWindow.showAsDropDown(btnOpenPopup, 150, 50);
        		         
        		   }}); 
                     
                     
        	 /*
        	 AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        	 alertDialog.setTitle("Title");
        	 alertDialog.setMessage("Message");
        	 alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
        	    public void onClick(DialogInterface dialog, int which) {
        	       // TODO Add your code for the button here.
        	    }
        	 });
        	 
        	 alertDialog.setButton("Cancel", new DialogInterface.OnClickListener() {
         	    public void onClick(DialogInterface dialog, int which) {
         	       // TODO Add your code for the button here.
         	    }
         	 });
        	 
        	 // Set the Icon for the Dialog
        	 
        	 alertDialog.show();
        */
          // do something
          break;
        // case R.id.buttonB:
          // do something else
          //break;
      }
  
        /*
    	if(username.equals("JonathanTan") && password.equals("123456789")){
    		
			Intent intent = new Intent(context, QuestionPage.class);
            startActivity(intent);   
    		
    	}else if(username.equals("MelissaTan") && password.equals("123456789")){
    	
    		
    	}else{
    		   
    		//Toast.makeText(this, "Username/Password is wrong!", 0 ).show();
    	}
    	
    */	
    	
    }
    
}