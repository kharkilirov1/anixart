package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes3.dex */
public enum JvmPrimitiveType {
    BOOLEAN(PrimitiveType.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(PrimitiveType.CHAR, "char", "C", "java.lang.Character"),
    BYTE(PrimitiveType.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(PrimitiveType.SHORT, "short", "S", "java.lang.Short"),
    INT(PrimitiveType.INT, "int", "I", "java.lang.Integer"),
    FLOAT(PrimitiveType.FLOAT, "float", "F", "java.lang.Float"),
    LONG(PrimitiveType.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(PrimitiveType.DOUBLE, "double", "D", "java.lang.Double");


    /* renamed from: n */
    public static final Set<FqName> f65949n = new HashSet();

    /* renamed from: o */
    public static final Map<String, JvmPrimitiveType> f65950o = new HashMap();

    /* renamed from: p */
    public static final Map<PrimitiveType, JvmPrimitiveType> f65951p = new EnumMap(PrimitiveType.class);

    /* renamed from: q */
    public static final Map<String, JvmPrimitiveType> f65952q = new HashMap();

    /* renamed from: b */
    public final PrimitiveType f65954b;

    /* renamed from: c */
    public final String f65955c;

    /* renamed from: d */
    public final String f65956d;

    /* renamed from: e */
    public final FqName f65957e;

    static {
        for (JvmPrimitiveType jvmPrimitiveType : values()) {
            ((HashSet) f65949n).add(jvmPrimitiveType.f65957e);
            ((HashMap) f65950o).put(jvmPrimitiveType.f65955c, jvmPrimitiveType);
            ((EnumMap) f65951p).put((EnumMap) jvmPrimitiveType.f65954b, (PrimitiveType) jvmPrimitiveType);
            ((HashMap) f65952q).put(jvmPrimitiveType.f65956d, jvmPrimitiveType);
        }
    }

    JvmPrimitiveType(PrimitiveType primitiveType, String str, @NotNull String str2, @NotNull String str3) {
        this.f65954b = primitiveType;
        this.f65955c = str;
        this.f65956d = str2;
        this.f65957e = new FqName(str3);
    }

    @NotNull
    /* renamed from: a */
    public static JvmPrimitiveType m33544a(@NotNull String str) {
        JvmPrimitiveType jvmPrimitiveType = (JvmPrimitiveType) ((HashMap) f65950o).get(str);
        if (jvmPrimitiveType != null) {
            return jvmPrimitiveType;
        }
        throw new AssertionError(C0000a.m14k("Non-primitive type name passed: ", str));
    }
}
