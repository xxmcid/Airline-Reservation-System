// COPYRIGHT HUMZA RAHMAN
// Airline Reservation System (ARS V1.0)
// Main Driver Class

import java.io.*;
import java.util.*;

public class driver
{

    public static int getflightNo()
    {
        Random rand = new Random();
        return (rand.nextInt(100000 - 10000) + 10000);
    }


    public static void main(String[] args) throws IOException
    {
        // Init database
        database database = new database();
        
        ArrayList<query> flights = new ArrayList<>();

        for (int i = 0; i < 20; i++)
        {
            flights.add(new query(i, getflightNo(), database));
        }

        String format = "%-15s %15s %15s %15s %15s %15s %15s%n";
        System.out.printf(format, "ID", "Airline", "Flight Number", "Origin", "Destination", "Model", "Status"); 
        for (int i = 0; i < flights.size(); i++)
        {
            System.out.printf(format, flights.get(i).getID(), flights.get(i).getAirline(), flights.get(i).getflightNo(),
                              flights.get(i).getOrigin(), flights.get(i).getDest(), flights.get(i).getModel(),
                              flights.get(i).getStatus());
        }  
    }
}
