package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: propertiesConventionUtil.kt */
/* loaded from: classes3.dex */
public final class PropertiesConventionUtilKt {
    @Nullable
    /* renamed from: a */
    public static final Name m32686a(@NotNull Name name, boolean z) {
        return m32687b(name, "set", false, z ? "is" : null, 4);
    }

    /* renamed from: b */
    public static Name m32687b(Name name, String str, boolean z, String str2, int i2) {
        char charAt;
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if (!name.f65607c) {
            String m33215b = name.m33215b();
            Intrinsics.m32175d(m33215b, "methodName.identifier");
            if (StringsKt.m33898X(m33215b, str, false, 2, null) && m33215b.length() != str.length() && ('a' > (charAt = m33215b.charAt(str.length())) || 'z' < charAt)) {
                if (str2 != null) {
                    StringBuilder m24u = C0000a.m24u(str2);
                    m24u.append(StringsKt.m33885K(m33215b, str));
                    return Name.m33211d(m24u.toString());
                }
                if (!z) {
                    return name;
                }
                String m33767b = CapitalizeDecapitalizeKt.m33767b(StringsKt.m33885K(m33215b, str), true);
                if (Name.m33212e(m33767b)) {
                    return Name.m33211d(m33767b);
                }
            }
        }
        return null;
    }
}
