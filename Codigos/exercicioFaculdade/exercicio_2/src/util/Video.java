package util;

public class Video {

    public String title;
    public double duration;
    public boolean runStatus;

    public void modeStatus() {
    }

    @Override
    public String toString() {
        return "The Movie: " + title + "\n" +
                "Have pause in: " + duration + "\n" +
                "Status: Paused";
    }

    public boolean modeStatus(boolean runStatus, double duration, String title) {
        if (runStatus == true) {
            System.out.println("The movie: " + title);
            System.out.println("Have pause in: " + duration);
            System.out.println("Status: Paused");
            return false;

        } else {
            System.out.println("The movie: " + title);
            System.out.println("Have pause in : " + duration);
            System.out.println("Status : Played");
            return true;
        }

    }

}


