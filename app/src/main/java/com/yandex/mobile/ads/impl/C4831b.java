package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.w00;
import java.io.IOException;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.yandex.mobile.ads.impl.b */
/* loaded from: classes3.dex */
final class C4831b extends AbstractC4861be implements w00.InterfaceC5951b {

    /* renamed from: a */
    @NonNull
    private final AbstractC4861be f48702a;

    /* renamed from: b */
    @NonNull
    private final C4785a f48703b = C4894c.m22953a();

    public C4831b(@NonNull Context context, @Nullable SSLSocketFactory sSLSocketFactory) {
        this.f48702a = x00.m29613a(context, this, sSLSocketFactory);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4861be
    /* renamed from: a */
    public final p00 mo22665a(@NonNull zv0<?> zv0Var, @NonNull Map<String, String> map) throws IOException, C6069yb {
        String mo27673m = zv0Var.mo27673m();
        if ((mo27673m == null || this.f48703b.m22336a(mo27673m)) ? false : true) {
            map.put(j00.m25754b(1), zv0Var.mo27673m());
        }
        return this.f48702a.mo22665a(zv0Var, map);
    }

    @Override // com.yandex.mobile.ads.impl.f91
    @Nullable
    /* renamed from: a */
    public final String mo22666a(@Nullable String str) {
        return str != null && !this.f48703b.m22336a(str) ? "https://yandex.ru/appcry" : str;
    }
}
