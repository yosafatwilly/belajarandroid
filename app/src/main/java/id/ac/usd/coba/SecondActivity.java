package id.ac.usd.coba;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        Uri locationUri = intent.getData();
        TextView Textview = findViewById(R.id.textView2);
        Textview.setText(intent.getStringExtra(MainActivity.EXTRA_MESSAGE));
    }

    public void backAction(View view) {
        Intent messageIntent = new Intent(this, MainActivity.class);
        startActivity(messageIntent);
    }
}
