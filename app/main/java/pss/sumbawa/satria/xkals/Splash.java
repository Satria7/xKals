package pss.sumbawa.satria.xkals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.airbnb.lottie.LottieAnimationView;

public class Splash extends AppCompatActivity {

    private LottieAnimationView imgSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        goHead();

        imgSplash = findViewById(R.id.imgSplash);
        imgSplash.clearAnimation();
        imgSplash.setAnimation((int) R.raw.gif_loading);
        imgSplash.playAnimation();


    }


    public void goHead() {
        new Thread() {
            public void run() {
                try {
                    sleep(2000);
                    Splash.this.startActivity(new Intent(Splash.this, MainActivity.class));
                    Splash.this.finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}