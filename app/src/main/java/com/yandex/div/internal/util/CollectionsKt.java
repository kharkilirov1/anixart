package com.yandex.div.internal.util;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Collections.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"utils_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class CollectionsKt {
    /* renamed from: a */
    public static final boolean m17385a(@NotNull List<?>... listArr) {
        boolean z;
        int length = listArr.length;
        int i2 = 0;
        do {
            z = true;
            if (i2 >= length) {
                return true;
            }
            List<?> list = listArr[i2];
            i2++;
            if (list != null && !list.isEmpty()) {
                z = false;
            }
        } while (z);
        return false;
    }
}
