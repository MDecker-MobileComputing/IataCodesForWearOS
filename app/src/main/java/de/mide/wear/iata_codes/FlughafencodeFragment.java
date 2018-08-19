package de.mide.wear.iata_codes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Fragment für Suche nach IATA-Flughafencode (z.B. "FRA" für "Frankfurt a.M.).
 * Code besteht immer aus drei Zeichen (Buchstaben und Ziffern).
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class FlughafencodeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate( R.layout.fragment_flughafencode, container, false );
        // attachToRoot=false
    }
}
