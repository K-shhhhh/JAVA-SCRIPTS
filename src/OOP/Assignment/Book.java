package Assignment;

public final class Book {
    private final String title;
    private final String author;
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.setPageCount(pageCount);
    }

    public void setPageCount(int pages){
        if (pages <= 0){
            this.pageCount = 1;
        } else {
            this.pageCount = pages;
        }
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPageCount(){
        return pageCount;
    }

    public double getReadingTime(){
        setPageCount(pageCount);
        double calculate = getPageCount() / 50.0;
        return calculate;
    }
}
