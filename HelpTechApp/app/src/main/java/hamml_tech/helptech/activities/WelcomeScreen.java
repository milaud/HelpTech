package hamml_tech.helptech.activities;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hamml_tech.helptech.R;

/**
 * Created by Michelle on 6/20/2017.
 */

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        Button signIn = (Button) findViewById(R.id.welcomeSignInButton);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomeScreen.this, SignIn.class));
            }
        });

        Button signUp = (Button) findViewById(R.id.welcomeNewAccountButton);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomeScreen.this, SignUp.class));
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
