package com.google.android.play.core.internal;

import java.io.File;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbc implements zzbd {
    @Override // com.google.android.play.core.internal.zzbd
    /* renamed from: a */
    public final boolean mo10855a(Object obj, File file, File file2) {
        Class<?> cls = obj.getClass();
        try {
            return new File((String) String.class.cast(zzbw.m10873g(cls, "optimizedPathFor", File.class, File.class).invoke(null, file, file2))).exists();
        } catch (Exception e2) {
            throw new zzbx(String.format("Failed to invoke static method %s on type %s", "optimizedPathFor", cls), e2);
        }
    }
}
