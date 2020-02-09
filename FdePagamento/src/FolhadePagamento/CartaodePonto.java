package FolhadePagamento;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CartaodePonto {
	private static String data;
	private static int horasinicial;
	private static int horasfinal;
	private static int minutosinicial;
	private static int minutosfinal;	
	private static boolean chegada;
	public CartaodePonto() {
		this.chegada = true;
	}
	public static void ponto() {
		DateFormat horasFormat = new SimpleDateFormat("HH");
		DateFormat minutosFormat = new SimpleDateFormat("mm");
		Date date = new Date();	
		if(chegada) {
			DateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy"); 
			data = dataFormat.format(date);
			setHorasinicial(Integer.parseInt(horasFormat.format(date)));
			setMinutosinicial(Integer.parseInt(minutosFormat.format(date)));
			chegada = false;
		}
		else {
			setHorasinicial(Integer.parseInt(horasFormat.format(date)));
			setMinutosinicial(Integer.parseInt(minutosFormat.format(date)));
			chegada = true;
			
		}
		
	}
	public static int getHorasinicial() {
		return horasinicial;
	}
	public static void setHorasinicial(int horasinicial) {
		CartaodePonto.horasinicial = horasinicial;
	}
	public static int getHorasfinal() {
		return horasfinal;
	}
	public static void setHorasfinal(int horasfinal) {
		CartaodePonto.horasfinal = horasfinal;
	}
	public static int getMinutosinicial() {
		return minutosinicial;
	}
	public static void setMinutosinicial(int minutosinicial) {
		CartaodePonto.minutosinicial = minutosinicial;
	}
	public static int getMinutosfinal() {
		return minutosfinal;
	}
	public static void setMinutosfinal(int minutosfinal) {
		CartaodePonto.minutosfinal = minutosfinal;
	}
}
