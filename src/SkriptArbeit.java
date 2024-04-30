//Was ist java? Wie funktioniert java
// Java ist eine OOP Kompilierte Sprache die in einem JVM (Java Virtual Machine) ausgeführt wird, das bedeutet dass man java Programme auf allen Betriebssystemen ausführen kann da
// der Java Code in Binary Code umgewandelt wird und dann von der JVM "gelesen" wird

//2. Was sind Datentypen und welche Funktion erfüllen sie? ¨
// Geben an wie Daten gespeichert werden sollen, als String, int, float, bool, short, long, char, array

//5. Was sind komplexe Datentypen und welche kann man in java nutzen?
// Constructor

//8. Was sind Operatoren?
//(a) Schreibe ein jp, welches die arithmetischen Operatoren ’plus’,’minus’,’mal’, ’dividiert’, ’modulo’, ’potenzieren’ nutzt. Welche Pr¨azedenz (i.e. Reihenfolge) haben diese Operatoren?
//(b) Schreibe ein jp, welches die bitweisen Operatoren ’And’, ’Or’, ’Xor’, ’Shift-left’,
//’Shift-right’, ’Not’ implementiert. Recherchiere kurz wie man diese Operatoren sinngebend nutzen
//kann (z.B. Xor-Swap, Multiplikation/Division mit 2, ...).
//(c) Schreibe ein jp, das logische Operatoren nutzt.



//10. Was ist eine Kondition? Welche Formen von Konditionen sind dir bekannt? L¨ose folgende Problemstellungen mithilfe einer Kondition.
//(a) Wenn A gleich B, dann gebe ’A gleich B’ aus.
//(b) Wenn nicht A ungleich B, dann gebe ’A ist nicht ungleich B’ aus.
//(c) Wenn ein String A den Buchstaben ’e’ beinhalte0000t, dann setze eine Variable B gleich ’Ja’, andernfalls
//’Nein’.
//(d) Wenn A die Zeichenkette ’rot’ beinhaltet, setze B gleich ’Ja’, andernfalls ’Nein’.
//(e) Fur eine Zahl A, gib ”positiv” aus wenn die Zahl positiv ist. Gib ”negativ” aus, wenn die Zahl ¨
//negativ ist. Andernfalls, wenn die Zahl 0 ist, gib ”null” aus.

//11. Was ist eine Schleife? Erstelle eine Schleife fur folgende Problemstellungen. ¨
//(a) Die Multiplikation ist das wiederholte addieren von Zahlen. Stelle die Multiplikation von 2 Zahlen
//als Addition, mithilfe einer Schleife da.
//(b) Die Division ist das wiederholte subtrahieren von Zahlen. Stelle die Division von 2 Zahlen als
//Subtraktion, mithilfe einer Schleife da.
//(c) Die Fibonacci-Reihe ist eine Folge von Zahlen, bei der das n¨achstgr¨oßere Element die Summe der
//jetzigen Zahl und der vorherigen Zahl ist: 1, 1, 2, 3, 5, 8, 13. Programmiere eine Schleife, welche die
//x-te Fibonacci-Zahl berechnet. x ist eine ganze Zahl und wird vom Nutzer eingegeben.
//(d) Fur eine beliebige Zeichenkette, suche mithilfe einer Schleife ob der Buchstabe ’a’ vorkommt. Wenn ¨
//ja, gib die Position des ersten ’a’ aus und terminiere die Schleife.
//(e) Fur eine beliebige Zeichenkette, suche mithilfe einer Schleife ob der Buchstabe ’a’ oder ’A’ vor- ¨
//kommt. Wenn ja, gib die Position aus und fuhre den Task weiter fort. ¨

//12. Wie definiert man eine Funktion in java? Gibt es eine Main-Funktion?

//13. Erstelle eine Funktion fur folgende Problemstellungen. Setze passende R ¨ uckgabewerte f ¨ ur den Caller. ¨
//(a) Erstelle eine Funktion ”sum(a, b, c, d)”, welche die Summe von a,b,c,d zuruckgibt. ¨
//(b) Erstelle eine Funktion ”revert(array)”, welche den Inhalt eines Arrays reversiert.
//(c) Erstelle eine Funktion ”trim(array, x, y)’, welche den Inhalt des Arrays von ’x’ bis ’y’ zuruckgibt. ¨
//Beispiel: trim([0, 1, 2, 3, 4], 1, 3) - [1, 2, 3]

//(d) Erstelle eine Funktion ”compare(a,b)”, welche die Elemente auf Wert und Typ kontrolliert. Ist der
//Wert gleich, gib ”Wert ist gleich.” aus. Ist der Typ gleich, gib ”Typ ist gleich.” aus. Sollte beides
//ungleich sein, so gebe ”Werte sind ungleich” aus.

//14. Wie werden Programmfehler und Ausnahmen in java behandelt? Recherchiere wie ’Try-Except’-
//Bl¨ocke funktionieren.

//15. Definiere kurz ob fur folgende Problemstellungen eine If-Kondition reicht, oder ob ein Try-Except ¨
//notwendig ist.
//(a) Im Geltungsbereich einer Funktion wird eine Division mit 0 durchgefuhrt. ¨
//(b) Fur eine Funktion, welche positive Werte zur ¨ uckgegeben werden, wird pl ¨ ¨otzlich eine negative
//zuruckgegeben. ¨
//(c) W¨ahrend des Programmes wird der Index fur eine Liste zu hoch angesetzt.


public class SkriptArbeit {
    // 8
    public static void Arithmetic(){
        int number = 15;
        int number2 = 10;

        System.out.println(number + number2);
        System.out.println(number - number2);
        System.out.println(number * number2);
        System.out.println(number / number2);
        System.out.println(number % number2);
    }

    public static void Logic(){
        String text = "Hallo";
        String text2 = "Welt";

        if (text.equals("Hallo") && text2.equals("Welt")){
            System.out.println("Invalid");
        }

        if (text.equals("Hallo") || text2.equals("Tschöss")){
            System.out.println("Invalid");
        }
        if (!text.equals("Hallo")){
            System.out.println("Invalid");
        }
    }
    public static void Bitwise() {
        int numberBin = 5;
        int numberBin2 = 7;

        System.out.println(numberBin & numberBin2);
        System.out.println(numberBin | numberBin2);
        System.out.println(numberBin ^ numberBin2);
        System.out.println(~numberBin2);
    }

    //  10
    //10. Was ist eine Kondition? Welche Formen von Konditionen sind dir bekannt? L¨ose folgende Problemstellungen mithilfe einer Kondition.
//(a) Wenn A gleich B, dann gebe ’A gleich B’ aus.
//(b) Wenn nicht A ungleich B, dann gebe ’A ist nicht ungleich B’ aus.
//(c) Wenn ein String A den Buchstaben ’e’ beinhalte0000t, dann setze eine Variable B gleich ’Ja’, andernfalls
//’Nein’.
//(d) Wenn A die Zeichenkette ’rot’ beinhaltet, setze B gleich ’Ja’, andernfalls ’Nein’.
//(e) Fur eine Zahl A, gib ”positiv” aus wenn die Zahl positiv ist. Gib ”negativ” aus, wenn die Zahl ¨
//negativ ist. Andernfalls, wenn die Zahl 0 ist, gib ”null” aus.

    public static void Condition() {
        int numberBin = 5;
        int numberBin2 = 7;
        String a = "Hallo Welt";
        String b = null;

        if (a.equals(b)){
            System.out.println("A == B");
        }

        if (!a.equals(b)){
            System.out.println("A != B");
        }
        if (a.contains("e")) {
            System.out.println("ja");
        }
    }
}

