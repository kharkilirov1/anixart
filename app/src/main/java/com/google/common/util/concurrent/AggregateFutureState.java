package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

@ReflectionSupport
@GwtCompatible
/* loaded from: classes2.dex */
abstract class AggregateFutureState<OutputT> extends AbstractFuture.TrustedFuture<OutputT> {

    /* renamed from: k */
    public static final AtomicHelper f22125k;

    /* renamed from: l */
    public static final Logger f22126l = Logger.getLogger(AggregateFutureState.class.getName());

    /* renamed from: i */
    public volatile Set<Throwable> f22127i;

    /* renamed from: j */
    public volatile int f22128j;

    public static abstract class AtomicHelper {
        public AtomicHelper() {
        }

        public AtomicHelper(C19691 c19691) {
        }
    }

    public static final class SafeAtomicHelper extends AtomicHelper {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<AggregateFutureState, Set<Throwable>> f22129a;

        /* renamed from: b */
        public final AtomicIntegerFieldUpdater<AggregateFutureState> f22130b;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super(null);
            this.f22129a = atomicReferenceFieldUpdater;
            this.f22130b = atomicIntegerFieldUpdater;
        }
    }

    public static final class SynchronizedAtomicHelper extends AtomicHelper {
        public SynchronizedAtomicHelper() {
            super(null);
        }

        public SynchronizedAtomicHelper(C19691 c19691) {
            super(null);
        }
    }

    static {
        AtomicHelper synchronizedAtomicHelper;
        Throwable th = null;
        try {
            synchronizedAtomicHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(AggregateFutureState.class, Set.class, "i"), AtomicIntegerFieldUpdater.newUpdater(AggregateFutureState.class, "j"));
        } catch (Throwable th2) {
            th = th2;
            synchronizedAtomicHelper = new SynchronizedAtomicHelper(null);
        }
        f22125k = synchronizedAtomicHelper;
        if (th != null) {
            f22126l.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
