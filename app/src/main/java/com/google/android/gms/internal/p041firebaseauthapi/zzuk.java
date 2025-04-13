package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.MainThread;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzuk extends LifecycleCallback {

    /* renamed from: c */
    public final List f16851c;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @MainThread
    /* renamed from: j */
    public final void mo8002j() {
        synchronized (this.f16851c) {
            this.f16851c.clear();
        }
    }
}
