package de.mide.wear.iata_codes;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;


public class FlugliniencodeActivity extends WearableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flugliniencode);

        setAmbientEnabled(); // Enables Always-on
    }
}
