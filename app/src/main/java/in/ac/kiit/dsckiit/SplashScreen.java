package in.ac.kiit.dsc;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent signInIntent = new Intent(getApplicationContext(), SignIn.class);
                    startActivity(signInIntent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splashThread.start();
    }
}
