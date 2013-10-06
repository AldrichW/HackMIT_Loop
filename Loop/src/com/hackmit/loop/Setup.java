package com.hackmit.loop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Setup extends Activity{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_setup);
    
	Button signupButton= (Button)findViewById(R.id.b_save);
	signupButton.setOnClickListener(btnListener);
    };
		
    private OnClickListener btnListener = new OnClickListener()
    {

        public void onClick(View v)
        {   
            Intent eventIntent = new Intent(Setup.this, EventFeed.class);
            startActivity(eventIntent);            
        } 
    }; 
}