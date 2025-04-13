package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class TransportContext {

    @AutoValue.Builder
    public static abstract class Builder {
        /* renamed from: a */
        public abstract TransportContext mo5507a();

        /* renamed from: b */
        public abstract Builder mo5508b(String str);

        /* renamed from: c */
        public abstract Builder mo5509c(@Nullable byte[] bArr);

        @RestrictTo
        /* renamed from: d */
        public abstract Builder mo5510d(Priority priority);
    }

    /* renamed from: a */
    public static Builder m5519a() {
        AutoValue_TransportContext.Builder builder = new AutoValue_TransportContext.Builder();
        builder.mo5510d(Priority.DEFAULT);
        return builder;
    }

    /* renamed from: b */
    public abstract String mo5504b();

    @Nullable
    /* renamed from: c */
    public abstract byte[] mo5505c();

    @RestrictTo
    /* renamed from: d */
    public abstract Priority mo5506d();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo5504b();
        objArr[1] = mo5506d();
        objArr[2] = mo5505c() == null ? "" : Base64.encodeToString(mo5505c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
