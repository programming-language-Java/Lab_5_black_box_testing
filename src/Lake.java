
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
        return "Наименование: " + NAME +
                "\nМатерик: " + MAINLAND +
                "\nПлощадь: " + AREA;
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
        return Double.compare(AREA, lake.AREA);
    }
}
