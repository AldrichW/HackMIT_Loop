package com.hackmit.loop;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class LoopSplash extends Activity {

	private static int SPLASH_TIME_OUT = 3000;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop_splash);
        
        new Handler().postDelayed(new Runnable() {
        	 
            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app 
             */
 
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(LoopSplash.this, MainActivity.class);
                startActivity(i);
 
                // close this activity
               finish();
            }
        }, SPLASH_TIME_OUT);
   }   
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.loop_splash, menu);
        return true;
    }
}

