package com.hillel.lombok.task34;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class Genre {
    private String name;
    private String description;
}
