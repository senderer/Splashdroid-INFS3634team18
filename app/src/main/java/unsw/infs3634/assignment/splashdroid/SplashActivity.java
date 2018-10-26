package unsw.infs3634.assignment.splashdroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SplashActivity extends AppCompatActivity{
    Context context;

    private final int SPLASH_DISPLAY_LENGTH = 4000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context = this;

        setContentView(R.layout.activity_splash);

        View decorView = getWindow().getDecorView();

        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        nextIntent();
    }
    public void nextIntent() {

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                finish();

                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }

        }, SPLASH_DISPLAY_LENGTH);
    }
}