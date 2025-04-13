package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.u0 */
/* loaded from: classes3.dex */
public final class C5831u0 {

    /* renamed from: a */
    @NotNull
    private final C5312k0 f55313a = new C5312k0();

    @SuppressLint
    /* renamed from: a */
    public final void m28811a(@NotNull Context context) throws d60 {
        Intrinsics.m32179h(context, "context");
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.yandex.mobile.ads.common.AdActivity"), 0);
            Intrinsics.m32178g(activityInfo, "context.packageManager.g…ityInfo(componentName, 0)");
            Objects.requireNonNull(this.f55313a);
            C5312k0.m26000a(activityInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new d60("There is no presence of com.yandex.mobile.ads.common.AdActivity activity in AndroidManifest file.");
        }
    }
}
