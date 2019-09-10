
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
        + radius+" is "+(2*PI*radius));
    }
}
