package joaovitorlopes.com.github.mymusics.main;

import joaovitorlopes.com.github.mymusics.models.Music;
import joaovitorlopes.com.github.mymusics.models.MyPreferences;
import joaovitorlopes.com.github.mymusics.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("ATWA");
        myMusic.setSinger("System Of A Down");

        for (int i = 0; i < 1000; i++) {
            myMusic.playIt();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.likeIt();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("NEWPOD");
        myPodcast.setHost("Fulano");

        for (int i = 0; i < 4000; i++) {
            myPodcast.playIt();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.likeIt();
        }

        MyPreferences preferences = new MyPreferences();
        preferences.include(myPodcast);
        preferences.include(myMusic);
    }
}
