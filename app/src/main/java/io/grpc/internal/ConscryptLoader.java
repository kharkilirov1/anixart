package io.grpc.internal;

import java.security.Provider;

/* loaded from: classes3.dex */
public final class ConscryptLoader {
    static {
        try {
            Class<?> cls = Class.forName("org.conscrypt.Conscrypt");
            cls.getMethod("newProvider", new Class[0]);
            cls.getMethod("isConscrypt", Provider.class);
        } catch (ClassNotFoundException unused) {
        } catch (NoSuchMethodException e2) {
            throw new AssertionError(e2);
        }
    }
}
