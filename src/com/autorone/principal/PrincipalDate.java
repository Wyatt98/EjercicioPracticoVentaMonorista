package com.autorone.principal;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PrincipalDate {

	public static void main(String[] args) {
		String fechaActualString = "2024/06/01";
		String fechaRecordatorioString = "2024/06/05";
		
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			LocalDate localDateActual = LocalDate.parse(fechaActualString, formatter);
			LocalDate localDateRecordatorio = LocalDate.parse(fechaRecordatorioString, formatter);
			
			long daysBetween = ChronoUnit.DAYS.between(localDateActual, localDateRecordatorio);
			
			System.out.println(daysBetween);
		} catch (DateTimeException exception) {
			System.err.println("Hubo un problema con el parseo de una de las fechas");
		} catch (Exception exception) {
			System.err.println("Hubo un problema general");
		} finally {
			System.out.println("Fin del programa");
		}
		
	}

}
