package fr.esiea.ex4A.Users;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {

    @PostMapping(path = "/api/inscription")
    public void inscriptionUser(@RequestBody UsersData usersData) {

    }
    @GetMapping(path = "/api/matches", produces = MediaType.APPLICATION_JSON_VALUE)
    List<MatchUser> getmatch(@RequestParam(name = "name", required = false) String name) {
        final List<MatchUser> matchUserList = List.of(
            new MatchUser("Salma","salma970"),
            new MatchUser("Halima","halima12")
        );

        return matchUserList;
    }
}


