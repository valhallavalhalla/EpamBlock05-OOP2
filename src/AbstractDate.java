
public abstract class AbstractDate implements Cloneable {

    private int year;
    private int month;
    private int day;

    public AbstractDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void incrementDay() {
        day++;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractDate that = (AbstractDate) o;

        if (getYear() != that.getYear()) return false;
        if (getMonth() != that.getMonth()) return false;
        return getDay() == that.getDay();

    }

    @Override
    public int hashCode() {
        int result = getYear();
        result = 31 * result + getMonth();
        result = 31 * result + getDay();
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "AbstractDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

}
