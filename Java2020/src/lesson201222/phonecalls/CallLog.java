package lesson201222.phonecalls;

import java.time.LocalDateTime;

public class CallLog {

	
	LocalDateTime callDateTime;
	
	String number;
	
	String callType;
	
	public CallLog(LocalDateTime callDateTime, String number, String callType) {
		this.callDateTime = callDateTime;
		this.number = number;
		this.callType = callType;
	}

	
	

}
