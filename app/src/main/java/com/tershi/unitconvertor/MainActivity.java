package com.tershi.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup chooser;
    RadioButton radioButton;
    Button btnConvertor;
    EditText Num;
    TextView ans;
    String check ,error;
    int value =0,answer =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnConvertor = (Button)(findViewById(R.id.btnConvertor));
        Num = (EditText)(findViewById(R.id.Num));
        ans = (TextView)(findViewById(R.id.ans));
        chooser = (RadioGroup) findViewById(R.id.chooser);

        btnConvertor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                    int radioId = chooser.getCheckedRadioButtonId();
                    radioButton = findViewById(radioId);

                    value = Integer.parseInt(Num.getText().toString());
                    switch (radioButton.getId()) {
                        case R.id.cmTOmm:
                            answer = value * 10;
                            break;
                        case R.id.cmTOm:
                            answer = value * 100;
                            break;
                        case R.id.mTOkm:
                            answer = value * 100;
                            break;
                        case R.id.KBTOByte:
                            answer = value * 1000;
                            break;
                        case R.id.MBTOKB:
                            answer = value * 1000;
                            break;
                        case R.id.GBTOMB:
                            answer = value * 1000;
                            break;
                        case R.id.TBTOGB:
                            answer = value * 1000;
                            break;
                        case R.id.PBTOTB:
                            answer = value * 1000;
                            break;
                        case R.id.EBTOPB:
                            answer = value * 1000;
                            break;
                        case R.id.KiBTOKB:
                            answer = value - 24;
                            break;
                        case R.id.MiBTOMB:
                            answer = value - 24;
                            break;
                        case R.id.GiBTOGB:
                            answer = value - 24;
                            break;
                        case R.id.KiBTOBytes:
                            answer = value * 1024;
                            break;
                        case R.id.MiBTOKiB:
                            answer = value * 1024;
                            break;
                        case R.id.GiBTOMiB:
                            answer = value * 1024;
                            break;
                        default:
                            error = "沒有選取任何東西";
                    }
                    if (error != "") {
                        ans.setText("Answer:" + answer);
                    } else {
                        ans.setText(error);
                    }
            }
        });
    }
    public void checkButton(View view){
        int radioId = chooser.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
    }
}