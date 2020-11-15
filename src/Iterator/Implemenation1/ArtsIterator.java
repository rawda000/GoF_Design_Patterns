package Iterator.Implemenation1;

public class ArtsIterator implements IIterator {
    private String[] papers;
    private int currentPosition;

    public ArtsIterator(String[] papers) {
        this.papers = papers;
        currentPosition = 0;
    }

    @Override
    public void first() {
        currentPosition = 0;
    }

    @Override
    public String next() {
        return papers[currentPosition++];
    }

    @Override
    public String currentItem() {
        return papers[currentPosition];
    }

    @Override
    public boolean hasNext() {
        if (currentPosition < papers.length) return true;
        return false;
    }
}
