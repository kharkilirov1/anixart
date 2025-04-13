package com.yandex.appmetrica.push.firebase;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.appmetrica.push.firebase.impl.C2798a;
import com.yandex.appmetrica.push.firebase.impl.C2800c;
import com.yandex.appmetrica.push.firebase.impl.C2803f;
import com.yandex.appmetrica.push.firebase.impl.C2804g;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.metrica.push.common.core.PushServiceController;
import com.yandex.metrica.push.common.core.PushServiceControllerProvider;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class FirebasePushServiceControllerProvider implements PushServiceControllerProvider {

    /* renamed from: a */
    @NonNull
    private final List<? extends C2798a> f30839a;

    public FirebasePushServiceControllerProvider(@NonNull Context context) {
        this((List<C2798a>) Arrays.asList(new C2800c(context), new C2803f(context), new C2798a(context)));
    }

    @Override // com.yandex.metrica.push.common.core.PushServiceControllerProvider
    @NonNull
    public PushServiceController getPushServiceController() {
        for (C2798a c2798a : this.f30839a) {
            C2804g m16552c = c2798a.m16552c();
            if (!m16552c.m16558a()) {
                if (m16552c.m16559b()) {
                    return c2798a;
                }
                throw new IllegalStateException(c2798a.m16551b());
            }
        }
        throw new IllegalStateException(CoreConstants.EXCEPTION_MESSAGE_ERROR_ACTIVATE);
    }

    @VisibleForTesting
    public FirebasePushServiceControllerProvider(@NonNull List<C2798a> list) {
        this.f30839a = list;
    }
}
