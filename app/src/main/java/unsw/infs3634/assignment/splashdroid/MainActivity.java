package unsw.infs3634.assignment.splashdroid;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import unsw.infs3634.assignment.splashdroid.Quiz.QuizActivity;
import unsw.infs3634.assignment.splashdroid.Videos.VideoListActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView splashdroid = (TextView) findViewById(R.id.splashdroid);

        Button videoButton = (Button) findViewById(R.id.videoButton);
        Button quizButton = (Button) findViewById(R.id.quizButton);
        ImageButton infoButton = (ImageButton) findViewById(R.id.infoButton);

        //use custom font
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Dense-Regular.otf");
        splashdroid.setTypeface(custom_font);

        //buttons

        videoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), VideoListActivity.class);
                startActivity(intent);
            }
        });

        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), QuizActivity.class);
                startActivity(intent);
            }
        });


        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), InfoActivity.class);
                startActivity(intent);

            }
        });

    }
}
