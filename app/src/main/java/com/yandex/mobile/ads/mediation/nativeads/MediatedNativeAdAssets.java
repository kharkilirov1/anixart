package com.yandex.mobile.ads.mediation.nativeads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class MediatedNativeAdAssets {

    /* renamed from: a */
    @Nullable
    private final String f57499a;

    /* renamed from: b */
    @Nullable
    private final String f57500b;

    /* renamed from: c */
    @Nullable
    private final String f57501c;

    /* renamed from: d */
    @Nullable
    private final String f57502d;

    /* renamed from: e */
    @Nullable
    private final MediatedNativeAdImage f57503e;

    /* renamed from: f */
    @Nullable
    private final MediatedNativeAdImage f57504f;

    /* renamed from: g */
    @Nullable
    private final MediatedNativeAdImage f57505g;

    /* renamed from: h */
    @Nullable
    private final MediatedNativeAdMedia f57506h;

    /* renamed from: i */
    @Nullable
    private final String f57507i;

    /* renamed from: j */
    @Nullable
    private final String f57508j;

    /* renamed from: k */
    @Nullable
    private final String f57509k;

    /* renamed from: l */
    @Nullable
    private final String f57510l;

    /* renamed from: m */
    @Nullable
    private final String f57511m;

    /* renamed from: n */
    @Nullable
    private final String f57512n;

    public static final class Builder {

        /* renamed from: a */
        @Nullable
        private String f57513a;

        /* renamed from: b */
        @Nullable
        private String f57514b;

        /* renamed from: c */
        @Nullable
        private String f57515c;

        /* renamed from: d */
        @Nullable
        private String f57516d;

        /* renamed from: e */
        @Nullable
        private MediatedNativeAdImage f57517e;

        /* renamed from: f */
        @Nullable
        private MediatedNativeAdImage f57518f;

        /* renamed from: g */
        @Nullable
        private MediatedNativeAdImage f57519g;

        /* renamed from: h */
        @Nullable
        private MediatedNativeAdMedia f57520h;

        /* renamed from: i */
        @Nullable
        private String f57521i;

        /* renamed from: j */
        @Nullable
        private String f57522j;

        /* renamed from: k */
        @Nullable
        private String f57523k;

        /* renamed from: l */
        @Nullable
        private String f57524l;

        /* renamed from: m */
        @Nullable
        private String f57525m;

        /* renamed from: n */
        @Nullable
        private String f57526n;

        @NonNull
        public MediatedNativeAdAssets build() {
            return new MediatedNativeAdAssets(this);
        }

        @NonNull
        public Builder setAge(@Nullable String str) {
            this.f57513a = str;
            return this;
        }

        @NonNull
        public Builder setBody(@Nullable String str) {
            this.f57514b = str;
            return this;
        }

        @NonNull
        public Builder setCallToAction(@Nullable String str) {
            this.f57515c = str;
            return this;
        }

        @NonNull
        public Builder setDomain(@Nullable String str) {
            this.f57516d = str;
            return this;
        }

        @NonNull
        public Builder setFavicon(@Nullable MediatedNativeAdImage mediatedNativeAdImage) {
            this.f57517e = mediatedNativeAdImage;
            return this;
        }

        @NonNull
        public Builder setIcon(@Nullable MediatedNativeAdImage mediatedNativeAdImage) {
            this.f57518f = mediatedNativeAdImage;
            return this;
        }

        @NonNull
        public Builder setImage(@Nullable MediatedNativeAdImage mediatedNativeAdImage) {
            this.f57519g = mediatedNativeAdImage;
            return this;
        }

        @NonNull
        public Builder setMedia(@Nullable MediatedNativeAdMedia mediatedNativeAdMedia) {
            this.f57520h = mediatedNativeAdMedia;
            return this;
        }

        @NonNull
        public Builder setPrice(@Nullable String str) {
            this.f57521i = str;
            return this;
        }

        @NonNull
        public Builder setRating(@Nullable String str) {
            this.f57522j = str;
            return this;
        }

        @NonNull
        public Builder setReviewCount(@Nullable String str) {
            this.f57523k = str;
            return this;
        }

        @NonNull
        public Builder setSponsored(@Nullable String str) {
            this.f57524l = str;
            return this;
        }

        @NonNull
        public Builder setTitle(@Nullable String str) {
            this.f57525m = str;
            return this;
        }

        @NonNull
        public Builder setWarning(@Nullable String str) {
            this.f57526n = str;
            return this;
        }
    }

    @Nullable
    public String getAge() {
        return this.f57499a;
    }

    @Nullable
    public String getBody() {
        return this.f57500b;
    }

    @Nullable
    public String getCallToAction() {
        return this.f57501c;
    }

    @Nullable
    public String getDomain() {
        return this.f57502d;
    }

    @Nullable
    public MediatedNativeAdImage getFavicon() {
        return this.f57503e;
    }

    @Nullable
    public MediatedNativeAdImage getIcon() {
        return this.f57504f;
    }

    @Nullable
    public MediatedNativeAdImage getImage() {
        return this.f57505g;
    }

    @Nullable
    public MediatedNativeAdMedia getMedia() {
        return this.f57506h;
    }

    @Nullable
    public String getPrice() {
        return this.f57507i;
    }

    @Nullable
    public String getRating() {
        return this.f57508j;
    }

    @Nullable
    public String getReviewCount() {
        return this.f57509k;
    }

    @Nullable
    public String getSponsored() {
        return this.f57510l;
    }

    @Nullable
    public String getTitle() {
        return this.f57511m;
    }

    @Nullable
    public String getWarning() {
        return this.f57512n;
    }

    private MediatedNativeAdAssets(@NonNull Builder builder) {
        this.f57499a = builder.f57513a;
        this.f57500b = builder.f57514b;
        this.f57501c = builder.f57515c;
        this.f57502d = builder.f57516d;
        this.f57503e = builder.f57517e;
        this.f57504f = builder.f57518f;
        this.f57505g = builder.f57519g;
        this.f57506h = builder.f57520h;
        this.f57507i = builder.f57521i;
        this.f57508j = builder.f57522j;
        this.f57509k = builder.f57523k;
        this.f57510l = builder.f57524l;
        this.f57511m = builder.f57525m;
        this.f57512n = builder.f57526n;
    }
}
