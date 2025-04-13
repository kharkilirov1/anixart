package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.billing_interface.C3115a;
import com.yandex.metrica.billing_interface.C3121g;
import com.yandex.metrica.billing_interface.EnumC3119e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.o */
/* loaded from: classes2.dex */
public final class C4169o implements InterfaceC4351v {

    /* renamed from: a */
    private final C3121g f46024a;

    public C4169o(@NotNull C3121g systemTimeProvider) {
        Intrinsics.m32179h(systemTimeProvider, "systemTimeProvider");
        this.f46024a = systemTimeProvider;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4351v
    @NotNull
    /* renamed from: a */
    public Map<String, C3115a> mo20174a(@NotNull C4195p config, @NotNull Map<String, ? extends C3115a> history, @NotNull InterfaceC4273s storage) {
        C3115a mo20069a;
        Intrinsics.m32179h(config, "config");
        Intrinsics.m32179h(history, "history");
        Intrinsics.m32179h(storage, "storage");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends C3115a> entry : history.entrySet()) {
            C3115a value = entry.getValue();
            Objects.requireNonNull(this.f46024a);
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = true;
            if (value.f42392a != EnumC3119e.INAPP || storage.mo20071a() ? !((mo20069a = storage.mo20069a(value.f42393b)) == null || (!Intrinsics.m32174c(mo20069a.f42394c, value.f42394c)) || (value.f42392a == EnumC3119e.SUBS && currentTimeMillis - mo20069a.f42396e >= TimeUnit.SECONDS.toMillis(config.f46090a))) : currentTimeMillis - value.f42395d > TimeUnit.SECONDS.toMillis(config.f46091b)) {
                z = false;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public /* synthetic */ C4169o(C3121g c3121g, int i2) {
        this((i2 & 1) != 0 ? new C3121g() : null);
    }
}
