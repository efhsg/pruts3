package nl.studentsplus.pruts3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import nl.studentsplus.pruts3.adapters.BijlesplanningAdapter;
import nl.studentsplus.pruts3.mock.data.DataProvider;

public class MainActivity extends AppCompatActivity {

    HashMap<String, List<String>> myHeader;
    List<String> myChild;
    ExpandableListView expandableListView;
    BijlesplanningAdapter bijlesplanningAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_bijlesplanning_list);

        expandableListView = (ExpandableListView) findViewById(R.id.bijlesplanningLijst);
        myHeader = DataProvider.getInfo();
        myChild = new ArrayList<>(myHeader.keySet());
        bijlesplanningAdapter = new BijlesplanningAdapter(this, myHeader, myChild);
        expandableListView.setAdapter(bijlesplanningAdapter);




    }
}
