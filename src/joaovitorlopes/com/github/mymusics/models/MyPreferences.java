package joaovitorlopes.com.github.mymusics.models;

public class MyPreferences {

    public void include(Audio audio) {
        if(audio.getRating() >= 9) {
            System.out.printf("%s is an absolute success and is highly preferred!%n", audio.getTitle());
        } else {
            System.out.printf("%s is not that popular, but it's well rated. %n", audio.getTitle());
        }
    }
}
