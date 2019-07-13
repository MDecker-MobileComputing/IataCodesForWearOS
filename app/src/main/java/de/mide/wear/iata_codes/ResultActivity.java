package de.mide.wear.iata_codes;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.TextView;


/**
 * Activity zur Darstellung von Ergebnis; diese Activity wird von den
 * beiden Fragmenten aufgerufen.
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class ResultActivity extends WearableActivity {

    /** Schlüssel, um einem expliziten intent den errechneten Wert BMI-Wert mitzugeben. */
    public static final String EXTRA_KEY_ERGEBNIS_TEXT = "ergebnis_text";


    /**
     * Lifecycle-Methode.
     * Nach Laden der Layout-Datei wird der als Extra übergebene Text
     * ausgelesen und im TextView-Element angezeigt.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);

        String textZumAnzeigen = "";

        Intent intent = getIntent();
        if ( intent.hasExtra(EXTRA_KEY_ERGEBNIS_TEXT) == true ) {
            textZumAnzeigen = intent.getStringExtra(EXTRA_KEY_ERGEBNIS_TEXT);
        } else {
            textZumAnzeigen = "INTERNER Fehler: Ergebnis-Text nicht gefunden.";
        }

        TextView textView = findViewById(R.id.resultTextView);
        textView.setText(textZumAnzeigen);

        setAmbientEnabled(); // Enables Always-on
    }

}
