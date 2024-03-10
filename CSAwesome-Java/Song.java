public class Song
{
    // Add a public static variable called numVerses

    public static int numVerses=0;

    // Change the method(s) to be static

    public static void verse(String s1,String s2)
    {

        System.out.println(s1);
        System.out.println(s1);
        numVerses=numVerses+1;
        System.out.println(numVerses);

    }

    public static void main(String args[])
    {
        // Call the static method(s) to print out the Song
        // Print out the static variable numVerses
        String S1="The ants go marching one by one, hurrah, hurrah";
        String S2="The ants go marching one by one, hurrah, hurrah";

        Song.verse(S1,S2);
        Song.verse(S1,S2);
        Song.verse(S1,S2);

    }
}
