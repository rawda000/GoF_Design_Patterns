package Iterator.Implemenation1;

public class Arts implements Subject {
    private String[] papers;

    public Arts() {
        papers = new String[]{"English", "History",
                "Geography", "Psychology"};
    }

    @Override
    public IIterator createIterator() {
        return new ArtsIterator(papers);
    }
}
