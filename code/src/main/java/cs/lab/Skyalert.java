package cs.lab;

import java.util.ArrayList;
import java.util.List;

public class Skyalert {
	private ArrayList<User> users;
	private ArrayList<Companhia> companies;

	private Integer TarifaOptima;

	public Skyalert() {
		users = new ArrayList<>();
		companies = new ArrayList<>();
		TarifaOptima = 9999;
	}

	public void Subscribe(User u) {
		users.add(u);
	}

	public void update() {
		for (var c: companies) {
			if(c.tarifa < TarifaOptima) {
				TarifaOptima = c.tarifa;
			}
		}
		for (var usr : users) {
			usr.MejorTarifa(TarifaOptima);
		}
	}

	public void addCompany(Companhia c) {
		companies.add(c);
	}

	public Vuelo comparar(Vuelo opt_1, Vuelo opt_2) {
		if(opt_1.getCosto() <  opt_2.getCosto()) {
			return opt_1;
		} else {
			return opt_2;
		}
	}
}
