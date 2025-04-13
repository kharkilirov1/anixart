package com.yandex.mobile.ads.instream;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes3.dex */
public final class InstreamAdRequestConfiguration {

    /* renamed from: a */
    @NonNull
    private final String f57420a;

    /* renamed from: b */
    @NonNull
    private final String f57421b;

    /* renamed from: c */
    @Nullable
    private final Map<String, String> f57422c;

    public static final class Builder {

        /* renamed from: a */
        @NonNull
        private String f57423a = "0";

        /* renamed from: b */
        @NonNull
        private final String f57424b;

        /* renamed from: c */
        @Nullable
        private Map<String, String> f57425c;

        public Builder(@NonNull String str) {
            this.f57424b = str;
        }

        public InstreamAdRequestConfiguration build() {
            return new InstreamAdRequestConfiguration(this, 0);
        }

        public Builder setCategoryId(@NonNull String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Passed categoryId is empty");
            }
            this.f57423a = str;
            return this;
        }

        @NonNull
        public Builder setParameters(@NonNull Map<String, String> map) {
            this.f57425c = map;
            return this;
        }
    }

    public /* synthetic */ InstreamAdRequestConfiguration(Builder builder, int i2) {
        this(builder);
    }

    @NonNull
    public String getCategoryId() {
        return this.f57420a;
    }

    @NonNull
    public String getPageId() {
        return this.f57421b;
    }

    @Nullable
    public Map<String, String> getParameters() {
        return this.f57422c;
    }

    private InstreamAdRequestConfiguration(@NonNull Builder builder) {
        this.f57420a = builder.f57423a;
        this.f57421b = builder.f57424b;
        this.f57422c = builder.f57425c;
    }
}
