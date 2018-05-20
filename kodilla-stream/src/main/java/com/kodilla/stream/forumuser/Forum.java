package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public final class Forum {
    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser(1, "Jan Kowalski", 'M', LocalDate.of(1995, 7, 25), 30));
        theForumUsersList.add(new ForumUser(2, "Krzysztof Nowak", 'M', LocalDate.of(2000, 4, 2), 150));
        theForumUsersList.add(new ForumUser(3, "Alina Janowska", 'K', LocalDate.of(1962, 3, 16), 80));
        theForumUsersList.add(new ForumUser(4, "Dorota Kwiatkowska", 'K', LocalDate.of(1999, 2, 5), 60));
        theForumUsersList.add(new ForumUser(5, "Zenon Nawrocki", 'M', LocalDate.of(1982, 9, 14), 200));
        theForumUsersList.add(new ForumUser(6, "Barbara Wiśniewska", 'K', LocalDate.of(2001, 8, 1), 112));
        theForumUsersList.add(new ForumUser(7, "Dariusz Paciorkowski", 'M', LocalDate.of(1972, 9, 14), 34));
        theForumUsersList.add(new ForumUser(8, "Adam Nowakowski", 'M', LocalDate.of(1969, 8, 1), 0));

    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(theForumUsersList);
    }

  }
