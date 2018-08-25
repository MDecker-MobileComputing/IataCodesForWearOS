package de.mide.wear.iata_codes;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;


/**
 * WearOS-App zur Abfrage von IATA-Codes für Flughäfen von Fluglinien;
 * verwendete Fragmente.
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class MainActivity extends WearableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setAmbientEnabled(); // Enables Always-on
    }

}
