package kotlin.jvm;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JvmClassMapping.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 2, m31886mv = {1, 7, 1})
@JvmName
/* loaded from: classes3.dex */
public final class JvmClassMappingKt {
    @NotNull
    /* renamed from: a */
    public static final <T extends Annotation> KClass<? extends T> m32146a(@NotNull T t) {
        Intrinsics.m32179h(t, "<this>");
        Class<? extends Annotation> annotationType = t.annotationType();
        Intrinsics.m32178g(annotationType, "this as java.lang.annota…otation).annotationType()");
        KClass<? extends T> m32150e = m32150e(annotationType);
        Intrinsics.m32177f(m32150e, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return m32150e;
    }

    @JvmName
    @NotNull
    /* renamed from: b */
    public static final <T> Class<T> m32147b(@NotNull KClass<T> kClass) {
        Intrinsics.m32179h(kClass, "<this>");
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).mo32163h();
        Intrinsics.m32177f(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @NotNull
    /* renamed from: c */
    public static final <T> Class<T> m32148c(@NotNull KClass<T> kClass) {
        Intrinsics.m32179h(kClass, "<this>");
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).mo32163h();
        if (!cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return cls;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    /* renamed from: d */
    public static final <T> Class<T> m32149d(@NotNull KClass<T> kClass) {
        Intrinsics.m32179h(kClass, "<this>");
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).mo32163h();
        if (cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    @JvmName
    @NotNull
    /* renamed from: e */
    public static final <T> KClass<T> m32150e(@NotNull Class<T> cls) {
        Intrinsics.m32179h(cls, "<this>");
        return Reflection.m32193a(cls);
    }
}
