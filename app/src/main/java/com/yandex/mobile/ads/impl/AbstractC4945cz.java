package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* renamed from: com.yandex.mobile.ads.impl.cz */
/* loaded from: classes3.dex */
public abstract class AbstractC4945cz extends AbstractC5794td<String> {
    public AbstractC4945cz(@NonNull Context context, @NonNull EnumC5007e6 enumC5007e6, @NonNull C5724s3 c5724s3) {
        super(context, enumC5007e6, c5724s3);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    @NonNull
    /* renamed from: a */
    public final AbstractC5630qd<String> mo23561a(String str, String str2) {
        return new C5520o2(this.f55053b, this.f55057f, str, str2, this);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td, com.yandex.mobile.ads.impl.tw0.InterfaceC5822b
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo22924a(@NonNull Object obj) {
        mo22924a((AdResponse) obj);
    }
}
