package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.cloud.datastore.core.number.NumberComparisonHelper;
import com.google.firebase.firestore.util.Util;
import java.util.Objects;

/* loaded from: classes2.dex */
public class GeoPoint implements Comparable<GeoPoint> {
    @Override // java.lang.Comparable
    public int compareTo(@NonNull GeoPoint geoPoint) {
        Objects.requireNonNull(geoPoint);
        int i2 = Util.f23027a;
        int m11116a = NumberComparisonHelper.m11116a(0.0d, 0.0d);
        return m11116a == 0 ? NumberComparisonHelper.m11116a(0.0d, 0.0d) : m11116a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof GeoPoint)) {
            return false;
        }
        Objects.requireNonNull((GeoPoint) obj);
        return true;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(0.0d);
        long doubleToLongBits2 = Double.doubleToLongBits(0.0d);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    @NonNull
    public String toString() {
        return "GeoPoint { latitude=0.0, longitude=0.0 }";
    }
}
