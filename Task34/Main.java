package task34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        System.out.println("Available commands: " +
                "\n  !allBooks" +
                "\n  !addBook" +
                "\n  !removeBook" +
                "\n\n  !allGenres" +
                "\n  !addGenre" +
                "\n  !removeGenre" +
                "\n\n  !allAuthors" +
                "\n  !addAuthor" +
                "\n  !removeAuthor" +
                "\n  !exit");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("!exit")) return;
            else {
                switch (input) {
                    case "!allBooks":
                        library.allBooks();
                        break;
                    case "!addBook":
                        System.out.println("Type: \ntitle \ndescription \nyear");
                        library.addBook(sc.nextLine(), sc.nextLine(), sc.nextLine());
                        break;
                    case  "!removeBook":
                        System.out.println("Type: \ntitle");
                        library.removeBook(sc.nextLine());
                        break;
                    case "!allGenres":
                        library.allGenres();
                        break;
                    case "!addGenre":
                        System.out.println("Type: \ntitle \ndescription");
                        library.addGenre(sc.nextLine(), sc.nextLine());
                        break;
                    case "!removeGenre":
                        System.out.println("Type: \ntitle");
                        library.removeGenre(sc.nextLine());
                        break;
                    case "!allAuthors":
                        library.allAuthors();
                        break;
                    case "!addAuthor":
                        System.out.println("Type: \nlast name \nfirst name");
                        library.addAuthor(sc.nextLine(), sc.nextLine());
                        break;
                    case "!removeAuthor":
                        System.out.println("Type: \nlast name \nfirst name");
                        library.removeAuthor(sc.nextLine(), sc.nextLine());
                        break;
                    default:
                        System.out.println("Invalid input. ");
                        break;
                }
            }
        }
    }
}
