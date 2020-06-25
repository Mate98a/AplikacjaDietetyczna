package pl.wsiz.aplikacjadietetyczna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class oap extends AppCompatActivity {

    ListView listView;
    List list=new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oap);

        listView=(ListView)findViewById(R.id.list_view1);
        list.add("Aktualna wersja: 1.0.0");
        list.add("Twórca: Mateusz H");
        list.add("Wymagania: Android 5.0");
        list.add("Zaaktualizowano: 25.06.20");
        adapter=new ArrayAdapter(oap.this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
    }
}
