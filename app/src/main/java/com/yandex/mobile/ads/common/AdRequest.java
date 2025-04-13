package com.yandex.mobile.ads.common;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AdRequest {

    /* renamed from: a */
    @Nullable
    private final String f47760a;

    /* renamed from: b */
    @Nullable
    private final String f47761b;

    /* renamed from: c */
    @Nullable
    private final String f47762c;

    /* renamed from: d */
    @Nullable
    private final List<String> f47763d;

    /* renamed from: e */
    @Nullable
    private final Location f47764e;

    /* renamed from: f */
    @Nullable
    private final Map<String, String> f47765f;

    /* renamed from: g */
    @Nullable
    private final String f47766g;

    /* renamed from: h */
    @Nullable
    private final AdTheme f47767h;

    public static final class Builder {

        /* renamed from: a */
        @Nullable
        private String f47768a;

        /* renamed from: b */
        @Nullable
        private String f47769b;

        /* renamed from: c */
        @Nullable
        private Location f47770c;

        /* renamed from: d */
        @Nullable
        private String f47771d;

        /* renamed from: e */
        @Nullable
        private List<String> f47772e;

        /* renamed from: f */
        @Nullable
        private Map<String, String> f47773f;

        /* renamed from: g */
        @Nullable
        private String f47774g;

        /* renamed from: h */
        @Nullable
        private AdTheme f47775h;

        @NonNull
        public AdRequest build() {
            return new AdRequest(this, 0);
        }

        @NonNull
        public Builder setAge(@NonNull String str) {
            this.f47768a = str;
            return this;
        }

        @NonNull
        public Builder setBiddingData(@NonNull String str) {
            this.f47774g = str;
            return this;
        }

        @NonNull
        public Builder setContextQuery(@NonNull String str) {
            this.f47771d = str;
            return this;
        }

        @NonNull
        public Builder setContextTags(@NonNull List<String> list) {
            this.f47772e = list;
            return this;
        }

        @NonNull
        public Builder setGender(@NonNull String str) {
            this.f47769b = str;
            return this;
        }

        @NonNull
        public Builder setLocation(@NonNull Location location) {
            this.f47770c = location;
            return this;
        }

        @NonNull
        public Builder setParameters(@NonNull Map<String, String> map) {
            this.f47773f = map;
            return this;
        }

        @NonNull
        public Builder setPreferredTheme(@Nullable AdTheme adTheme) {
            this.f47775h = adTheme;
            return this;
        }
    }

    public /* synthetic */ AdRequest(Builder builder, int i2) {
        this(builder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdRequest.class != obj.getClass()) {
            return false;
        }
        AdRequest adRequest = (AdRequest) obj;
        String str = this.f47760a;
        if (str == null ? adRequest.f47760a != null : !str.equals(adRequest.f47760a)) {
            return false;
        }
        String str2 = this.f47761b;
        if (str2 == null ? adRequest.f47761b != null : !str2.equals(adRequest.f47761b)) {
            return false;
        }
        String str3 = this.f47762c;
        if (str3 == null ? adRequest.f47762c != null : !str3.equals(adRequest.f47762c)) {
            return false;
        }
        List<String> list = this.f47763d;
        if (list == null ? adRequest.f47763d != null : !list.equals(adRequest.f47763d)) {
            return false;
        }
        Location location = this.f47764e;
        if (location == null ? adRequest.f47764e != null : !location.equals(adRequest.f47764e)) {
            return false;
        }
        Map<String, String> map = this.f47765f;
        if (map == null ? adRequest.f47765f != null : !map.equals(adRequest.f47765f)) {
            return false;
        }
        String str4 = this.f47766g;
        if (str4 == null ? adRequest.f47766g == null : str4.equals(adRequest.f47766g)) {
            return this.f47767h == adRequest.f47767h;
        }
        return false;
    }

    @Nullable
    public String getAge() {
        return this.f47760a;
    }

    @Nullable
    public String getBiddingData() {
        return this.f47766g;
    }

    @Nullable
    public String getContextQuery() {
        return this.f47762c;
    }

    @Nullable
    public List<String> getContextTags() {
        return this.f47763d;
    }

    @Nullable
    public String getGender() {
        return this.f47761b;
    }

    @Nullable
    public Location getLocation() {
        return this.f47764e;
    }

    @Nullable
    public Map<String, String> getParameters() {
        return this.f47765f;
    }

    @Nullable
    public AdTheme getPreferredTheme() {
        return this.f47767h;
    }

    public int hashCode() {
        String str = this.f47760a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f47761b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f47762c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f47763d;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f47764e;
        int hashCode5 = (hashCode4 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f47765f;
        int hashCode6 = (hashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f47766g;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f47767h;
        return hashCode7 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    private AdRequest(@NonNull Builder builder) {
        this.f47760a = builder.f47768a;
        this.f47761b = builder.f47769b;
        this.f47762c = builder.f47771d;
        this.f47763d = builder.f47772e;
        this.f47764e = builder.f47770c;
        this.f47765f = builder.f47773f;
        this.f47766g = builder.f47774g;
        this.f47767h = builder.f47775h;
    }
}
