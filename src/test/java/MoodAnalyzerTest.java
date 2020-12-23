import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class MoodAnalyzerTest {

    @Test
    public void testMoodAnalysis(){                                                            //To get SAD

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

        String mood = null;
        try {
            mood = moodAnalyzer.analyzeMood("This is a Sad message");
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("SAD",mood);

    }

    @Test
    public void testMoodAnalysis1(){                                                        //To get HAPPY

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

        String mood = null;
        try {
            mood = moodAnalyzer.analyzeMood("This is a Happy message");
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("HAPPY",mood);

    }

    @Test
    public void testMoodAnalysis2(){                                                        //To get HAPPY  //Null Pointer Exception

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyzerException.class);
            mood = moodAnalyzer.analyzeMood(null);
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }


    }


}
