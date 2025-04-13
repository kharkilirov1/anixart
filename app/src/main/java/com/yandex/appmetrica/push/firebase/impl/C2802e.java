package com.yandex.appmetrica.push.firebase.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.metrica.push.common.utils.CoreUtils;
import java.util.Locale;

/* renamed from: com.yandex.appmetrica.push.firebase.impl.e */
/* loaded from: classes2.dex */
class C2802e extends AbstractC2805h {

    /* renamed from: c */
    private static final String f30851c = String.format(Locale.US, "Expected two identifiers: %s and %s in resources. Use gradle plugin com.google.gms.google-services in your application build.gradle and add google-services.json in your project. See more at %s", "google_app_id", "gcm_defaultSenderId", CoreConstants.LINK_TO_INTEGRATION_PUSH_SDK);

    public C2802e(@NonNull Context context) {
        super(context, f30851c);
    }

    @Override // com.yandex.appmetrica.push.firebase.impl.AbstractC2805h
    @Nullable
    @WorkerThread
    /* renamed from: b */
    public String mo16554b() {
        return CoreUtils.getStringFromResources(m16563d(), "google_api_key");
    }

    @Override // com.yandex.appmetrica.push.firebase.impl.AbstractC2805h
    @Nullable
    @WorkerThread
    /* renamed from: c */
    public String mo16555c() {
        return CoreUtils.getStringFromResources(m16563d(), "google_app_id");
    }

    @Override // com.yandex.appmetrica.push.firebase.impl.AbstractC2805h
    @Nullable
    /* renamed from: f */
    public String mo16556f() {
        return CoreUtils.getStringFromResources(m16563d(), "project_id");
    }

    @Override // com.yandex.appmetrica.push.firebase.impl.AbstractC2805h
    @Nullable
    @WorkerThread
    /* renamed from: g */
    public String mo16557g() {
        return CoreUtils.getStringFromResources(m16563d(), "gcm_defaultSenderId");
    }
}
