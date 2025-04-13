package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class rh1 {

    /* renamed from: a */
    public static boolean f54313a = Log.isLoggable("Volley", 2);

    /* renamed from: com.yandex.mobile.ads.impl.rh1$a */
    public static class C5690a {

        /* renamed from: c */
        public static final boolean f54314c = rh1.f54313a;

        /* renamed from: a */
        private final ArrayList f54315a = new ArrayList();

        /* renamed from: b */
        private boolean f54316b = false;

        /* renamed from: com.yandex.mobile.ads.impl.rh1$a$a */
        public static class a {

            /* renamed from: a */
            public final String f54317a;

            /* renamed from: b */
            public final long f54318b;

            /* renamed from: c */
            public final long f54319c;

            public a(String str, long j2, long j3) {
                this.f54317a = str;
                this.f54318b = j2;
                this.f54319c = j3;
            }
        }

        /* renamed from: a */
        public final synchronized void m27925a(String str, long j2) {
            if (this.f54316b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f54315a.add(new a(str, j2, SystemClock.elapsedRealtime()));
        }

        public final void finalize() throws Throwable {
            if (this.f54316b) {
                return;
            }
            m27924a("Request on the loose");
            n60.m26810c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }

        /* renamed from: a */
        public final synchronized void m27924a(String str) {
            long j2;
            this.f54316b = true;
            if (this.f54315a.size() == 0) {
                j2 = 0;
            } else {
                long j3 = ((a) this.f54315a.get(0)).f54319c;
                ArrayList arrayList = this.f54315a;
                j2 = ((a) arrayList.get(arrayList.size() - 1)).f54319c - j3;
            }
            if (j2 <= 0) {
                return;
            }
            long j4 = ((a) this.f54315a.get(0)).f54319c;
            n60.m26809b("(%-4d ms) %s", Long.valueOf(j2), str);
            Iterator it = this.f54315a.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                long j5 = aVar.f54319c;
                n60.m26809b("(+%-4d) [%2d] %s", Long.valueOf(j5 - j4), Long.valueOf(aVar.f54318b), aVar.f54317a);
                j4 = j5;
            }
        }
    }
}
