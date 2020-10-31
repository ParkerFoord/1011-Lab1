/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class District
 *Name: Parker
 *Created 10/28/2020
 */

package week08;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  District purpose:
 *  @author Parker
 *  @version created on 10/28/2020 at 1:14 PM
 */

/**
 * Manages parking lots within a district.
 * @author [Parker Foord]
 */
public class District {
    private ParkingLot lot1;
    private ParkingLot lot2;
    private ParkingLot lot3;

    /**
     * Set up a district with three parking lots.
     * @param name1 Name of the first parking lot
     * @param capacity1 Maximum number of vehicles for the first parking lot
     * @param name2 Name of the second parking lot
     * @param capacity2 Maximum number of vehicles for the second parking lot
     * @param name3 Name of the third parking lot
     * @param capacity3 Maximum number of vehicles for the third parking lot
     */
    public District(String name1, int capacity1, String name2, int capacity2,
                    String name3, int capacity3) {
        lot1 = new ParkingLot(name1, capacity1);
        lot2 = new ParkingLot(name2, capacity2);
        lot3 = new ParkingLot(name3, capacity3);
    }

    /**
     * Display status information for all three lots.
     * @see ParkingLot#displayStatus() for the format for each.
     */
    public void displayStatus() {
        System.out.println("District status:");
        System.out.print("  ");
        lot1.displayStatus();
        System.out.print("  ");
        lot2.displayStatus();
        System.out.print("  ");
        lot3.displayStatus();
        System.out.println();
    }

    /**
     * Returns the number of remaining parking spots in the district
     * @return the number of remaining parking spots in the district
     */
    public int getNumberOfSpotsRemaining() {
        // TODO: Complete this stub
        return lot1.getNumberOfSpotsRemaining() + lot2.getNumberOfSpotsRemaining() + lot3.getNumberOfSpotsRemaining();

    }

    /**
     * Returns the amount of time all three lots have been
     * simultaneously closed.
     * @return number of minutes all three lots have been closed
     */
    public int getMinutesClosed() {
        // TODO: Complete this stub

        return lot1.getMinutesClosed() + lot2.getMinutesClosed() + lot3.getMinutesClosed();

    }

    /**
     * Checks the status of all three lots in the district and
     * returns true if they are all closed and false otherwise.
     * @return whether all three lots in the district are closed
     */
    public boolean isClosed() {
        // TODO: Complete this stub
        if(lot1.isClosed() && lot2.isClosed() && lot3.isClosed()){
            return true;
        }else{

        return false;
    }}

    /**
     * Record a vehicle entering a lot at a specified timestamp.
     * <p></p>
     * This calls ParkingLot.markVehicleEntry for the lot corresponding
     * to lotNumber (e.g., if lotNumber==1, call markVehicleEntry on lot1).
     * <p></p>
     * If lotNumber is out of range, the method should return without
     * doing anything else.
     * @param lotNumber Number of lot (should be 1, 2, or 3)
     * @param timestamp Entry timestamp in minutes since all lots were opened.
     */
    public void markVehicleEntry(int lotNumber, int timestamp) {
        // TODO: Complete this stub
        if(lotNumber == 1 ||lotNumber == 2 ||lotNumber == 3){
        markVehicleEntry(lotNumber,timestamp);
        }

    }

    /**
     * Record a vehicle exiting a lot at a specified timestamp.
     * <p></p>
     * This calls ParkingLot.markVehicleExit for the lot corresponding
     * to lotNumber (e.g., if lotNumber==1, call markVehicleExit on lot1).
     * <p></p>
     * If lotNumber is out of range, the method should return without
     * doing anything else.
     * @param lotNumber Number of lot (should be 1, 2, or 3)
     * @param timestamp Exit timestamp in minutes since all lots were opened.
     */
    public void markVehicleExit(int lotNumber, int timestamp) {
        // TODO: Complete this stub
        if(lotNumber == 1 ||lotNumber == 2 ||lotNumber == 3){
            markVehicleExit(lotNumber,timestamp);
        }
    }
}