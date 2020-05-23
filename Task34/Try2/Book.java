package com.hillel.lombok.task34;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class Book {
    private String name;
    private int year;
    private String description;
    private Genre genre;
}
