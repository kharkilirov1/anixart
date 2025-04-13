package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.vk */
/* loaded from: classes2.dex */
public class C4372vk implements InterfaceC4476zk<List<C4346uk>> {

    /* renamed from: a */
    @NonNull
    private final C4060jk f46828a;

    /* renamed from: b */
    @NonNull
    private final C3950fe f46829b;

    public C4372vk(@NonNull C4060jk c4060jk, @NonNull C3950fe c3950fe) {
        this.f46828a = c4060jk;
        this.f46829b = c3950fe;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.metrica.impl.p023ob.C4346uk m21064a() {
        /*
            r8 = this;
            com.yandex.metrica.impl.ob.uk r0 = new com.yandex.metrica.impl.ob.uk
            com.yandex.metrica.impl.ob.jk r1 = r8.f46828a
            android.telephony.TelephonyManager r1 = r1.m20172f()
            r2 = 3
            r3 = 0
            if (r1 == 0) goto L2d
            java.lang.String r1 = r1.getSimOperator()     // Catch: java.lang.Throwable -> L2d
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2d
            if (r4 != 0) goto L1c
            r4 = 0
            java.lang.String r1 = r1.substring(r4, r2)     // Catch: java.lang.Throwable -> L2d
            goto L1d
        L1c:
            r1 = r3
        L1d:
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L24
            goto L2d
        L24:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2d
            goto L2e
        L2d:
            r1 = r3
        L2e:
            com.yandex.metrica.impl.ob.jk r4 = r8.f46828a
            android.telephony.TelephonyManager r4 = r4.m20172f()
            if (r4 == 0) goto L56
            java.lang.String r4 = r4.getSimOperator()     // Catch: java.lang.Throwable -> L56
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L56
            if (r5 != 0) goto L45
            java.lang.String r2 = r4.substring(r2)     // Catch: java.lang.Throwable -> L56
            goto L46
        L45:
            r2 = r3
        L46:
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L4d
            goto L56
        L4d:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L56
            goto L57
        L56:
            r2 = r3
        L57:
            com.yandex.metrica.impl.ob.jk r4 = r8.f46828a
            android.telephony.TelephonyManager r4 = r4.m20172f()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            if (r4 == 0) goto L7c
            com.yandex.metrica.impl.ob.fe r6 = m21065b(r8)     // Catch: java.lang.Throwable -> L7c
            com.yandex.metrica.impl.ob.jk r7 = m21063a(r8)     // Catch: java.lang.Throwable -> L7c
            android.content.Context r7 = r7.m20171e()     // Catch: java.lang.Throwable -> L7c
            boolean r6 = r6.m19901b(r7)     // Catch: java.lang.Throwable -> L7c
            if (r6 == 0) goto L7c
            boolean r4 = r4.isNetworkRoaming()     // Catch: java.lang.Throwable -> L7c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L7c
            goto L7d
        L7c:
            r4 = r3
        L7d:
            if (r4 != 0) goto L80
            goto L81
        L80:
            r5 = r4
        L81:
            boolean r4 = r5.booleanValue()
            com.yandex.metrica.impl.ob.jk r5 = r8.f46828a
            android.telephony.TelephonyManager r5 = r5.m20172f()
            if (r5 == 0) goto L91
            java.lang.String r3 = r5.getSimOperatorName()     // Catch: java.lang.Throwable -> L91
        L91:
            r0.<init>(r1, r2, r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4372vk.m21064a():com.yandex.metrica.impl.ob.uk");
    }

    @Nullable
    /* renamed from: b */
    public Object m21066b() {
        ArrayList arrayList = new ArrayList();
        if (this.f46828a.m20170d()) {
            if (C3658U2.m19211a(23)) {
                if (this.f46829b.m19901b(this.f46828a.m20171e())) {
                    arrayList.addAll(C4398wk.m21116a(this.f46828a.m20171e()));
                }
                if (arrayList.size() == 0) {
                    arrayList.add(m21064a());
                }
            } else {
                arrayList.add(m21064a());
            }
        }
        return arrayList;
    }
}
