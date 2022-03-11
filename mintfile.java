import java.util.*;
class date
{
	public static void main(String[] args)
	{
		int minutes, days, months, years, rmin, hours;
		Scanner ob;
		ob=new Scanner(System.in);
		System.out.println("Enter the time in minutes :");
		minutes=ob.nextInt();

		years = minutes/525600;
		rmin = minutes%525600;
		months = rmin/43800;
		rmin = rmin%43800;
		days = rmin/1440;
		rmin = rmin%1440;
		hours = rmin/60;
		rmin = rmin%60;

		System.out.println(years + "-" + months + "-" + days + ":" + hours + ":" + rmin);
		ob.close();
	}
}