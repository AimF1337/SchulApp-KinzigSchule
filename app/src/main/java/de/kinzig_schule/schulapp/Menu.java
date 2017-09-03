package de.kinzig_schule.schulapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    public static final String extra_message = "de.kinzig_schule.schulapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btn_vertretungsplan = (Button) findViewById(R.id.btn_vertretungsplan);
        Button btn_11bg = (Button) findViewById(R.id.btn_11bg);
        Button btn_12bg = (Button) findViewById(R.id.btn_12bg);
        Button btn_13bg = (Button) findViewById(R.id.btn_13bg);


        btn_vertretungsplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),Anzeige.class);
                String message = "https://docs.google.com/gview?embedded=true&url=http://www.kinzig-schule.de/wp-content/uploads/Vertretung/Schueler/VKlassen.pdf";
                intent.putExtra(extra_message,message);
                startActivity(intent);
            }
        });

        btn_11bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),Anzeige.class);
                String message = "https://docs.google.com/gview?embedded=true&url=http://www.kinzig-schule.de/wp-content/uploads/2015/11/2017-08-28-Terminplan_Klausuren_BG11-1.pdf";
                intent.putExtra(extra_message,message);
                startActivity(intent);
            }
        });

        btn_12bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),Anzeige.class);
                String message = "https://docs.google.com/gview?embedded=true&url=http://www.kinzig-schule.de/wp-content/uploads/2015/11/2017-08-28-Terminplan_Klausuren_BG12.pdf";
                intent.putExtra(extra_message,message);
                startActivity(intent);
            }
        });

        btn_13bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),Anzeige.class);
                String message = "https://docs.google.com/gview?embedded=true&url=http://www.kinzig-schule.de/wp-content/uploads/2015/11/2017-08-28-Terminplan_Klausuren_BG13.pdf";
                intent.putExtra(extra_message,message);
                startActivity(intent);
            }
        });
    }
}
