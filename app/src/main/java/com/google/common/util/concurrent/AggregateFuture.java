package com.google.common.util.concurrent;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;
import java.util.Objects;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes2.dex */
abstract class AggregateFuture<InputT, OutputT> extends AggregateFutureState<OutputT> {

    /* renamed from: n */
    public static final Logger f22120n = Logger.getLogger(AggregateFuture.class.getName());

    /* renamed from: m */
    @NullableDecl
    public ImmutableCollection<? extends ListenableFuture<? extends InputT>> f22121m;

    /* renamed from: com.google.common.util.concurrent.AggregateFuture$1 */
    class RunnableC19671 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.AggregateFuture$2 */
    class RunnableC19682 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            AggregateFuture.m12171s(null, null);
            throw null;
        }
    }

    public enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    /* renamed from: s */
    public static void m12171s(AggregateFuture aggregateFuture, ImmutableCollection immutableCollection) {
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: c */
    public final void mo12134c() {
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.f22121m;
        mo12172t(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (immutableCollection != null)) {
            boolean m12152q = m12152q();
            UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it = immutableCollection.iterator();
            while (it.hasNext()) {
                it.next().cancel(m12152q);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: l */
    public final String mo12135l() {
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.f22121m;
        if (immutableCollection == null) {
            return super.mo12135l();
        }
        String valueOf = String.valueOf(immutableCollection);
        return C0576a.m4114m(valueOf.length() + 8, "futures=", valueOf);
    }

    @ForOverride
    @OverridingMethodsMustInvokeSuper
    /* renamed from: t */
    public void mo12172t(ReleaseResourcesReason releaseResourcesReason) {
        Objects.requireNonNull(releaseResourcesReason);
        this.f22121m = null;
    }
}
