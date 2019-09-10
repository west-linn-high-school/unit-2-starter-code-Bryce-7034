
/**
 * Write a description of class Geometry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Geometry
{
    public static void main(String[]args){
        int sides = 7;
        double radius = 5.0;
        final double PI = (3.14);
        
        System.out.print("sides= "+sides+" radius= "+radius+" PI= "+PI+"\n");
        System.out.print("A heptagon has "+ sides+" sides\n");
        System.out.print("A decagon has "+ (sides+(10-sides))+" sides\n");
        System.out.print("A dodecagon has "+ (sides+(12-sides))+" sides\n");
        System.out.print("The circumference of a circle with a radius of "
        + radius+" is "+(2*PI*radius)+"\n");
        
        int a = 40;
        int b = 6;
        double c;
        double x = 40.0;
        double y = 6.0;
        double z;
        
        //c needs to be double or lossey error
        c = a/y;
        System.out.print("c = "+c+"\n");
        
        z = (double) a/b;
        System.out.print("z = "+z+"\n");
    }
}
