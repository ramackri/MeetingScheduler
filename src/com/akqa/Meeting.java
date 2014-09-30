package com.akqa;
import org.joda.time.Interval;
import org.joda.time.LocalTime;


public class Meeting implements Comparable<Meeting> {

	private String employeeId;

	private LocalTime requestStartTime;

	private LocalTime requestFinishTime;

	public Meeting(String employeeId, LocalTime startTime, LocalTime finishTime) {
		this.employeeId = employeeId;
		this.requestStartTime = startTime;
		this.requestFinishTime = finishTime;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public LocalTime getStartTime() {
		return requestStartTime;
	}

	public LocalTime getFinishTime() {
		return requestFinishTime;
	}

	public int compareTo(Meeting that) {
		Interval meetingInterval = new Interval(requestStartTime.toDateTimeToday(),
				requestFinishTime.toDateTimeToday());
		Interval toCompareMeetingInterval = new Interval(that.getStartTime()
				.toDateTimeToday(), that.getFinishTime().toDateTimeToday());

		if (meetingInterval.overlaps(toCompareMeetingInterval)) {
			return 0;
		} else {
			return this.getStartTime().compareTo(that.getStartTime());
		}

	}
}
