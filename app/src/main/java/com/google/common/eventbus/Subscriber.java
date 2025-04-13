package com.google.common.eventbus;

import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
class Subscriber {

    /* renamed from: com.google.common.eventbus.Subscriber$1 */
    class RunnableC18211 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    @VisibleForTesting
    public static final class SynchronizedSubscriber extends Subscriber {
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof Subscriber)) {
            return false;
        }
        Objects.requireNonNull((Subscriber) obj);
        throw null;
    }

    public final int hashCode() {
        throw null;
    }
}
