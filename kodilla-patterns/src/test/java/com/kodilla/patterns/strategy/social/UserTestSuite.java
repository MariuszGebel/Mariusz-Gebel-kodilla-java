package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User jan = new Millenials("Jan Kowalski");
        User dorota = new YGeneration("Dorota Nowak");
        User jerzy = new ZGeneration("Jerzy Witkowski");

        //When
        String janUses = jan.sMedia();
        System.out.println("Jan uses: " + janUses);
        String dorotaUses = dorota.sMedia();
        System.out.println("Dorota uses: " + dorotaUses);
        String jerzyUses = jerzy.sMedia();
        System.out.println("Jerzy uses: " + jerzyUses);

        //Then
        Assert.assertEquals("Facebook", janUses);
        Assert.assertEquals("Twitter", dorotaUses);
        Assert.assertEquals("Snapchat", jerzyUses);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User jan = new Millenials("Jan Kowalski");

        //When
        System.out.println();
        String janUses = jan.sMedia();
        System.out.println("Jan uses: " + janUses);
        jan.sharePost(new TwitterPublisher());
        janUses = jan.sMedia();
        System.out.println("Jan changes SocialMedia Publisher and now uses: " + janUses);

        //Then
        Assert.assertEquals("Twitter", janUses);
    }
}
