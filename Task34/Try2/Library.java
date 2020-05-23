package com.hillel.lombok.task34;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {
    HashMap<String, Author> authors = new HashMap<>();
    HashMap<String, Genre> genres = new HashMap<>();
    HashMap<String, Book> books = new HashMap<>();

    public void addBook(String name, int year, String description) {
        Genre genre = null;
        Author author = null;
        Book book;
        Scanner sc = new Scanner(System.in);
        if (!genres.isEmpty()) {
            System.out.println("Choose book's genre: ");
            allGenres();
            String line = sc.next();
            for (Map.Entry<String, Genre> entryGenre : genres.entrySet()) {
                if (entryGenre.getKey().equals(line)) {
                    genre = entryGenre.getValue();
                    break;
                }
            }
        } else {
            System.out.println("Type name and description of new genre. \nExample: Fantasy - Fantasy is a genre of speculative fiction set in a fictional universe");
            String[] input = sc.next().split(" - ");
            genre = Genre.builder()
                    .name(input[0])
                    .description(input[1])
                    .build();
            genres.put(input[0], genre);
        }
        if (!authors.isEmpty()) {
            System.out.println("Choose book's author: ");
            allAuthors();
            String line = sc.next();
            for (Map.Entry<String, Author> entryAuthor : authors.entrySet()) {
                if (entryAuthor.getKey().equals(line)) {
                    author = entryAuthor.getValue();
                    break;
                }
            }
        } else {
            System.out.println("Type name and surname of new author. \nExample: Gorokh Anton");
            String[] input = sc.next().split(" ");
            author = Author.builder()
                    .surname(input[0])
                    .name(input[1])
                    .build();
            authors.put(input[0] + " " + input[1], author);
        }
        book = Book.builder()
                .name(name)
                .year(year)
                .description(description)
                .genre(genre)
                .build();
        books.put(name, book);
        author.books.add(book);
        authors.put(author.getSurname() + " " + author.getName(), author);
        System.out.println("Book added. ");
    }

    public void removeBook(String name) {
        books.remove(name);
        for (Map.Entry<String, Author> entryAuthor : authors.entrySet()) {
            Author author = entryAuthor.getValue();
            for (int i = 0; i < author.books.size(); i++) {
                if (author.books.get(i).getName().equals(name)) {
                    author.books.remove(i);
                    authors.put(author.getSurname() + " " + author.getName(), author);
                    System.out.println("Book removed. ");
                    return;
                }
            }
        }
    }

    public void allBooks() {
        System.out.println("Books: ");
        for (Map.Entry<String, Book> book : books.entrySet()) System.out.println("  " + book.getKey());
    }

    public void addAuthor(String surname, String name) {
        authors.put(surname + " " + name, Author.builder()
                .surname(surname)
                .name(name)
                .build());
        System.out.println("Author added. ");
    }

    public void removeAuthor(String surname, String name) {
        if (!authors.containsKey(surname + " " + name)) System.out.println("There is no genre with this name. ");
        else {
            authors.remove(surname + " " + name);
            System.out.println("Author removed. ");
        }
    }

    public void allAuthors() {
        System.out.println("Authors: ");
        for (Map.Entry<String, Author> author : authors.entrySet()) System.out.println("  " + author.getKey());
    }

    public void addGenre(String name, String description) {
        genres.put(name, Genre.builder()
        .name(name)
        .description(description)
        .build());
        System.out.println("Genre added. ");
    }

    public void removeGenre(String name) {
        if (!genres.containsKey(name)) System.out.println("There is no genre with this name. ");
        else {
            genres.remove(name);
            System.out.println("Genre removed. ");
        }
    }

    public void allGenres() {
        System.out.println("Genres: ");
        for (Map.Entry<String, Genre> genre : genres.entrySet()) System.out.println("  " + genre.getKey());
    }
}
