package ua.lviv.lgs.model;

import java.time.LocalDate;

public class Reservation {
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Reservation(){
		
	}

	public Reservation(LocalDate startDate, LocalDate endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Reservation [startDate=" + startDate + ", endDate=" + endDate
				+ "]";
	}
	
	
	
	

}
