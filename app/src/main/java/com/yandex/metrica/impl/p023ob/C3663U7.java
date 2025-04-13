package com.yandex.metrica.impl.p023ob;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.yandex.metrica.impl.ob.U7 */
/* loaded from: classes2.dex */
class C3663U7 implements FilenameFilter {
    public C3663U7(C3688V7 c3688v7) {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.endsWith(".dmp");
    }
}
