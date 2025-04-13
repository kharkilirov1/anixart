package com.yandex.metrica.push;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.core.notification.AbstractC4507j;
import com.yandex.metrica.push.core.notification.C4499b;

/* renamed from: com.yandex.metrica.push.f */
/* loaded from: classes2.dex */
public abstract class AbstractC4510f {

    /* renamed from: a */
    @Nullable
    private static volatile AbstractC4507j f47287a;

    private AbstractC4510f() {
    }

    @NonNull
    /* renamed from: a */
    public static AbstractC4507j m21416a() {
        AbstractC4507j abstractC4507j = f47287a;
        if (abstractC4507j == null) {
            synchronized (AbstractC4510f.class) {
                abstractC4507j = f47287a;
                if (abstractC4507j == null) {
                    abstractC4507j = new C4499b();
                    f47287a = abstractC4507j;
                }
            }
        }
        return abstractC4507j;
    }
}
