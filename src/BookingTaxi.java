import java.util.*;
public class BookingTaxi {
    public static void bookTaxi(int customerID,char pickupPoint,char dropPoint,int pickupTime,List<taxi> freeTaxis)
        {
            int min = 999;
            int distanceBetweenpickUpandDrop = 0;
            int earning = 0;
            int nextfreeTime = 0;
            char nextSpot = 'Z';
            taxi bookedTaxi = null;
            String tripDetail = "";
            for(taxi t : freeTaxis)
            {
                int distanceBetweenCustomerAndTaxi = Math.abs((t.currentSpot - '0') - (pickupPoint - '0')) * 15;
                if(distanceBetweenCustomerAndTaxi < min)
                {
                    bookedTaxi = t;
                    distanceBetweenpickUpandDrop = Math.abs((dropPoint - '0') - (pickupPoint - '0')) * 15;
                    earning = (distanceBetweenpickUpandDrop-5) * 10 + 100;
                    int dropTime  = pickupTime + distanceBetweenpickUpandDrop/15;
                    nextfreeTime = dropTime;
                    nextSpot = dropPoint;
                    tripDetail = customerID + "               " + customerID + "          " + pickupPoint +  "      " + dropPoint + "       " + pickupTime + "          " +dropTime + "           " + earning;
                    min = distanceBetweenCustomerAndTaxi;
                }

            }
            bookedTaxi.setDetails(true,nextSpot,nextfreeTime,bookedTaxi.totalEarnings + earning,tripDetail);
            System.out.println("Taxi " + bookedTaxi.id + " booked");

        }

        public static List<taxi> createTaxis(int n)
        {
            List<taxi> taxis = new ArrayList<taxi>();
            for(int i=1 ;i <=n;i++)
            {
                taxi t = new taxi();
                taxis.add(t);
            }
            return taxis;
        }
        public static List<taxi> getFreeTaxis(List<taxi> taxis, int pickupTime, char pickupPoint)
        {
            List<taxi> freeTaxis = new ArrayList<taxi>();
            for(taxi t : taxis)
            {
                if(t.freeTime <= pickupTime && (Math.abs((t.currentSpot - '0') - (pickupPoint - '0')) <= pickupTime - t.freeTime))
                    freeTaxis.add(t);

            }
            return freeTaxis;
        }
        public static void main(String[] args)
        {
            List<taxi> taxis = createTaxis(4);

            Scanner s = new Scanner(System.in);
            int id = 1;

            while(true)
            {
                System.out.println("0 - > Book Taxi");
                System.out.println("1 - > Print Taxi details");
                int choice = s.nextInt();
                switch(choice)
                {
                    case 0:
                    {
                        int customerID = id;
                        System.out.println("Enter Pickup point");
                        char pickupPoint = s.next().charAt(0);
                        System.out.println("Enter Drop point");
                        char dropPoint = s.next().charAt(0);
                        System.out.println("Enter Pickup time");
                        int pickupTime = s.nextInt();
                        if(pickupPoint < 'A' || dropPoint > 'F' || pickupPoint > 'F' || dropPoint < 'A')
                        {
                            System.out.println("Valid pickup and drop are A, B, C, D, E, F. Exitting");
                            return;
                        }
                        List<taxi> freeTaxis = getFreeTaxis(taxis,pickupTime,pickupPoint);
                        if(freeTaxis.size() == 0)
                        {
                            System.out.println("No Taxi can be alloted. Exitting");
                            return;
                        }
                        Collections.sort(freeTaxis,(a,b)->a.totalEarnings - b.totalEarnings);
                        bookTaxi(id,pickupPoint,dropPoint,pickupTime,freeTaxis);
                        id++;
                        break;
                    }
                    case 1:
                    {
                        for(taxi t : taxis)
                            t.printTaxiDetails();
                        for(taxi t : taxis)
                            t.printDetails();
                        break;
                    }
                    default:
                        return;
                }
            }

        }
    }

