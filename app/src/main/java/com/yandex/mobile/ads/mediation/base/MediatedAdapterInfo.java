package com.yandex.mobile.ads.mediation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class MediatedAdapterInfo {

    /* renamed from: a */
    @Nullable
    private final String f57484a;

    /* renamed from: b */
    @Nullable
    private final String f57485b;

    /* renamed from: c */
    @Nullable
    private final String f57486c;

    public static final class Builder {

        /* renamed from: a */
        @Nullable
        private String f57487a;

        /* renamed from: b */
        @Nullable
        private String f57488b;

        /* renamed from: c */
        @Nullable
        private String f57489c;

        @NonNull
        public MediatedAdapterInfo build() {
            return new MediatedAdapterInfo(this);
        }

        @NonNull
        public Builder setAdapterVersion(@NonNull String str) {
            this.f57487a = str;
            return this;
        }

        @NonNull
        public Builder setNetworkName(@NonNull String str) {
            this.f57488b = str;
            return this;
        }

        @NonNull
        public Builder setNetworkSdkVersion(@NonNull String str) {
            this.f57489c = str;
            return this;
        }
    }

    @Nullable
    public String getAdapterVersion() {
        return this.f57484a;
    }

    @Nullable
    public String getNetworkName() {
        return this.f57485b;
    }

    @Nullable
    public String getNetworkSdkVersion() {
        return this.f57486c;
    }

    private MediatedAdapterInfo(@NonNull Builder builder) {
        this.f57484a = builder.f57487a;
        this.f57485b = builder.f57488b;
        this.f57486c = builder.f57489c;
    }
}
