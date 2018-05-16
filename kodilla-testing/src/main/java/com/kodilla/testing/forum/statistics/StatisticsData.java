package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;

public class StatisticsData {
    Statistics statistics;
    public ArrayList<Double> showStat = new ArrayList<>();

    public StatisticsData(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUsersNumber() {
        return statistics.userNames().size();
    }

    public int getPostsNumber() {
        return statistics.postsCount();
    }

    public int getCommentsNumber() {
        return statistics.commentsCount();
    }

    public double getAvrPostsUser() {
        double result;
        if (statistics.userNames().size() != 0) {
            result = statistics.postsCount() * 1.0 / statistics.userNames().size();
        } else {
            result = 0;
        }
        return result;
    }

    public double getAvrCommentsUser() {
        double result;
        if (statistics.userNames().size() != 0) {
            result = statistics.commentsCount() * 1.0 / statistics.userNames().size();
        } else {
            result = 0;
        }
        return result;
    }

    public double getAvrCommentsPost() {
        double result;
        if (statistics.postsCount() != 0) {
            result = statistics.commentsCount() * 1.0 / statistics.postsCount();
        } else {
            result = 0;
        }
        return result;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        int usersNumber = getUsersNumber();
        int postsNumber = getPostsNumber();
        int commentsNumber = getCommentsNumber();
        double avrPostsUser = getAvrPostsUser();
        double avrCommentsUser = getAvrCommentsUser();
        double avrCommentsPost = getAvrCommentsPost();

        showStat.add((double)usersNumber);
        showStat.add((double)postsNumber);
        showStat.add((double)commentsNumber);
        showStat.add(avrPostsUser);
        showStat.add(avrCommentsUser);
        showStat.add(avrCommentsPost);
    }

    public ArrayList<Double> showStatistics() {
        return showStat;
    }

}
