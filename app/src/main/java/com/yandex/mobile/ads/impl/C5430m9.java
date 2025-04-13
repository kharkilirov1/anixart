package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.metrica.C4484p;
import com.yandex.metrica.IIdentifierCallback;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.m9 */
/* loaded from: classes3.dex */
public final class C5430m9 {
    /* renamed from: a */
    public static void m26590a(@NotNull Context context, boolean z) {
        Intrinsics.m32179h(context, "context");
        try {
            C4484p.slte(context, z);
        } catch (Throwable th) {
            n60.m26808a(th, th.getMessage(), new Object[0]);
        }
    }

    @Nullable
    /* renamed from: b */
    public static String m26591b(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        try {
            return C4484p.guid(context);
        } catch (Throwable unused) {
            n60.m26810c("Failed to request uuid", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static void m26589a(@NotNull Context context, @NotNull IIdentifierCallback callback, @NotNull List requestParameters) throws RuntimeException {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(callback, "callback");
        Intrinsics.m32179h(requestParameters, "requestParameters");
        C4484p.m21344a(context, callback, (List<String>) requestParameters);
    }

    @Nullable
    /* renamed from: a */
    public static String m26588a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        try {
            return C4484p.gdid(context);
        } catch (Throwable unused) {
            n60.m26810c("Failed to request deviceId", new Object[0]);
            return null;
        }
    }
}
