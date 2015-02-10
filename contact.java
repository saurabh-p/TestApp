package com.example.mandeepsingh.readersdoor;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by MANDEEP SINGH on 10-02-2015.
 */
public class contact extends android.support.v4.app.Fragment {


    View rd;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       rd=inflater.inflate(R.layout.contectus,container,false);

        return rd;
    }
}
  
  
  XML file
  <?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent" android:layout_height="match_parent">
    <RelativeLayout

        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
        <RelativeLayout
            android:id="@+id/r1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content">

            <ImageView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"


                android:src="@drawable/rd"

                android:id="@+id/imageView"
                android:scaleType="fitXY"
                android:layout_alignParentTop="true"
                android:layout_alignParentRight="true"
                android:layout_alignParentEnd="true" />

        </RelativeLayout>



        <ScrollView
            android:layout_width="fill_parent"
            android:layout_height="fill_parent"
            android:background="#FF6600"
            android:layout_below="@+id/r1"
            >
           <TextView
               android:layout_height="fill_parent"
               android:layout_width="fill_parent"
               android:textSize="33dp"
               android:text="Send an email to \
                               readersdoor@gmail.com\n
 to request an invitation."/>


            </ScrollView>

    </RelativeLayout>

</RelativeLayout>
