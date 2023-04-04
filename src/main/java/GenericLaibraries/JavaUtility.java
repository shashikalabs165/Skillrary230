package GenericLaibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This class contains reusable java methods
 * @author shaash
 *
 */
public class JavaUtility
{
	/**
	 * This method generate random number within the limit
	 * @param limit
	 * @return
	 */
	public int generateRandomNum(int limit)
	{
		Random random = new Random();
		int randomNum = random.nextInt(limit);
		return randomNum;
		
	}
	
	/**
	 * This method returns current time in specified format
	 * @return
	 */
	public String getCuurentTime()
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_YY_hh_mm_ss");
		String CurrentTime = sdf.format(date);
		return CurrentTime;
	}
}
