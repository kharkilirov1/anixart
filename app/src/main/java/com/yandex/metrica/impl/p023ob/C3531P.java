package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.P */
/* loaded from: classes2.dex */
public class C3531P {

    /* renamed from: a */
    @NonNull
    private final Context f43582a;

    /* renamed from: b */
    @NonNull
    private final C3316G9 f43583b;

    /* renamed from: c */
    @NonNull
    private final String f43584c;

    /* renamed from: d */
    @NonNull
    private final C3729Wn f43585d;

    public C3531P(@NonNull Context context, @NonNull C3316G9 c3316g9) {
        this(context, c3316g9, context.getPackageName(), new C3729Wn());
    }

    @NonNull
    /* renamed from: a */
    public List<String> m18693a() {
        Signature[] signatureArr;
        String str;
        List<String> m18144g = this.f43583b.m18144g();
        boolean isEmpty = m18144g.isEmpty();
        List<String> list = m18144g;
        if (isEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (C3658U2.m19211a(28)) {
                    SigningInfo signingInfo = this.f43585d.m19373b(this.f43582a, this.f43584c, 134217728).signingInfo;
                    signatureArr = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    signatureArr = this.f43585d.m19373b(this.f43582a, this.f43584c, 64).signatures;
                }
                if (signatureArr != null) {
                    for (Signature signature : signatureArr) {
                        try {
                            str = C3509O2.m18656a(MessageDigest.getInstance("SHA1").digest(signature.toByteArray())).toUpperCase(Locale.US).replaceAll("(.{2})(?=.+)", "$1:");
                        } catch (Throwable unused) {
                            str = null;
                        }
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList);
            boolean isEmpty2 = arrayList.isEmpty();
            list = arrayList;
            if (!isEmpty2) {
                this.f43583b.m18134a(arrayList).m18227c();
                list = arrayList;
            }
        }
        return list;
    }

    @VisibleForTesting
    public C3531P(@NonNull Context context, @NonNull C3316G9 c3316g9, @NonNull String str, @NonNull C3729Wn c3729Wn) {
        this.f43582a = context;
        this.f43583b = c3316g9;
        this.f43584c = str;
        this.f43585d = c3729Wn;
    }
}
