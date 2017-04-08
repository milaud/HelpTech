package hamml_tech.helptech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static java.sql.DriverManager.println;

public class Main_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        Button button1 = (Button)findViewById(R.id.button1);
        ImageButton image1 = (ImageButton)findViewById(R.id.imageButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                println("test");
            }
        });

        //step by step guides button
        Button step = (Button)findViewById(R.id.button3);
        ImageButton image3 = (ImageButton)findViewById(R.id.imageButton3);
        step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main_Screen.this, step_guides_1.class));
            }
        });

    }
}
