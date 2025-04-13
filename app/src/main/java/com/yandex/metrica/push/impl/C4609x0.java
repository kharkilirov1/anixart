package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.PushServiceFacade;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.push.impl.x0 */
/* loaded from: classes2.dex */
public class C4609x0 {

    /* renamed from: a */
    @NonNull
    private final Map<String, InterfaceC4607w0> f47587a;

    public C4609x0() {
        HashMap hashMap = new HashMap();
        this.f47587a = hashMap;
        hashMap.put(PushServiceFacade.COMMAND_INIT_PUSH_SERVICE, new C4611y0());
        hashMap.put(PushServiceFacade.COMMAND_INIT_PUSH_TOKEN, new C4613z0());
        hashMap.put(PushServiceFacade.COMMAND_UPDATE_TOKEN, new C4516C0());
        hashMap.put(PushServiceFacade.COMMAND_PROCESS_PUSH, new C4512A0());
    }

    @Nullable
    /* renamed from: a */
    public InterfaceC4607w0 m21745a(@Nullable String str) {
        return this.f47587a.get(str);
    }
}
