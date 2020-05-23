package com.hillel.lombok.task34;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;

@Getter
@Builder

public class Author {
    public ArrayList<Book> books = new ArrayList<>();
    private String surname;
    private String name;
}
