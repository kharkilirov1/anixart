package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3696Vf;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Im */
/* loaded from: classes2.dex */
public class C3379Im extends AbstractC3179Am {

    /* renamed from: d */
    private static final int[] f43149d = {3, 6, 4};

    /* renamed from: e */
    private static final C3379Im f43150e = new C3379Im("");

    public C3379Im(@Nullable String str) {
        super(str);
    }

    /* renamed from: g */
    public static C3379Im m18338g() {
        return f43150e;
    }

    /* renamed from: a */
    public void m18339a(@NonNull C3696Vf.d dVar, String str) {
        boolean z;
        String str2;
        for (C3696Vf.d.a aVar : dVar.f44266d) {
            if (aVar != null) {
                int[] iArr = f43149d;
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    if (aVar.f44270d == iArr[i2]) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (z) {
                    StringBuilder m27x = C0000a.m27x(str, ": ");
                    if (aVar.f44270d == 3 && TextUtils.isEmpty(aVar.f44271e)) {
                        str2 = "Native crash of app";
                    } else if (aVar.f44270d == 4) {
                        StringBuilder sb = new StringBuilder(aVar.f44271e);
                        byte[] bArr = aVar.f44272f;
                        if (bArr != null) {
                            String str3 = new String(bArr);
                            if (!TextUtils.isEmpty(str3)) {
                                sb.append(" with value ");
                                sb.append(str3);
                            }
                        }
                        str2 = sb.toString();
                    } else {
                        str2 = aVar.f44271e;
                    }
                    m27x.append(str2);
                    m21333b(m27x.toString());
                }
            }
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4480zo
    /* renamed from: b */
    public String mo18340b() {
        return "AppMetrica";
    }

    public C3379Im() {
        this("");
    }
}
