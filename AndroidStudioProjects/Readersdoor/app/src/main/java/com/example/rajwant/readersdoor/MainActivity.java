package com.example.rajwant.readersdoor;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;


public class MainActivity extends ActionBarActivity {
    private VideoView v1;
    private View discview;
    private TextView subt1,subt2,subt3,subt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subt3=(TextView)findViewById(R.id.subtitle1);
        subt4=(TextView)findViewById(R.id.subtitle2);
        subt1=(TextView)findViewById(R.id.subtitle3);
        subt2=(TextView)findViewById(R.id.main);
        subt1.setVisibility(View.INVISIBLE);
        subt2.setVisibility(View.INVISIBLE);
        discview=(View)findViewById(R.id.discoverview);
        discview.setVisibility(View.INVISIBLE);

        v1=(VideoView)findViewById(R.id.rdvideo);
        String emo = "android.resource://" + getPackageName() + "/" + R.raw.o2;
        v1.setVideoURI(Uri.parse(emo));
        v1.start();
        v1.setOnPreparedListener (new MediaPlayer.OnPreparedListener() {


            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        subt3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                subt1.setVisibility(View.VISIBLE);
                subt2.setVisibility(View.INVISIBLE);
                discview.setVisibility(View.VISIBLE);

            }
        });
        subt4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                subt2.setVisibility(View.VISIBLE);
                subt2.setVisibility(View.INVISIBLE);

            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
