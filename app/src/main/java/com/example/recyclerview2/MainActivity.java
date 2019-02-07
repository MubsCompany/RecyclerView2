package com.example.recyclerview2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity {

  FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        getSupportActionBar().setDisplayShowHomeEnabled( true );
        getSupportActionBar().setDisplayUseLogoEnabled( true );
        getSupportActionBar().setLogo( R.drawable.ic_launcher_background );


        fm = getSupportFragmentManager();
        fm.beginTransaction().add( R.id.kontener,new FirstFragment() ).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.menu,menu );
        return super.onCreateOptionsMenu( menu );
    }
// Ketika menu di pilih
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Fragment destinetionFragment = null;

        fm = getSupportFragmentManager();
        switch (item.getItemId()) {
            case R.id.mn_satu :
             destinetionFragment = new FirstFragment();
                break;

            case R.id.mn_dua :
                destinetionFragment = new SecondFragment();
                break;

            case R.id.mn_tiga:
                destinetionFragment = new ThirdFragment();
                break;
        }

        assert destinetionFragment != null;
        fm.beginTransaction().replace( R.id.kontener,destinetionFragment ).addToBackStack( "any" ).commit();

        return super.onOptionsItemSelected( item );
    }
}
