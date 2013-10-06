package com.hackmit.loop;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoopSplash extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop_splash);
        
    	Button signupButton= (Button)findViewById(R.id.b_signup_main);
    	signupButton.setOnClickListener(signupListener);
    	
    	Button loginButton= (Button)findViewById(R.id.b_login_main);
    	loginButton.setOnClickListener(loginListener);
    }
    private OnClickListener signupListener = new OnClickListener(){

            public void onClick(View v)
            {   
                 //Intent newPicIntent = new Intent(v.getContext(), NewPictureActivity.class);
                 //startActivityForResult(newPicIntent, 0);
                Intent i = new Intent(LoopSplash.this, MainActivity.class);
                startActivity(i);
            }      
        
    }; 
    
    private OnClickListener loginListener = new OnClickListener(){
    	
    		public void onClick(View v){
    			Intent i = new Intent(LoopSplash.this, LoginActivity.class);
    			startActivity(i);
    		}
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.loop_splash, menu);
        return true;
    }
}

