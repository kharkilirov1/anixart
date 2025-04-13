package com.p017vk.api.sdk.utils;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: VKUtils.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/utils/VKUtils;", "", "MD5", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class VKUtils {

    /* renamed from: a */
    public static final VKUtils f30791a = new VKUtils();

    /* compiled from: VKUtils.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/utils/VKUtils$MD5;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class MD5 {

        /* renamed from: a */
        public static final /* synthetic */ KProperty[] f30792a = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(MD5.class), "tmpBuilder", "getTmpBuilder()Ljava/lang/StringBuilder;"))};

        /* renamed from: b */
        public static final ThreadLocalDelegate f30793b = ThreadLocalDelegateKt.m16534a(new Function0<StringBuilder>() { // from class: com.vk.api.sdk.utils.VKUtils$MD5$tmpBuilder$2
            @Override // kotlin.jvm.functions.Function0
            public StringBuilder invoke() {
                return new StringBuilder();
            }
        });
    }

    @JvmStatic
    @Nullable
    /* renamed from: b */
    public static final Map<String, String> m16535b(@Nullable String str) {
        if (str == null) {
            return null;
        }
        List m33893S = StringsKt.m33893S(str, new String[]{"&"}, false, 0, 6, null);
        HashMap hashMap = new HashMap(m33893S.size());
        Iterator it = m33893S.iterator();
        while (it.hasNext()) {
            List m33893S2 = StringsKt.m33893S((String) it.next(), new String[]{"="}, false, 0, 6, null);
            if (m33893S2.size() > 1) {
                hashMap.put(m33893S2.get(0), m33893S2.get(1));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final float m16536a() {
        Resources system = Resources.getSystem();
        Intrinsics.m32175d(system, "Resources.getSystem()");
        DisplayMetrics displayMetrics = system.getDisplayMetrics();
        Intrinsics.m32175d(displayMetrics, "Resources.getSystem().displayMetrics");
        return displayMetrics.density;
    }
}
