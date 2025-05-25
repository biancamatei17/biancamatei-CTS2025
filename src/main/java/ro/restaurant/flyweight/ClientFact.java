package ro.restaurant.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ClientFact {
    private final Map<String, ClientFly> clienti = new HashMap<>();

    public ClientFly getClientFly(String nume, String telefon, String email) {
        String key = nume + "|" + telefon + "|" + email;
        if (!clienti.containsKey(key)) {
            clienti.put(key, new ClientFly(nume, telefon, email));
        }
        return clienti.get(key);
    }
}
