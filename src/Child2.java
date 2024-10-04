public class Child2 extends Parent implements Printable {
    private String favoriteBook;

    public Child2(String name, int age, String favoriteBook) {
        super(name, age);
        this.favoriteBook = favoriteBook;
    }

    public String getFavoriteBook() {
        return favoriteBook;
    }

    @Override
    public void print() {
        System.out.println(getInfo() + ", Favorite Book: " + favoriteBook);
    }
}
