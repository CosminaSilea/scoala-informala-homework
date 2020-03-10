package homework.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("BiathlonResults.txt")))) {


            List<String> athletesInfo = new ArrayList<>();
            String s = null;
            while ((s = br.readLine()) != null) {
                athletesInfo.add(s);
            }

            String a1 = athletesInfo.get(0);
            String a2 = athletesInfo.get(1);
            String a3 = athletesInfo.get(2);


            String[] arrAthlete1 = a1.split(",");
            String[] arrAthlete2 = a2.split(",");
            String[] arrAthlete3 = a3.split(",");

            Athlete athlete1 = new Athlete(arrAthlete1[0], arrAthlete1[1], arrAthlete1[2], arrAthlete1[3], arrAthlete1[4], arrAthlete1[5], arrAthlete1[6]);
            Athlete athlete2 = new Athlete(arrAthlete2[0], arrAthlete2[1], arrAthlete2[2], arrAthlete2[3], arrAthlete2[4], arrAthlete2[5], arrAthlete2[6]);
            Athlete athlete3 = new Athlete(arrAthlete3[0], arrAthlete3[1], arrAthlete3[2], arrAthlete3[3], arrAthlete3[4], arrAthlete3[5], arrAthlete3[6]);


            String[] totalTime1 = Athlete.totalTimePlusPenalty(athlete1).split(":");
            String[] totalTime2 = Athlete.totalTimePlusPenalty(athlete2).split(":");
            String[] totalTime3 = Athlete.totalTimePlusPenalty(athlete3).split(":");

            athlete1.setTotalTime(LocalTime.of(00, Integer.parseInt(totalTime1[0]), Integer.parseInt(totalTime1[1])));
            athlete2.setTotalTime(LocalTime.of(00, Integer.parseInt(totalTime2[0]), Integer.parseInt(totalTime2[1])));
            athlete3.setTotalTime(LocalTime.of(00, Integer.parseInt(totalTime3[0]), Integer.parseInt(totalTime3[1])));

            List<Athlete> allAthletes = new ArrayList<>();
            allAthletes.add(athlete1);
            allAthletes.add(athlete2);
            allAthletes.add(athlete3);

            Collections.sort(allAthletes);

            System.out.println("Winner " + allAthletes.get(0).getName() + " " + allAthletes.get(0).getTotalTime() + " " + "(" +
                    allAthletes.get(0).getSkiTimeResult() + " " + Athlete.totalTimePenalty(allAthletes.get(0)) + ")");

            System.out.println("Runner-up " + allAthletes.get(1).getName() + " " + allAthletes.get(1).getTotalTime() +
                    " " + "(" + allAthletes.get(1).getSkiTimeResult() + " " + Athlete.totalTimePenalty(allAthletes.get(1)) + ")");

            System.out.println("Third Place " + allAthletes.get(2).getName() + " " + allAthletes.get(2).getTotalTime() + "" +
                    " " + "(" + allAthletes.get(2).getSkiTimeResult() + " " + Athlete.totalTimePenalty(allAthletes.get(2)) + ")");


        }

    }

}