package de.mide.wear.iata_codes;

/**
 * Klasse simuliert eine Datenbank zur Abfrage von IATA-Flughafen- und Fluglinien-
 * Codes (IATA: International Air Transport Association).<br>
 *
 * <b>ACHTUNG:</b> Diese Klasse kennt nur eine sehr kleine Teilmenge der IATA-Codes.
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
     *             besteht aus genau drei Zeichen (Buchstaben + Ziffern);
     *             wird vor Vergleich um Leerzeichen am Anfang und Ende
     *             bereinigt.
     *
     * @return Name des Flughafens, z.B. "Frankfurt a.M., Deutschland";
     *         leerer String, wenn Code nicht gefunden wurde (aber nie
     *         <i>null</i>).
     *
     * @throws Exception Wenn <i>code</i> nicht genau drei Zeichen hat.
     */
    public static String getFlughafenCode(String code) throws Exception {

        String codeTrimmed = code.trim().toUpperCase();

        if (codeTrimmed.length() != 3) {
            throw new Exception("Flughafen-Code hat nicht genau drei Zeichen.");
        }

        switch (codeTrimmed) {
            case "FKB": return "Karlsruhe/Baden-Baden, Germany";
            case "FRA": return "Frankfurt a.M., Germany";
            case "LHR": return "London Heathrow, U.K.";
            case "LIS": return "Lissabon, Portugal";
            case "PEK": return "Peking, PR China";
            case "STR": return "Stuttgart, Germany";
            default: return "";
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
     *             besteht aus genau zwei Zeichen (Buchstaben + Ziffern);
     *             wird vor Vergleich um Leerzeichen am Anfang und Ende
     *             bereinigt.
     *
     * @return Name der Fluglinie, z.B. "Lufthansa";
     *         leerer String, wenn Code nicht gefunden wurde, aber nie
     *         <i>null</i>.
     *
     * @throws Exception Wenn <i>code</i> nicht genau zwei Zeichen hat.
     */
    public static String getAirlineCode(String code) throws Exception {

        String codeTrimmed = code.trim().toUpperCase();

        if (codeTrimmed.length() != 2) {
            throw new Exception("Fluglinien-Code hat nicht genau drei Zeichen.");
        }

        switch (codeTrimmed) {
            case "AA": return "American Airlines (USA)";
            case "BA": return "British Airways (UK)";
            case "LH": return "Lufthansa (Germany)";
            case "LO": return "LOT (Polish Airlines)";
            case "SK": return "SAS Scandinavian Airlines (Sweden)";
            default: return "";
        }
    }

}
