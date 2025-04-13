package com.yandex.metrica.impl.p023ob;

import android.os.HandlerThread;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.un */
/* loaded from: classes2.dex */
public class HandlerThreadC4349un extends HandlerThread implements InterfaceC4323tn {

    /* renamed from: a */
    private volatile boolean f46664a;

    public HandlerThreadC4349un(@NonNull String str) {
        super(str);
        this.f46664a = true;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4323tn
    /* renamed from: c */
    public synchronized boolean mo20676c() {
        return this.f46664a;
    }
}
