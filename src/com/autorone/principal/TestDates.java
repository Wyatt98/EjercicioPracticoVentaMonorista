package com.autorone.principal;

import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Calendar calendarioRecordatorio = Calendar.getInstance();
		calendarioRecordatorio.add(Calendar.DAY_OF_YEAR, 30);
		
		Date fecha = new Date();
		Calendar calendarActual = Calendar.getInstance();
		calendarActual.setTime(fecha);
		calendarActual.add(Calendar.DAY_OF_YEAR, 60);
		
		if(calendarActual.getTimeInMillis() < calendarioRecordatorio.getTime().getTime()) {
			System.out.println("No te recuerdo algo");
		} else {
			System.out.println("Ey, tienes un recordatorio");
		}
		
	}

}
