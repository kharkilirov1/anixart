package com.google.android.play.core.tasks;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.zzci;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzm<ResultT> extends Task<ResultT> {

    /* renamed from: a */
    public final Object f20326a = new Object();

    /* renamed from: b */
    public final zzh<ResultT> f20327b = new zzh<>();

    /* renamed from: c */
    @GuardedBy
    public boolean f20328c;

    /* renamed from: d */
    @GuardedBy
    public ResultT f20329d;

    /* renamed from: e */
    @GuardedBy
    public Exception f20330e;

    @Override // com.google.android.play.core.tasks.Task
    /* renamed from: a */
    public final Task<ResultT> mo10997a(OnCompleteListener<ResultT> onCompleteListener) {
        this.f20327b.m11010a(new zzb(TaskExecutors.f20304a, onCompleteListener));
        m11018k();
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    /* renamed from: b */
    public final Task<ResultT> mo10998b(Executor executor, OnFailureListener onFailureListener) {
        this.f20327b.m11010a(new zzd(executor, onFailureListener));
        m11018k();
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    /* renamed from: c */
    public final Task<ResultT> mo10999c(OnSuccessListener<? super ResultT> onSuccessListener) {
        mo11000d(TaskExecutors.f20304a, onSuccessListener);
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    /* renamed from: d */
    public final Task<ResultT> mo11000d(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener) {
        this.f20327b.m11010a(new zzf(executor, onSuccessListener));
        m11018k();
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    @Nullable
    /* renamed from: e */
    public final Exception mo11001e() {
        Exception exc;
        synchronized (this.f20326a) {
            exc = this.f20330e;
        }
        return exc;
    }

    @Override // com.google.android.play.core.tasks.Task
    /* renamed from: f */
    public final ResultT mo11002f() {
        ResultT resultt;
        synchronized (this.f20326a) {
            zzci.m10891b(this.f20328c, "Task is not yet complete");
            Exception exc = this.f20330e;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            resultt = this.f20329d;
        }
        return resultt;
    }

    @Override // com.google.android.play.core.tasks.Task
    /* renamed from: g */
    public final boolean mo11003g() {
        boolean z;
        synchronized (this.f20326a) {
            z = this.f20328c;
        }
        return z;
    }

    @Override // com.google.android.play.core.tasks.Task
    /* renamed from: h */
    public final boolean mo11004h() {
        boolean z;
        synchronized (this.f20326a) {
            z = false;
            if (this.f20328c && this.f20330e == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: i */
    public final void m11016i(Exception exc) {
        synchronized (this.f20326a) {
            zzci.m10891b(!this.f20328c, "Task is already complete");
            this.f20328c = true;
            this.f20330e = exc;
        }
        this.f20327b.m11011b(this);
    }

    /* renamed from: j */
    public final void m11017j(ResultT resultt) {
        synchronized (this.f20326a) {
            zzci.m10891b(!this.f20328c, "Task is already complete");
            this.f20328c = true;
            this.f20329d = resultt;
        }
        this.f20327b.m11011b(this);
    }

    /* renamed from: k */
    public final void m11018k() {
        synchronized (this.f20326a) {
            if (this.f20328c) {
                this.f20327b.m11011b(this);
            }
        }
    }
}
