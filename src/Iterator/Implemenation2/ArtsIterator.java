package Iterator.Implemenation2;


import java.util.Iterator;

public class ArtsIterator implements Iterator<String> {
    private String[] papers;
    private int currentPosition;

    public ArtsIterator(String[] papers) {
        this.papers = papers;
        currentPosition = 0;
    }

    public void first() {
        currentPosition = 0;
    }

    @Override
    public String next() {
        return papers[currentPosition++];
    }

    public String currentItem() {
        return papers[currentPosition];
    }

    @Override
    public boolean hasNext() {
        if (currentPosition < papers.length) return true;
        return false;
    }
}
