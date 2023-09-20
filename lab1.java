import java.util.Random;
import java.lang.Math;
public  class lab1{
    public static void main (String[] args){
        short[] c = new short[13];
        for (int i = 0; 0 <= i && i <= 12; ++i){
            c[i] = (short) (i + 5);
        }
        double[] x = new double[14];
        Random random = new Random();
        for (int i = 0; i < x.length; ++i) {
            x[i] = random.nextDouble(18) - 5;
        }
        double[][] c1 = new double[13][14];
        for (int i = 0; i<13; ++i){
            for (int j = 0; j<14; ++j){
                switch(c[i]){
                    case 8:
                        c1[i][j]= Math.pow(Math.asin(1.0/(Math.exp(Math.abs(x[j])))), (Math.cos(Math.atan((x[j]-4)/16.0)))-4)/Math.cos(Math.exp(x[j]));
                        break; 
                    case 6,9,10,11,13,14:
                        c1[i][j] = Math.sin(Math.pow(x[j]*(4+x[j]),3))*(((Math.log(Math.abs(x[j])) + 2)/Math.cos(x[j])) - 1.0/3);
                        break;
                    default:
                        c1[i][j] = Math.pow(1.0/2*(Math.exp(Math.atan(Math.sin(x[j]))) + 1), Math.PI-Math.tan(Math.pow(x[j],x[j]*(x[j]-1))));
                        break;
                }
            }
        }
        for (int i = 0; i <13; ++i) {
            for (int j = 0; j < 14; ++j) {
                System.out.printf("%.2f ", c1[i][j]);
            }
            System.out.println();
        }
    }
}
