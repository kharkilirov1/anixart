package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.metrica.identifiers.impl.q */
/* loaded from: classes2.dex */
final class C3148q extends Lambda implements Function1 {

    /* renamed from: b */
    public static final C3148q f42507b = new C3148q();

    public C3148q() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        IBinder it = (IBinder) obj;
        Intrinsics.m32179h(it, "it");
        int i2 = AbstractBinderC3152u.f42511a;
        IInterface queryLocalInterface = it.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC3153v)) ? new C3151t(it) : (InterfaceC3153v) queryLocalInterface;
    }
}
