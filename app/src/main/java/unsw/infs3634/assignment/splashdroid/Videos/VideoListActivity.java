package unsw.infs3634.assignment.splashdroid.Videos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import unsw.infs3634.assignment.splashdroid.R;


public class VideoListActivity extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_list);
        listView = (ListView)findViewById(R.id.listview);

        final String[] values = new String []{"1. Android Fundamentals", "2. Designing Interactive Apps",
                "3. Activities and Intents", "4. Fragments", "5. Threads and Parallelism", "6. SQLite and Android", "Additional Material"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.mylist,android.R.id.text1,values);
        listView.setAdapter(adapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Learning Topics");
        setSupportActionBar(toolbar);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myintent = new Intent(view.getContext(), VideoActivity1.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 1) {
                    Intent myintent = new Intent(view.getContext(), VideoActivity2.class);
                    startActivityForResult(myintent, 1);
                }
                if (position == 2) {
                    Intent myintent = new Intent(view.getContext(), VideoActivity3.class);
                    startActivityForResult(myintent, 2);
                }
                if (position == 3) {
                    Intent myintent = new Intent(view.getContext(), VideoActivity4.class);
                    startActivityForResult(myintent, 3);
                }
                if (position == 4) {
                    Intent myintent = new Intent(view.getContext(), VideoActivity5.class);
                    startActivityForResult(myintent, 4);
                }
                if (position == 5) {
                    Intent myintent = new Intent(view.getContext(), VideoActivity6.class);
                    startActivityForResult(myintent, 5);
                }
                if (position == 6) {
                    Intent myintent = new Intent(view.getContext(), VideoActivity7.class);
                    startActivityForResult(myintent, 5);
                }
            }
        });
    }
}