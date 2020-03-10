package homework.io;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Athlete implements Comparable<Athlete>{

    private String number;
    private String name;
    private String countryCode;
    private String skiTimeResult;
    private String firstShooting;
    private String SecondShooting;
    private String ThirdShooting;
    private LocalTime totalTime;


    public Athlete(String number, String name, String countryCode, String skiTimeResult, String firstShooting, String secondShooting, String thirdShooting) {
        this.number = number;
        this.name = name;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShooting = firstShooting;
        this.SecondShooting = secondShooting;
        this.ThirdShooting = thirdShooting;
        this.totalTime = null;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getSkiTimeResult() {
        return skiTimeResult;
    }

    public String getFirstShooting() {
        return firstShooting;
    }

    public String getSecondShooting() {
        return SecondShooting;
    }

    public String getThirdShooting() {
        return ThirdShooting;
    }

    public LocalTime getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(LocalTime totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", skiTimeResult='" + skiTimeResult + '\'' +
                ", firstShooting='" + firstShooting + '\'' +
                ", SecondShooting='" + SecondShooting + '\'' +
                ", ThirdShooting='" + ThirdShooting + '\'' +
                ", totalTime=" + totalTime +
                '}';
    }

    /**
     * @param shootingRange the method receive as param the string that represents the shooting range and check if the
     *                      string contains the char 'o'
     * @return the penalty time that is calculated by adding 10 every time the char 'o' is in the string
     */
    public static int shotTimePenalty(String shootingRange) {
        int time = 0;
        for (int i = 0; i < shootingRange.length(); i++) {
            //  char c = shootingRange.charAt(i);
            if (shootingRange.charAt(i) == 'o') {
                time += 10;
            }
        }
        return time;
    }

    /**
     * calculate the total penalty time for each athlete
     * @param athlete
     * @return the total penalty time
     */

    public static int totalTimePenalty(Athlete athlete) {
        int totalTime = shotTimePenalty(athlete.getFirstShooting()) + shotTimePenalty(athlete.getSecondShooting()) + shotTimePenalty(athlete.getThirdShooting());
        return totalTime;
    }

    /**
     * the method adds to the skiing time the total Penalty
     * @param athlete
     * @return the total time (skiing time + penalty)
     * @throws ParseException
     */

    public static String totalTimePlusPenalty(Athlete athlete) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
        Date t = sdf.parse(athlete.getSkiTimeResult());
        Calendar cal = Calendar.getInstance();
        cal.setTime(t);
        cal.add(Calendar.SECOND, Athlete.totalTimePenalty(athlete));
        String newTime = sdf.format(cal.getTime());
        return newTime;
    }

    @Override
    public int compareTo(Athlete athlete) {
        if(this.getTotalTime().isAfter(athlete.getTotalTime())){
            return 1;
        }
        return -1;
    }
}




