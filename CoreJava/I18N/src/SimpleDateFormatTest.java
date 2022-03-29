import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) {

//		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");

		String date = sdf.format(new Date());
		System.out.println(date);

//		String dateAsString = "10-12-2014 03:49:54PM";
		String dateAsString = "10-12-2014 15:49:54";
//		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ssaa");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		try {
			Date date1 = sdf1.parse(dateAsString);
			System.out.println(DateFormat.getDateTimeInstance(0, 0).format(date1));
//			System.out.println(date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
