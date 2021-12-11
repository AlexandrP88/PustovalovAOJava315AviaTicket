package ru.netology.repository;

import ru.netology.domain.Route;

public class RouteRepository {
    private Route[] route = new Route[0];

    public void save(Route ticket) {
        int length = route.length + 1;
        Route[] tmp = new Route[length];
        System.arraycopy(route, 0, tmp, 0, route.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = ticket;
        route = tmp;
    }

    public Route[] findAll() {
        return route;
    }

    public void removeById(int id) {
        int length = route.length - 1;
        Route[] tmp = new Route[length];
        int index = 0;
        for (Route ticket : route) {
            if (ticket.getId() != id) {
                tmp[index] = ticket;
                index++;
            }
        }
        route = tmp;
    }
}
