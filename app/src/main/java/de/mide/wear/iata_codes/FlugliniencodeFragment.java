package de.mide.wear.iata_codes;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Fragment für Suche nach IATA-Fluglinien-Codes (z.B. "LH" für "Lufthansa").
 * Code besteht immer aus zwei Zeichen (Buchstaben und Ziffern).
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class FlugliniencodeFragment extends Fragment {

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

        // Hintergrundfarbe von Fragment kann nicht über Attribut geändert werden.
        // siehe auch: https://stackoverflow.com/a/15941465/1364368
        getView().setBackgroundColor(Color.DKGRAY); // dark gray
    }
}
