package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes3.dex */
final class JvmTypeFactoryImpl implements JvmTypeFactory<JvmType> {

    /* renamed from: a */
    public static final JvmTypeFactoryImpl f64799a = new JvmTypeFactoryImpl();

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* renamed from: d */
    public JvmType mo32918d(JvmType jvmType) {
        JvmPrimitiveType jvmPrimitiveType;
        JvmType possiblyPrimitiveType = jvmType;
        Intrinsics.m32180i(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof JvmType.Primitive) || (jvmPrimitiveType = ((JvmType.Primitive) possiblyPrimitiveType).f64798a) == null) {
            return possiblyPrimitiveType;
        }
        String replace = jvmPrimitiveType.f65957e.f65597a.f65602a.replace('.', JsonPointer.SEPARATOR);
        Intrinsics.m32175d(replace, "JvmClassName.byFqNameWit…apperFqName).internalName");
        return mo32917c(replace);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* renamed from: e */
    public JvmType mo32919e() {
        return mo32917c("java/lang/Class");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    @NotNull
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public JvmType mo32916b(@NotNull String representation) {
        JvmPrimitiveType jvmPrimitiveType;
        Intrinsics.m32180i(representation, "representation");
        char charAt = representation.charAt(0);
        JvmPrimitiveType[] values = JvmPrimitiveType.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = values[i2];
            if (jvmPrimitiveType.f65956d.charAt(0) == charAt) {
                break;
            }
            i2++;
        }
        if (jvmPrimitiveType != null) {
            return new JvmType.Primitive(jvmPrimitiveType);
        }
        if (charAt == 'V') {
            return new JvmType.Primitive(null);
        }
        if (charAt == '[') {
            String substring = representation.substring(1);
            Intrinsics.m32175d(substring, "(this as java.lang.String).substring(startIndex)");
            return new JvmType.Array(mo32916b(substring));
        }
        if (charAt == 'L') {
            StringsKt.m33925w(representation, ';', false, 2, null);
        }
        String substring2 = representation.substring(1, representation.length() - 1);
        Intrinsics.m32175d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return new JvmType.Object(substring2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    @NotNull
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public JvmType.Object mo32917c(@NotNull String internalName) {
        Intrinsics.m32180i(internalName, "internalName");
        return new JvmType.Object(internalName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    @NotNull
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String mo32915a(@NotNull JvmType type) {
        String str;
        Intrinsics.m32180i(type, "type");
        if (type instanceof JvmType.Array) {
            StringBuilder m24u = C0000a.m24u("[");
            m24u.append(mo32915a(((JvmType.Array) type).f64796a));
            return m24u.toString();
        }
        if (type instanceof JvmType.Primitive) {
            JvmPrimitiveType jvmPrimitiveType = ((JvmType.Primitive) type).f64798a;
            return (jvmPrimitiveType == null || (str = jvmPrimitiveType.f65956d) == null) ? "V" : str;
        }
        if (type instanceof JvmType.Object) {
            return C0000a.m20q(C0000a.m24u("L"), ((JvmType.Object) type).f64797a, ";");
        }
        throw new NoWhenBranchMatchedException();
    }
}
