import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
         SysHeap heap = new SysHeap();
         MetroSystem system = new MetroSystem();

         File file = new File(args[0]);
         String comma = ",";
         try {
             Scanner scanner = new Scanner(file);
             String[] input;

             while (scanner.hasNextLine()) {
                 input = scanner.nextLine().split(comma);
                 switch (input[0]) {
                     case "add_stop":
                         system.addStop(Integer.parseInt(input[1]), input[2], Integer.parseInt(input[3]), Double.parseDouble(input[4]), Double.parseDouble(input[5]));
                         break;
                     case "add_route":
                         system.addRoute(Integer.parseInt(input[1]), Integer.parseInt(input[2]), input[3]);
                         break;
                     case "extend_route":
                         system.extendRoute(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                         break;
                     case "add_bus":
                         system.addBus(Integer.parseInt(input[1]), Integer.parseInt(input[2]), Integer.parseInt(input[3]), Integer.parseInt(input[4]), Integer.parseInt(input[5]), Integer.parseInt(input[6]), Integer.parseInt(input[7]), Integer.parseInt(input[8]));
                         break;
                     case "add_event":
                         heap.addEvent(Integer.parseInt(input[1]), input[2], Integer.parseInt(input[3]));
                         break;
                     default:
                         break;
                 }
             }
             scanner.close();

         }
         catch (FileNotFoundException e) {
             e.printStackTrace();
         }

         for (int i = 0; i < 20; i++) heap.nextEvent(system);




    }
}
