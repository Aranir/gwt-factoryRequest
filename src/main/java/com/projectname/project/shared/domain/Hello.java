package com.projectname.project.shared.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by roger on 15/07/15.
 */

public class Hello {
    private final String id;
    private final String name;


    @JsonCreator
    public Hello(@JsonProperty("id") final String id, @JsonProperty("name") final String name) {
        this.id = id;
        this.name = name;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}