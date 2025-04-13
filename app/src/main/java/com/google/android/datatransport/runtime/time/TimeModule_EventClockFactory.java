package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* loaded from: classes.dex */
public final class TimeModule_EventClockFactory implements Factory<Clock> {

    public static final class InstanceHolder {

        /* renamed from: a */
        public static final TimeModule_EventClockFactory f9419a = new TimeModule_EventClockFactory();
    }

    /* renamed from: a */
    public static TimeModule_EventClockFactory m5601a() {
        return InstanceHolder.f9419a;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new WallTimeClock();
    }
}
