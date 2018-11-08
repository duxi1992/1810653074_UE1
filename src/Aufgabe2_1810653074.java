public class Aufgabe2_1810653074 {
    public static void main(String[] args) {
        String bezeichnung;         // Null bis 2.147.483.647
        int wert1  ;              //-231 .. 231 -1 entspricht -2147483648 ... 2147483647
        double wert2;             //+/-4,9E-324 ... +/-1,7E+308;	64-bit IEEE 754, doppelte Genauigkeit
        boolean gebucht;          // Boolescher Wahrheitswert
        long wert3;               //	0 ... 65.535 ; Unicode Zeichen UTF-16
        byte wert4;               // 	-128 ... 127;
        short wert5;              // -32.768 ... 32.767
        float wert6;              //+/-1,4E-45 ... +/-3,4E+38; es wird empfohlen, diesen Wert nicht für Programme zu verwenden, die sehr genau rechnen müssen


        bezeichnung = "Urlaub";
        wert1 = 185146;
        wert2 = 16532165.57;
        gebucht = true;
        wert3 = 65784;
        wert4 = -85;
        wert5 = (short) 32.767;
        wert6 = 15156546516356559854F;


        /* Es wird eine Konstante Variable int mit dem Namen Wert erstellt und der Wert 218 wird zugewiensen;
        * Eine Variable kann weiterhin geändert werden, eine Konstante nicht*/

        final int wert = 218;

    }

}