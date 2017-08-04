package string;

/**
 * <pre>
 * ProjectName:  data structure
 * PackageName:  string
 * CreateTime:   2017/07/28 17:03.
 * </pre>
 * Description:
 *
 * @author panchaoliang
 * @version Ver 1.0
 */
public class String implements Str {
    private int length;
    private char[] s;

    public String() {
        length=0;
    }

    public String(char[] s) {
        this.length = s.length;
        this.s = s;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public char charAt(int index) {
        if (index<0 || index>s.length-1) {
            throw new RuntimeException("index is wrong!");
        }
        return s[index];
    }

    @Override
    public int indexOf(char c) {

        return indexOf(c,0);
    }

    @Override
    public int indexOf(char c, int from) {
        return 0;
    }

    @Override
    public int indexOf(Str str) {
        return 0;
    }

    @Override
    public int indexOf(Str str, int from) {
        return 0;
    }

    @Override
    public Str substring(int strartIndex) {
        return null;
    }

    @Override
    public Str substring(int beginIndex, int endIndex) {
        return null;
    }

    @Override
    public Str insert(int posit, Str str) {
        return null;
    }

    @Override
    public Str delete(int begin, int end) {
        return null;
    }

    @Override
    public Str replace(Str target, Str replacement) {
        return null;
    }

    @Override
    public Str replace(Str target, Str replacement, int from) {
        return null;
    }

    @Override
    public Str concat(Str str) {
        return null;
    }

    @Override
    public char[] toCharArray() {
        return new char[0];
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
