package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.ListenerSet;
import com.yandex.mobile.ads.exo.offline.C4778c;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.util.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1176a implements Handler.Callback {

    /* renamed from: b */
    public final /* synthetic */ int f14751b;

    /* renamed from: c */
    public final /* synthetic */ Object f14752c;

    public /* synthetic */ C1176a(Object obj, int i2) {
        this.f14751b = i2;
        this.f14752c = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean m22292a;
        switch (this.f14751b) {
            case 0:
                ListenerSet listenerSet = (ListenerSet) this.f14752c;
                Iterator it = listenerSet.f14644d.iterator();
                while (it.hasNext()) {
                    ListenerSet.ListenerHolder listenerHolder = (ListenerSet.ListenerHolder) it.next();
                    ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent = listenerSet.f14643c;
                    if (!listenerHolder.f14651d && listenerHolder.f14650c) {
                        FlagSet m7553b = listenerHolder.f14649b.m7553b();
                        listenerHolder.f14649b = new FlagSet.Builder();
                        listenerHolder.f14650c = false;
                        iterationFinishedEvent.mo5568e(listenerHolder.f14648a, m7553b);
                    }
                    if (listenerSet.f14642b.mo7570e(0)) {
                        return true;
                    }
                }
                return true;
            default:
                m22292a = ((C4778c) this.f14752c).m22292a(message);
                return m22292a;
        }
    }
}
