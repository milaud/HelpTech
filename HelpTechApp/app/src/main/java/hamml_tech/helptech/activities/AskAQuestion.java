package hamml_tech.helptech.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.ScrollingTabContainerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import hamml_tech.helptech.R;

public class AskAQuestion extends AppCompatActivity {

    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_a_question_1);
        addItemsOnSpinner();

        Button post = (Button) findViewById(R.id.post_button);
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to question page
            }
        });
    }

    private void addItemsOnSpinner() {
        Spinner spinner = (Spinner) findViewById(R.id.device_spin_list);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.device_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }


}
