package com.squareup.okhttp;

import androidx.room.util.C0576a;
import com.squareup.okhttp.Headers;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class Response {

    /* renamed from: a */
    public final Request f24925a;

    /* renamed from: b */
    public final Protocol f24926b;

    /* renamed from: c */
    public final int f24927c;

    /* renamed from: d */
    public final String f24928d;

    public static class Builder {

        /* renamed from: a */
        public int f24929a = -1;

        /* renamed from: b */
        public Headers.Builder f24930b = new Headers.Builder();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Response{protocol=");
        m24u.append(this.f24926b);
        m24u.append(", code=");
        m24u.append(this.f24927c);
        m24u.append(", message=");
        m24u.append(this.f24928d);
        m24u.append(", url=");
        return C0576a.m4118q(m24u, this.f24925a.f24914a.f24860i, '}');
    }
}
