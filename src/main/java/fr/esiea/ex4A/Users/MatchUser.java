package fr.esiea.ex4A.Users;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MatchUser {
    public final String name;
    public final String twitter;

    public MatchUser(@JsonProperty("name")String name, @JsonProperty("twitter") String twitter) {
        this.name = name;
        this.twitter = twitter;
    }
}
