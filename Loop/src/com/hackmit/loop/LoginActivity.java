package com.hackmit.loop;

import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginActivity extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login2);
    
	Button loginButton= (Button)findViewById(R.id.b_login);
	loginButton.setOnClickListener(btnListener);
    }
	
    private OnClickListener btnListener = new OnClickListener()
    {

        public void onClick(View v)
        {  
		      Intent setupIntent = new Intent(LoginActivity.this, Setup.class);
		      startActivity(setupIntent);
		      finish();
		        	            
        } 

    }; 
	
}
