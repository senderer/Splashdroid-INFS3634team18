package unsw.infs3634.assignment.splashdroid;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_info);

        //Set toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("App Information");
        setSupportActionBar(toolbar);


        TextView infoTitle = (TextView) findViewById(R.id.infoTitle);
        //use custom font
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Dense-Regular.otf");
        infoTitle.setTypeface(custom_font);
    }
}







