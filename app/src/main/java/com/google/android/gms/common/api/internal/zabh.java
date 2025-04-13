package com.google.android.gms.common.api.internal;

import android.os.Message;
import androidx.room.util.C0576a;
import java.util.Objects;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zabh extends com.google.android.gms.internal.base.zaq {

    /* renamed from: a */
    public final /* synthetic */ zabi f15506a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Lock lock;
        int i2 = message.what;
        if (i2 != 1) {
            if (i2 == 2) {
                throw ((RuntimeException) message.obj);
            }
            C0576a.m4123v(31, "Unknown message id: ", i2, "GACStateManager");
            return;
        }
        zabg zabgVar = (zabg) message.obj;
        zabi zabiVar = this.f15506a;
        Objects.requireNonNull(zabgVar);
        zabiVar.f15507a.lock();
        try {
            if (zabiVar.f15512f != zabgVar.f15505a) {
                lock = zabiVar.f15507a;
            } else {
                zabgVar.mo8019a();
                lock = zabiVar.f15507a;
            }
            lock.unlock();
        } catch (Throwable th) {
            zabiVar.f15507a.unlock();
            throw th;
        }
    }
}
