package com.yandex.metrica.push.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.common.PushServiceFacade;
import com.yandex.metrica.push.common.core.PushServiceController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.yandex.metrica.push.impl.e */
/* loaded from: classes2.dex */
public class C4570e {

    /* renamed from: a */
    @NonNull
    private final Context f47371a;

    /* renamed from: b */
    @NonNull
    private final Collection<PushServiceController> f47372b;

    /* renamed from: c */
    @NonNull
    private final Collection<String> f47373c;

    public C4570e(@NonNull Context context, @NonNull Collection<PushServiceController> collection) {
        this.f47371a = context;
        this.f47372b = Collections.unmodifiableList(new ArrayList(collection));
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<PushServiceController> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getTitle());
        }
        this.f47373c = Collections.unmodifiableList(arrayList);
    }

    @NonNull
    /* renamed from: a */
    public Collection<String> m21537a() {
        return this.f47373c;
    }

    @NonNull
    /* renamed from: b */
    public Map<String, String> m21538b() {
        HashMap hashMap = new HashMap();
        for (PushServiceController pushServiceController : this.f47372b) {
            hashMap.put(pushServiceController.getTitle(), pushServiceController.getToken());
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: c */
    public void m21539c() {
        Iterator<PushServiceController> it = this.f47372b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= it.next().register();
        }
        if (z) {
            PushServiceFacade.initToken(this.f47371a);
        }
    }
}
