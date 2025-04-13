package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* loaded from: classes.dex */
public final class TimeModule_UptimeClockFactory implements Factory<Clock> {

    public static final class InstanceHolder {

        /* renamed from: a */
        public static final TimeModule_UptimeClockFactory f9420a = new TimeModule_UptimeClockFactory();
    }

    /* renamed from: a */
    public static TimeModule_UptimeClockFactory m5602a() {
        return InstanceHolder.f9420a;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new UptimeClock();
    }
}
