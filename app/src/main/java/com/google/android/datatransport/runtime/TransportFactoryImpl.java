package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import java.util.Set;

/* loaded from: classes.dex */
final class TransportFactoryImpl implements TransportFactory {

    /* renamed from: a */
    public final Set<Encoding> f9157a;

    /* renamed from: b */
    public final TransportContext f9158b;

    /* renamed from: c */
    public final TransportInternal f9159c;

    public TransportFactoryImpl(Set<Encoding> set, TransportContext transportContext, TransportInternal transportInternal) {
        this.f9157a = set;
        this.f9158b = transportContext;
        this.f9159c = transportInternal;
    }

    @Override // com.google.android.datatransport.TransportFactory
    /* renamed from: a */
    public <T> Transport<T> mo5401a(String str, Class<T> cls, Encoding encoding, Transformer<T, byte[]> transformer) {
        if (this.f9157a.contains(encoding)) {
            return new TransportImpl(this.f9158b, str, encoding, transformer, this.f9159c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", encoding, this.f9157a));
    }
}
