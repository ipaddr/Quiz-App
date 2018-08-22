package id.iip.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText a1, a3;
    private RadioGroup a2;
    private CheckBox a4_1, a4_2, a4_3, a4_4;

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = (EditText)findViewById(R.id.a1);
        a3 = (EditText)findViewById(R.id.a3);
        a2 = (RadioGroup) findViewById(R.id.a2);
        a4_1 = (CheckBox)findViewById(R.id.a4_1);
        a4_2 = (CheckBox)findViewById(R.id.a4_2);
        a4_3 = (CheckBox)findViewById(R.id.a4_3);
        a4_4 = (CheckBox)findViewById(R.id.a4_4);
    }

    public void submit(View view){
        if (a1 != null && a1.getText().toString().contains("washington")){
            score += 1;
        }

        RadioButton rb = (RadioButton)findViewById(a2.getCheckedRadioButtonId());
        if (rb != null && rb.getText().toString().equalsIgnoreCase("50")){
            score += 1;
        }

        if (a3 != null && a3.getText().toString().contains("trump")){
            score += 1;
        }

        if (a4_2.isChecked() && a4_4.isChecked()){
            score += 1;
        }

        Toast.makeText(this, "Total score : "+String.valueOf(score), Toast.LENGTH_SHORT).show();

        score = 0;
        a1.setText("");
        a2.clearCheck();
        a3.setText("");
        a4_1.setChecked(false);
        a4_2.setChecked(false);
        a4_3.setChecked(false);
        a4_4.setChecked(false);
    }
}
