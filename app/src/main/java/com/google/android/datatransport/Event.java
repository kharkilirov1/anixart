package com.google.android.datatransport;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class Event<T> {
    /* renamed from: d */
    public static <T> Event<T> m5399d(T t) {
        return new AutoValue_Event(null, t, Priority.DEFAULT);
    }

    @Nullable
    /* renamed from: a */
    public abstract Integer mo5396a();

    /* renamed from: b */
    public abstract T mo5397b();

    /* renamed from: c */
    public abstract Priority mo5398c();
}
