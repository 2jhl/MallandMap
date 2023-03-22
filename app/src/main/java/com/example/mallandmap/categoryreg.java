package com.example.mallandmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class categoryreg extends AppCompatActivity {
    Button srh;
    ImageButton back;
    TextView title, text_gender, text_agegroup, text_style;
    Spinner gender, agegroup, style;
    View.OnClickListener cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categoryreg);

        srh = (Button) findViewById(R.id.cat_search);
        back = (ImageButton) findViewById(R.id.back);
        title = (TextView) findViewById(R.id.title);
        text_gender = (TextView) findViewById(R.id.text_spn_gender);
        text_agegroup = (TextView) findViewById(R.id.text_spn_agegroup);
        text_style = (TextView) findViewById(R.id.text_spn_style);
        gender = (Spinner) findViewById(R.id.spn_gender);
        agegroup = (Spinner) findViewById(R.id.spn_agegroup);
        style = (Spinner) findViewById(R.id.spn_style);

        String[] gender = {"남성", "여성", "전체"};
        Spinner spn_gender = (Spinner) findViewById(R.id.spn_gender);
        ArrayAdapter<String> adap_gender = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item, gender);
        spn_gender.setAdapter(adap_gender);
        spn_gender.setSelection(0);

        String[] agegroup = {"유아", "아동", "성인", "전체"};
        Spinner spn_agegroup = (Spinner) findViewById(R.id.spn_agegroup);
        ArrayAdapter<String> adap_agegroup = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item, agegroup);
        spn_agegroup.setAdapter(adap_agegroup);
        spn_agegroup.setSelection(0);

        String[] style = {"스포츠", "캐주얼", "빈티지", "스트릿", "모던", "댄디"};
        Spinner spn_style = (Spinner) findViewById(R.id.spn_style);
        ArrayAdapter<String> adap_style = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item, style);
        spn_style.setAdapter(adap_style);
        spn_style.setSelection(0);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch( view.getId() ){
                    case R.id.back:
                        Intent in = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(in);
                        break;
                }
            }
        };
        back.setOnClickListener(cl);
    }
}




