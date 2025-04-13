package com.google.android.play.core.internal;

import android.util.Log;
import java.io.File;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbo implements zzbd {
    @Override // com.google.android.play.core.internal.zzbd
    /* renamed from: a */
    public final boolean mo10855a(Object obj, File file, File file2) {
        try {
            return !((Boolean) zzbw.m10871e(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
}
