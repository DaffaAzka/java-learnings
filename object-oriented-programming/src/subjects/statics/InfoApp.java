package subjects.statics;

public class InfoApp {
    public static void main(String[] args) {
        System.out.println(Info.APP);
        System.out.println(Info.PROCESSOR);
        System.out.println(Info.upWord("Daffa", "Islami", "Azka"));

        Info.NewInfo newInfo = new Info.NewInfo();
        System.out.println(newInfo.VER);
    }
}
