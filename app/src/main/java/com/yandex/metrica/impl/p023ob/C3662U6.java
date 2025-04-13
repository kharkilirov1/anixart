package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.U6 */
/* loaded from: classes2.dex */
public class C3662U6 {
    /* renamed from: a */
    public boolean m19237a(@Nullable File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return file.mkdir();
        }
        if (file.isDirectory()) {
            return true;
        }
        if (file.delete()) {
            return file.mkdir();
        }
        return false;
    }
}
