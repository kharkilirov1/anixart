package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.billing_interface.EnumC3116b;
import java.lang.reflect.Field;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.z3 */
/* loaded from: classes2.dex */
public final class C4459z3 {
    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final EnumC3116b m21287a() {
        String str;
        Field field;
        EnumC3116b enumC3116b = EnumC3116b.LIBRARY_V4;
        EnumC3116b enumC3116b2 = EnumC3116b.LIBRARY_V3;
        try {
            Class m17881b = C3184B2.m17881b("com.android.billingclient.BuildConfig");
            str = (String) ((m17881b == null || (field = m17881b.getField("VERSION_NAME")) == null) ? null : field.get(null));
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return EnumC3116b.NONE;
        }
        if (StringsKt.m33898X(str, "2.", false, 2, null) || StringsKt.m33898X(str, "3.", false, 2, null)) {
            return enumC3116b2;
        }
        StringsKt.m33898X(str, "4.", false, 2, null);
        return enumC3116b;
    }
}
