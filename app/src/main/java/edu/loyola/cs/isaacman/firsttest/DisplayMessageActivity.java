package edu.loyola.cs.isaacman.firsttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //get message from Intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

        //create text view
        TextView textView =new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        //set text view as activity layout
        setContentView(textView);


        /* // alternate (easier?) way to do the same thing
        setContentView(R.layout.activity_display_message);
        TextView textView=(TextView) findViewById(R.id.testing);
        textView.setTextSize(40);
        textView.setText(message);
        */
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
