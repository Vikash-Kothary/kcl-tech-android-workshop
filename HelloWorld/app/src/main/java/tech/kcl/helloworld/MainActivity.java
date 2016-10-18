package tech.kcl.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* This is a multi
        * line comment. As long as I'm between
        * the two tags, it will be ignored */
        // This is a single line comment
        view = (TextView) findViewById(R.id.text_view);

        view.setText("fihsd");

        view.setText("Android World");
    }

    @Override
    protected void onStart() {
        super.onStart();

        // Extra
        view.append("onStart\n");

    }

    @Override
    protected void onResume() {
        super.onResume();


    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
