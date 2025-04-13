package com.yandex.mobile.ads.instream;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class InstreamAdBreakPosition {

    /* renamed from: a */
    @NonNull
    private final Type f57416a;

    /* renamed from: b */
    private final long f57417b;

    public enum Type {
        PERCENTS,
        MILLISECONDS,
        POSITION;

        Type() {
        }
    }

    public InstreamAdBreakPosition(@NonNull Type type, long j2) {
        this.f57417b = j2;
        this.f57416a = type;
    }

    @NonNull
    public Type getPositionType() {
        return this.f57416a;
    }

    public long getValue() {
        return this.f57417b;
    }
}
