package de.mide.wear.iata_codes;

/**
 * Klasse simuliert eine Datenbank zur Abfrage von IATA-Flughafen- und Fluglinien-
 * Codes (IATA: International Air Transport Association).<br>
 *
 * <b>ACHTUNG:</b> Diese Klasse kennt nur eine sehr kleine Teilmenge der IATA-Codes
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class IataCodesDatenbank {

    /**
     * Name Flughafen für IATA-Flughafen-Code abfragen.
     * <br><br>
     *
     * Vollständige(re) Listen von IATA-Flughafen-Codes:
     * <ul>
     *     <li><a href="https://de.wikipedia.org/wiki/Liste_der_IATA-Flughafen-Codes">Deutsche Wikipedia</a>.</li>
     *     <li><a href="https://www.iata.org/publications/Pages/code-search.aspx">Offizielle Datenbank der IATA ("Location Code" auswählen)</a>.</li>
     * </ul>
     *
     * @param code IATA-Flughafen-Code, z.B. "FRA" für "Frankfurt a.M.";
     *             besteht aus genau drei Zeichen (Buchstaben + Ziffern).
     *
     * @return Name des Flughafens, z.B. "Frankfurt a.M., Deutschland".
     */
    public static String getFlughafenCode(String code) {

        switch (code) {
            case "FRA": return "Frankfurt a.M., Deutschland";
            case "STR": return "Stuttgart, Deutschland";
            default: return "Unbekannter IATA-Airport-Code \"" + code + "\"";
        }
    }


    /**
     * Name Fluglinie für IATA-Airline-Code abfragen.
     * <br><br>
     *
     * Vollständige(re) Listen von IATA-Airline-Codes:
     * <ul>
     *   <li><a href="https://de.wikipedia.org/wiki/Liste_der_IATA-Airline-Codes">Deutsche Wikipedia</a>.</li>
     *   <li><a href="https://www.iata.org/publications/Pages/code-search.aspx">Offizielle Datenbank der IATA ("IATA Airline code" auswählen)</a>.</li>
     * </ul>
     *
     * @param code IATA-Flughafen-Code, z.B. "LH" oder "AA";
     *             besteht aus genau zwei Zeichen (Buchstaben + Ziffern).
     *
     * @return Name der Fluglinie, z.B. "Lufthansa".
     */
    public static String getAirlineCode(String code) {

        switch (code) {
            case "LH": return "Lufthansa";
            case "AA": return "American Airlines";
            default: return "Unbekannter IATA-Airline-Code \"" + code + "\"";
        }
    }

}
