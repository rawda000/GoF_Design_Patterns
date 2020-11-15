package Iterator.Implemenation2;


public class Arts implements Subject {
    private String[] papers;

    public Arts() {
        papers = new String[]{"English", "History",
                "Geography", "Psychology"};
    }

    @Override
    public ArtsIterator createIterator() {
        return new ArtsIterator(papers);
    }
}
