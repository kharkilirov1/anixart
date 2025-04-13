package com.google.cloud.datastore.core.number;

/* loaded from: classes.dex */
public final class NumberComparisonHelper {
    /* renamed from: a */
    public static int m11116a(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        if (d == d2) {
            return 0;
        }
        if (Double.isNaN(d2)) {
            return !Double.isNaN(d) ? 1 : 0;
        }
        return -1;
    }
}
