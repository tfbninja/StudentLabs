package lab16b_arrayList_madlib;

import java.io.File;
import static java.lang.System.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MadLib {

    private ArrayList<String> verbs;
    private ArrayList<String> nouns;
    private ArrayList<String> adjectives;
    private String story = "";

    public MadLib() {
    }

    public MadLib(String fileName) {

        try {
            Scanner verbFile = new Scanner(new File("verbs.dat"));
            Scanner nounFile = new Scanner(new File("nouns.dat"));
            Scanner storyFile = new Scanner(new File("story.dat"));
            Scanner adjFile = new Scanner(new File("adjectives.dat"));
            while (verbFile.hasNext()) {
                verbs.add(verbFile.next());
                verbFile.nextLine();
            }
            while (nounFile.hasNext()) {
                nouns.add(nounFile.next());
                nounFile.nextLine();
            }
            while (storyFile.hasNextLine()) {
                this.story += storyFile.nextLine();
            }
            while (adjFile.hasNext()) {
                adjectives.add(adjFile.next());
                adjFile.nextLine();
            }

        } catch (Exception e) {
            out.println("Houston we have a problem!" + e.toString());
        }

    }

    public String getRandomVerb() {
        return choose(verbs);
    }

    public String getRandomNoun() {
        return choose(nouns);
    }

    public String getRandomAdjective() {
        return choose(adjectives);
    }

    public String choose(ArrayList<String> list) {
        int timeSeed = LocalTime.now().getNano();
        Random random = new Random(timeSeed);
        return list.get(random.nextInt(list.size()));
    }

    public String toString() {
        return this.story.replace("@", getRandomVerb()).replace("#", getRandomNoun()).replace("&", getRandomAdjective());
    }
}
