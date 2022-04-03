package homeworkweek9;

public class Programme10 {
    public static void main(String[] args) {
        String stationName[] = {"waterloo", "embankment", "london bridge", "canada water"};
        //String lineName [] = {"Northern Line","Jubilee line","bakerloo line"};
        String tubeName[][] = new String[3][3];

        tubeName[0][0] = "Northern Line"; //line name
        tubeName[0][1] = "waterloo";
        tubeName[0][2] = "london bridge";

        tubeName[1][0] = "Jubilee line";
        tubeName[1][1] = "london bridge";
        tubeName[1][2] = "canada water";

        tubeName[2][0] = "bakerloo line";
        tubeName[2][1] = "waterloo";
        tubeName[2][2] = "embankment";
//        String c = "";
//        for (int i=0; i<stationName.length; i++){
//           c = stationName[i];
//        }
//        System.out.println(c);


        for (int i = 0; i < tubeName.length; i++) {
            for (int j = 1; j < tubeName[i].length; j++) {
                if (tubeName[i][j] == stationName[2]) {
                    System.out.println(stationName[2] + " has pass line is ");
                    System.out.println(tubeName[0][0]);
                    System.out.println(tubeName[1][0]);

                }
                if (tubeName[i][j] == stationName[i]) {
                    System.out.println(stationName[i] + " has pass line is ");
                    System.out.println(tubeName[0][0]);
                    System.out.println(tubeName[2][0]);
                    break;

                }
                if (tubeName[i][j] == stationName[1]) {
                    System.out.println(stationName[1] + " has pass line is ");
                    System.out.println(tubeName[2][0]);
                    break;

                }
                if (tubeName[i][j] == stationName[3]) {
                    System.out.println(stationName[3] + " has pass line is ");
                    System.out.println(tubeName[1][0]);
                    break;

                }


            }
        }
    }
}
