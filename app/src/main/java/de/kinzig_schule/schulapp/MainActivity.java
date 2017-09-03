package de.kinzig_schule.schulapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    SharedPreferences sharedprefs;
    CheckBox pwchecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedprefs = getSharedPreferences("kinzig-schule.options", Context.MODE_PRIVATE);
        final EditText pw = (EditText) findViewById(R.id.txt_password);
        pwchecked = (CheckBox) findViewById(R.id.pwtick);


        if (ReadPrefs(sharedprefs)) {
            Intent intent = new Intent(MainActivity.this, Menu.class);
        }

        Button button = (Button) findViewById(R.id.btn_login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                SavePrefs(sharedprefs,pwchecked);
                if(pw.getText().toString().equals("!schule")) {
                    Intent intent = new Intent(MainActivity.this, Menu.class);
                    startActivity(intent);
                }
                else {
                    int duration = Toast.LENGTH_SHORT;
                    CharSequence text = "Falsches Passwort";
                    Toast.makeText(MainActivity.this,text,duration).show();
                }
            }
        });

    }

    private void SavePrefs(SharedPreferences prefs, CheckBox pwtick)
    {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("passwort",pwtick.isChecked());
        editor.commit();
    }

    private boolean ReadPrefs(SharedPreferences prefs)
    {
        if (prefs.contains("passwort") && prefs.getBoolean("passwort",false))
            return true;
        else
            return false;
    }
}
