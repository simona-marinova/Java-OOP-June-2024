package workingWithAbstraction.trafficLights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrafficLight[] lights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(light -> TrafficLight.valueOf(light))
                .toArray(TrafficLight[]::new);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < lights.length; j++) {
              //  switch (lights[j]) {
                 //   case RED -> lights[j] = TrafficLight.GREEN;
                  //  case GREEN -> lights[j] = TrafficLight.YELLOW;
                   // case YELLOW -> lights[j] = TrafficLight.RED;
            //    }
                if(lights[j]==TrafficLight.RED){
                    lights[j]=TrafficLight.GREEN;
                }
                else if (lights[j]==TrafficLight.GREEN){
                    lights[j] = TrafficLight.YELLOW;
                }
                else {
                    lights[j] = TrafficLight.RED;
                }
            }
            for (TrafficLight light : lights) {
                System.out.print(light + " ");
            }
            System.out.println();
        }
    }
}