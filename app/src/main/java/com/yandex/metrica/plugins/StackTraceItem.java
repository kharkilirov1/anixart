package com.yandex.metrica.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class StackTraceItem {

    /* renamed from: a */
    @Nullable
    public final String f47205a;

    /* renamed from: b */
    @Nullable
    public final String f47206b;

    /* renamed from: c */
    @Nullable
    public final Integer f47207c;

    /* renamed from: d */
    @Nullable
    public final Integer f47208d;

    /* renamed from: e */
    @Nullable
    public final String f47209e;

    public static class Builder {

        /* renamed from: a */
        @Nullable
        public String f47210a;

        /* renamed from: b */
        @Nullable
        public String f47211b;

        /* renamed from: c */
        @Nullable
        public Integer f47212c;

        /* renamed from: d */
        @Nullable
        public Integer f47213d;

        /* renamed from: e */
        @Nullable
        public String f47214e;

        @NonNull
        public StackTraceItem build() {
            return new StackTraceItem(this.f47210a, this.f47211b, this.f47212c, this.f47213d, this.f47214e, null);
        }

        @NonNull
        public Builder withClassName(@Nullable String str) {
            this.f47210a = str;
            return this;
        }

        @NonNull
        public Builder withColumn(@Nullable Integer num) {
            this.f47213d = num;
            return this;
        }

        @NonNull
        public Builder withFileName(@Nullable String str) {
            this.f47211b = str;
            return this;
        }

        @NonNull
        public Builder withLine(@Nullable Integer num) {
            this.f47212c = num;
            return this;
        }

        @NonNull
        public Builder withMethodName(@Nullable String str) {
            this.f47214e = str;
            return this;
        }
    }

    public StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, C4486a c4486a) {
        this.f47205a = str;
        this.f47206b = str2;
        this.f47207c = num;
        this.f47208d = num2;
        this.f47209e = str3;
    }

    @Nullable
    public String getClassName() {
        return this.f47205a;
    }

    @Nullable
    public Integer getColumn() {
        return this.f47208d;
    }

    @Nullable
    public String getFileName() {
        return this.f47206b;
    }

    @Nullable
    public Integer getLine() {
        return this.f47207c;
    }

    @Nullable
    public String getMethodName() {
        return this.f47209e;
    }
}
