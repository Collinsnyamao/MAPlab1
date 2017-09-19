package ke.co.comsterhomes.www.layouts;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.*;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_home extends AppCompatActivity {

    public void maketoast(CharSequence txt){
        Context context = getApplicationContext();
        txt = "";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,txt,duration);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TextView textt = (TextView) findViewById(R.id.txtt);
        TextView usernameview = (TextView) findViewById(R.id.Usernameview);
        TextView nameview = (TextView) findViewById(R.id.nameview);
        TextView emailview23 = (TextView) findViewById(R.id.emailview);
        Intent usernametrack = getIntent();
        Bundle bundleuser = usernametrack.getExtras();

        if (bundleuser!= null){
            String userreflect = (String)  bundleuser.get("useruser");
            String name1 = (String) bundleuser.get("name1");
            String name2 = (String) bundleuser.get("name2");
            String email2 = (String) bundleuser.get("email");
            textt.setText(userreflect);
            usernameview.setText(userreflect);
            String fullname = name1 + " " + name2;
            nameview.setText(fullname);
            emailview23.setText(email2);




        }

        String userreflect = (String) bundleuser.get("useruser");

        String welcome = "welcome " + userreflect;
        maketoast(welcome);

         }

}
