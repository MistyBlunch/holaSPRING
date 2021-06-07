package cs.lab;

public class Vuelo {
	Integer costo;
	String lugarPartida;
	String lugarLlegada;
	Float duracion;

	public Vuelo(Integer costo,Float duracion, String lugarPartida, String lugarLlegada) {
		this.costo = costo;
		this.duracion = duracion;
		this.lugarPartida = lugarPartida;
		this.lugarLlegada = lugarLlegada;
	}

	public Integer getCosto() {
		return costo;
	}

	public void setCosto(Integer costo) {
		this.costo = costo;
	}

	public String getLugarPartida() {
		return lugarPartida;
	}

	public void setLugarPartida(String lugarPartida) {
		this.lugarPartida = lugarPartida;
	}

	public String getLugarLlegada() {
		return lugarLlegada;
	}

	public void setLugarLlegada(String lugarLlegada) {
		this.lugarLlegada = lugarLlegada;
	}

	public Float getDuracion() {
		return duracion;
	}

	public void setDuracion(Float duracion) {
		this.duracion = duracion;
	}
}
