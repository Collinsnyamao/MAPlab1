package ke.co.comsterhomes.www.layouts;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_main);

        final EditText username2 = (EditText) findViewById(R.id.Username2);
        final EditText email2 = (EditText) findViewById(R.id.email2);
        final EditText first_name2 = (EditText) findViewById(R.id.fname2);
        final EditText last_name2 = (EditText) findViewById(R.id.lname2);
        Button buttonfive = (Button) findViewById(R.id.buttonsumbitfive);
        buttonfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentfive  =new Intent(MainActivity.this,Activity_home.class);
                startActivity(intentfive);

                String username22 = username2.getText().toString();
                String name1viewstring = first_name2.getText().toString();
                String name2viewstring = last_name2.getText().toString();
                String emailview = email2.getText().toString();
                Intent trackusername = new Intent(MainActivity.this,Activity_home.class);
                trackusername.putExtra("useruser",username22);
                trackusername.putExtra("name1",name1viewstring);
                trackusername.putExtra("name2",name2viewstring);
                trackusername.putExtra("email",emailview);
                startActivity(trackusername);

            }
        });

        Button buttonsignup = (Button) findViewById(R.id.signupbtn);
        buttonsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsignup = new Intent(MainActivity.this,Activity_signup.class);
                startActivity(intentsignup);
            }
        });

    }




}
