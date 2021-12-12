//© Kelly Click
public class Main {

    //For anything with simple units/components/pieces
    //There will be rich opportunity for pattern recognition
    //such as in:
    //Go, Chess, Piano,Programming etc.

    //Use
    //Dilating, translating, rotating, reflecting
    public static void main(String[] args)
    {
        Unit u = new Unit(new int[]{3,4});
        int[] uDilated = Dilate(u,3,4);
        System.out.println("Dilated: ");
        System.out.println(uDilated[0] + " " + uDilated[1]);
        int[] uTranslated = Translate(u, 1, 2);
        System.out.println("Translated: ");
        System.out.println(uTranslated[0] + " " + uTranslated[1]);
        int[] uRotated = Rotate(u, 3);
        System.out.println("Rotated: ");
        System.out.println(uRotated[0] + " " + uRotated[1]);
        int[] uReflectedOverOrigin = Reflect(u);
        System.out.println("Reflected: ");
        System.out.println(uReflectedOverOrigin[0] + " " + uReflectedOverOrigin[1]);



    }
    //Dilating
    public static int[] Dilate(Unit unit, int dil, int dilTwo)
    {
        int[] un = unit.GetShape();
        un[0] = un[0] * dil;
        un[1] = un[1] * dilTwo;

        return un;

    }

    //Translate
    public static int[] Translate(Unit unit, int tra, int traTwo)
    {

        unit.GetShape()[0] = unit.GetShape()[0] + tra;
        unit.GetShape()[1] = unit.GetShape()[1] + traTwo;

        int[] u = unit.GetShape();
        return u;
    }

    //Rotate
    //Four rotations
    public static int[] Rotate(Unit unit, int rot)
    {
        //Counter-clockwise
        if (rot % 4 == 0)
        {
            unit.SetShape(unit.GetShape()[0], unit.GetShape()[1]);
        }
        else if (rot % 4 == 1)
        {
            unit.SetShape(-unit.GetShape()[1], unit.GetShape()[0]);
        }
        else if (rot % 4 == 2)
        {
            unit.SetShape(-unit.GetShape()[0], -unit.GetShape()[1]);
        }
        else if (rot % 4 == 3)
        {
            unit.SetShape(unit.GetShape()[1], -unit.GetShape()[0]);
        }
        return unit.GetShape();
    }


    //Reflect over 0,0
    public static int[] Reflect(Unit unit)
    {
        int[] sh = unit.GetShape();
        sh[0] = -sh[0];
        sh[1] = - sh[1];
        return sh;
    }

    //Connecting Function

}
