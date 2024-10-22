public class App {
    public static void main(String[] args){
        /*
         * DATI PRIMITIVI
         * 
         * dati forniti da Java così come sono
         * iniziano con la minuscola
         */

        boolean theBoolean = true; //oppure false

        byte theByte = 127; //da -128 a 127 (viene considerato anche lo 0)

        short theShort = -32768; //da -32768 a 32767

        int theInt = 2_000_000_000; //da -2 miliardi a 2 miliardi (possono essere scritti anche senza _ )

        long theLong = 90_000_000_000_000L; //da -9 quintilioni a 9 quintilioni -> FONDAMENTALE inserire "L" oppure "l" alla fine del valore

        float theFloat = 5.1234567f; //numero con 7 cifre decimali -> FONDAMENTALE inserire "f" alla fine del valore

        double theDouble = 9.12345678912345; //numero con 15 cifre decimali

        char theChar = 'f'; //singolo carattere -> IMPORTANTE SCRIVERLO TRA APICI SINGOLI 'x'


        /*
         * DATI REFERENCE
         * 
         * String -> dato reference fornito da java
         * altri dati creati da noi sviluppatori
         * iniziano con la MAIUSCOLA
         * presentano attributi e metodi da poter invocare
         * 
         */

        String theString = "ciao mamma"; //insieme di caratteri tra virgolette "xxx yy zzz"


        //Stampo nel terminale i dati
        System.out.println(theBoolean);
        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theLong);
        System.out.println(theInt);
        System.out.println(theFloat);
        System.out.println(theDouble);
        System.out.println(theChar);
        System.out.println(theString);
    }
}
