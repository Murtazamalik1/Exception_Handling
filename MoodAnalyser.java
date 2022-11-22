package com.Junit;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalysisException {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalysisException {
        try {

            if (message.contains("sad"))
                return "sad";
            else
                return "Happy";
        } catch (NullPointerException e){
            throw new MoodAnalysisException("please enter proper message");
        }
    }

}
