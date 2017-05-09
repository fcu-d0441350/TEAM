package com.example.ds95_.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        ListView list = (ListView)findViewById(R.id.LV);
        ArrayList alist=new ArrayList<Pet_Item>();
        Pet_Item item1=new Pet_Item(R.drawable.stray_pet,"浪浪資訊");
        Pet_Item item2=new Pet_Item(R.drawable.pet_item,"製作寵物周邊");
        Pet_Item item3=new Pet_Item(R.drawable.pet_background,"寵物桌布");
        alist.add(item1);
        alist.add(item2);
        alist.add(item3);
        Pet_adapter adapter = new Pet_adapter(this,alist);
        list.setAdapter(adapter);
        list.setOnItemClickListener(itemclick);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    AdapterView.OnItemClickListener itemclick= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            int [] imageIds=null;
            Intent intent = new Intent();
            switch(position)
            {
                case 0:
                    imageIds = new int[1];
                    imageIds[0]=R.drawable.stray_pet;
                    intent.setClass(MainActivity.this,Pet_strayData.class);
                    intent.putExtra("img_id1",imageIds);
                    startActivity(intent);
                    break;
                case 1:
                    imageIds=new int [1];
                    imageIds[0]=R.drawable.pet_item;
                    intent.setClass(MainActivity.this,Pet_produce_select.class);
                    intent.putExtra("img_id2",imageIds);
                    startActivity(intent);
                    break;
                case 2:
                    imageIds= new int [1];
                    imageIds[0]=R.drawable.pet_background;
                    Uri uri = Uri.parse("https://wallpaper.gamme.com.tw/wp/category/pets/page2");
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.setData(uri);
                    startActivity(intent);
                    break;
            }
        }
    };
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
