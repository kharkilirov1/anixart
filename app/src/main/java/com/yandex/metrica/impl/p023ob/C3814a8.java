package com.yandex.metrica.impl.p023ob;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.a8 */
/* loaded from: classes2.dex */
class C3814a8 implements InterfaceC3653Tm<String, Bundle, C3788Z7> {

    /* renamed from: a */
    @NonNull
    private final C4126m8 f44731a;

    /* renamed from: b */
    @NonNull
    private final C4204p8 f44732b;

    public C3814a8() {
        this(new C4126m8(), new C4204p8());
    }

    @VisibleForTesting
    public C3814a8(@NonNull C4126m8 c4126m8, @NonNull C4204p8 c4204p8) {
        this.f44731a = c4126m8;
        this.f44732b = c4204p8;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3653Tm
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.p023ob.C3788Z7 mo17948a(@androidx.annotation.NonNull java.lang.String r8, @androidx.annotation.NonNull android.os.Bundle r9) {
        /*
            r7 = this;
            java.lang.String r0 = "arg_hv"
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            r2 = 0
            if (r1 == 0) goto La
            goto L25
        La:
            java.lang.String r1 = "arg_df"
            boolean r3 = r9.containsKey(r1)
            if (r3 == 0) goto L25
            java.lang.String r3 = "arg_ct"
            boolean r4 = r9.containsKey(r3)
            if (r4 != 0) goto L1b
            goto L25
        L1b:
            java.lang.String r1 = r9.getString(r1)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L27
        L25:
            r5 = r2
            goto L30
        L27:
            long r3 = r9.getLong(r3)
            com.yandex.metrica.impl.ob.c8 r5 = new com.yandex.metrica.impl.ob.c8
            r5.<init>(r8, r1, r3)
        L30:
            if (r5 == 0) goto L9c
            java.lang.String r8 = "arg_cd"
            java.lang.String r8 = r9.getString(r8)
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L9c
            com.yandex.metrica.impl.ob.m8 r1 = r7.f44731a
            com.yandex.metrica.impl.ob.C4 r8 = r1.m20394a(r8)
            if (r8 == 0) goto L9c
            com.yandex.metrica.impl.ob.p8 r1 = r7.f44732b
            java.lang.String r3 = "arg_rc"
            java.lang.String r9 = r9.getString(r3)
            java.lang.String r3 = ""
            if (r9 != 0) goto L53
            r9 = r3
        L53:
            java.util.Objects.requireNonNull(r1)
            com.yandex.metrica.impl.ob.ym$a r1 = new com.yandex.metrica.impl.ob.ym$a     // Catch: java.lang.Exception -> L91
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L91
            r6 = 0
            byte[] r9 = android.util.Base64.decode(r9, r6)     // Catch: java.lang.Exception -> L91
            r4.<init>(r9)     // Catch: java.lang.Exception -> L91
            r1.<init>(r4)     // Catch: java.lang.Exception -> L91
            java.lang.String r9 = "arg_ee"
            java.lang.String r9 = r1.optString(r9, r3)     // Catch: java.lang.Exception -> L8b
            boolean r3 = r1.has(r0)     // Catch: java.lang.Exception -> L8b
            if (r3 == 0) goto L76
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Exception -> L8b
            goto L77
        L76:
            r0 = r2
        L77:
            com.yandex.metrica.impl.ob.o8 r1 = new com.yandex.metrica.impl.ob.o8     // Catch: java.lang.Exception -> L8b
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L8b
            if (r3 == 0) goto L80
            r9 = r2
        L80:
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L8b
            if (r3 == 0) goto L87
            r0 = r2
        L87:
            r1.<init>(r9, r0)     // Catch: java.lang.Exception -> L8b
            goto L96
        L8b:
            com.yandex.metrica.impl.ob.o8 r1 = new com.yandex.metrica.impl.ob.o8     // Catch: java.lang.Exception -> L91
            r1.<init>(r2, r2)     // Catch: java.lang.Exception -> L91
            goto L96
        L91:
            com.yandex.metrica.impl.ob.o8 r1 = new com.yandex.metrica.impl.ob.o8
            r1.<init>(r2, r2)
        L96:
            com.yandex.metrica.impl.ob.Z7 r9 = new com.yandex.metrica.impl.ob.Z7
            r9.<init>(r5, r8, r1)
            return r9
        L9c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3814a8.mo17948a(java.lang.String, android.os.Bundle):com.yandex.metrica.impl.ob.Z7");
    }
}
