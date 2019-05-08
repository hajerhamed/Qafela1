package trade.hajer.qafela.firstphase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import trade.hajer.qafela.R;

public class EnterActivity extends AppCompatActivity {
private Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);

        button1= findViewById(R.id.enter_ar);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent= (getApplicationContext(),LoginActivity.class);
            }
        });
    }
}
