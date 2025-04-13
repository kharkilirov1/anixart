package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC4944cy;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes3.dex */
final class h51 implements InterfaceC4944cy {

    /* renamed from: b */
    @GuardedBy
    private static final ArrayList f50852b = new ArrayList(50);

    /* renamed from: a */
    private final Handler f50853a;

    /* renamed from: com.yandex.mobile.ads.impl.h51$a */
    public static final class C5167a implements InterfaceC4944cy.a {

        /* renamed from: a */
        @Nullable
        private Message f50854a;

        private C5167a() {
        }

        /* renamed from: a */
        public final C5167a m25064a(Message message) {
            this.f50854a = message;
            return this;
        }

        public /* synthetic */ C5167a(int i2) {
            this();
        }

        /* renamed from: a */
        public final boolean m25065a(Handler handler) {
            Message message = this.f50854a;
            Objects.requireNonNull(message);
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
            this.f50854a = null;
            h51.m25062a(this);
            return sendMessageAtFrontOfQueue;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4944cy.a
        /* renamed from: a */
        public final void mo23559a() {
            Message message = this.f50854a;
            Objects.requireNonNull(message);
            message.sendToTarget();
            this.f50854a = null;
            h51.m25062a(this);
        }
    }

    public h51(Handler handler) {
        this.f50853a = handler;
    }

    /* renamed from: d */
    private static C5167a m25063d() {
        C5167a c5167a;
        ArrayList arrayList = f50852b;
        synchronized (arrayList) {
            c5167a = arrayList.isEmpty() ? new C5167a(0) : (C5167a) arrayList.remove(arrayList.size() - 1);
        }
        return c5167a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4944cy
    /* renamed from: a */
    public final InterfaceC4944cy.a mo23550a(int i2, @Nullable Object obj) {
        return m25063d().m25064a(this.f50853a.obtainMessage(i2, obj));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4944cy
    /* renamed from: b */
    public final boolean mo23557b() {
        return this.f50853a.hasMessages(0);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4944cy
    /* renamed from: c */
    public final void mo23558c() {
        this.f50853a.removeMessages(2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4944cy
    /* renamed from: a */
    public final InterfaceC4944cy.a mo23549a(int i2, int i3) {
        return m25063d().m25064a(this.f50853a.obtainMessage(1, i2, i3));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4944cy
    /* renamed from: b */
    public final InterfaceC4944cy.a mo23556b(int i2) {
        return m25063d().m25064a(this.f50853a.obtainMessage(i2));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4944cy
    /* renamed from: a */
    public final boolean mo23554a(InterfaceC4944cy.a aVar) {
        return ((C5167a) aVar).m25065a(this.f50853a);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4944cy
    /* renamed from: a */
    public final boolean mo23552a(int i2) {
        return this.f50853a.sendEmptyMessage(i2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4944cy
    /* renamed from: a */
    public final boolean mo23553a(long j2) {
        return this.f50853a.sendEmptyMessageAtTime(2, j2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4944cy
    /* renamed from: a */
    public final void mo23551a() {
        this.f50853a.removeCallbacksAndMessages(null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4944cy
    /* renamed from: a */
    public final boolean mo23555a(Runnable runnable) {
        return this.f50853a.post(runnable);
    }

    /* renamed from: a */
    public static void m25062a(C5167a c5167a) {
        ArrayList arrayList = f50852b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(c5167a);
            }
        }
    }
}
