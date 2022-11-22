package com.MoodAnalysertest;

import org.junit.Assert;
import org.junit.Test;
import sun.plugin2.message.Message;

public class MoodAnalyserTest_uc1 {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("this is a sad Message"); //create method
        Assert.assertEquals("sad", mood);

    }
    public class MoodAnalyser {
        public String analyseMood(String message) {
            if (message.contains("sad"))
                return "sad";
            else
                return "Happy";
        }
    }

    @Test
    public void givenMessage_WhenSad_ShouldReturnHappy(){
       MoodAnalyser moodAnalyser =  new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("this is a Happy Message"); //create method
        Assert.assertEquals("Happy", mood);


    }


}
