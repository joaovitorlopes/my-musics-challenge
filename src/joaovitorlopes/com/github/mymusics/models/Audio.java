package joaovitorlopes.com.github.mymusics.models;

public class Audio {
    private String title;
    private int totalReproductions;
    private int totalLikes;
    private int rating;

    public void likeIt() {
        this.totalLikes++;
    }

    public void playIt() {
        this.totalReproductions++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getRating() {
        return rating;
    }
}
