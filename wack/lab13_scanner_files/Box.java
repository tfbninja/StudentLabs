package lab13_scanner_files;

public class Box {

    private String let;
    private int size;

    public Box() {
        this.let = "";
        this.size = 0;
    }

    public Box(String let, int size) {
        this.let = let;
        this.size = size;
    }

    public void setLetter(String let) {
        this.let = let;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getLetter() {
        return this.let;
    }

    public int getSize() {
        return this.size;
    }

    public String coolBox() {
        String output = "";
        for (int i = 0; i < this.size; i++) {
            for (int a = i; a < this.size + i; a++) {
                output += (char) ((this.let.charAt(0) + a - 65) % 26 + 65);
            }
            output += "\n";
        }
        return output;
    }

    public String evenCoolerBox() {
        char[][] outputList = new char[this.size][this.size];
        int bound = this.size - 1;
        int revBound = 0;
        int letAdd = 0;
        while (bound > 0) {
            for (int left = 0; left < bound - revBound; left++) {
                outputList[revBound][revBound + left] = (char) ((this.let.charAt(0) + letAdd - 65) % 26 + 65);
                letAdd++;
            }

            for (int bot = 0; bot < bound - revBound; bot++) {
                outputList[revBound + bot][bound] = (char) ((this.let.charAt(0) + letAdd - 65) % 26 + 65);
                letAdd++;
            }

            for (int right = 0; right < bound - revBound; right++) {
                outputList[bound][bound - right] = (char) ((this.let.charAt(0) + letAdd - 65) % 26 + 65);
                letAdd++;
            }

            for (int top = 0; top < bound - revBound; top++) {
                outputList[bound - top][revBound] = (char) ((this.let.charAt(0) + letAdd - 65) % 26 + 65);
                letAdd++;
            }

            bound--;
            revBound++;
        }
        if (this.size % 2 == 1 && !(this.size == 1)) {
            outputList[this.size / 2][this.size / 2] = (char) ((this.let.charAt(0) + letAdd - 65) % 26 + 65);
        } else if (this.size == 1) {
            return this.let;
        }

        String realOutput = "";
        for (int x = 0; x < this.size; x++) {
            for (int y = 0; y < this.size; y++) {
                realOutput += outputList[y][x];
                //System.out.print(outputList[x][y]);
            }
            realOutput += "\n";
        }
        return realOutput;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < this.size; i++) {
            for (int a = 0; a < this.size; a++) {
                output += this.let;
            }
            output += "\n";
        }

        return output + "\n";
    }
}
