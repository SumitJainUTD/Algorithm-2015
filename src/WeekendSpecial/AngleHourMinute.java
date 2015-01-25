package WeekendSpecial;

public class AngleHourMinute {

	public static double angle(int hour, int minute){
		if(hour<0||minute<0){
			return -1;
		}
		//at 12:00 both hand meet, take it as reference.
		//angle bw handd and minute = angle og hour ~ angle of minute
		//return min(angle, 360-angle)
		// hour had moves 360 in 12 hours => 360/12 = 30 degree in one hour or 0.5 degree in 1 min
		//minute hand moves 360 in 60 mins => 360/60 = 6 degree in one min 
		// so if given time is h hours and m mins, hour hand will move (h*60+m)*0.5
		// and minute hand will move 6*m
		if(hour==12){
			hour = 0;
		}
		if(minute==60){
			minute = 0;
			hour+=1;
		}
		double hourAngle = (hour*60+minute)*0.5;
		double minAngle = minute*6;
		double bwAngle = Math.abs(hourAngle-minAngle);
		return Math.min(360-bwAngle, bwAngle);
			
	}
	public static void main(String[] args) {
		System.out.println(angle(12, 30));
		System.out.println(angle(3, 30));
		System.out.println(angle(2, 23));

	}

}
