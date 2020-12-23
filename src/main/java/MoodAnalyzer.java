public class MoodAnalyzer {

    public String analyzeMood(String message) throws MoodAnalyzerException {

        try {
            if (message.contains(("Sad")))
                return "SAD";
            else
                return "HAPPY";

        }catch (NullPointerException e){
            throw new MoodAnalyzerException("Please Enter Valid Message.");
        }

    }
}
