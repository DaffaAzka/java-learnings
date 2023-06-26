package adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AdapterApp {

    public static void main(String[] args) {
        List<CatalogAdapter> list = new ArrayList<>();

        list.add(new BookCatalogAdapter(new Book("Java", "Dest")));
        list.add(new BookCatalogAdapter(new Book("PHP", "Delta")));
        list.add(new BookCatalogAdapter(new Book("JS", "Rei")));

        list.add(new ScreencastCatalogAdapter(new Screencast("Web", "Mid", 10L)));
        list.add(new ScreencastCatalogAdapter(new Screencast("Droid", "Lyn", 40L)));
        list.add(new ScreencastCatalogAdapter(new Screencast("Flutter", "Yuki", 60L)));

        list.forEach(item -> {
            System.out.println(item.getCatalogTitle());
        });
    }

}
