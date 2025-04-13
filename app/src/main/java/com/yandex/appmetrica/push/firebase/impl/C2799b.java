package com.yandex.appmetrica.push.firebase.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.push.common.utils.CoreUtils;
import java.util.Locale;

/* renamed from: com.yandex.appmetrica.push.firebase.impl.b */
/* loaded from: classes2.dex */
class C2799b extends AbstractC2805h {

    /* renamed from: c */
    private static final String f30849c = String.format(Locale.US, "Expected two identifiers: %s and %s in application block of AndroidManifest.xml. See more at https://appmetrica.yandex.ru/docs/mobile-sdk-dg/push/android-initialize.html", "ymp_firebase_app_id", "ymp_gcm_sender_id");

    public C2799b(@NonNull Context context) {
        super(context, f30849c);
    }

    @Override // com.yandex.appmetrica.push.firebase.impl.AbstractC2805h
    @Nullable
    @WorkerThread
    /* renamed from: b */
    public String mo16554b() {
        return CoreUtils.getStringFromMetaData(m16563d(), "ymp_firebase_api_key");
    }

    @Override // com.yandex.appmetrica.push.firebase.impl.AbstractC2805h
    @Nullable
    @WorkerThread
    /* renamed from: c */
    public String mo16555c() {
        return CoreUtils.getStringFromMetaData(m16563d(), "ymp_firebase_app_id");
    }

    @Override // com.yandex.appmetrica.push.firebase.impl.AbstractC2805h
    @Nullable
    /* renamed from: f */
    public String mo16556f() {
        return CoreUtils.getStringFromMetaData(m16563d(), "ymp_firebase_project_id");
    }

    @Override // com.yandex.appmetrica.push.firebase.impl.AbstractC2805h
    @Nullable
    @WorkerThread
    /* renamed from: g */
    public String mo16557g() {
        return m16562a(m16563d(), "ymp_gcm_sender_id");
    }
}
