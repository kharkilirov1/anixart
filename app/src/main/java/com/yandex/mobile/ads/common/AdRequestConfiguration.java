package com.yandex.mobile.ads.common;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AdRequestConfiguration {

    /* renamed from: a */
    @NonNull
    private final String f47776a;

    /* renamed from: b */
    @Nullable
    private final String f47777b;

    /* renamed from: c */
    @Nullable
    private final String f47778c;

    /* renamed from: d */
    @Nullable
    private final String f47779d;

    /* renamed from: e */
    @Nullable
    private final List<String> f47780e;

    /* renamed from: f */
    @Nullable
    private final Location f47781f;

    /* renamed from: g */
    @Nullable
    private final Map<String, String> f47782g;

    /* renamed from: h */
    @Nullable
    private final String f47783h;

    /* renamed from: i */
    @Nullable
    private final AdTheme f47784i;

    public static final class Builder {

        /* renamed from: a */
        @NonNull
        private final String f47785a;

        /* renamed from: b */
        @Nullable
        private String f47786b;

        /* renamed from: c */
        @Nullable
        private String f47787c;

        /* renamed from: d */
        @Nullable
        private Location f47788d;

        /* renamed from: e */
        @Nullable
        private String f47789e;

        /* renamed from: f */
        @Nullable
        private List<String> f47790f;

        /* renamed from: g */
        @Nullable
        private Map<String, String> f47791g;

        /* renamed from: h */
        @Nullable
        private String f47792h;

        /* renamed from: i */
        @Nullable
        private AdTheme f47793i;

        public Builder(@NonNull String str) {
            this.f47785a = str;
        }

        @NonNull
        public AdRequestConfiguration build() {
            return new AdRequestConfiguration(this, 0);
        }

        @NonNull
        public Builder setAge(@NonNull String str) {
            this.f47786b = str;
            return this;
        }

        @NonNull
        public Builder setBiddingData(@NonNull String str) {
            this.f47792h = str;
            return this;
        }

        @NonNull
        public Builder setContextQuery(@NonNull String str) {
            this.f47789e = str;
            return this;
        }

        @NonNull
        public Builder setContextTags(@NonNull List<String> list) {
            this.f47790f = list;
            return this;
        }

        @NonNull
        public Builder setGender(@NonNull String str) {
            this.f47787c = str;
            return this;
        }

        @NonNull
        public Builder setLocation(@NonNull Location location) {
            this.f47788d = location;
            return this;
        }

        @NonNull
        public Builder setParameters(@NonNull Map<String, String> map) {
            this.f47791g = map;
            return this;
        }

        @NonNull
        public Builder setPreferredTheme(@Nullable AdTheme adTheme) {
            this.f47793i = adTheme;
            return this;
        }
    }

    public /* synthetic */ AdRequestConfiguration(Builder builder, int i2) {
        this(builder);
    }

    @NonNull
    /* renamed from: a */
    public final String m21949a() {
        return this.f47776a;
    }

    @Nullable
    /* renamed from: b */
    public final String m21950b() {
        return this.f47777b;
    }

    @Nullable
    /* renamed from: c */
    public final String m21951c() {
        return this.f47783h;
    }

    @Nullable
    /* renamed from: d */
    public final String m21952d() {
        return this.f47779d;
    }

    @Nullable
    /* renamed from: e */
    public final List<String> m21953e() {
        return this.f47780e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdRequestConfiguration.class != obj.getClass()) {
            return false;
        }
        AdRequestConfiguration adRequestConfiguration = (AdRequestConfiguration) obj;
        if (!this.f47776a.equals(adRequestConfiguration.f47776a)) {
            return false;
        }
        String str = this.f47777b;
        if (str == null ? adRequestConfiguration.f47777b != null : !str.equals(adRequestConfiguration.f47777b)) {
            return false;
        }
        String str2 = this.f47778c;
        if (str2 == null ? adRequestConfiguration.f47778c != null : !str2.equals(adRequestConfiguration.f47778c)) {
            return false;
        }
        String str3 = this.f47779d;
        if (str3 == null ? adRequestConfiguration.f47779d != null : !str3.equals(adRequestConfiguration.f47779d)) {
            return false;
        }
        List<String> list = this.f47780e;
        if (list == null ? adRequestConfiguration.f47780e != null : !list.equals(adRequestConfiguration.f47780e)) {
            return false;
        }
        Location location = this.f47781f;
        if (location == null ? adRequestConfiguration.f47781f != null : !location.equals(adRequestConfiguration.f47781f)) {
            return false;
        }
        Map<String, String> map = this.f47782g;
        if (map == null ? adRequestConfiguration.f47782g != null : !map.equals(adRequestConfiguration.f47782g)) {
            return false;
        }
        String str4 = this.f47783h;
        if (str4 == null ? adRequestConfiguration.f47783h == null : str4.equals(adRequestConfiguration.f47783h)) {
            return this.f47784i == adRequestConfiguration.f47784i;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final String m21954f() {
        return this.f47778c;
    }

    @Nullable
    /* renamed from: g */
    public final Location m21955g() {
        return this.f47781f;
    }

    @Nullable
    /* renamed from: h */
    public final Map<String, String> m21956h() {
        return this.f47782g;
    }

    public int hashCode() {
        int hashCode = this.f47776a.hashCode() * 31;
        String str = this.f47777b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f47778c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f47779d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f47780e;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f47781f;
        int hashCode6 = (hashCode5 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f47782g;
        int hashCode7 = (hashCode6 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f47783h;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f47784i;
        return hashCode8 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    @Nullable
    /* renamed from: i */
    public final AdTheme m21957i() {
        return this.f47784i;
    }

    private AdRequestConfiguration(@NonNull Builder builder) {
        this.f47776a = builder.f47785a;
        this.f47777b = builder.f47786b;
        this.f47778c = builder.f47787c;
        this.f47779d = builder.f47789e;
        this.f47780e = builder.f47790f;
        this.f47781f = builder.f47788d;
        this.f47782g = builder.f47791g;
        this.f47783h = builder.f47792h;
        this.f47784i = builder.f47793i;
    }
}
