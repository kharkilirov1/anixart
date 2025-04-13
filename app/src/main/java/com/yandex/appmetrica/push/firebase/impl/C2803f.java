package com.yandex.appmetrica.push.firebase.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

/* renamed from: com.yandex.appmetrica.push.firebase.impl.f */
/* loaded from: classes2.dex */
public class C2803f extends C2798a {
    public C2803f(@NonNull Context context) {
        this(context, new C2801d(context));
    }

    @Override // com.yandex.appmetrica.push.firebase.impl.C2798a
    @NonNull
    /* renamed from: a */
    public FirebaseApp mo16550a(@NonNull FirebaseOptions firebaseOptions) {
        try {
            return FirebaseApp.m12215h(m16549a(), firebaseOptions);
        } catch (Throwable unused) {
            return FirebaseApp.m12212c();
        }
    }

    @VisibleForTesting
    public C2803f(@NonNull Context context, @NonNull AbstractC2805h abstractC2805h) {
        super(context, abstractC2805h);
    }
}
