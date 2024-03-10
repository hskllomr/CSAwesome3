public class Temperature
{
    private static double temperature;
    public static double maxTemp = 0;

    public Temperature(double t)
    {
        temperature = t;
        if (temperature > maxTemp)
        {
            maxTemp = temperature;
        }
    }

    public static void printMax()
    {
        System.out.println(maxTemp);
    }

    public static void main(String[] args)
    {
        Temperature t1 = new Temperature(75);
        Temperature t2 = new Temperature(100);
        Temperature.printMax();
    }
}
