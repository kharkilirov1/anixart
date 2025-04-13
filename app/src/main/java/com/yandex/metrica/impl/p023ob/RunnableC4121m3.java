package com.yandex.metrica.impl.p023ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.m3 */
/* loaded from: classes2.dex */
class RunnableC4121m3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4095l3 f45934a;

    /* renamed from: com.yandex.metrica.impl.ob.m3$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context;
            context = RunnableC4121m3.this.f45934a.f45857a;
            C3524Oh.m18680a(context);
        }
    }

    public RunnableC4121m3(C4095l3 c4095l3) {
        this.f45934a = c4095l3;
    }

    @Override // java.lang.Runnable
    public void run() {
        C4245qn c4245qn;
        c4245qn = this.f45934a.f45861e;
        ((C4271rn) c4245qn.m20606a()).execute(new a());
    }
}
