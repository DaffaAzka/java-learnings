package subjects;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class CString {
    public static void main(String[] args) {
        SToken();
    }

    public static void SJoiner() {
        String[] name = {"Daffa", "Islami", "Azka"};
        StringJoiner joiner = new StringJoiner(
                " | ", "[ ", " ]"
        );

        for (var temp : name) {
            joiner.add(temp);
        }

        System.out.println(joiner.toString());
    }

    public static void SBuilder() {
        StringBuilder builder = new StringBuilder();
        builder.append("Daffa");
        builder.append(" ");
        builder.append("Islami");
        builder.append(" ");
        builder.append("Azka");
        System.out.println(builder.toString());
    }

    public static void SToken() {
        var usernames = "Dest Reicader Delta Mid";
        StringTokenizer tokenizer = new StringTokenizer(usernames, " ");

        while (tokenizer.hasMoreTokens()) {
            var res = tokenizer.nextToken();
            System.out.println(res);
        }
    }
}
