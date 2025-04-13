package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
public final class zzw<TResult> extends Task<TResult> {

    /* renamed from: a */
    public final Object f17292a = new Object();

    /* renamed from: b */
    public final zzr<TResult> f17293b = new zzr<>();

    /* renamed from: c */
    @GuardedBy
    public boolean f17294c;

    /* renamed from: d */
    public volatile boolean f17295d;

    /* renamed from: e */
    @Nullable
    @GuardedBy
    public TResult f17296e;

    /* renamed from: f */
    @GuardedBy
    public Exception f17297f;

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: a */
    public final Task<TResult> mo9696a(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        this.f17293b.m9729a(new zzh(executor, onCanceledListener));
        m9736y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: b */
    public final Task<TResult> mo9697b(@NonNull Activity activity, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        zzj zzjVar = new zzj(TaskExecutors.f17241a, onCompleteListener);
        this.f17293b.m9729a(zzjVar);
        LifecycleFragment m7993c = LifecycleCallback.m7993c(activity);
        zzv zzvVar = (zzv) m7993c.mo8004i1("TaskOnStopCallback", zzv.class);
        if (zzvVar == null) {
            zzvVar = new zzv(m7993c);
        }
        synchronized (zzvVar.f17291c) {
            zzvVar.f17291c.add(new WeakReference<>(zzjVar));
        }
        m9736y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: c */
    public final Task<TResult> mo9698c(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f17293b.m9729a(new zzj(TaskExecutors.f17241a, onCompleteListener));
        m9736y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: d */
    public final Task<TResult> mo9699d(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f17293b.m9729a(new zzj(executor, onCompleteListener));
        m9736y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: e */
    public final Task<TResult> mo9700e(@NonNull OnFailureListener onFailureListener) {
        mo9701f(TaskExecutors.f17241a, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: f */
    public final Task<TResult> mo9701f(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.f17293b.m9729a(new zzl(executor, onFailureListener));
        m9736y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: g */
    public final Task<TResult> mo9702g(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        this.f17293b.m9729a(new zzn(executor, onSuccessListener));
        m9736y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: h */
    public final <TContinuationResult> Task<TContinuationResult> mo9703h(@NonNull Continuation<TResult, TContinuationResult> continuation) {
        return mo9704i(TaskExecutors.f17241a, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: i */
    public final <TContinuationResult> Task<TContinuationResult> mo9704i(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation) {
        zzw zzwVar = new zzw();
        this.f17293b.m9729a(new zzd(executor, continuation, zzwVar));
        m9736y();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: j */
    public final <TContinuationResult> Task<TContinuationResult> mo9705j(@NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        return mo9706k(TaskExecutors.f17241a, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: k */
    public final <TContinuationResult> Task<TContinuationResult> mo9706k(@NonNull Executor executor, @NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        zzw zzwVar = new zzw();
        this.f17293b.m9729a(new zzf(executor, continuation, zzwVar));
        m9736y();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    @Nullable
    /* renamed from: l */
    public final Exception mo9707l() {
        Exception exc;
        synchronized (this.f17292a) {
            exc = this.f17297f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: m */
    public final TResult mo9708m() {
        TResult tresult;
        synchronized (this.f17292a) {
            Preconditions.m8134i(this.f17294c, "Task is not yet complete");
            if (this.f17295d) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = this.f17297f;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            tresult = this.f17296e;
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: n */
    public final <X extends Throwable> TResult mo9709n(@NonNull Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f17292a) {
            Preconditions.m8134i(this.f17294c, "Task is not yet complete");
            if (this.f17295d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (cls.isInstance(this.f17297f)) {
                throw cls.cast(this.f17297f);
            }
            Exception exc = this.f17297f;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            tresult = this.f17296e;
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: o */
    public final boolean mo9710o() {
        return this.f17295d;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: p */
    public final boolean mo9711p() {
        boolean z;
        synchronized (this.f17292a) {
            z = this.f17294c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: q */
    public final boolean mo9712q() {
        boolean z;
        synchronized (this.f17292a) {
            z = false;
            if (this.f17294c && !this.f17295d && this.f17297f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: r */
    public final <TContinuationResult> Task<TContinuationResult> mo9713r(@NonNull SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        Executor executor = TaskExecutors.f17241a;
        zzw zzwVar = new zzw();
        this.f17293b.m9729a(new zzp(executor, successContinuation, zzwVar));
        m9736y();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: s */
    public final <TContinuationResult> Task<TContinuationResult> mo9714s(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        zzw zzwVar = new zzw();
        this.f17293b.m9729a(new zzp(executor, successContinuation, zzwVar));
        m9736y();
        return zzwVar;
    }

    /* renamed from: t */
    public final void m9731t(@NonNull Exception exc) {
        Preconditions.m8132g(exc, "Exception must not be null");
        synchronized (this.f17292a) {
            m9735x();
            this.f17294c = true;
            this.f17297f = exc;
        }
        this.f17293b.m9730b(this);
    }

    /* renamed from: u */
    public final void m9732u(@Nullable TResult tresult) {
        synchronized (this.f17292a) {
            m9735x();
            this.f17294c = true;
            this.f17296e = tresult;
        }
        this.f17293b.m9730b(this);
    }

    /* renamed from: v */
    public final boolean m9733v() {
        synchronized (this.f17292a) {
            if (this.f17294c) {
                return false;
            }
            this.f17294c = true;
            this.f17295d = true;
            this.f17293b.m9730b(this);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean m9734w(@Nullable TResult tresult) {
        synchronized (this.f17292a) {
            if (this.f17294c) {
                return false;
            }
            this.f17294c = true;
            this.f17296e = tresult;
            this.f17293b.m9730b(this);
            return true;
        }
    }

    @GuardedBy
    /* renamed from: x */
    public final void m9735x() {
        if (this.f17294c) {
            int i2 = DuplicateTaskCompletionException.f17239b;
            if (!mo9711p()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception mo9707l = mo9707l();
            String concat = mo9707l != null ? "failure" : mo9712q() ? "result ".concat(String.valueOf(mo9708m())) : mo9710o() ? "cancellation" : "unknown issue";
        }
    }

    /* renamed from: y */
    public final void m9736y() {
        synchronized (this.f17292a) {
            if (this.f17294c) {
                this.f17293b.m9730b(this);
            }
        }
    }
}
