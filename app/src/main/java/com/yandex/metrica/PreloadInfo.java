package com.yandex.metrica;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class PreloadInfo {

    /* renamed from: a */
    public String f42250a;

    /* renamed from: b */
    public Map<String, String> f42251b;

    public static class Builder {

        /* renamed from: a */
        public String f42252a;

        /* renamed from: b */
        public Map<String, String> f42253b = new HashMap();

        public Builder(String str, C3086a c3086a) {
            this.f42252a = str;
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, null);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f42253b.put(str, str2);
            }
            return this;
        }
    }

    public PreloadInfo(Builder builder, C3086a c3086a) {
        this.f42250a = builder.f42252a;
        this.f42251b = Collections.unmodifiableMap(builder.f42253b);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, null);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f42251b;
    }

    public String getTrackingId() {
        return this.f42250a;
    }
}
