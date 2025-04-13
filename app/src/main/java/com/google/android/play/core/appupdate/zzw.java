package com.google.android.play.core.appupdate;

import com.google.android.play.core.install.model.AppUpdateType;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzw extends AppUpdateOptions {

    /* renamed from: a */
    public final int f19643a;

    /* renamed from: b */
    public final boolean f19644b;

    public /* synthetic */ zzw(int i2, boolean z) {
        this.f19643a = i2;
        this.f19644b = z;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions
    /* renamed from: a */
    public final boolean mo10654a() {
        return this.f19644b;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions
    @AppUpdateType
    /* renamed from: b */
    public final int mo10655b() {
        return this.f19643a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppUpdateOptions) {
            AppUpdateOptions appUpdateOptions = (AppUpdateOptions) obj;
            if (this.f19643a == appUpdateOptions.mo10655b() && this.f19644b == appUpdateOptions.mo10654a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f19643a ^ 1000003) * 1000003) ^ (true != this.f19644b ? 1237 : 1231);
    }

    public final String toString() {
        int i2 = this.f19643a;
        boolean z = this.f19644b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i2);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
