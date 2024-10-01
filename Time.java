package Assignment_4;

public class Time {
	private int hr;
	private int min;
	private int sec;

	public Time(int hr, int min, int sec) {
		setTime(hr, min, sec);
	}

	public Time() {
		this.hr = 0;
		this.min = 0;
		this.sec = 0;
	}

	public void setTime(int hr, int min, int sec) {
		if (hr >= 0 && hr < 24) {
			this.hr = hr;
		} else {
			System.out.println("Invalid hour. Setting to 0.");
			this.hr = 0;
		}

		if (min >= 0 && min < 60) {
			this.min = min;
		} else {
			System.out.println("Invalid minute. Setting to 0.");
			this.min = 0;
		}

		if (sec >= 0 && sec < 60) {
			this.sec = sec;
		} else {
			System.out.println("Invalid second. Setting to 0.");
			this.sec = 0;
		}
	}

	public void display() {
		System.out.printf("Time: %02d:%02d:%02d%n", hr, min, sec); // Display time in HH:MM:SS format
	}
}
