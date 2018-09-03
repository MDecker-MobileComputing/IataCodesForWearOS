package de.mide.wear.iata_codes;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;


/**
 * WearOS-App zur Abfrage von IATA-Codes für Flughäfen von Fluglinien;
 * verwendete Fragmente.
 * Variante mit getrennten Activities für die beiden Abfragen.
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class MainActivity extends WearableActivity
                          implements View.OnClickListener {

    protected Button _flughafenButton = null;

    protected Button _fluglinienButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _flughafenButton = findViewById(R.id.flughafenButton);
        _flughafenButton.setOnClickListener(this);

        _fluglinienButton = findViewById(R.id.fluglinienButton);
        _fluglinienButton.setOnClickListener(this);

        setAmbientEnabled(); // Enables Always-on
    }


    /**
     * Event-Handler für Buttons.
     *
     * @param view Button, der Event ausgelöst hast.
     */
    public void onClick(View view) {

        Intent intent = null;

        if (view == _flughafenButton) {
            intent = new Intent(this, FlughafencodeActivity.class);
        }
        else if (view == _fluglinienButton) {
            intent = new Intent(this, FlugliniencodeActivity.class);
        }

        startActivity(intent);
    }

}
