package com.yandex.metrica.push.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.push.impl.b0 */
/* loaded from: classes2.dex */
public class C4565b0 extends C4548T {
    public C4565b0(@NonNull Context context, @NonNull C4562a c4562a) {
        this(context, c4562a, new C4563a0());
    }

    @VisibleForTesting
    public C4565b0(@NonNull Context context, @NonNull C4562a c4562a, @NonNull C4563a0 c4563a0) {
        super(c4563a0);
        m21473a(m21474a(context, c4562a));
        m21473a(new C4554W(context));
    }
}
