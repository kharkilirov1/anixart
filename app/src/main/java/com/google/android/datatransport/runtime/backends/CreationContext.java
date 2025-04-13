package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class CreationContext {
    /* renamed from: a */
    public abstract Context mo5531a();

    @NonNull
    /* renamed from: b */
    public abstract String mo5532b();

    /* renamed from: c */
    public abstract Clock mo5533c();

    /* renamed from: d */
    public abstract Clock mo5534d();
}
