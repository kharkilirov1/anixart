package com.yandex.mobile.ads.nativeads;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class NativeAdRequestConfiguration {

    /* renamed from: a */
    @NonNull
    private final String f57624a;

    /* renamed from: b */
    @Nullable
    private final String f57625b;

    /* renamed from: c */
    @Nullable
    private final String f57626c;

    /* renamed from: d */
    @Nullable
    private final String f57627d;

    /* renamed from: e */
    @Nullable
    private final List<String> f57628e;

    /* renamed from: f */
    @Nullable
    private final Location f57629f;

    /* renamed from: g */
    @Nullable
    private final Map<String, String> f57630g;

    /* renamed from: h */
    @Nullable
    private final String f57631h;

    /* renamed from: i */
    @Nullable
    private final AdTheme f57632i;

    /* renamed from: j */
    private final boolean f57633j;

    public static final class Builder {

        /* renamed from: a */
        @NonNull
        private final String f57634a;

        /* renamed from: b */
        @Nullable
        private String f57635b;

        /* renamed from: c */
        @Nullable
        private String f57636c;

        /* renamed from: d */
        @Nullable
        private Location f57637d;

        /* renamed from: e */
        @Nullable
        private String f57638e;

        /* renamed from: f */
        @Nullable
        private List<String> f57639f;

        /* renamed from: g */
        @Nullable
        private Map<String, String> f57640g;

        /* renamed from: h */
        @Nullable
        private String f57641h;

        /* renamed from: i */
        @Nullable
        private AdTheme f57642i;

        /* renamed from: j */
        private boolean f57643j = true;

        public Builder(@NonNull String str) {
            this.f57634a = str;
        }

        @NonNull
        public NativeAdRequestConfiguration build() {
            return new NativeAdRequestConfiguration(this, 0);
        }

        @NonNull
        public Builder setAge(@NonNull String str) {
            this.f57635b = str;
            return this;
        }

        @NonNull
        public Builder setBiddingData(@NonNull String str) {
            this.f57641h = str;
            return this;
        }

        @NonNull
        public Builder setContextQuery(@NonNull String str) {
            this.f57638e = str;
            return this;
        }

        @NonNull
        public Builder setContextTags(@NonNull List<String> list) {
            this.f57639f = list;
            return this;
        }

        @NonNull
        public Builder setGender(@NonNull String str) {
            this.f57636c = str;
            return this;
        }

        @NonNull
        public Builder setLocation(@NonNull Location location) {
            this.f57637d = location;
            return this;
        }

        @NonNull
        public Builder setParameters(@NonNull Map<String, String> map) {
            this.f57640g = map;
            return this;
        }

        @NonNull
        public Builder setPreferredTheme(@NonNull AdTheme adTheme) {
            this.f57642i = adTheme;
            return this;
        }

        @NonNull
        public Builder setShouldLoadImagesAutomatically(boolean z) {
            this.f57643j = z;
            return this;
        }
    }

    public /* synthetic */ NativeAdRequestConfiguration(Builder builder, int i2) {
        this(builder);
    }

    @NonNull
    /* renamed from: a */
    public final String m30465a() {
        return this.f57624a;
    }

    @Nullable
    /* renamed from: b */
    public final String m30466b() {
        return this.f57625b;
    }

    @Nullable
    /* renamed from: c */
    public final String m30467c() {
        return this.f57631h;
    }

    @Nullable
    /* renamed from: d */
    public final String m30468d() {
        return this.f57627d;
    }

    @Nullable
    /* renamed from: e */
    public final List<String> m30469e() {
        return this.f57628e;
    }

    @Nullable
    /* renamed from: f */
    public final String m30470f() {
        return this.f57626c;
    }

    @Nullable
    /* renamed from: g */
    public final Location m30471g() {
        return this.f57629f;
    }

    @Nullable
    /* renamed from: h */
    public final Map<String, String> m30472h() {
        return this.f57630g;
    }

    @Nullable
    /* renamed from: i */
    public final AdTheme m30473i() {
        return this.f57632i;
    }

    /* renamed from: j */
    public final boolean m30474j() {
        return this.f57633j;
    }

    private NativeAdRequestConfiguration(@NonNull Builder builder) {
        this.f57624a = builder.f57634a;
        this.f57625b = builder.f57635b;
        this.f57626c = builder.f57636c;
        this.f57627d = builder.f57638e;
        this.f57628e = builder.f57639f;
        this.f57629f = builder.f57637d;
        this.f57630g = builder.f57640g;
        this.f57631h = builder.f57641h;
        this.f57632i = builder.f57642i;
        this.f57633j = builder.f57643j;
    }
}
