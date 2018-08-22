package de.mide.wear.iata_codes;

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
import android.widget.Toast;
import android.support.v7.app.AlertDialog;


/**
 * Fragment für Suche nach IATA-Flughafencode (z.B. "FRA" für "Frankfurt a.M.).
 * Code besteht immer aus drei Zeichen (Buchstaben und Ziffern).
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class FlughafencodeFragment
        extends Fragment
        implements View.OnClickListener {

    /** Referenz auf Text-Eingabefeld für IATA-Flughafen-Code. */
    protected EditText _codeEditText = null;


    /**
     * Layout-Datei für Fragment mit Inflater laden und View daraus erzeugen.
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate( R.layout.fragment_flughafencode, container, false );
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

        // Hintergrundfarbe von Fragment kann nicht über Attribut geändert werden.
        // siehe auch: https://stackoverflow.com/a/15941465/1364368
        getView().setBackgroundColor(Color.DKGRAY); // dark gray

        Button button = view.findViewById(R.id.sucheFlughafenButton);
        button.setOnClickListener(this);

        _codeEditText = view.findViewById(R.id.codeFlughafenEditText);
    }


    /**
     * Event-Handler für Button, führt Suche nach Flughafen-Code aus.
     *
     * @param view Button, der das Event ausgelöst hat.
     */
    @Override
    public void onClick(View view) {

        try {
            String code = _codeEditText.getText().toString().trim();

            String flughafen = IataCodesDatenbank.getFlughafenCode(code);
            if (flughafen.length() == 0) {
                Toast toast =
                        Toast.makeText(view.getContext(),
                                "Kein Flughafen mit Code \"" + code + "\" gefunden.",
                                Toast.LENGTH_LONG);
                toast.show();

            } else {

                Toast toast =
                        Toast.makeText(view.getContext(),
                                "Flughafen:\n" + flughafen,
                                Toast.LENGTH_LONG);
                toast.show();


            }
        }
        catch (Exception ex) {
            Toast toast =
                    Toast.makeText(view.getContext(),
                                   "Code ist zu kurz\n(weniger als drei Zeichen)",
                                   Toast.LENGTH_LONG);
            toast.show();
        }
    }

}
