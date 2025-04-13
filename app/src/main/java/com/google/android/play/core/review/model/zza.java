package com.google.android.play.core.review.model;

import com.yandex.div2.C3033a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zza {

    /* renamed from: a */
    public static final Map<Integer, String> f20178a;

    /* renamed from: b */
    public static final Map<Integer, String> f20179b;

    static {
        HashMap hashMap = new HashMap();
        f20178a = hashMap;
        HashMap hashMap2 = new HashMap();
        f20179b = hashMap2;
        Integer m17739a = C3033a.m17739a(hashMap, -1, "The Play Store app is either not installed or not the official version.", -2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(m17739a, "INVALID_REQUEST");
    }
}
