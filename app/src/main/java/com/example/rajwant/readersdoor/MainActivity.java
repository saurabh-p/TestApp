package com.example.rajwant.readersdoor;

import android.graphics.Point;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;


public class MainActivity extends ActionBarActivity {
    private VideoView v1;
    private LinearLayout rdl1,rdl2,rdl3,rdl4;
    private RelativeLayout r1;
    private VideoView rd;
    private TextView subt1,subt2,subt3,subt4;
    private ActionBar actionbar;

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
        r1=(RelativeLayout)findViewById(R.id.r1);


        rd=(VideoView)findViewById(R.id.rdvideo);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int height = size.y;
        int  width =size.x;

        rdl1=(LinearLayout)findViewById(R.id.l1);
       // ViewGroup.LayoutParams params = rdl1.getLayoutParams();



        rdl2=(LinearLayout)findViewById(R.id.l2);


      //  ViewGroup.LayoutParams params = rdl2.getLayoutParams();



        rdl3=(LinearLayout)findViewById(R.id.l3);
       // ViewGroup.LayoutParams params = rdl3.getLayoutParams();


        rdl4=(LinearLayout)findViewById(R.id.l4);
        rdl1.getLayoutParams().height = height;
        rdl1.getLayoutParams().width = width;

        rdl1.requestLayout();

        rdl2.getLayoutParams().height = height;
        rdl2.getLayoutParams().width = width;

        rdl2.requestLayout();
        rdl3.getLayoutParams().height = height;
        rdl3.getLayoutParams().width = width;

        rdl3.requestLayout();
        rdl4.getLayoutParams().height = height;
        rdl4.getLayoutParams().width = width;

        rdl4.requestLayout();


        // ViewGroup.LayoutParams params= rdl4.getLayoutParams();

        /*rdl1.setLayoutParams(new LinearLayout().LayoutParams(width,height));


        rdl2.setLayoutParams(new RelativeLayout.LayoutParams(width,height));

        rdl3.setLayoutParams(new RelativeLayout.LayoutParams(width,height));
       rdl4.setLayoutParams(new RelativeLayout.LayoutParams(width,height));*/
      v1=(VideoView)findViewById(R.id.rdvideo);
        String emo = "android.resource://" + getPackageName() + "/" + R.raw.o3;
        v1.setVideoURI(Uri.parse(emo));
        v1.start();
       /* v1.setOnPreparedListener (new MediaPlayer.OnPreparedListener() {


            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);

            }
        });*/

        subt3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                subt1.setVisibility(View.VISIBLE);
                subt2.setVisibility(View.INVISIBLE);

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
