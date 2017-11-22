
package com.nishanth.mymenuapp;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.searching:
                Intent intent= new Intent(Intent.ACTION_PICK,  ContactsContract.Contacts.CONTENT_URI);

                startActivity(intent);
                return true;
            case R.id.browsing:
                Intent intent3 = new Intent(MainActivity.this,BrowserActivity.class);
                startActivity(intent3);
                return true;
            case R.id.maps:
                Intent i = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(i);
                return true;
            case R.id.searchview:
                Intent intent2 = new Intent(MainActivity.this,SearchActivity.class);
                startActivity(intent2);
        }
        return super.onOptionsItemSelected(item);
    }
}
