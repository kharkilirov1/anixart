package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.model.AssetPackStatus;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzbg {
    /* renamed from: a */
    public static boolean m10720a(@AssetPackStatus int i2) {
        return i2 == 1 || i2 == 7 || i2 == 2 || i2 == 3;
    }

    /* renamed from: b */
    public static boolean m10721b(@AssetPackStatus int i2) {
        return i2 == 2 || i2 == 7 || i2 == 3;
    }

    /* renamed from: c */
    public static boolean m10722c(@AssetPackStatus int i2, @AssetPackStatus int i3) {
        if (i2 == 5) {
            if (i3 != 5) {
                return true;
            }
            i2 = 5;
        }
        if (i2 == 6) {
            if (i3 != 6 && i3 != 5) {
                return true;
            }
            i2 = 6;
        }
        if (i2 == 4 && i3 != 4) {
            return true;
        }
        if (i2 == 3 && (i3 == 2 || i3 == 7 || i3 == 1 || i3 == 8)) {
            return true;
        }
        if (i2 == 2) {
            return i3 == 1 || i3 == 8;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m10723d(@AssetPackStatus int i2) {
        return i2 == 5 || i2 == 6 || i2 == 4;
    }
}
