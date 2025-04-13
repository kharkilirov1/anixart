package com.google.android.play.core.install;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.internal.zzag;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public abstract class InstallState {
    /* renamed from: f */
    public static InstallState m10824f(@NonNull Intent intent, @NonNull zzag zzagVar) {
        zzagVar.m10834a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        zzagVar.m10834a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        zzagVar.m10834a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        return new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
    }

    /* renamed from: a */
    public abstract long mo10825a();

    @InstallErrorCode
    /* renamed from: b */
    public abstract int mo10826b();

    @InstallStatus
    /* renamed from: c */
    public abstract int mo10827c();

    /* renamed from: d */
    public abstract String mo10828d();

    /* renamed from: e */
    public abstract long mo10829e();
}
