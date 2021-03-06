package com.hackmit.loop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    
	Button signupButton= (Button)findViewById(R.id.b_signup);
	signupButton.setOnClickListener(btnListener);
    };
	
    private OnClickListener btnListener = new OnClickListener()
    {

        public void onClick(View v)
        {   
             //Intent newPicIntent = new Intent(v.getContext(), NewPictureActivity.class);
             //startActivityForResult(newPicIntent, 0);
            Intent setupIntent = new Intent(MainActivity.this, Setup.class);
            startActivity(setupIntent);
        } 

    }; 
	
}
