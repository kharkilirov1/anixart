package com.google.firebase.firestore.util;

import p000a.C0000a;

/* loaded from: classes2.dex */
public class Assert {
    /* renamed from: a */
    public static AssertionError m12489a(String str, Object... objArr) {
        StringBuilder m24u = C0000a.m24u("INTERNAL ASSERTION FAILED: ");
        m24u.append(String.format(str, objArr));
        throw new AssertionError(m24u.toString());
    }

    /* renamed from: b */
    public static void m12490b(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        m12489a(str, objArr);
        throw null;
    }
}
