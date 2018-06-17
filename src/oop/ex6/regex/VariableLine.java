package oop.ex6.regex;

import oop.ex6.structures.Variable;

import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.*;

public class VariableLine {
    // group 1 - final with spaces if exists
    private final static String f = "^(\\s*?final\\s)??";
    private final static String spacesMaybe = "\\s*?";
    // group 1 - variable name, group 2 - variable name starts with a letter, group 3 variable name starts
    // with _
    private final static String variableName = "((\\w[\\w_\\d]*?)|(_[\\w_\\d]+?))";
    // group 1 - type of variable, group 2-6 - specific variable type
    private final static String type = "((int)|(double)|(String)|(boolean)|(char))";
    // group 1 - value inserted into parameter
    private final static String value = "([^,\\s;]+)";
    // group 1 - entire variables equals something, variable name has groups, value has groups
    private final static String variableEquals = "(" + variableName + spacesMaybe + "=" + spacesMaybe +
            value + ")";
    // group 1 - variable declaration, might have assignment too, variable equals has groups, variable name
    // has groups
    private final static String initVars = "(" + variableEquals + "|" + variableName + ")";

    private static Pattern p = Pattern.compile(f + spacesMaybe + type + "\\s+?(" + initVars +
            spacesMaybe + "," + spacesMaybe + ")*?" + initVars + spacesMaybe + ";$");

    public static ArrayList<Variable> isVariableLine(String line) {
        Matcher m = p.matcher(line);
        if (m.matches()) {
            Pattern initValues = Pattern.compile(variableEquals + "|(" + variableName + spacesMaybe + "([,;" +
                    "])" + ")");
            Matcher sub = initValues.matcher(line);
            Stack<String> names = new Stack<>();
            Stack<String> values = new Stack<>();
            while (sub.find()) {
                // variable name with assignment
                String n = sub.group(2);
                if(n != null){
                    names.push(n);
                    values.push(sub.group(5));
                }
                else{
                    names.push(sub.group(8));
                    values.push(null);
                }
            }
            // true if final
            System.out.println(!m.group(1)
                    .equals(""));
            // holds the type
            System.out.println(m.group(2));

            ArrayList<Variable> vars = new ArrayList<>();
            while(!names.isEmpty()){
                vars.add(new Variable(!m.group(1).equals(""),names.pop(), m.group(2),values.pop()));
            }
            return vars;
        }
        return null;
    }

    public static void main(String[] args) {
        String line = "  final   String  a0 = 5.48  ,_vd=    jk,vnfdk , fD0Fs_f4f = -8754  ;";
        System.out.println(isVariableLine(line));
    }
}
