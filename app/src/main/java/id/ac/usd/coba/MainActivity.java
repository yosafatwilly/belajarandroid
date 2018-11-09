package id.ac.usd.coba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int Count;
    TextView Textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view){
        Toast toast = Toast.makeText(this, R.string.message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countFunction(View view){
        Textview = findViewById(R.id.textview);
        ++Count;
        if (view != null){
            Textview.setText(Integer.toString(Count));
        }
    }

    public void kurangFunction(View view){
        Textview = findViewById(R.id.textview);
        int check = Integer.parseInt(Textview.getText().toString());

        if (check > 0){
            --Count;
        }
        if (view != null){
            Textview.setText(Integer.toString(Count));
        }
    }
}
