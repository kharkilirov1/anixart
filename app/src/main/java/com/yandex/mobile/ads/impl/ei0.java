package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.C6212h;
import com.yandex.mobile.ads.nativeads.C6214i;
import com.yandex.mobile.ads.nativeads.C6216j;
import com.yandex.mobile.ads.nativeads.C6232r;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ei0 {

    /* renamed from: a */
    @NonNull
    private final rj0 f49976a = new rj0();

    /* renamed from: b */
    @NonNull
    private final C6214i f49977b = new C6214i();

    @Nullable
    /* renamed from: a */
    public final C6212h m24177a(@NonNull Context context, @NonNull kh0 kh0Var, @NonNull w10 w10Var, @NonNull C6216j c6216j, @NonNull di0 di0Var, @Nullable eh0 eh0Var) {
        if (eh0Var == null) {
            return null;
        }
        Objects.requireNonNull(this.f49976a);
        qj0 m27935a = rj0.m27935a();
        xl0 mo29951a = di0Var.m23891d().mo29951a(eh0Var);
        C5461mv c5461mv = new C5461mv();
        zl0 m30558a = c6216j.m30558a(kh0Var, eh0Var);
        Objects.requireNonNull(this.f49977b);
        return m27935a.mo27742a(context, eh0Var, new C6232r(context, eh0Var, w10Var, mo29951a), w10Var, C6214i.m30557a(context, kh0Var, m30558a, mo29951a, di0Var, c5461mv, eh0Var));
    }
}
