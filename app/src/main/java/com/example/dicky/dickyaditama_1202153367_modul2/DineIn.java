package com.example.dicky.dickyaditama_1202153367_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DineIn extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    // Define TAG for logging.
    private static final String TAG = DineIn.class.getSimpleName();
    // Define mSpinnerLabel for the label (the spinner item that the user chooses).
    private String mSpinnerLabel = "";
    EditText name;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        name = (EditText)findViewById(R.id.editText5);
        button2 = (Button) findViewById(R.id.button2);

        Spinner spinner = (Spinner) findViewById(R.id.label_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        if (spinner != null) {
            spinner.setAdapter(adapter);
        }

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DineIn.this, DafterMenu.class);
                DineIn.this.startActivity(intent);
                Toast.makeText(getApplicationContext(), mSpinnerLabel+" Terpilih", Toast.LENGTH_SHORT).show();

            }
        });

    }
    public void showText(View view) {
        EditText editText = (EditText) findViewById(R.id.editText5);
        if (editText != null) {
            String showString = ("No meja :");
            TextView nomorMejaResult = (TextView) findViewById(R.id.textView5);
            if (nomorMejaResult != null) nomorMejaResult.setText(showString);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        mSpinnerLabel = adapterView.getItemAtPosition (i).toString();
        showText(view);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG,"onNothingSelected: ");
    }
}
