package com.yandex.metrica.push.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.common.RefreshTokenInfo;
import com.yandex.metrica.push.common.utils.PublicLogger;
import java.util.Map;

/* renamed from: com.yandex.metrica.push.impl.z0 */
/* loaded from: classes2.dex */
class C4613z0 extends AbstractC4514B0 {

    /* renamed from: com.yandex.metrica.push.impl.z0$a */
    public class a implements InterfaceC4559Y0<Map<String, String>> {

        /* renamed from: a */
        public final /* synthetic */ Context f47588a;

        public a(C4613z0 c4613z0, Context context) {
            this.f47588a = context;
        }

        @Override // com.yandex.metrica.push.impl.InterfaceC4559Y0
        /* renamed from: a */
        public void mo21421a(Map<String, String> map) {
            Map<String, String> map2 = map;
            PublicLogger.m21385i("Will send tokens %s to server!", map2.toString());
            C4562a.m21488a(this.f47588a).m21492a(map2);
        }
    }

    @Override // com.yandex.metrica.push.impl.AbstractC4514B0
    /* renamed from: a */
    public void mo21419a(@NonNull Context context, @NonNull Map<String, String> map, @NonNull RefreshTokenInfo refreshTokenInfo) {
        m21420a(context, refreshTokenInfo.force, map, new a(this, context));
    }
}
