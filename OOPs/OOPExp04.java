
//SE - 3, 20, Suraj Jagtap

//OOPM(JAVA) Experiment No: 04

import java.util.*;

class Hotel  {
    String HotelName;
    String City;
    int Roomcharges;

    //Constructor:
    Hotel()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Name of Hotel: ");
        HotelName = s.nextLine();
        System.out.print("City: ");
        City = s.nextLine();
        System.out.print("Room Charges: ");
        Roomcharges = s.nextInt();
    }

    //Function to Display Given Hotel Data:
    public void Display() 
    {
        System.out.println(HotelName + "\t\t" + City + "\t\t" + Roomcharges);
    }

    //Function that Sorts the Hotel Data and Return the Array of Objects(Hotels):
    public static Hotel[] Sort(Hotel H[])
    {
        Hotel temp;
        for (int i = 0; i < H.length - 1; i++) {
            for (int j = 1; j < H.length; j++) {
                if (H[i].Roomcharges > H[j].Roomcharges)
                {
                    temp = H[i];
                    H[i] = H[j];
                    H[j] = temp;
                }
            }
        }
        return H;
    }
}

//Main Class:
public class OOPExp04 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the no. of Hotels: ");
        int n = s.nextInt();

        Hotel H[] = new Hotel[n];  //An Array of Objects of Class Hotel Has Been Created of 'n' size.
        
        for (int i = 0; i < n; i++) 
        {
            System.out.println("\nEnter Hotel no. " + (i + 1) + " Details:");
            H[i] = new Hotel();
        }

        H = Hotel.Sort(H);

        System.out.print("\nThe Hotels in Ascending Order:\n");
        System.out.println("\nHotel Name\tCity\tRoom Charges");
        for (int i = 0; i < n; i++) 
            H[i].Display();
        
            s.close();
    }
}