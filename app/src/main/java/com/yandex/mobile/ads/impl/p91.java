package com.yandex.mobile.ads.impl;

import android.os.Build;
import androidx.emoji2.text.flatbuffer.C0321a;
import androidx.room.util.C0576a;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p91 {

    /* renamed from: a */
    @NotNull
    private final zz0 f53412a;

    public p91(@NotNull zz0 sdkVersionFormatter) {
        Intrinsics.m32179h(sdkVersionFormatter, "sdkVersionFormatter");
        this.f53412a = sdkVersionFormatter;
    }

    @NotNull
    /* renamed from: a */
    public static String m27195a() {
        String str;
        StringBuilder m2872a = C0321a.m2872a('(');
        String MODEL = Build.MODEL;
        Intrinsics.m32178g(MODEL, "MODEL");
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.m32178g(MANUFACTURER, "MANUFACTURER");
        if (StringsKt.m33898X(MODEL, MANUFACTURER, false, 2, null)) {
            str = p41.m27163a(MODEL);
            Intrinsics.m32178g(str, "{\n            StringUtil…ze(Build.MODEL)\n        }");
        } else {
            str = p41.m27163a(MANUFACTURER) + ' ' + MODEL;
        }
        m2872a.append(str);
        m2872a.append("; Android ");
        return C0576a.m4118q(m2872a, Build.VERSION.RELEASE, ')');
    }

    @NotNull
    /* renamed from: b */
    public final String m27196b() {
        StringBuilder m26356a = l60.m26356a("com.yandex.mobile.metrica.ads.sdk/");
        m26356a.append(this.f53412a.m30347a());
        m26356a.append('.');
        m26356a.append(BuildConfigFieldProvider.getBuildNumber());
        return m26356a.toString();
    }

    public /* synthetic */ p91() {
        this(new zz0());
    }
}
