package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zak extends zap {
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: a */
    public final void mo7994a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: i */
    public final void mo8001i() {
        this.f15596c = true;
        boolean z = this.f15596c;
        StringBuilder sb = new StringBuilder("null".length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append("null");
        Log.d("AutoManageHelper", sb.toString());
        if (this.f15597d.get() == null) {
            throw null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public final void mo8002j() {
        this.f15596c = false;
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    /* renamed from: l */
    public final void mo8017l(ConnectionResult connectionResult, int i2) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i2 >= 0) {
            throw null;
        }
        Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
    }

    @Override // com.google.android.gms.common.api.internal.zap
    /* renamed from: m */
    public final void mo8018m() {
        throw null;
    }
}
