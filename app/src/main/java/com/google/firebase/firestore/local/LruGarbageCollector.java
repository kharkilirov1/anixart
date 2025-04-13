package com.google.firebase.firestore.local;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class LruGarbageCollector {

    public class GCScheduler implements Scheduler {
    }

    public static class Params {
    }

    public static class Results {
    }

    public static class RollingSequenceNumberBuffer {

        /* renamed from: a */
        public static final /* synthetic */ int f22788a = 0;

        static {
            C2101a c2101a = C2101a.f22827e;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        timeUnit.toMillis(1L);
        timeUnit.toMillis(5L);
    }
}
