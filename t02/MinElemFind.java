package javase01.t02;

public class MinElemFind {
    public static void main (String[] args) {
        
        //double n, an = 1;
		double an = 1;
        double E = 0.01d;
        
        System.out.println("an = 1 / (n+1)^2");
        System.out.println("an < E");
        System.out.println("E = " + E);
        System.out.println();
        /*                           
        int n;
		for(n = 1; an > E; n++) {
            an = 1 / (( (double) n + 1) * ( (double) n + 1));
            System.out.println("a" + n + " = " + an);
        }
        */
        
        int n = 0;
        do {
            ++n;
            an = 1 / (( (double) n + 1) * ( (double) n + 1));
            System.out.println("a" + n + " = " + an);
            } while (an > E);
            
        System.out.println();       
        System.out.println("/n" + n  + "'th element is the minimal");
    }
}