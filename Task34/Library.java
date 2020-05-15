package task34;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Genre> genres = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Author> authors = new ArrayList<>();

    public void addGenre(String title, String description) {
        genres.add(new Genre(title, description));
    }

    public void removeGenre(String title) {
        for (int i = 0; i < genres.size(); i++) {
            if (genres.get(i).title.equals(title)) genres.remove(i);
        }
    }

    public void allGenres() {
        for (int i = 0; i < genres.size(); i++) System.out.println((i + 1) + ". " + genres.get(i));
    }

    public void addAuthor(String lastName, String firstName) {
        authors.add(new Author(lastName, firstName));
    }

    public void removeAuthor(String lastName, String firstName) {
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).firstName.equals(firstName) && authors.get(i).lastName.equals(lastName))
                authors.remove(i);
        }
    }

    public void allAuthors() {
        for (int i = 0; i < authors.size(); i++) System.out.println((i + 1) + ". " + authors.get(i));
    }

    public void addBook(String title, String description, String year) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose genre: ");
            allGenres();
            int genreIndex = sc.nextInt();
            System.out.println("Choose author: ");
            allAuthors();
            int authorIndex = sc.nextInt();
            books.add(new Book(title, description, year, genres.get(genreIndex)));
            authors.get(authorIndex).books.add(getBook(title));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid input. ");
        }
    }

    private Author getAuthor(String firstName, String lastName) {
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).firstName.equals(firstName) && authors.get(i).lastName.equals(lastName))
                return authors.get(i);
        }
        return null;
    }

    private Book getBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title.equals(title)) return books.get(i);
        }
        return null;
    }

    private Genre getGenre(String title) {
        for (int i = 0; i < genres.size(); i++) {
            if (genres.get(i).title.equals(title)) return genres.get(i);
        }
        return null;
    }

    public void removeBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title.equals(title)) {
                books.remove(i);
            }
        }
    }

    public void allBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

    private static class Genre {
        private String title;
        private String description;

        public Genre(String title, String description) {
            this.title = title;
            this.description = description;
        }

        @Override
        public String toString() {
            return title + ": " + description + ". ";
        }
    }

    private static class Book {
        private String title;
        private String description;
        private String year;
        private Genre genre;

        public Book(String title, String description, String year, Genre genre) {
            this.title = title;
            this.description = description;
            this.year = year;
            this.genre = genre;
        }

        @Override
        public String toString() {
            return title + " " + year + ".\n" + genre + "\n" + description;
        }
    }

    private static class Author {
        private String lastName;
        private String firstName;
        private ArrayList<Book> books = new ArrayList<>();

        public Author(String lastName, String firstName) {
            this.lastName = lastName;
            this.firstName = firstName;
        }

        @Override
        public String toString() {
            String toString = lastName + " " + firstName + ".\nBooks: ";
            for (int i = 0; i < this.books.size() - 1; i++) {
                toString += books.get(i) + ", ";
            }
            toString += books.get(books.size() - 1) + ". ";
            return toString;

        }
    }
}