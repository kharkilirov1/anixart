package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.SendRequest;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_SendRequest extends SendRequest {

    /* renamed from: a */
    public final TransportContext f9121a;

    /* renamed from: b */
    public final String f9122b;

    /* renamed from: c */
    public final Event<?> f9123c;

    /* renamed from: d */
    public final Transformer<?, byte[]> f9124d;

    /* renamed from: e */
    public final Encoding f9125e;

    public static final class Builder extends SendRequest.Builder {

        /* renamed from: a */
        public TransportContext f9126a;

        /* renamed from: b */
        public String f9127b;

        /* renamed from: c */
        public Event<?> f9128c;

        /* renamed from: d */
        public Transformer<?, byte[]> f9129d;

        /* renamed from: e */
        public Encoding f9130e;
    }

    public AutoValue_SendRequest(TransportContext transportContext, String str, Event event, Transformer transformer, Encoding encoding, C09061 c09061) {
        this.f9121a = transportContext;
        this.f9122b = str;
        this.f9123c = event;
        this.f9124d = transformer;
        this.f9125e = encoding;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    /* renamed from: a */
    public Encoding mo5499a() {
        return this.f9125e;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    /* renamed from: b */
    public Event<?> mo5500b() {
        return this.f9123c;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    /* renamed from: c */
    public Transformer<?, byte[]> mo5501c() {
        return this.f9124d;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    /* renamed from: d */
    public TransportContext mo5502d() {
        return this.f9121a;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    /* renamed from: e */
    public String mo5503e() {
        return this.f9122b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendRequest)) {
            return false;
        }
        SendRequest sendRequest = (SendRequest) obj;
        return this.f9121a.equals(sendRequest.mo5502d()) && this.f9122b.equals(sendRequest.mo5503e()) && this.f9123c.equals(sendRequest.mo5500b()) && this.f9124d.equals(sendRequest.mo5501c()) && this.f9125e.equals(sendRequest.mo5499a());
    }

    public int hashCode() {
        return ((((((((this.f9121a.hashCode() ^ 1000003) * 1000003) ^ this.f9122b.hashCode()) * 1000003) ^ this.f9123c.hashCode()) * 1000003) ^ this.f9124d.hashCode()) * 1000003) ^ this.f9125e.hashCode();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("SendRequest{transportContext=");
        m24u.append(this.f9121a);
        m24u.append(", transportName=");
        m24u.append(this.f9122b);
        m24u.append(", event=");
        m24u.append(this.f9123c);
        m24u.append(", transformer=");
        m24u.append(this.f9124d);
        m24u.append(", encoding=");
        m24u.append(this.f9125e);
        m24u.append("}");
        return m24u.toString();
    }
}
