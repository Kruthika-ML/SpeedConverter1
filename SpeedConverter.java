public class SpeedConverter {
    public static void main(String[] args){
        toMilesPerHour(1.5);
        toMilesPerHour(10.25);
        toMilesPerHour(-5.6);
        toMilesPerHour(25.42);
        toMilesPerHour(75.114);
    }

    public static void toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("-1");
        } else if(kilometersPerHour>0){
            double milesPerHour = 0.621 * kilometersPerHour;
            System.out.println("The conversion is " +Math.round(milesPerHour));
        }
    }

    public static void printConversion(double kiloMetersPerHour){
        if(kiloMetersPerHour<0){
            System.out.println("Invalid Value");
                    
        }
    }
}
