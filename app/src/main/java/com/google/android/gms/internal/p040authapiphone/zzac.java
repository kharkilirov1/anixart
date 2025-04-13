package com.google.android.gms.internal.p040authapiphone;

import com.google.android.gms.common.Feature;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: classes.dex */
public final class zzac {

    /* renamed from: a */
    public static final Feature f15999a;

    /* renamed from: b */
    public static final Feature[] f16000b;

    static {
        Feature feature = new Feature("sms_code_autofill", 2L);
        Feature feature2 = new Feature("sms_code_browser", 2L);
        Feature feature3 = new Feature("sms_retrieve", 1L);
        f15999a = feature3;
        f16000b = new Feature[]{feature, feature2, feature3, new Feature("user_consent", 3L)};
    }
}
