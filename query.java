// Query class
// Holds and is responsible for processing flight data.

import java.io.*;
import java.util.HashMap;

public class query
{
  // Static Macros
  private static final int GROUNDED = -2;
  private static final int DOCKED_ORIGIN = -1;
  private static final int BOARDING = 0;
  private static final int TAXI_ORIGIN = 1;
  private static final int ENROUTE = 2;
  private static final int TAXI_DEST = 3;
  private static final int DOCKED_FINAL = 4;

  // Member Variables
  public int id;

  // Flight Info
  private String airline;
  private int flightNum;
  private String origin;
  private String dest;

  // Aircraft Data
  private String model;
  private int planeCap;
  private int status;


  public query(int id, int flightNum, database database)
  {
    this.id = id;
    this.airline = database.getAirline(flightNum);
    this.flightNum = flightNum;
    this.origin = database.getOrigin(flightNum);
    this.dest = database.getDest(flightNum);

    this.model = database.getModel(flightNum);
    this.status = GROUNDED;
  }

  public int getID()
  {
    return this.id;
  }

  public String getAirline()
  {
    return this.airline;
  }
  
  public int getflightNo()
  {
    return this.flightNum;
  }

  public String getOrigin()
  {
    return this.origin;
  }

  public String getDest()
  {
    return this.dest;
  }

  public String getModel()
  {
    return this.model;
  }

  public int getStatus()
  {
    return this.status;
  }
}
