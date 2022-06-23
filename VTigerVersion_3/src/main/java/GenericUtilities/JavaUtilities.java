package GenericUtilities;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author Reshma
 *
 */
public class JavaUtilities {
	/**
	 * It is used to generate Random number
	 * @return
	 */
public int getRandomNumber() {
Random random=new Random();
int R=random.nextInt(500);
return R;
}
/**
 *It is used to get SystemDateAndTimeInISTFormat
 * @return
 */
public String getSystemDateAndTimeInISTFormat()
{
	Date date=new Date();
	return date.toString();
}
public String getSystemYeardatemonthFormat()
{
	Date date=new Date();
 	String dateandTime=date.toString();
	String yyyy=dateandTime.split(" ")[5];
	String DD=dateandTime.split(" ")[2];
	@SuppressWarnings("deprecation")
	int MM=date.getMonth()+1;
	String finalformat=yyyy+" "+DD+" "+MM;
	return finalformat;
}
}
