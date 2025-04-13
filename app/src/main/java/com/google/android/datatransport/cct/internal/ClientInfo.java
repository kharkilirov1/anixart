package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_ClientInfo;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class ClientInfo {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract ClientInfo mo5441a();

        @NonNull
        /* renamed from: b */
        public abstract Builder mo5442b(@Nullable AndroidClientInfo androidClientInfo);

        @NonNull
        /* renamed from: c */
        public abstract Builder mo5443c(@Nullable ClientType clientType);
    }

    public enum ClientType {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        ClientType(int i2) {
        }
    }

    @NonNull
    /* renamed from: a */
    public static Builder m5479a() {
        return new AutoValue_ClientInfo.Builder();
    }

    @Nullable
    /* renamed from: b */
    public abstract AndroidClientInfo mo5439b();

    @Nullable
    /* renamed from: c */
    public abstract ClientType mo5440c();
}
