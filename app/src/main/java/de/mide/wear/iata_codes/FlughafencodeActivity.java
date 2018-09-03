package de.mide.wear.iata_codes;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;

public class FlughafencodeActivity extends WearableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flughafencode);

        setAmbientEnabled(); // Enables Always-on
    }
}
