package com.google.android.datatransport.runtime;

import androidx.room.util.C0576a;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.runtime.AutoValue_SendRequest;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
final class TransportImpl<T> implements Transport<T> {

    /* renamed from: a */
    public final TransportContext f9160a;

    /* renamed from: b */
    public final String f9161b;

    /* renamed from: c */
    public final Encoding f9162c;

    /* renamed from: d */
    public final Transformer<T, byte[]> f9163d;

    /* renamed from: e */
    public final TransportInternal f9164e;

    public TransportImpl(TransportContext transportContext, String str, Encoding encoding, Transformer<T, byte[]> transformer, TransportInternal transportInternal) {
        this.f9160a = transportContext;
        this.f9161b = str;
        this.f9162c = encoding;
        this.f9163d = transformer;
        this.f9164e = transportInternal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.datatransport.Transport
    /* renamed from: a */
    public void mo5400a(Event<T> event) {
        C0576a c0576a = C0576a.f5947a;
        TransportInternal transportInternal = this.f9164e;
        AutoValue_SendRequest.Builder builder = new AutoValue_SendRequest.Builder();
        TransportContext transportContext = this.f9160a;
        Objects.requireNonNull(transportContext, "Null transportContext");
        builder.f9126a = transportContext;
        builder.f9128c = event;
        String str = this.f9161b;
        Objects.requireNonNull(str, "Null transportName");
        builder.f9127b = str;
        Transformer<T, byte[]> transformer = this.f9163d;
        Objects.requireNonNull(transformer, "Null transformer");
        builder.f9129d = transformer;
        Encoding encoding = this.f9162c;
        Objects.requireNonNull(encoding, "Null encoding");
        builder.f9130e = encoding;
        String str2 = builder.f9126a == null ? " transportContext" : "";
        if (builder.f9127b == null) {
            str2 = C0000a.m14k(str2, " transportName");
        }
        if (builder.f9128c == null) {
            str2 = C0000a.m14k(str2, " event");
        }
        if (builder.f9129d == null) {
            str2 = C0000a.m14k(str2, " transformer");
        }
        if (builder.f9130e == null) {
            str2 = C0000a.m14k(str2, " encoding");
        }
        if (!str2.isEmpty()) {
            throw new IllegalStateException(C0000a.m14k("Missing required properties:", str2));
        }
        transportInternal.mo5520a(new AutoValue_SendRequest(builder.f9126a, builder.f9127b, builder.f9128c, builder.f9129d, builder.f9130e, null), c0576a);
    }
}
