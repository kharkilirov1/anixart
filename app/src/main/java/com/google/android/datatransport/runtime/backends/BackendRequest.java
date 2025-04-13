package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class BackendRequest {

    @AutoValue.Builder
    public static abstract class Builder {
        /* renamed from: a */
        public abstract BackendRequest mo5526a();

        /* renamed from: b */
        public abstract Builder mo5527b(Iterable<EventInternal> iterable);

        /* renamed from: c */
        public abstract Builder mo5528c(@Nullable byte[] bArr);
    }

    /* renamed from: a */
    public static Builder m5535a() {
        return new AutoValue_BackendRequest.Builder();
    }

    /* renamed from: b */
    public abstract Iterable<EventInternal> mo5524b();

    @Nullable
    /* renamed from: c */
    public abstract byte[] mo5525c();
}
