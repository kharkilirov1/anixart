package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzbh implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ zzbi f22400a;

    public zzbh(zzbi zzbiVar) {
        this.f22400a = zzbiVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    /* renamed from: a */
    public final void mo7970a(boolean z) {
        if (!z) {
            Objects.requireNonNull(this.f22400a);
            Objects.requireNonNull(this.f22400a);
        } else {
            Objects.requireNonNull(this.f22400a);
            zzam zzamVar = this.f22400a.f22401a;
            zzamVar.f22372d.removeCallbacks(zzamVar.f22373e);
        }
    }
}
