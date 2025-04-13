package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import java.util.Objects;

@GwtIncompatible
/* loaded from: classes.dex */
public final class RemovalListeners {

    /* renamed from: com.google.common.cache.RemovalListeners$1 */
    class C16121 implements RemovalListener<Object, Object> {

        /* renamed from: com.google.common.cache.RemovalListeners$1$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ C16121 f20763b;

            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(this.f20763b);
                throw null;
            }
        }

        @Override // com.google.common.cache.RemovalListener
        /* renamed from: a */
        public void mo11234a(RemovalNotification<Object, Object> removalNotification) {
            throw null;
        }
    }
}
