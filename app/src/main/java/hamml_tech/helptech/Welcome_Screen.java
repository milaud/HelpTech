package hamml_tech.helptech;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Michelle on 6/20/2017.
 */

public class Welcome_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        Button signIn = (Button) findViewById(R.id.welcomeSignInButton);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Welcome_Screen.this, Sign_In.class));
            }
        });

        Button signUp = (Button) findViewById(R.id.welcomeNewAccountButton);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Welcome_Screen.this, Sign_Up.class));
            }
        });

        Button registerStaff = (Button) findViewById(R.id.welcomeRegisterStaffButton);
        registerStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to register for staff screen
            }
        });

    }

}
