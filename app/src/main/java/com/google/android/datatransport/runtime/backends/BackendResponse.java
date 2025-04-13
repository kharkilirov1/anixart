package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class BackendResponse {

    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static BackendResponse m5536a() {
        return new AutoValue_BackendResponse(Status.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static BackendResponse m5537d() {
        return new AutoValue_BackendResponse(Status.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static BackendResponse m5538e(long j2) {
        return new AutoValue_BackendResponse(Status.OK, j2);
    }

    /* renamed from: f */
    public static BackendResponse m5539f() {
        return new AutoValue_BackendResponse(Status.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo5529b();

    /* renamed from: c */
    public abstract Status mo5530c();
}
