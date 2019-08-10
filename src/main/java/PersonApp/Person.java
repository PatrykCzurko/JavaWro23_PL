package PersonApp;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private List<Language> languages;

    public Person (Language language) {
        languages = new ArrayList<>();
        languages.add(language);

    }
    public void learn (Language language) {
        languages.add(language);
    }
    public void sayHello (){
        for (Language lang :languages)
            System.out.println(lang.hello() + "  ");
        System.out.println();
    }
}
