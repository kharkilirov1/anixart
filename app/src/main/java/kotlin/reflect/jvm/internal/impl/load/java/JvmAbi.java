package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class JvmAbi {

    /* renamed from: a */
    public static final FqName f64347a = new FqName("kotlin.jvm.JvmField");

    static {
        FqName fqName = new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl");
        new ClassId(fqName.m33198c(), fqName.m33199d());
    }

    @NotNull
    /* renamed from: a */
    public static String m32683a(@NotNull String str) {
        if (m32685c(str)) {
            return str;
        }
        StringBuilder m24u = C0000a.m24u("get");
        m24u.append(CapitalizeDecapitalizeKt.m33766a(str));
        return m24u.toString();
    }

    @NotNull
    /* renamed from: b */
    public static String m32684b(@NotNull String str) {
        StringBuilder m24u = C0000a.m24u("set");
        m24u.append(m32685c(str) ? str.substring(2) : CapitalizeDecapitalizeKt.m33766a(str));
        return m24u.toString();
    }

    /* renamed from: c */
    public static boolean m32685c(String str) {
        if (!str.startsWith("is") || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        return 'a' > charAt || charAt > 'z';
    }
}
