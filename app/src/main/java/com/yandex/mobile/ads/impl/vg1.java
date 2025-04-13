package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class vg1 {

    /* renamed from: com.yandex.mobile.ads.impl.vg1$a */
    public interface InterfaceC5918a {
        /* renamed from: b */
        boolean mo29223b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static boolean m29222a(@NonNull View view) {
        return ((InterfaceC5918a) view).mo29223b() && view.hasWindowFocus() && !tg1.m28660d(view);
    }
}
