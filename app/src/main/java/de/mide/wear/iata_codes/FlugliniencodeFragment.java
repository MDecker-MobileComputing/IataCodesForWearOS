package de.mide.wear.iata_codes;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Fragment für Suche nach IATA-Fluglinien-Codes (z.B. "LH" für "Lufthansa").
 * Code besteht immer aus zwei Zeichen (Buchstaben und Ziffern).
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class FlugliniencodeFragment extends Fragment
                                    implements View.OnClickListener {

    /** Referenz auf Text-Eingabefeld für IATA-Fluglinien-Code. */
    protected EditText _codeEditText = null;


    /**
     * Layout-Datei für Fragment mit Inflater laden und View daraus erzeugen.
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate( R.layout.fragment_flugliniencode, container, false );
        // attachToRoot=false
    }


    /**
     * Diese Methode entspricht der Methode {@link android.app.Activity#onCreate(Bundle)}
     * von Activities.
     *
     * @param view Referenz auf View-Objekt, das von Methode
     *             {@link Fragment#onCreateView(LayoutInflater, ViewGroup, Bundle)}
     *             mit Inflater erstellt und mit return zurückgegeben wurde.
     */
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button = view.findViewById(R.id.sucheFluglinieButton);
        button.setOnClickListener(this);

        _codeEditText = view.findViewById(R.id.codeFluglinienEditText);
    }


    /**
     * Event-Handler für Button, führt Suche nach Fluglinien-Code aus;
     * Ergebnis oder Fehler wird auf {@link ResultActivity} dargestellt.
     *
     * @param view Button, der das Event ausgelöst hat.
     */
    @Override
    public void onClick(View view) {

        Intent intent = new Intent(view.getContext(), ResultActivity.class);
        String text = "";

        try {
            String code = _codeEditText.getText().toString().trim();

            String fluglinie = IataCodesDatenbank.getFluglinienCode(code);

            if (fluglinie.length() == 0) {

                text = "Keine Fluglinie mit Code \"" + code.toUpperCase() + "\" gefunden.";
                intent.putExtra(ResultActivity.EXTRA_KEY_ERGEBNIS_TEXT, text);

            } else {

                text = "Fluglinie mit Code \"" + code.toUpperCase() + "\":\n\n" + fluglinie;
                intent.putExtra(ResultActivity.EXTRA_KEY_ERGEBNIS_TEXT, text);
            }
        }
        catch (Exception ex) {

            text = "Code zu kurz\n(weniger als zwei Zeichen)";
            intent.putExtra(ResultActivity.EXTRA_KEY_ERGEBNIS_TEXT, text);
        }

        startActivity(intent);
    }

}
