package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;

/* loaded from: classes.dex */
public interface ClientHealthMetricsStore {
    /* renamed from: a */
    void mo5577a();

    /* renamed from: c */
    ClientMetrics mo5578c();

    /* renamed from: e */
    void mo5579e(long j2, LogEventDropped.Reason reason, String str);
}
