package workingWithAbstraction.enumDemo;

public enum Week {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}