public class Assignment1 {

    public static void main(String[] args) {
        
        //validation
        if (args.length == 0) {
            System.out.println("Please enter the operation code.");
            System.exit(0);
        }

        //for the first formula
        if (args[0].equals("1")) {
            if( args.length != 4) {
                System.out.println("4 values must be entered.");
                System.exit(0);
            }
            if (Float.parseFloat(args[1]) <= 0 || Float.parseFloat(args[2]) <= 0 || Float.parseFloat(args[3]) <= 0) {
                System.out.println("The values of both masses and force should be positive.");
                System.exit(0);
            }
        }

        //for the second formula
        if (args[0].equals("2")) {
            if (args.length != 3) {
                System.out.println("3 values must be entered.");
                System.exit(0);
            }
            if (Integer.parseInt(args[2]) <= 0) {
                System.out.println("Upper bound (N) should be positive.");
                System.exit(0);
            }
        }

        //take the input
        String opCode = args[0];

       switch(opCode) {
            case "1":
                float m1 = Float.parseFloat(args[1]);
                float m2 = Float.parseFloat(args[2]);
                float F = Float.parseFloat(args[3]);
                final double G = 6.674 * Math.pow(10, -11);
                double r;

                r = Math.sqrt((G * m1 * m2) / F);
                System.out.printf("%.3e\n", r);

                break;
            case "2" :
                float x = Float.parseFloat(args[1]);
                int n = Integer.parseInt(args[2]);

                double sum = 0.0;
                int pow1 = 1;
                double fact = 1.0;
                double pow2 = x;
                for (int i = 0; i < n; i++) {
                   //repeat n times
                   sum += pow1 * (pow2 / fact);          
                   fact *= (2 * i + 2) * (2 * i + 3);
                   pow1 *= -1;
                   pow2 *= x * x;
               }

               System.out.printf("%.3e\n", sum);

               break;
            default:
               System.out.println("There are two operations. Either 1 or 2 should be entered.");

               break;
       } 
    }
    
}

