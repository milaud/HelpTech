package hamml_tech.helptech;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Michelle on 6/20/2017.
 */

public class Sign_Up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button confirmAccount = (Button) findViewById(R.id.signUpConfirmButton);
        confirmAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check that all info is correct and saved then go to next screen
                startActivity(new Intent(Sign_Up.this, Sign_In.class));
            }
        });
    }
}
