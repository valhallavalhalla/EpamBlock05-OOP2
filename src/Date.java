
public class Date extends AbstractDate {

    private String separator;

    public Date(int year, int month, int day, String formatSeparator) {
        super(year, month, day);
        this.separator = formatSeparator;
    }

    /**
     * Creates string representation of date
     * in format:
     * YYYY{@code separator}MM{@code separator}DD
     *
     * @return string representation of date.
     */
    private String getFormatedDate() {
        return getYear() + separator
                + getMonth() + separator
                + getDay();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Date date = (Date) o;

        return separator != null ? separator.equals(date.separator) : date.separator == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (separator != null ? separator.hashCode() : 0);
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
        return "Date{" + super.toString() +
                ", separator='" + separator + '\'' +
                '}';
    }

}
