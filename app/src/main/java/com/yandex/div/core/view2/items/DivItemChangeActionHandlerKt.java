package com.yandex.div.core.view2.items;

import android.net.Uri;
import com.yandex.div.core.view2.items.OverflowItemStrategy;
import com.yandex.div.internal.Assert;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DivItemChangeActionHandler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivItemChangeActionHandlerKt {
    /* renamed from: a */
    public static final OverflowItemStrategy m17123a(Uri uri, int i2, int i3) {
        String queryParameter = uri.getQueryParameter("overflow");
        if (queryParameter == null ? true : Intrinsics.m32174c(queryParameter, "clamp")) {
            return new OverflowItemStrategy.Clamp(i2, i3);
        }
        if (Intrinsics.m32174c(queryParameter, "ring")) {
            return new OverflowItemStrategy.Ring(i2, i3);
        }
        int i4 = Assert.f33709a;
        return new OverflowItemStrategy.Clamp(i2, i3);
    }
}
