package health;

import java.util.Calendar;
import java.util.Date;
import java.util.*;
class CalendarShow{
public static void main(String[] s){
Locale l= Locale.CANADA;
TimeZone t= TimeZone.getTimeZone("GMT");
Calendar c= Calendar.getInstance(t,l);
Date d= c.getTime();
System.out.println(d);

}
}