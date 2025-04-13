package com.yandex.metrica.impl.p023ob;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.Gg */
/* loaded from: classes2.dex */
public class ResultReceiverC3323Gg extends ResultReceiver {

    /* renamed from: b */
    public static final /* synthetic */ int f43008b = 0;

    /* renamed from: a */
    @NonNull
    private final InterfaceC3273Eg f43009a;

    public ResultReceiverC3323Gg(@NonNull Handler handler, @NonNull InterfaceC3273Eg interfaceC3273Eg) {
        super(handler);
        this.f43009a = interfaceC3273Eg;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i2, Bundle bundle) {
        if (i2 == 1) {
            C3298Fg c3298Fg = null;
            try {
                c3298Fg = C3298Fg.m18102a(bundle.getByteArray("referrer"));
            } catch (Throwable unused) {
            }
            this.f43009a.mo17971a(c3298Fg);
        }
    }
}
