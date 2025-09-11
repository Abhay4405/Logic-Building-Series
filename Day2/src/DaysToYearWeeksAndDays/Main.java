package DaysToYearWeeksAndDays;

public class Main {
public static void main(String[] args) {
	int num = 7500;
	int years = num / 365;
	int weeks = (num % 365) / 7;
	int days = (num % 365) % 7;
	System.out.println(years+" years, "+weeks+" weeks and "+days+" days ");
}
}
