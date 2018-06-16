package ch.xy.customspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.dropdownmenue, android.R.layout.simple_spinner_item);
//Or if you just want a local String array replace the command above with:
//        String[] array = {"a","b","c"};
//        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(view.getContext(), R.layout.dropdownmenue, array);

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
    }


}
