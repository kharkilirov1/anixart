package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.AppUpdateOptions;
import p000a.C0000a;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzu extends AppUpdateOptions.Builder {

    /* renamed from: a */
    public Integer f19641a;

    /* renamed from: b */
    public Boolean f19642b;

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    /* renamed from: a */
    public final AppUpdateOptions mo10656a() {
        Integer num = this.f19641a;
        if (num != null && this.f19642b != null) {
            return new zzw(num.intValue(), this.f19642b.booleanValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.f19641a == null) {
            sb.append(" appUpdateType");
        }
        if (this.f19642b == null) {
            sb.append(" allowAssetPackDeletion");
        }
        String valueOf = String.valueOf(sb);
        throw new IllegalStateException(C0000a.m20q(new StringBuilder(valueOf.length() + 28), "Missing required properties:", valueOf));
    }
}
