package lab17a_refs_params_labs;

public class LetterBoxes {

    public static void printBox(char letter, int size) {
        for (int i = 0; i < size; i++) {
            for (int x = 0; x < size; x++) {
                System.out.print(letter);
            }
            System.out.println("");
        }
    }
}
