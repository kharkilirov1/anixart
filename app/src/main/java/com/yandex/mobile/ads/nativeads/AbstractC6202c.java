package com.yandex.mobile.ads.nativeads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.C5276ja;
import com.yandex.mobile.ads.impl.InterfaceC5000e2;
import com.yandex.mobile.ads.impl.InterfaceC5512nv;
import com.yandex.mobile.ads.impl.a80;
import com.yandex.mobile.ads.impl.ai0;
import com.yandex.mobile.ads.impl.bv0;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.s01;

/* renamed from: com.yandex.mobile.ads.nativeads.c */
/* loaded from: classes3.dex */
public abstract class AbstractC6202c {

    /* renamed from: a */
    @VisibleForTesting
    public static final AbstractC6202c f57676a = new a();

    /* renamed from: b */
    @VisibleForTesting
    public static final AbstractC6202c f57677b = new b();

    /* renamed from: com.yandex.mobile.ads.nativeads.c$a */
    public class a extends AbstractC6202c {
        @Override // com.yandex.mobile.ads.nativeads.AbstractC6202c
        @NonNull
        /* renamed from: a */
        public final View.OnClickListener mo30537a(@NonNull InterfaceC5512nv interfaceC5512nv, @NonNull bv0 bv0Var, @NonNull InterfaceC5000e2 interfaceC5000e2, @NonNull C6264w c6264w, @NonNull C5276ja c5276ja, @Nullable a80 a80Var) {
            return new ai0(interfaceC5512nv, bv0Var, interfaceC5000e2, c6264w, c5276ja, a80Var);
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.c$b */
    public class b extends AbstractC6202c {
        @Override // com.yandex.mobile.ads.nativeads.AbstractC6202c
        @NonNull
        /* renamed from: a */
        public final View.OnClickListener mo30537a(@NonNull InterfaceC5512nv interfaceC5512nv, @NonNull bv0 bv0Var, @NonNull InterfaceC5000e2 interfaceC5000e2, @NonNull C6264w c6264w, @NonNull C5276ja c5276ja, @Nullable a80 a80Var) {
            return ("call_to_action".equals(c5276ja.m25824b()) || "feedback".equals(c5276ja.m25824b())) ? new ai0(interfaceC5512nv, bv0Var, interfaceC5000e2, c6264w, c5276ja, a80Var) : new k01(c6264w.m30757h().m30505d());
        }
    }

    @NonNull
    /* renamed from: a */
    public static AbstractC6202c m30536a(@Nullable s01 s01Var) {
        return (s01Var == null || !"button_click_only".equals(s01Var.m28038b())) ? f57676a : f57677b;
    }

    @NonNull
    /* renamed from: a */
    public abstract View.OnClickListener mo30537a(@NonNull InterfaceC5512nv interfaceC5512nv, @NonNull bv0 bv0Var, @NonNull InterfaceC5000e2 interfaceC5000e2, @NonNull C6264w c6264w, @NonNull C5276ja c5276ja, @Nullable a80 a80Var);
}
