package subjects.statics;

public class Info {
    static String APP = "OOP-SUBJECTS-STATICS";
    public static final int PROCESSOR;

    static {
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }

    static String upWord(String... data) {
        StringBuilder temp = new StringBuilder();
        for (var d : data) {
            temp.append(d + " ");
        }
        return temp.toString();
    }

    static class NewInfo {
        public String VER = "1.6";
    }
}
