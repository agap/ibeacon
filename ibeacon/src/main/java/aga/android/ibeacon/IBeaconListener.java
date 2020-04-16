package aga.android.ibeacon;

import java.util.Set;

import androidx.annotation.NonNull;

public interface IBeaconListener {

    void onNearbyBeaconsDetected(@NonNull Set<Beacon> beacons);
}
