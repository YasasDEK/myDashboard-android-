package morteza.whatevervalue.com.mydashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    Button male, female;
//    Layout male;
    androidx.cardview.widget.CardView mason,carpenter,electrician,plumber,repair,painter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mason =  (androidx.cardview.widget.CardView) findViewById((R.id.mason));
        carpenter =  (androidx.cardview.widget.CardView) findViewById((R.id.carpenter));
        electrician =  (androidx.cardview.widget.CardView) findViewById((R.id.electrician));
        plumber =  (androidx.cardview.widget.CardView) findViewById((R.id.plumber));
        repair =  (androidx.cardview.widget.CardView) findViewById((R.id.repair));
        painter = (androidx.cardview.widget.CardView) findViewById((R.id.painter));

        mason.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                masonActivity();
            }
        });

        carpenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                carpenterActivity();
            }
        });
    }

    public void masonActivity() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }


    public void carpenterActivity() {
        Toast.makeText(MainActivity.this,"Hey carpenter", Toast.LENGTH_LONG).show();
    }
}
