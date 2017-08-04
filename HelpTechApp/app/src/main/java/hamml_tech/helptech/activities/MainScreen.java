package hamml_tech.helptech.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import hamml_tech.helptech.R;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        //live feedback button
        Button liveFeed = (Button)findViewById(R.id.button1);
        ImageButton liveFeedImage = (ImageButton)findViewById(R.id.imageButton1);
        liveFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainScreen.this, LiveFeedback.class));
            }
        });
        liveFeedImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainScreen.this, LiveFeedback.class));
            }
        });

        //ask a question button
        Button ask = (Button)findViewById(R.id.button2);
        ImageButton askImage = (ImageButton) findViewById(R.id.imageButton2);
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainScreen.this, AskAQuestion.class));
            }
        });
        askImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainScreen.this, AskAQuestion.class));
            }
        });

        //step by step guides button
        Button step = (Button)findViewById(R.id.button3);
        ImageButton stepImage = (ImageButton)findViewById(R.id.imageButton3);
        step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainScreen.this, StepGuides.class));
            }
        });
        stepImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainScreen.this, StepGuides.class));
            }
        });

        //view past questions button
        Button pastQuestions = (Button) findViewById(R.id.button4);
        ImageButton pastQuestionsImage = (ImageButton) findViewById(R.id.imageButton4);
        pastQuestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainScreen.this, ViewPastQuestions.class));
            }
        });
        pastQuestionsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainScreen.this, ViewPastQuestions.class));
            }
        });

    }
}
