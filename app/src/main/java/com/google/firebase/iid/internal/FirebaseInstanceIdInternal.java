package com.google.firebase.iid.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid-interop@@17.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public interface FirebaseInstanceIdInternal {

    /* compiled from: com.google.firebase:firebase-iid-interop@@17.1.0 */
    @KeepForSdk
    public interface NewTokenListener {
        @KeepForSdk
        /* renamed from: a */
        void mo12553a(String str);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    Task<String> mo12538a();

    @KeepForSdk
    /* renamed from: b */
    void mo12539b(NewTokenListener newTokenListener);

    @Nullable
    @KeepForSdk
    String getToken();
}
