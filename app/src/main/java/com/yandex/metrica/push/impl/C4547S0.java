package com.yandex.metrica.push.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.utils.PublicLogger;
import java.io.Closeable;
import java.io.IOException;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.yandex.metrica.push.impl.S0 */
/* loaded from: classes2.dex */
public class C4547S0 implements InterfaceC4544Q0 {

    /* renamed from: a */
    @NonNull
    private final OkHttpClient f47310a;

    public C4547S0(@NonNull Context context) {
        this.f47310a = new OkHttpClient.Builder().cache(new Cache(context.getCacheDir(), 10485760L)).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // com.yandex.metrica.push.impl.InterfaceC4544Q0
    @Nullable
    /* renamed from: a */
    public byte[] mo21471a(@NonNull String str) {
        Response response;
        Request build = new Request.Builder().url(str).build();
        ?? r0 = 0;
        byte[] bArr = null;
        try {
            try {
                response = this.f47310a.newCall(build).execute();
                try {
                    response.cacheResponse();
                    bArr = response.body() != null ? response.body().bytes() : null;
                    C4530J0.m21446a(response);
                } catch (IOException e2) {
                    e = e2;
                    PublicLogger.m21384e(e, e.getMessage(), new Object[0]);
                    C4530J0.m21446a(response);
                    return bArr;
                }
            } catch (Throwable th) {
                r0 = build;
                th = th;
                C4530J0.m21446a((Closeable) r0);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            response = null;
        } catch (Throwable th2) {
            th = th2;
            C4530J0.m21446a((Closeable) r0);
            throw th;
        }
        return bArr;
    }
}
