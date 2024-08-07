package dev;

import java.util.ArrayList;
import java.util.List;

public class DevService {
    private static List<Dev> devList = new ArrayList<>();

    public void addDev(Dev dev) {
        devList.add(dev);
    }

    public List<Dev> getDevList() {
        return devList;
    }
}
