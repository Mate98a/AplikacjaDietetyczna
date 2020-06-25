package pl.wsiz.aplikacjadietetyczna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView bmi,wag,por,kal,oap,wyj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmi = (CardView)findViewById(R.id.bmi);
        wag = (CardView)findViewById(R.id.wag);
        por = (CardView)findViewById(R.id.por);
        kal= (CardView)findViewById(R.id.kal);
        oap = (CardView)findViewById(R.id.oap);
        wyj = (CardView)findViewById(R.id.wyj);

        bmi.setOnClickListener(this);
        wag.setOnClickListener(this);
        por.setOnClickListener(this);
        kal.setOnClickListener(this);
        oap.setOnClickListener(this);
        wyj.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    Intent i ;
    switch(v.getId())   {
        case R.id.bmi : i = new Intent(this,bmi.class);startActivity(i);break;
        case R.id.wag : i = new Intent(this,wag.class);startActivity(i);break;
        case R.id.por : i = new Intent(this,por.class);startActivity(i);break;
        case R.id.kal : i = new Intent(this,kal.class);startActivity(i);break;
        case R.id.oap : i = new Intent(this,oap.class);startActivity(i);break;
        case R.id.wyj : i = new Intent(this,wyj.class);moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);break;
        default:break;
    }

    }
}
