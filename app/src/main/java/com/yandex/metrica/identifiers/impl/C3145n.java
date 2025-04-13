package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.metrica.identifiers.impl.n */
/* loaded from: classes2.dex */
final class C3145n extends Lambda implements Function1 {

    /* renamed from: b */
    public static final C3145n f42504b = new C3145n();

    public C3145n() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        IBinder it = (IBinder) obj;
        Intrinsics.m32179h(it, "it");
        int i2 = AbstractBinderC3133b.f42485a;
        IInterface queryLocalInterface = it.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC3134c)) ? new C3132a(it) : (InterfaceC3134c) queryLocalInterface;
    }
}
