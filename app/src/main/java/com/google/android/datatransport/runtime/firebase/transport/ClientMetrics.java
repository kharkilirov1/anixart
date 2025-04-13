package com.google.android.datatransport.runtime.firebase.transport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ClientMetrics {

    /* renamed from: e */
    public static final /* synthetic */ int f9212e = 0;

    /* renamed from: a */
    public final TimeWindow f9213a;

    /* renamed from: b */
    public final List<LogSourceMetrics> f9214b;

    /* renamed from: c */
    public final GlobalMetrics f9215c;

    /* renamed from: d */
    public final String f9216d;

    public static final class Builder {

        /* renamed from: a */
        public TimeWindow f9217a = null;

        /* renamed from: b */
        public List<LogSourceMetrics> f9218b = new ArrayList();

        /* renamed from: c */
        public GlobalMetrics f9219c = null;

        /* renamed from: d */
        public String f9220d = "";
    }

    static {
        Collections.unmodifiableList(new Builder().f9218b);
    }

    public ClientMetrics(TimeWindow timeWindow, List<LogSourceMetrics> list, GlobalMetrics globalMetrics, String str) {
        this.f9213a = timeWindow;
        this.f9214b = list;
        this.f9215c = globalMetrics;
        this.f9216d = str;
    }
}
