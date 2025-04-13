package com.google.android.gms.internal.p041firebaseauthapi;

import android.util.Log;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzug {

    /* renamed from: a */
    public final int f16837a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0062 -> B:6:0x0063). Please report as a decompilation issue!!! */
    public zzug(String str) {
        List m8814c;
        int i2 = 2;
        i2 = 2;
        i2 = 2;
        int i3 = 2;
        int i4 = 3;
        i4 = 3;
        i4 = 3;
        int i5 = 3;
        try {
            m8814c = zzaf.m8813b("[.-]").m8814c(str);
        } catch (IllegalArgumentException e2) {
            ?? isLoggable = Log.isLoggable("LibraryVersionContainer", i4);
            i3 = i2;
            i5 = isLoggable;
            if (isLoggable != 0) {
                ?? r1 = new Object[i2];
                r1[0] = str;
                r1[1] = e2;
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", r1));
                i3 = r1;
                i5 = isLoggable;
            }
        }
        if (m8814c.size() == 1) {
            str = Integer.parseInt(str);
        } else {
            if (m8814c.size() >= 3) {
                str = Integer.parseInt((String) m8814c.get(2)) + (Integer.parseInt((String) m8814c.get(1)) * 1000) + (Integer.parseInt((String) m8814c.get(0)) * 1000000);
            }
            str = -1;
            i2 = i3;
            i4 = i5;
        }
        this.f16837a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.p041firebaseauthapi.zzug m9413a() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p041firebaseauthapi.zzug.m9413a():com.google.android.gms.internal.firebase-auth-api.zzug");
    }

    /* renamed from: b */
    public final String m9414b() {
        return String.format("X%s", Integer.toString(this.f16837a));
    }
}
