package com.theoakteam.sunny_pc.oakicare.Sunny.Chisty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class ChistyActivitymain extends Activity {

    ImageView mImageView;
    ListView mListView;
    Button buttonB1,buttonB2,buttonB3,buttonB4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide Title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.chisty_activity_main);

        buttonB1= (Button) findViewById(R.id.buttonB1);
        buttonB2= (Button) findViewById(R.id.buttonB2);
        buttonB3= (Button) findViewById(R.id.buttonB3);
        buttonB4= (Button) findViewById(R.id.buttonB4);



        //For button B1

        buttonB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChistyMainactivity.this,B1.class);
                startActivity(intent);

            }
        });

        //For button B2

        buttonB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChistyMainactivity.this,B2.class);
                startActivity(intent);

            }
        });

        //For button B3

        buttonB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChistyMainactivity.this,B3.class);
                startActivity(intent);

            }
        });

        //For button B4

        buttonB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChistyMainactivity.this,B4.class);
                startActivity(intent);

            }
        });



    }




    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount,
                         int totalItemCount) {
        if(visibleItemCount == 0) return;
        if(firstVisibleItem != 0) return;



        mImageView.setTranslationY(-mListView.getChildAt(0).getTop() / 2);

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