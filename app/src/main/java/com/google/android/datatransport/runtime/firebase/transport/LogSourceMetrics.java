package com.google.android.datatransport.runtime.firebase.transport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class LogSourceMetrics {

    /* renamed from: c */
    public static final /* synthetic */ int f9236c = 0;

    /* renamed from: a */
    public final String f9237a;

    /* renamed from: b */
    public final List<LogEventDropped> f9238b;

    public static final class Builder {

        /* renamed from: a */
        public String f9239a = "";

        /* renamed from: b */
        public List<LogEventDropped> f9240b = new ArrayList();
    }

    static {
        Collections.unmodifiableList(new Builder().f9240b);
    }

    public LogSourceMetrics(String str, List<LogEventDropped> list) {
        this.f9237a = str;
        this.f9238b = list;
    }
}
