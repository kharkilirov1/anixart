package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Hj */
/* loaded from: classes2.dex */
public class C3351Hj implements InterfaceC3251Dj {

    /* renamed from: a */
    @NonNull
    private final Context f43064a;

    /* renamed from: b */
    @NonNull
    private final C3432L0 f43065b;

    @VisibleForTesting
    public C3351Hj(@NonNull Context context, @NonNull C3432L0 c3432l0) {
        this.f43064a = context;
        this.f43065b = c3432l0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m18235b() {
        /*
            r5 = this;
            r0 = 21
            boolean r0 = com.yandex.metrica.impl.p023ob.C3658U2.m19211a(r0)
            r1 = 1
            java.lang.String r2 = "metrica_data.db"
            r3 = 0
            if (r0 == 0) goto L2b
            com.yandex.metrica.impl.ob.L0 r0 = r5.f43065b
            android.content.Context r4 = r5.f43064a
            java.util.Objects.requireNonNull(r0)
            java.io.File r0 = r4.getNoBackupFilesDir()
            if (r0 != 0) goto L1b
            r0 = 0
            goto L21
        L1b:
            java.io.File r4 = new java.io.File
            r4.<init>(r0, r2)
            r0 = r4
        L21:
            if (r0 == 0) goto L2b
            boolean r0 = r0.exists()
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r0 != 0) goto L44
            com.yandex.metrica.impl.ob.L0 r0 = r5.f43065b
            android.content.Context r4 = r5.f43064a
            java.util.Objects.requireNonNull(r0)
            java.io.File r0 = r4.getDatabasePath(r2)
            if (r0 == 0) goto L42
            boolean r0 = r0.exists()
            if (r0 == 0) goto L42
            goto L45
        L42:
            r1 = 0
            goto L45
        L44:
            r1 = r0
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3351Hj.m18235b():boolean");
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3251Dj
    /* renamed from: a */
    public boolean mo17905a() {
        return !m18235b();
    }
}
