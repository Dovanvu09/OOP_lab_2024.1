package hust.soict.dsai.aims.media;

public class Track {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Track) {
            Track other = (Track) obj;
            return this.title.equals(other.getTitle()) && this.length == other.getLength();
        }
        return false;
    }

    @Override
    public String toString() {
        return "Track [title=" + title + ", length=" + length + "]";
    }
}