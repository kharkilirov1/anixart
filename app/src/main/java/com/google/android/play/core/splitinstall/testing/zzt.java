package com.google.android.play.core.splitinstall.testing;

import androidx.annotation.Nullable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public abstract class zzt {

    /* renamed from: a */
    public static final zzt f20260a;

    static {
        zza zzaVar = new zza();
        zzaVar.f20232b = new HashMap();
        zzaVar.mo10977b(Collections.unmodifiableMap(zzaVar.mo10979d()));
        f20260a = zzaVar.mo10978c();
    }

    @Nullable
    @SplitInstallErrorCode
    /* renamed from: a */
    public abstract Integer mo10980a();

    /* renamed from: b */
    public abstract Map<String, Integer> mo10981b();
}
