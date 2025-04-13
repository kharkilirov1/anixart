package com.google.android.play.core.splitinstall;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzo implements zzg {

    /* renamed from: b */
    public static final zzo f20286b;

    /* renamed from: c */
    public static final AtomicReference<zzh> f20287c;

    /* renamed from: d */
    public static final /* synthetic */ zzo[] f20288d;

    static {
        zzo zzoVar = new zzo();
        f20286b = zzoVar;
        f20288d = new zzo[]{zzoVar};
        f20287c = new AtomicReference<>(null);
    }

    public static zzo[] values() {
        return (zzo[]) f20288d.clone();
    }

    @Override // com.google.android.play.core.splitinstall.zzg
    @Nullable
    /* renamed from: u */
    public final zzh mo10992u() {
        return f20287c.get();
    }
}
