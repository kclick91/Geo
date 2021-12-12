public class Unit {

    private int[] shape;
    public Unit(int[] sh)
    {
        shape = sh;
    }

    public int[] GetShape()
    {
        return shape;
    }

    public void SetShape(int x, int y)
    {
        shape[0] = x;
        shape[1] = y;
    }
    public void SetShape(int[] xandy)
    {
        shape = xandy;
    }
}
