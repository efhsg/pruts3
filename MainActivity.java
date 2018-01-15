package nl.studentsplus.pruts3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        BijlesplanningFragment bijlesplanningFragment = new BijlesplanningFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentBijlesplanningPlaceHolder, bijlesplanningFragment).addToBackStack(null).commit();
    }
}
