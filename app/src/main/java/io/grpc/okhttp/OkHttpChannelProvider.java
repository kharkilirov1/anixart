package io.grpc.okhttp;

import io.grpc.Internal;
import io.grpc.ManagedChannelProvider;

@Internal
/* loaded from: classes3.dex */
public final class OkHttpChannelProvider extends ManagedChannelProvider {
    @Override // io.grpc.ManagedChannelProvider
    /* renamed from: a */
    public int mo30895a() {
        boolean z = false;
        try {
            Class.forName("android.app.Application", false, OkHttpChannelProvider.class.getClassLoader());
            z = true;
        } catch (Exception unused) {
        }
        return z ? 8 : 3;
    }
}
