package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;

/* loaded from: classes.dex */
public final class MediaStoreUtil {
    /* renamed from: a */
    public static boolean m4981a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: b */
    public static boolean m4982b(int i2, int i3) {
        return i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && i2 <= 512 && i3 <= 384;
    }
}
