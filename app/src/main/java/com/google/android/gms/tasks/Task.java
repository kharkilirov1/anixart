package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
public abstract class Task<TResult> {
    @NonNull
    /* renamed from: a */
    public Task<TResult> mo9696a(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    /* renamed from: b */
    public Task<TResult> mo9697b(@NonNull Activity activity, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: c */
    public Task<TResult> mo9698c(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: d */
    public Task<TResult> mo9699d(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: e */
    public abstract Task<TResult> mo9700e(@NonNull OnFailureListener onFailureListener);

    @NonNull
    /* renamed from: f */
    public abstract Task<TResult> mo9701f(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener);

    @NonNull
    /* renamed from: g */
    public abstract Task<TResult> mo9702g(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener);

    @NonNull
    /* renamed from: h */
    public <TContinuationResult> Task<TContinuationResult> mo9703h(@NonNull Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: i */
    public <TContinuationResult> Task<TContinuationResult> mo9704i(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: j */
    public <TContinuationResult> Task<TContinuationResult> mo9705j(@NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @NonNull
    /* renamed from: k */
    public <TContinuationResult> Task<TContinuationResult> mo9706k(@NonNull Executor executor, @NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @Nullable
    /* renamed from: l */
    public abstract Exception mo9707l();

    /* renamed from: m */
    public abstract TResult mo9708m();

    /* renamed from: n */
    public abstract <X extends Throwable> TResult mo9709n(@NonNull Class<X> cls) throws Throwable;

    /* renamed from: o */
    public abstract boolean mo9710o();

    /* renamed from: p */
    public abstract boolean mo9711p();

    /* renamed from: q */
    public abstract boolean mo9712q();

    @NonNull
    /* renamed from: r */
    public <TContinuationResult> Task<TContinuationResult> mo9713r(@NonNull SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @NonNull
    /* renamed from: s */
    public <TContinuationResult> Task<TContinuationResult> mo9714s(@NonNull Executor executor, @NonNull SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
