package com.Junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyser_uc3 {
    @Test
    public void givenNullMood_ShouldReturnHappy(){
      MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            ExpectedException expectedRule = ExpectedException.none();
            expectedRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("Happy",mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }


    }
}
