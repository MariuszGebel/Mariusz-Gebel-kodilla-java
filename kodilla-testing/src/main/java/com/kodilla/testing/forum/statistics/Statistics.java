package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public interface Statistics {
    ArrayList<String> userNames();
    int postsCount();
    int commentsCount();

}
