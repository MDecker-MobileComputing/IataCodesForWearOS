package de.mide.wear.iata_codes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.wear.widget.WearableRecyclerView;
import android.support.wearable.activity.WearableActivity;
import android.view.ViewGroup;


/**
 * Zitat aus
 * <a href="https://designguidelines.withgoogle.com/wearos/patterns/navigation.html#">Abschnitt
 * "Navigation" in den "Design Guildelines" für WearOS:</a>
 * <i>"Wear OS devices use left-to-right swipe gestures, instead of Back buttons, to close the
 * current view and go back to the previous view. [...] If possible, keep other navigation to a
 * vertical axis and avoid horizontal carousels when designing apps.</i>
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class MainActivity extends WearableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Enables Always-on
        setAmbientEnabled();
    }


}
