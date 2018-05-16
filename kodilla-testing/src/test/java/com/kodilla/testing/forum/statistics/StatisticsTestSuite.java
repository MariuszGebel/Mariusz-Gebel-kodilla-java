package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    private static int testCounter = 0;


    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("\nAll tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("\nPreparing to execute test #" + testCounter);
    }

    @Test
    public void testAvrPostsZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 0;
        int comments = 2000;
        ArrayList<String> users = new ArrayList<String>();
        for(int i = 0; i<500; i++) {
            users.add("Jan Kowalski");
        }
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        StatisticsData statisticsData = new StatisticsData(statisticsMock);
        double avrPosts_User = statisticsData.getAvrPostsUser();
        double avrComments_User = statisticsData.getAvrCommentsUser();
        double avrComments_Post = statisticsData.getAvrCommentsPost();
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(avrPosts_User);
        lista.add(avrComments_User);
        lista.add(avrComments_Post);

        //Then
        ArrayList<Double> expectedList = new ArrayList<>();
        expectedList.add(0.0);
        expectedList.add(4.0);
        expectedList.add(0.0);
        System.out.println("Expected: " + expectedList);
        System.out.println("Actual:   " + lista);
        Assert.assertEquals(expectedList, lista);
    }

    @Test
    public void testAvrPostsOneThousand(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 1000;
        int comments = 2000;
        ArrayList<String> users = new ArrayList<String>();
        for(int i = 0; i<500; i++) {
            users.add("Jan Kowalski");
        }
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        StatisticsData statisticsData = new StatisticsData(statisticsMock);
        double avrPosts_User = statisticsData.getAvrPostsUser();
        double avrComments_User = statisticsData.getAvrCommentsUser();
        double avrComments_Post = statisticsData.getAvrCommentsPost();
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(avrPosts_User);
        lista.add(avrComments_User);
        lista.add(avrComments_Post);

        //Then
        ArrayList<Double> expectedList = new ArrayList<>();
        expectedList.add(2.0);
        expectedList.add(4.0);
        expectedList.add(2.0);
        System.out.println("Expected: " + expectedList);
        System.out.println("Actual:   " + lista);
        Assert.assertEquals(expectedList, lista);
    }

    @Test
    public void testAvrCommentsZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 1000;
        int comments = 0;
        ArrayList<String> users = new ArrayList<String>();
        for(int i = 0; i<500; i++) {
            users.add("Jan Kowalski");
        }
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        StatisticsData statisticsData = new StatisticsData(statisticsMock);
        double avrPosts_User = statisticsData.getAvrPostsUser();
        double avrComments_User = statisticsData.getAvrCommentsUser();
        double avrComments_Post = statisticsData.getAvrCommentsPost();
        ArrayList<Double> actualList = new ArrayList<>();
        actualList.add(avrPosts_User);
        actualList.add(avrComments_User);
        actualList.add(avrComments_Post);

        //Then
        ArrayList<Double> expectedList = new ArrayList<>();
        expectedList.add(2.0);
        expectedList.add(0.0);
        expectedList.add(0.0);
        System.out.println("Expected: " + expectedList);
        System.out.println("Actual:   " + actualList);
        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void testAvrCommentsLessThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 1000;
        int comments = 500;
        ArrayList<String> users = new ArrayList<String>();
        for(int i = 0; i<500; i++) {
            users.add("Jan Kowalski");
        }
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        StatisticsData statisticsData = new StatisticsData(statisticsMock);
        double avrPosts_User = statisticsData.getAvrPostsUser();
        double avrComments_User = statisticsData.getAvrCommentsUser();
        double avrComments_Post = statisticsData.getAvrCommentsPost();
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(avrPosts_User);
        lista.add(avrComments_User);
        lista.add(avrComments_Post);

        //Then
        ArrayList<Double> expectedList = new ArrayList<>();
        expectedList.add(2.0);
        expectedList.add(1.0);
        expectedList.add(0.5);
        System.out.println("Expected: " + expectedList);
        System.out.println("Actual:   " + lista);
        Assert.assertEquals(expectedList, lista);
        Assert.assertEquals(expectedList, lista);
    }

    @Test
    public void testAvrMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 1000;
        int comments = 5000;
        ArrayList<String> users = new ArrayList<String>();
        for(int i = 0; i<500; i++) {
            users.add("Jan Kowalski");
        }
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        StatisticsData statisticsData = new StatisticsData(statisticsMock);
        double avrPosts_User = statisticsData.getAvrPostsUser();
        double avrComments_User = statisticsData.getAvrCommentsUser();
        double avrComments_Post = statisticsData.getAvrCommentsPost();
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(avrPosts_User);
        lista.add(avrComments_User);
        lista.add(avrComments_Post);

        //Then
        ArrayList<Double> expectedList = new ArrayList<>();
        expectedList.add(2.0);
        expectedList.add(10.0);
        expectedList.add(5.0);
        System.out.println("Expected: " + expectedList);
        System.out.println("Actual:   " + lista);
        Assert.assertEquals(expectedList, lista);
        Assert.assertEquals(expectedList, lista);
    }

    @Test
    public void testAvrUsersZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 1000;
        int comments = 5000;
        ArrayList<String> users = new ArrayList<String>();
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        StatisticsData statisticsData = new StatisticsData(statisticsMock);
        double avrPosts_User = statisticsData.getAvrPostsUser();
        double avrComments_User = statisticsData.getAvrCommentsUser();
        double avrComments_Post = statisticsData.getAvrCommentsPost();
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(avrPosts_User);
        lista.add(avrComments_User);
        lista.add(avrComments_Post);

        //Then
        ArrayList<Double> expectedList = new ArrayList<>();
        expectedList.add(0.0);
        expectedList.add(0.0);
        expectedList.add(5.0);
        System.out.println("Expected: " + expectedList);
        System.out.println("Actual:   " + lista);
        Assert.assertEquals(expectedList, lista);
        Assert.assertEquals(expectedList, lista);
    }

    @Test
    public void testAvrUsersHundred(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 1000;
        int comments = 5000;
        ArrayList<String> users = new ArrayList<String>();
        for(int i = 0; i<100; i++) {
            users.add("Jan Kowalski");
        }
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        StatisticsData statisticsData = new StatisticsData(statisticsMock);
        double avrPosts_User = statisticsData.getAvrPostsUser();
        double avrComments_User = statisticsData.getAvrCommentsUser();
        double avrComments_Post = statisticsData.getAvrCommentsPost();
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(avrPosts_User);
        lista.add(avrComments_User);
        lista.add(avrComments_Post);

        //Then
        ArrayList<Double> expectedList = new ArrayList<>();
        expectedList.add(10.0);
        expectedList.add(50.0);
        expectedList.add(5.0);
        System.out.println("Expected: " + expectedList);
        System.out.println("Actual:   " + lista);
        Assert.assertEquals(expectedList, lista);
        Assert.assertEquals(expectedList, lista);
    }
}



