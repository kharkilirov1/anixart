package com.yandex.appmetrica.push.firebase.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.push.common.utils.CoreUtils;

/* renamed from: com.yandex.appmetrica.push.firebase.impl.h */
/* loaded from: classes2.dex */
abstract class AbstractC2805h {

    /* renamed from: a */
    @NonNull
    private final Context f30856a;

    /* renamed from: b */
    @NonNull
    private final String f30857b;

    public AbstractC2805h(@NonNull Context context, @NonNull String str) {
        this.f30856a = context;
        this.f30857b = str;
    }

    @Nullable
    /* renamed from: a */
    public String m16562a(@NonNull Context context, @NonNull String str) {
        String stringFromMetaData = CoreUtils.getStringFromMetaData(context, str);
        if (TextUtils.isEmpty(stringFromMetaData)) {
            return null;
        }
        String[] split = stringFromMetaData.split(":");
        if (split.length == 2 && "number".equals(split[0])) {
            return split[1];
        }
        return null;
    }

    @Nullable
    @WorkerThread
    /* renamed from: b */
    public abstract String mo16554b();

    @Nullable
    @WorkerThread
    /* renamed from: c */
    public abstract String mo16555c();

    @NonNull
    /* renamed from: d */
    public Context m16563d() {
        return this.f30856a;
    }

    @NonNull
    /* renamed from: e */
    public String m16564e() {
        return this.f30857b;
    }

    @Nullable
    @WorkerThread
    /* renamed from: f */
    public abstract String mo16556f();

    @Nullable
    @WorkerThread
    /* renamed from: g */
    public abstract String mo16557g();

    @NonNull
    /* renamed from: a */
    public C2804g m16561a() {
        return new C2804g(mo16554b(), mo16555c(), mo16557g(), mo16556f());
    }
}
