package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.dj */
/* loaded from: classes2.dex */
class C3903dj {

    /* renamed from: a */
    @NonNull
    private final C3790Z9 f44970a;

    public C3903dj() {
        this(new C3790Z9());
    }

    /* renamed from: a */
    public void m19770a(@NonNull C4371vj c4371vj, @NonNull JSONObject jSONObject) {
        C3790Z9 c3790z9 = this.f44970a;
        C4082kg.b bVar = new C4082kg.b();
        JSONObject optJSONObject = jSONObject.optJSONObject("auto_inapp_collecting");
        if (optJSONObject != null) {
            bVar.f45671b = optJSONObject.optInt("send_frequency_seconds", bVar.f45671b);
            bVar.f45672c = optJSONObject.optInt("first_collecting_inapp_max_age_seconds", bVar.f45672c);
        }
        c4371vj.m21010a(c3790z9.mo17817a(bVar));
    }

    @VisibleForTesting
    public C3903dj(@NonNull C3790Z9 c3790z9) {
        this.f44970a = c3790z9;
    }
}
