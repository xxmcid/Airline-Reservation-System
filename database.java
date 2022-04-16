// Holds data for aircraft names and models
import java.io.*;
import java.util.*;

public class database
{
  private static HashMap<Integer, String> aircraftModels;
  private static HashMap<Integer, String> airlines;
  private static ArrayList<String> airports;

  public String getModel(int flightNum)
  {
    int hash = (flightNum % aircraftModels.size());
    return aircraftModels.get(hash);
  }

  public String getAirline(int flightNum)
  {
    int hash = (flightNum % airlines.size());
    return airlines.get(hash);
  }

  public String getOrigin(int flightNum)
  {
    int index = (flightNum % airports.size());
    return airports.get(index);
  }

  public String getDest(int flightNum)
  {
    int index = ((flightNum + 1) % airports.size());
    return airports.get(index);
  }

  database() throws IOException
  {
    aircraftModels = new HashMap<>();
    airlines = new HashMap<>();
    airports = new ArrayList<>();

    int index = 0;
    Scanner in = new Scanner(new File("./Aircraft/models.txt"));

    while(in.hasNextLine())
    {
      aircraftModels.put(index++, in.nextLine());
    }

    index = 0;
    in = new Scanner(new File("./Airlines/airlines.txt"));

    while(in.hasNextLine())
    {
      airlines.put(index++, in.nextLine());
    }

    in = new Scanner(new File("./Airports/airports.txt"));

    while(in.hasNextLine())
    {
      airports.add(in.nextLine());
    }
  }

}
