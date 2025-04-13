package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.IParamsCallback;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.wi */
/* loaded from: classes2.dex */
public final class C4396wi {

    /* renamed from: a */
    @NotNull
    private C4422xi f46897a = new C4422xi();

    @NotNull
    /* renamed from: a */
    public final synchronized C4422xi m21112a() {
        return this.f46897a;
    }

    /* renamed from: a */
    public final synchronized void m21113a(@NotNull C4422xi c4422xi) {
        this.f46897a = c4422xi;
    }

    @Nullable
    /* renamed from: a */
    public final C3963g1 m21111a(@NotNull String str) {
        Boolean m21157b;
        String str2;
        C4422xi c4422xi = this.f46897a;
        if (str.hashCode() != 949037879 || !str.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) || (m21157b = c4422xi.m21157b()) == null) {
            return null;
        }
        boolean booleanValue = m21157b.booleanValue();
        EnumC3911e1 m21158c = c4422xi.m21158c();
        String m21156a = c4422xi.m21156a();
        if (booleanValue) {
            str2 = "true";
        } else {
            if (booleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "false";
        }
        return new C3963g1(str2, m21158c, m21156a);
    }

    /* renamed from: a */
    public final synchronized void m21114a(@NotNull List<String> list, @NotNull Map<String, C3963g1> map) {
        Boolean m21157b;
        String str;
        for (String str2 : list) {
            if (str2.hashCode() == 949037879 && str2.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) && (m21157b = this.f46897a.m21157b()) != null) {
                boolean booleanValue = m21157b.booleanValue();
                EnumC3911e1 m21158c = this.f46897a.m21158c();
                String m21156a = this.f46897a.m21156a();
                if (booleanValue) {
                    str = "true";
                } else {
                    if (booleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "false";
                }
                map.put(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED, new C3963g1(str, m21158c, m21156a));
            }
        }
    }
}
