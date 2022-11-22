package com.MoodAnalysertest;

import com.Junit.MoodAnalysisException;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyser_uc2 {

    @Test
    public void givenNullMood_ShouldReturnHappy(){
        Moodanalyser moodanalyser = new Moodanalyser(null);
        String mood =  moodanalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);

    }

    public class Moodanalyser {

        private String message;

        public  Moodanalyser(String message) {
            this.message = message;
        }

        public String analyseMood(String message) {
            this.message = message;
            return analyseMood();
        }
        public String analyseMood(){
            try {

                if (message.contains("sad"))
                    return "sad";
                else
                    return "HAPPY";
            } catch (NullPointerException e){
               return "HAPPY";
            }
        }
    }
}
