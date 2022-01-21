package homework.io;

import org.junit.Test;

import static homework.io.Athlete.shotTimePenalty;
import static org.junit.Assert.assertEquals;

public class AthleteTest {

   @Test
   public void testPenalty(){
       String result = "xoxox";
       int time = shotTimePenalty(result);
       assertEquals(time, 20);
   }

   @Test
    public void totalTimePenaltyAthlete(){
     int totalTime = shotTimePenalty("xxoox") + shotTimePenalty("xxoox") + shotTimePenalty("xxoox");
     assertEquals(totalTime, 60);
   }


}