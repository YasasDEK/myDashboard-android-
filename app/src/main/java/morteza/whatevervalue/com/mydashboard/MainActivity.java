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
    androidx.cardview.widget.CardView male,female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        male =  (androidx.cardview.widget.CardView) findViewById((R.id.male));
        female =  (androidx.cardview.widget.CardView) findViewById((R.id.female));
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }

    public void openActivity() {
        Toast.makeText(MainActivity.this,"Hey boy", Toast.LENGTH_LONG).show();
    }


    public void openActivity2() {
        Toast.makeText(MainActivity.this,"Hey girl", Toast.LENGTH_LONG).show();
    }
}
