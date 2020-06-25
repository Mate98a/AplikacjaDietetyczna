package pl.wsiz.aplikacjadietetyczna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class kal extends AppCompatActivity {
    private EditText height;
    private EditText weight;
    private EditText age;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kal);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        age = (EditText) findViewById(R.id.Age);
        result = (TextView) findViewById(R.id.result);
    }
    public void calculateCAL(View v) {
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();
        String ageStr = age.getText().toString();

        if (heightStr != null && !"".equals(heightStr)
                && weightStr != null  &&  !"".equals(weightStr)) {
            float heightValue = Float.parseFloat(heightStr) ;
            float weightValue = Float.parseFloat(weightStr);
            float ageValue = Float.parseFloat(ageStr);

            float cal =(float)  ((10*weightValue)+(6.25*heightValue)-(5*ageValue)+5);

            displayCAL(cal);
        }
    }
    private void displayCAL(float cal) {
        String bmiLabel ="";

            bmiLabel = "Zapotrzebowanie na około "+cal + " kalorii dziennie";
            result.setText(bmiLabel);
        }
}
