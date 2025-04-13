package com.google.android.play.core.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public abstract class Task<ResultT> {
    @NonNull
    /* renamed from: a */
    public abstract Task<ResultT> mo10997a(@NonNull OnCompleteListener<ResultT> onCompleteListener);

    @NonNull
    /* renamed from: b */
    public abstract Task<ResultT> mo10998b(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener);

    @NonNull
    /* renamed from: c */
    public abstract Task<ResultT> mo10999c(OnSuccessListener<? super ResultT> onSuccessListener);

    @NonNull
    /* renamed from: d */
    public abstract Task<ResultT> mo11000d(@NonNull Executor executor, @NonNull OnSuccessListener<? super ResultT> onSuccessListener);

    @Nullable
    /* renamed from: e */
    public abstract Exception mo11001e();

    @NonNull
    /* renamed from: f */
    public abstract ResultT mo11002f();

    /* renamed from: g */
    public abstract boolean mo11003g();

    /* renamed from: h */
    public abstract boolean mo11004h();
}
