package com.google.android.play.core.splitcompat;

import android.content.res.AssetManager;
import android.util.Log;
import com.google.android.play.core.internal.zzbw;
import java.io.File;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zza {
    public zza(zze zzeVar) {
    }

    /* renamed from: a */
    public static final int m10938a(AssetManager assetManager, File file) {
        int intValue = ((Integer) zzbw.m10869c(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        StringBuilder sb = new StringBuilder(39);
        sb.append("addAssetPath completed with ");
        sb.append(intValue);
        Log.d("SplitCompat", sb.toString());
        return intValue;
    }
}
