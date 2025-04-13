package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.d */
/* loaded from: classes2.dex */
public class C3883d extends IOException {
    public C3883d(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C3883d m19688a() {
        return new C3883d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: b */
    public static C3883d m19689b() {
        return new C3883d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
