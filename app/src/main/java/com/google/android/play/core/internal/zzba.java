package com.google.android.play.core.internal;

import android.os.Build;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzba {
    /* renamed from: a */
    public static zzaz m10853a() {
        switch (Build.VERSION.SDK_INT) {
            case 21:
                return new zzbf();
            case 22:
                return new zzbg();
            case 23:
                return new zzbk();
            case 24:
                return new zzbl();
            case 25:
                return new zzbm();
            case 26:
                return new zzbp();
            case 27:
                if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                    return new zzbq();
                }
                break;
        }
        return new zzbs();
    }
}
