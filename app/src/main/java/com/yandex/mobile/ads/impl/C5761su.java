package com.yandex.mobile.ads.impl;

import android.os.Environment;

/* renamed from: com.yandex.mobile.ads.impl.su */
/* loaded from: classes3.dex */
public final class C5761su {
    /* renamed from: a */
    public static boolean m28358a() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || !(Environment.isExternalStorageRemovable() || "mounted_ro".equals(externalStorageState));
    }
}
