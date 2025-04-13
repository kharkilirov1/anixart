package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.yandex.metrica.impl.ob.qi */
/* loaded from: classes2.dex */
public class C4240qi implements InterfaceC4448yi {

    /* renamed from: b */
    private static final IIdentifierCallback f46248b = new a();

    /* renamed from: a */
    @NonNull
    private final AtomicReference<IIdentifierCallback> f46249a;

    /* renamed from: com.yandex.metrica.impl.ob.qi$a */
    public class a implements IIdentifierCallback {
        @Override // com.yandex.metrica.IIdentifierCallback
        public void onReceive(Map<String, String> map) {
        }

        @Override // com.yandex.metrica.IIdentifierCallback
        public void onRequestError(IIdentifierCallback.Reason reason) {
        }
    }

    public C4240qi(@NonNull IIdentifierCallback iIdentifierCallback) {
        this.f46249a = new AtomicReference<>(iIdentifierCallback);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4448yi
    /* renamed from: a */
    public void mo20599a(@NonNull IParamsCallback.Reason reason, Map<String, C3963g1> map) {
        IIdentifierCallback andSet = this.f46249a.getAndSet(f46248b);
        int ordinal = reason.ordinal();
        andSet.onRequestError(ordinal != 1 ? ordinal != 2 ? IIdentifierCallback.Reason.UNKNOWN : IIdentifierCallback.Reason.INVALID_RESPONSE : IIdentifierCallback.Reason.NETWORK);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4448yi
    public void onReceive(Map<String, C3963g1> map) {
        IIdentifierCallback andSet = this.f46249a.getAndSet(f46248b);
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, C3963g1> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().f45155a);
        }
        andSet.onReceive(hashMap);
    }
}
