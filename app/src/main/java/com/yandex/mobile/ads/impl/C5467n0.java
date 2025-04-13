package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.impl.n0 */
/* loaded from: classes3.dex */
public final class C5467n0 {

    /* renamed from: b */
    @NonNull
    private static final Object f52830b = new Object();

    /* renamed from: c */
    private static volatile C5467n0 f52831c;

    /* renamed from: a */
    @NonNull
    private final HashMap f52832a = new HashMap();

    private C5467n0() {
        m26782a("window_type_browser", new C5259j0());
    }

    @NonNull
    /* renamed from: a */
    public static C5467n0 m26780a() {
        if (f52831c == null) {
            synchronized (f52830b) {
                if (f52831c == null) {
                    f52831c = new C5467n0();
                }
            }
        }
        return f52831c;
    }

    /* renamed from: a */
    public final synchronized void m26782a(@NonNull String str, @NonNull InterfaceC5420m0 interfaceC5420m0) {
        if (!this.f52832a.containsKey(str)) {
            this.f52832a.put(str, interfaceC5420m0);
        }
    }

    @Nullable
    /* renamed from: a */
    public final synchronized InterfaceC5370l0 m26781a(@NonNull Context context, @NonNull RelativeLayout relativeLayout, @Nullable ResultReceiver resultReceiver, @NonNull C4788a1 c4788a1, @NonNull C5612q0 c5612q0, @NonNull Intent intent, @NonNull Window window) {
        InterfaceC5420m0 interfaceC5420m0;
        String stringExtra = intent.getStringExtra("window_type");
        if (stringExtra == null || (interfaceC5420m0 = (InterfaceC5420m0) this.f52832a.get(stringExtra)) == null) {
            return null;
        }
        return interfaceC5420m0.mo25752a(context, relativeLayout, c4788a1, c5612q0, intent, window);
    }
}
