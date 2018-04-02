package kr.ac.yjp.myapplication;

import java.util.Random;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Color;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;



public class MainActivity extends AppCompatActivity {
    RadioGroup group;
    RadioButton button1, button2, button3;
    Button button;
    ImageView image;

    OnClickListener radio_listener=new OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (group.getCheckedRadioButtonId()) {
                case R.id.radio0:
                    image.setImageResource(R.drawable.androidimg0);
                    break;
                case R.id.radio1:
                    image.setImageResource(R.drawable.androidimg1);
                    break;
                case R.id.radio2:
                    image.setImageResource(R.drawable.androidimg2);
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("survey");

        group = (RadioGroup) findViewById(R.id.radioGroup1);
        button1 = (RadioButton) findViewById(R.id.radio0);
        button2 = (RadioButton) findViewById(R.id.radio1);
        button3 = (RadioButton) findViewById(R.id.radio2);

        button1.setOnClickListener(radio_listener);
        button2.setOnClickListener(radio_listener);
        button3.setOnClickListener(radio_listener);

        button = (Button) findViewById(R.id.button1);
        image = (ImageView) findViewById(R.id.imageView1);
    }
}