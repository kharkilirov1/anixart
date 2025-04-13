package com.google.android.exoplayer2.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class PriorityTaskManager {

    /* renamed from: a */
    public final Object f14705a = new Object();

    /* renamed from: b */
    public final PriorityQueue<Integer> f14706b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c */
    public int f14707c = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public PriorityTooLowException(int r4, int r5) {
            /*
                r3 = this;
                r0 = 60
                java.lang.String r1 = "Priority too low [priority="
                java.lang.String r2 = ", highest="
                java.lang.StringBuilder r4 = androidx.room.util.C0576a.m4120s(r0, r1, r4, r2, r5)
                java.lang.String r5 = "]"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.PriorityTaskManager.PriorityTooLowException.<init>(int, int):void");
        }
    }

    /* renamed from: a */
    public void m7673a(int i2) throws PriorityTooLowException {
        synchronized (this.f14705a) {
            if (this.f14707c != i2) {
                throw new PriorityTooLowException(i2, this.f14707c);
            }
        }
    }
}
