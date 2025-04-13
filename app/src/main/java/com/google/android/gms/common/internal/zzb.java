package com.google.android.gms.common.internal;

import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zzb extends com.google.android.gms.internal.common.zzi {

    /* renamed from: a */
    public final /* synthetic */ BaseGmsClient f15794a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.f15794a = baseGmsClient;
    }

    /* renamed from: a */
    public static final boolean m8197a(Message message) {
        int i2 = message.what;
        return i2 == 2 || i2 == 1 || i2 == 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r0 == 5) goto L15;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r8) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzb.handleMessage(android.os.Message):void");
    }
}
