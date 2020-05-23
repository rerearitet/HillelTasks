package com.hillel.lombok.task34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        String line;
        System.out.println("Available commands:\n  addGenre\n  removeGenre\n  allGenres\n  addAuthor\n  removeAuthor\n  allAuthors\n  addBook\n  removeBook\n  allBooks");
        while (!(line = sc.nextLine()).equals("stop")) {
            switch (line) {
                case "addGenre":
                    System.out.println("Type name and description of genre. \nExample: Fantasy \nFantasy is a genre of speculative fiction set in a fictional universe. ");
                    library.addGenre(sc.next(), sc.next());
                    break;
                case "removeGenre":
                    System.out.println("Type name of genre. ");
                    library.removeGenre(sc.next());
                    break;
                case "allGenres":
                    library.allGenres();
                    break;
                case "addAuthor":
                    System.out.println("Type surname and name. \nExample:\n Gorokh\n Anton");
                    library.addAuthor(sc.next(), sc.next());
                    break;
                case "removeAuthor":
                    System.out.println("Type surname and name. \nExample:\n Gorokh\n Anton");
                    library.removeAuthor(sc.next(), sc.next());
                    break;
                case "allAuthors":
                    library.allAuthors();
                    break;
                case "addBook":
                    System.out.println("Type name, year and description. Example:\n Bobiki\n 1999\n The best book in the world.");
                    library.addBook(sc.next(), Integer.valueOf(sc.next()), sc.next());
                    break;
                case "removeBook":
                    System.out.println("Type name of book. ");
                    library.removeBook(sc.next());
                case "allBooks":
                    library.allBooks();
                default:
                    continue;
            }
        }
    }
}
