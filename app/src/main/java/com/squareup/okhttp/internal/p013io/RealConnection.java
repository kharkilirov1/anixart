package com.squareup.okhttp.internal.p013io;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.Handshake;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.http.StreamAllocation;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class RealConnection implements Connection {

    /* renamed from: a */
    public final Route f25193a;

    /* renamed from: b */
    public Socket f25194b;

    /* renamed from: c */
    public Handshake f25195c;

    /* renamed from: d */
    public Protocol f25196d;

    /* renamed from: e */
    public int f25197e;

    /* renamed from: f */
    public final List<Reference<StreamAllocation>> f25198f;

    /* renamed from: g */
    public boolean f25199g;

    /* renamed from: h */
    public long f25200h;

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Connection{");
        m24u.append(this.f25193a.f24931a.f24770a.f24855d);
        m24u.append(":");
        m24u.append(this.f25193a.f24931a.f24770a.f24856e);
        m24u.append(", proxy=");
        m24u.append(this.f25193a.f24932b);
        m24u.append(" hostAddress=");
        m24u.append(this.f25193a.f24933c);
        m24u.append(" cipherSuite=");
        Handshake handshake = this.f25195c;
        m24u.append(handshake != null ? handshake.f24846a : "none");
        m24u.append(" protocol=");
        m24u.append(this.f25196d);
        m24u.append('}');
        return m24u.toString();
    }
}
