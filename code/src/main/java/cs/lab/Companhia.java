package cs.lab;

import java.util.ArrayList;

public class Companhia {
    private ArrayList<Skyalert> subs;
    public Integer tarifa;

    public Companhia(Integer t) {
        subs = new ArrayList<>();
        tarifa = t;
    }

    public void Subscribe(Skyalert sub) {
        subs.add(sub);
        sub.addCompany(this);
    }

    public void ActualizarTarifa(Integer nuevaTarifa) {
        tarifa = nuevaTarifa;
        for (var sub: subs) {
            sub.update();
        }
    }
}
