package dev.kgbier.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        TextView textView = new TextView(this);
        textView.setText("Sample");

        setContentView(textView);

        super.onCreate(savedInstanceState);
    }

}
