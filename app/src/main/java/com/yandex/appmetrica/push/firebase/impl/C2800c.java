package com.yandex.appmetrica.push.firebase.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

/* renamed from: com.yandex.appmetrica.push.firebase.impl.c */
/* loaded from: classes2.dex */
public class C2800c extends C2798a {
    public C2800c(@NonNull Context context) {
        this(context, new C2799b(context));
    }

    @Override // com.yandex.appmetrica.push.firebase.impl.C2798a
    @NonNull
    /* renamed from: a */
    public FirebaseApp mo16550a(@NonNull FirebaseOptions firebaseOptions) {
        try {
            return FirebaseApp.m12216i(m16549a(), firebaseOptions, "METRICA_PUSH");
        } catch (Throwable unused) {
            return FirebaseApp.m12213d("METRICA_PUSH");
        }
    }

    @VisibleForTesting
    public C2800c(@NonNull Context context, @NonNull AbstractC2805h abstractC2805h) {
        super(context, abstractC2805h);
    }
}
