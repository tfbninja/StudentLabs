package lab24c_sortsearch_insertion;

public class InsertionSortRunner {

    public static void main(String args[]) {
        String[] tests = "alice tommy bobby patrick annabelle sallysue sallymae bigchungus thanos captainjacksparrow".split(" ");
        InsertionSort i = new InsertionSort();
        for (String s : tests) {
            i.add(s);
            System.out.println(i);
        }
    }
}
