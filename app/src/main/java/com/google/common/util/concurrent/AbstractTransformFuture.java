package com.google.common.util.concurrent;

import androidx.room.util.C0576a;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import com.google.errorprone.annotations.ForOverride;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes2.dex */
abstract class AbstractTransformFuture<I, O, F, T> extends FluentFuture.TrustedFuture<O> implements Runnable {

    /* renamed from: k */
    public static final /* synthetic */ int f22117k = 0;

    /* renamed from: i */
    @NullableDecl
    public ListenableFuture<? extends I> f22118i;

    /* renamed from: j */
    @NullableDecl
    public F f22119j;

    public static final class AsyncTransformFuture<I, O> extends AbstractTransformFuture<I, O, AsyncFunction<? super I, ? extends O>, ListenableFuture<? extends O>> {
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        /* renamed from: s */
        public Object mo12169s(Object obj, @NullableDecl Object obj2) throws Exception {
            AsyncFunction asyncFunction = (AsyncFunction) obj;
            ListenableFuture<O> apply = asyncFunction.apply(obj2);
            Preconditions.m11188l(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return apply;
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        /* renamed from: t */
        public void mo12170t(Object obj) {
            mo12151p((ListenableFuture) obj);
        }
    }

    public static final class TransformFuture<I, O> extends AbstractTransformFuture<I, O, Function<? super I, ? extends O>, O> {
        public TransformFuture(ListenableFuture<? extends I> listenableFuture, Function<? super I, ? extends O> function) {
            super(listenableFuture, function);
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        @NullableDecl
        /* renamed from: s */
        public Object mo12169s(Object obj, @NullableDecl Object obj2) throws Exception {
            return ((Function) obj).apply(obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        /* renamed from: t */
        public void mo12170t(@NullableDecl O o) {
            mo12149n(o);
        }
    }

    public AbstractTransformFuture(ListenableFuture<? extends I> listenableFuture, F f2) {
        Objects.requireNonNull(listenableFuture);
        this.f22118i = listenableFuture;
        Objects.requireNonNull(f2);
        this.f22119j = f2;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: c */
    public final void mo12134c() {
        m12147k(this.f22118i);
        this.f22118i = null;
        this.f22119j = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: l */
    public String mo12135l() {
        String str;
        ListenableFuture<? extends I> listenableFuture = this.f22118i;
        F f2 = this.f22119j;
        String mo12135l = super.mo12135l();
        if (listenableFuture != null) {
            String valueOf = String.valueOf(listenableFuture);
            str = C0576a.m4115n(valueOf.length() + 16, "inputFuture=[", valueOf, "], ");
        } else {
            str = "";
        }
        if (f2 != null) {
            String valueOf2 = String.valueOf(f2);
            return C1008a.m6437d(valueOf2.length() + C0576a.m4106e(str, 11), str, "function=[", valueOf2, "]");
        }
        if (mo12135l == null) {
            return null;
        }
        String valueOf3 = String.valueOf(str);
        return mo12135l.length() != 0 ? valueOf3.concat(mo12135l) : new String(valueOf3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture<? extends I> listenableFuture = this.f22118i;
        F f2 = this.f22119j;
        if ((isCancelled() | (listenableFuture == null)) || (f2 == null)) {
            return;
        }
        this.f22118i = null;
        if (listenableFuture.isCancelled()) {
            mo12151p(listenableFuture);
            return;
        }
        try {
            try {
                Object mo12169s = mo12169s(f2, Futures.m12193a(listenableFuture));
                this.f22119j = null;
                mo12170t(mo12169s);
            } catch (Throwable th) {
                try {
                    mo12150o(th);
                } finally {
                    this.f22119j = null;
                }
            }
        } catch (Error e2) {
            mo12150o(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e3) {
            mo12150o(e3);
        } catch (ExecutionException e4) {
            mo12150o(e4.getCause());
        }
    }

    @NullableDecl
    @ForOverride
    /* renamed from: s */
    public abstract T mo12169s(F f2, @NullableDecl I i2) throws Exception;

    @ForOverride
    /* renamed from: t */
    public abstract void mo12170t(@NullableDecl T t);
}
