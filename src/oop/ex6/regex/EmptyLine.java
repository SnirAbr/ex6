package oop.ex6.regex;

import java.util.regex.*;

public class EmptyLine {

    private static Pattern p = Pattern.compile("\\s*?");

    public static boolean isEmptyLine(String line) {
        Matcher m = p.matcher(line);
        return m.matches();
    }
}
