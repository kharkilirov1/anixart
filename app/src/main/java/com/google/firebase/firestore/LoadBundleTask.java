package com.google.firebase.firestore;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class LoadBundleTask extends Task<LoadBundleTaskProgress> {

    /* renamed from: a */
    public final Task<LoadBundleTaskProgress> f22651a = new TaskCompletionSource().f17240a;

    public static class ManagedListener {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            throw null;
        }
    }

    @RestrictTo
    public LoadBundleTask() {
        new ArrayDeque();
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: a */
    public Task<LoadBundleTaskProgress> mo9696a(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        return this.f22651a.mo9696a(executor, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: b */
    public Task<LoadBundleTaskProgress> mo9697b(@NonNull Activity activity, @NonNull OnCompleteListener<LoadBundleTaskProgress> onCompleteListener) {
        return this.f22651a.mo9697b(activity, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: c */
    public Task<LoadBundleTaskProgress> mo9698c(@NonNull OnCompleteListener<LoadBundleTaskProgress> onCompleteListener) {
        return this.f22651a.mo9698c(onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: d */
    public Task<LoadBundleTaskProgress> mo9699d(@NonNull Executor executor, @NonNull OnCompleteListener<LoadBundleTaskProgress> onCompleteListener) {
        return this.f22651a.mo9699d(executor, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: e */
    public Task<LoadBundleTaskProgress> mo9700e(@NonNull OnFailureListener onFailureListener) {
        return this.f22651a.mo9700e(onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: f */
    public Task<LoadBundleTaskProgress> mo9701f(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        return this.f22651a.mo9701f(executor, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: g */
    public Task<LoadBundleTaskProgress> mo9702g(@NonNull Executor executor, @NonNull OnSuccessListener<? super LoadBundleTaskProgress> onSuccessListener) {
        return this.f22651a.mo9702g(executor, onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: h */
    public <TContinuationResult> Task<TContinuationResult> mo9703h(@NonNull Continuation<LoadBundleTaskProgress, TContinuationResult> continuation) {
        return this.f22651a.mo9703h(continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: i */
    public <TContinuationResult> Task<TContinuationResult> mo9704i(@NonNull Executor executor, @NonNull Continuation<LoadBundleTaskProgress, TContinuationResult> continuation) {
        return this.f22651a.mo9704i(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: j */
    public <TContinuationResult> Task<TContinuationResult> mo9705j(@NonNull Continuation<LoadBundleTaskProgress, Task<TContinuationResult>> continuation) {
        return this.f22651a.mo9705j(continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: k */
    public <TContinuationResult> Task<TContinuationResult> mo9706k(@NonNull Executor executor, @NonNull Continuation<LoadBundleTaskProgress, Task<TContinuationResult>> continuation) {
        return this.f22651a.mo9706k(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @Nullable
    /* renamed from: l */
    public Exception mo9707l() {
        return this.f22651a.mo9707l();
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: m */
    public LoadBundleTaskProgress mo9708m() {
        return this.f22651a.mo9708m();
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: n */
    public LoadBundleTaskProgress mo9709n(@NonNull Class cls) throws Throwable {
        return this.f22651a.mo9709n(cls);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: o */
    public boolean mo9710o() {
        return this.f22651a.mo9710o();
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: p */
    public boolean mo9711p() {
        return this.f22651a.mo9711p();
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: q */
    public boolean mo9712q() {
        return this.f22651a.mo9712q();
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: r */
    public <TContinuationResult> Task<TContinuationResult> mo9713r(@NonNull SuccessContinuation<LoadBundleTaskProgress, TContinuationResult> successContinuation) {
        return this.f22651a.mo9713r(successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* renamed from: s */
    public <TContinuationResult> Task<TContinuationResult> mo9714s(@NonNull Executor executor, @NonNull SuccessContinuation<LoadBundleTaskProgress, TContinuationResult> successContinuation) {
        return this.f22651a.mo9714s(executor, successContinuation);
    }
}
