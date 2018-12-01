package lab17a_refs_params_labs;

public class TriangleWord {

    public static void printTriangle(String word) {
        for (int i = 0; i <= word.length(); i++) {
            for (int x = 0; x < i; x++) {
                System.out.print(word.substring(0, i));
            }
            System.out.println("");
        }
    }
}
