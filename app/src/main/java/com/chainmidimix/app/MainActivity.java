package com.chainmidimix.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(32, 32, 32, 32);
        root.setBackgroundColor(Color.rgb(245, 248, 246));

        TextView title = new TextView(this);
        title.setText("Chainmidimix");
        title.setTextColor(Color.rgb(16, 42, 42));
        title.setTextSize(30);
        title.setGravity(Gravity.CENTER);

        TextView status = new TextView(this);
        status.setText("MIDI-Mixer bereit");
        status.setTextColor(Color.rgb(0, 105, 92));
        status.setTextSize(18);
        status.setGravity(Gravity.CENTER);

        root.addView(title, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams statusParams = new LinearLayout.LayoutParams(-1, -2);
        statusParams.topMargin = 24;
        root.addView(status, statusParams);
        setContentView(root);
    }
}
}