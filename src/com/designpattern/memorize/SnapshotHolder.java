package com.designpattern.memorize;

import java.util.ArrayList;
import java.util.List;

public class SnapshotHolder {
    private List<Snapshot> snapshotList = new ArrayList<>();

    public boolean addSnapShot(Snapshot snapshot) {
        return snapshotList.add(snapshot);
    }

    public Snapshot getSnapShot(int index) {
        return snapshotList.get(index);
    }
}
