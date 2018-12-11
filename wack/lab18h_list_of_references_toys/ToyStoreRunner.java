package lab18h_list_of_references_toys;

public class ToyStoreRunner {

    public static void main(String args[]) {

        String toys = "sorry bat sorry sorry sorry train train teddy teddy ball ball";
        ToyStore tester = new ToyStore();
        System.out.println(tester);

        tester.loadToys(toys);
        System.out.println(tester);
        System.out.println("max == " + tester.getMostFrequentToy());
    }
}
