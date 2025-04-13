package com.google.android.p007a;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: BaseProxy.java */
/* renamed from: com.google.android.a.a */
/* loaded from: classes.dex */
public class C0894a implements IInterface {

    /* renamed from: a */
    public final IBinder f8945a;

    public C0894a(IBinder iBinder) {
        this.f8945a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8945a;
    }
}
