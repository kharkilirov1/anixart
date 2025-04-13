package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
abstract class SendRequest {

    @AutoValue.Builder
    public static abstract class Builder {
    }

    /* renamed from: a */
    public abstract Encoding mo5499a();

    /* renamed from: b */
    public abstract Event<?> mo5500b();

    /* renamed from: c */
    public abstract Transformer<?, byte[]> mo5501c();

    /* renamed from: d */
    public abstract TransportContext mo5502d();

    /* renamed from: e */
    public abstract String mo5503e();
}
