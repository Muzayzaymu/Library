public class Main {
    public static void main(String[] args) {
        Author Dostoevsky = new Author("Fyodor", "Dostoevsky");
        Book Idiot = new Book("Idiot", 1868, Dostoevsky);

        Author Turgenev = new Author("Ivan", "Turgenev");
        Book FathersAndChildren = new Book("Fathers and children", 1862, Turgenev);

        System.out.println(Idiot);
        System.out.println(FathersAndChildren);
    }
}