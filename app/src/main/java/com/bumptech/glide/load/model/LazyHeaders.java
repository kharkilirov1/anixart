package com.bumptech.glide.load.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class LazyHeaders implements Headers {

    /* renamed from: b */
    public final Map<String, List<LazyHeaderFactory>> f8443b;

    /* renamed from: c */
    public volatile Map<String, String> f8444c;

    public static final class Builder {

        /* renamed from: b */
        public static final Map<String, List<LazyHeaderFactory>> f8445b;

        /* renamed from: a */
        public Map<String, List<LazyHeaderFactory>> f8446a = f8445b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = property.charAt(i2);
                    if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                        sb.append(charAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new StringHeaderFactory(property)));
            }
            f8445b = Collections.unmodifiableMap(hashMap);
        }
    }

    public static final class StringHeaderFactory implements LazyHeaderFactory {

        /* renamed from: a */
        @NonNull
        public final String f8447a;

        public StringHeaderFactory(@NonNull String str) {
            this.f8447a = str;
        }

        @Override // com.bumptech.glide.load.model.LazyHeaderFactory
        /* renamed from: a */
        public String mo5142a() {
            return this.f8447a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof StringHeaderFactory) {
                return this.f8447a.equals(((StringHeaderFactory) obj).f8447a);
            }
            return false;
        }

        public int hashCode() {
            return this.f8447a.hashCode();
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("StringHeaderFactory{value='");
            m24u.append(this.f8447a);
            m24u.append('\'');
            m24u.append('}');
            return m24u.toString();
        }
    }

    public LazyHeaders(Map<String, List<LazyHeaderFactory>> map) {
        this.f8443b = Collections.unmodifiableMap(map);
    }

    @Override // com.bumptech.glide.load.model.Headers
    /* renamed from: a */
    public Map<String, String> mo5141a() {
        if (this.f8444c == null) {
            synchronized (this) {
                if (this.f8444c == null) {
                    this.f8444c = Collections.unmodifiableMap(m5143b());
                }
            }
        }
        return this.f8444c;
    }

    /* renamed from: b */
    public final Map<String, String> m5143b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<LazyHeaderFactory>> entry : this.f8443b.entrySet()) {
            List<LazyHeaderFactory> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i2 = 0; i2 < size; i2++) {
                String mo5142a = value.get(i2).mo5142a();
                if (!TextUtils.isEmpty(mo5142a)) {
                    sb.append(mo5142a);
                    if (i2 != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LazyHeaders) {
            return this.f8443b.equals(((LazyHeaders) obj).f8443b);
        }
        return false;
    }

    public int hashCode() {
        return this.f8443b.hashCode();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("LazyHeaders{headers=");
        m24u.append(this.f8443b);
        m24u.append('}');
        return m24u.toString();
    }
}
