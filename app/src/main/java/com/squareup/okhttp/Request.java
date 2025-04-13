package com.squareup.okhttp;

import androidx.room.util.C0576a;
import com.squareup.okhttp.Headers;
import java.io.IOException;
import java.net.URI;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class Request {

    /* renamed from: a */
    public final HttpUrl f24914a;

    /* renamed from: b */
    public final String f24915b;

    /* renamed from: c */
    public final Headers f24916c;

    /* renamed from: d */
    public final RequestBody f24917d;

    /* renamed from: e */
    public final Object f24918e;

    /* renamed from: f */
    public volatile URI f24919f;

    public static class Builder {

        /* renamed from: a */
        public HttpUrl f24920a;

        /* renamed from: b */
        public String f24921b = "GET";

        /* renamed from: c */
        public Headers.Builder f24922c = new Headers.Builder();

        /* renamed from: d */
        public RequestBody f24923d;

        /* renamed from: e */
        public Object f24924e;

        /* renamed from: a */
        public Request m13925a() {
            if (this.f24920a != null) {
                return new Request(this, null);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: b */
        public Builder m13926b(String str, String str2) {
            Headers.Builder builder = this.f24922c;
            builder.m13896d(str, str2);
            builder.m13897e(str);
            builder.f24850a.add(str);
            builder.f24850a.add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public Builder m13927c(HttpUrl httpUrl) {
            if (httpUrl == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f24920a = httpUrl;
            return this;
        }
    }

    public Request(Builder builder, C24681 c24681) {
        this.f24914a = builder.f24920a;
        this.f24915b = builder.f24921b;
        this.f24916c = builder.f24922c.m13895c();
        this.f24917d = builder.f24923d;
        Object obj = builder.f24924e;
        this.f24918e = obj == null ? this : obj;
    }

    /* renamed from: a */
    public URI m13924a() throws IOException {
        try {
            URI uri = this.f24919f;
            if (uri != null) {
                return uri;
            }
            URI m13913p = this.f24914a.m13913p();
            this.f24919f = m13913p;
            return m13913p;
        } catch (IllegalStateException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Request{method=");
        m24u.append(this.f24915b);
        m24u.append(", url=");
        m24u.append(this.f24914a);
        m24u.append(", tag=");
        Object obj = this.f24918e;
        if (obj == this) {
            obj = null;
        }
        return C0576a.m4117p(m24u, obj, '}');
    }
}
