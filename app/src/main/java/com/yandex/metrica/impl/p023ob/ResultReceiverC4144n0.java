package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

@SuppressLint
/* renamed from: com.yandex.metrica.impl.ob.n0 */
/* loaded from: classes2.dex */
public class ResultReceiverC4144n0 extends ResultReceiver {

    /* renamed from: b */
    public static final /* synthetic */ int f45965b = 0;

    /* renamed from: a */
    @NonNull
    private final a f45966a;

    /* renamed from: com.yandex.metrica.impl.ob.n0$a */
    public interface a {
        /* renamed from: a */
        void mo18335a(int i2, @NonNull Bundle bundle);
    }

    public ResultReceiverC4144n0(Handler handler, @NonNull a aVar) {
        super(handler);
        this.f45966a = aVar;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.setClassLoader(C3378Il.class.getClassLoader());
        this.f45966a.mo18335a(i2, bundle);
    }
}
