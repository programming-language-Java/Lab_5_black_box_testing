
public class Lake implements Comparable<Lake> {
    private final String NAME;
    private final String MAINLAND;
    private final double AREA;

    Lake(String name, String mainland, double area) {
        this.NAME = name;
        this.MAINLAND = mainland;
        this.AREA = area;
    }

    @Override
    public String toString() {
        return "������������: " + NAME +
                "\n�������: " + MAINLAND +
                "\n�������: " + AREA;
    }

    public String getName() {
        return NAME;
    }

    public String getMainland() {
        return MAINLAND;
    }

    public double getArea() {
        return AREA;
    }

    @Override
    public int compareTo(Lake lake) {
        boolean isSort = AREA != lake.AREA;
        if (isSort)
            return (int) (AREA - lake.AREA);
        return 1;
    }
}
