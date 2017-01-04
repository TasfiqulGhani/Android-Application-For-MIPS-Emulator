package bughunters.team.csethreethreetwo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StartPage extends AppCompatActivity {

    TextView head;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        head=(TextView)findViewById(R.id.head);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                head.setText("Simulator");
            }
        }, 2000);

        Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            @Override
            public void run() {
                head.setText("Instruction : add $t3,$t1,$t2");
            }
        }, 4000);

        Handler handler2 = new Handler();
        handler2.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent	i2 = new Intent(StartPage.this,MainActivity.class);

                startActivityForResult(i2,500);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        }, 8000);
    }
}
