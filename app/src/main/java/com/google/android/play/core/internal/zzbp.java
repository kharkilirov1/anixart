package com.google.android.play.core.internal;

import java.io.File;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbp implements zzaz {
    /* renamed from: c */
    public static boolean m10862c(ClassLoader classLoader, File file, File file2, boolean z) {
        return zzbf.m10858e(classLoader, file, file2, z, new zzbh(), "path", new zzbo());
    }

    @Override // com.google.android.play.core.internal.zzaz
    /* renamed from: a */
    public final boolean mo10849a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m10862c(classLoader, file, file2, z);
    }

    @Override // com.google.android.play.core.internal.zzaz
    /* renamed from: b */
    public final void mo10850b(ClassLoader classLoader, Set<File> set) {
        zzbk.m10860c(classLoader, set, new zzbn());
    }
}
