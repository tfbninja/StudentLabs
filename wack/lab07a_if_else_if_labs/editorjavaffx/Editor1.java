package editorjavaffx;

public class Editor1 implements Ed {

    private String pre, post;

    public Editor1(String before, String after) {
        pre = before;
        post = after;
    }

    public String toString() {
        return pre + "||" + post;
    }

    public String getBefore() {
        return pre;
    }

    public String getAfter() {
        return post;
    }

    public Editor1 rightArrow() {
        return new Editor1(pre + post.substring(0, 1),
                post.substring(1));

    }

    public Ed leftArrow() {
        return new Editor1("not", "finished");
    }

    public Ed delete() {
        return new Editor1("not", "finished");
    }

    public Ed backspace() {
        return new Editor1("not", "finished");
    }

    public Ed insertString(char c) // Originally insert(char c), which is fine if you teach the char type
    {
        return new Editor1("not", "finished");
    }

    public Ed homeKey() {
        return new Editor1("not", "finished");
    }

    public Ed endKey() {
        return new Editor1("not", "finished");
    }

    public static void main(String[] args) {
        Editor1 eddie = new Editor1("big", "dog");
        System.out.println(eddie + " right arrow = " + eddie.rightArrow());
        System.out.println(eddie + " left arrow = " + eddie.leftArrow());
    }
}
