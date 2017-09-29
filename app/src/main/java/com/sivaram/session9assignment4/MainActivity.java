package com.sivaram.session9assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declare Layout Object.
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Typecast relateive layout object and set reference to view object.
        relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);

        // Register Context Menu to the Layout. which will allow to Long Press on any location of the screen
        // to display context menu.
        registerForContextMenu(relativeLayout);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        // Set Header Icon and title [Icon won't display in latest version of android]
        menu.setHeaderIcon(R.mipmap.ic_launcher);
        menu.setHeaderTitle("Context Menu");

        // Create Menu Inflater Object to get menu context.
        MenuInflater inflater = getMenuInflater();

        // Assign Declared Menu XML file to MenuInflater Object.
        inflater.inflate(R.menu.context_menu,menu);
    }

    // Override Method for Context Menu Item Selected.
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        // Toast Selected Menu Item Title on Click.
        Toast.makeText(this, item.getTitle() + " Menu Item Clicked", Toast.LENGTH_SHORT).show();

        return true;
    }
}
