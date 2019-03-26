package lab24g_sortsearch_wordsearch;

public class WordSearch {

    private String[][] m;

    public WordSearch(int size, String str) {
        m = new String[size][size];
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                m[r][c] = String.valueOf(str.charAt(r * size + c));
            }
        }
    }

    public boolean isFound(String word) {
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                if (checkRight(word, r, c) || checkLeft(word, r, c) || checkUp(word, r, c) || checkDown(word, r, c)
                        || checkDiagDownRight(word, r, c) || checkDiagUpRight(word, r, c) || checkDiagUpLeft(word, r, c) || checkDiagDownLeft(word, r, c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkRight(String w, int r, int c) {
        for (int i = 0; i < w.length(); i++) {
            if (c + i >= m[r].length) {
                return false;
            }
            if (!m[r][c + i].equals(String.valueOf(w.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public boolean checkLeft(String w, int r, int c) {
        for (int i = 0; i < w.length(); i++) {
            if (c - i < 0) {
                return false;
            }
            if (!m[r][c - i].equals(String.valueOf(w.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public boolean checkUp(String w, int r, int c) {
        for (int i = 0; i < w.length(); i++) {
            if (r - i < 0) {
                return false;
            }
            if (!m[r - i][c].equals(String.valueOf(w.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public boolean checkDown(String w, int r, int c) {
        for (int i = 0; i < w.length(); i++) {
            if (r + i >= m.length) {
                return false;
            }
            if (!m[r + i][c].equals(String.valueOf(w.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public boolean checkDiagUpRight(String w, int r, int c) {
        for (int i = 0; i < w.length(); i++) {
            if (r - i < 0 || c + i >= m[r].length) {
                return false;
            }
            if (!m[r - i][c + i].equals(String.valueOf(w.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public boolean checkDiagUpLeft(String w, int r, int c) {
        for (int i = 0; i < w.length(); i++) {
            if (r - i < 0 || c - i < 0) {
                return false;
            }
            if (!m[r - i][c - i].equals(String.valueOf(w.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public boolean checkDiagDownLeft(String w, int r, int c) {
        for (int i = 0; i < w.length(); i++) {
            if (r + i >= m.length || c - i < 0) {
                return false;
            }
            if (!m[r + i][c - i].equals(String.valueOf(w.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public boolean checkDiagDownRight(String w, int r, int c) {
        for (int i = 0; i < w.length(); i++) {
            if (r + i >= m.length || c + i >= m[r].length) {
                return false;
            }
            if (!m[r + i][c + i].equals(String.valueOf(w.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String out = "";
        for (String[] row : m) {
            for (String i : row) {
                out += i + " ";
            }
            out += "\n";
        }
        return out;
    }
}
