package io.grpc.internal;

import io.grpc.NameResolverProvider;

/* loaded from: classes3.dex */
public final class DnsNameResolverProvider extends NameResolverProvider {
    @Override // io.grpc.NameResolver.Factory
    /* renamed from: a */
    public String mo30927a() {
        return "dns";
    }

    @Override // io.grpc.NameResolverProvider
    /* renamed from: b */
    public boolean mo30928b() {
        return true;
    }

    @Override // io.grpc.NameResolverProvider
    /* renamed from: c */
    public int mo30929c() {
        return 5;
    }
}
