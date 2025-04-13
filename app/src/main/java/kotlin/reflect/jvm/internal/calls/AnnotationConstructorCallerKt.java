package kotlin.reflect.jvm.internal.calls;

import androidx.emoji2.text.flatbuffer.C0321a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnnotationConstructorCaller.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0006²\u0006\u0016\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0016\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, m31884d2 = {"", "T", "", "hashCode", "", "toString", "kotlin-reflect-api"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class AnnotationConstructorCallerKt {

    /* renamed from: a */
    public static final /* synthetic */ KProperty[] f63657a = {Reflection.m32196d(new PropertyReference0Impl(Reflection.m32194b(AnnotationConstructorCallerKt.class, "kotlin-reflect-api"), "hashCode", "<v#0>")), Reflection.m32196d(new PropertyReference0Impl(Reflection.m32194b(AnnotationConstructorCallerKt.class, "kotlin-reflect-api"), "toString", "<v#1>"))};

    @NotNull
    /* renamed from: a */
    public static final <T> T m32329a(@NotNull final Class<T> annotationClass, @NotNull final Map<String, ? extends Object> values, @NotNull List<Method> methods) {
        Intrinsics.m32180i(annotationClass, "annotationClass");
        Intrinsics.m32180i(values, "values");
        Intrinsics.m32180i(methods, "methods");
        final AnnotationConstructorCallerKt$createAnnotationInstance$2 annotationConstructorCallerKt$createAnnotationInstance$2 = new AnnotationConstructorCallerKt$createAnnotationInstance$2(annotationClass, methods, values);
        final Lazy m31881b = LazyKt.m31881b(new Function0<Integer>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Integer invoke() {
                int i2 = 0;
                for (Map.Entry entry : values.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    i2 += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(i2);
            }
        });
        KProperty[] kPropertyArr = f63657a;
        final KProperty kProperty = kPropertyArr[0];
        final Lazy m31881b2 = LazyKt.m31881b(new Function0<String>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public String invoke() {
                StringBuilder m2872a = C0321a.m2872a('@');
                m2872a.append(annotationClass.getCanonicalName());
                CollectionsKt.m32049z(values.entrySet(), m2872a, ", ", "(", ")", 0, null, new Function1<Map.Entry<? extends String, ? extends Object>, String>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public String invoke(Map.Entry<? extends String, ? extends Object> entry) {
                        Map.Entry<? extends String, ? extends Object> entry2 = entry;
                        Intrinsics.m32180i(entry2, "entry");
                        String key = entry2.getKey();
                        Object value = entry2.getValue();
                        return key + '=' + (value instanceof boolean[] ? Arrays.toString((boolean[]) value) : value instanceof char[] ? Arrays.toString((char[]) value) : value instanceof byte[] ? Arrays.toString((byte[]) value) : value instanceof short[] ? Arrays.toString((short[]) value) : value instanceof int[] ? Arrays.toString((int[]) value) : value instanceof float[] ? Arrays.toString((float[]) value) : value instanceof long[] ? Arrays.toString((long[]) value) : value instanceof double[] ? Arrays.toString((double[]) value) : value instanceof Object[] ? Arrays.toString((Object[]) value) : value.toString());
                    }
                }, 48, null);
                String sb = m2872a.toString();
                Intrinsics.m32175d(sb, "StringBuilder().apply(builderAction).toString()");
                return sb;
            }
        });
        final KProperty kProperty2 = kPropertyArr[1];
        T t = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new InvocationHandler() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$result$1
            @Override // java.lang.reflect.InvocationHandler
            @Nullable
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                Intrinsics.m32175d(method, "method");
                String name = method.getName();
                if (name != null) {
                    int hashCode = name.hashCode();
                    if (hashCode != -1776922004) {
                        if (hashCode != 147696667) {
                            if (hashCode == 1444986633 && name.equals("annotationType")) {
                                return annotationClass;
                            }
                        } else if (name.equals("hashCode")) {
                            return m31881b.getValue();
                        }
                    } else if (name.equals("toString")) {
                        return m31881b2.getValue();
                    }
                }
                if (Intrinsics.m32174c(name, "equals") && objArr != null && objArr.length == 1) {
                    return Boolean.valueOf(annotationConstructorCallerKt$createAnnotationInstance$2.m32330a(ArraysKt.m31949Y(objArr)));
                }
                if (values.containsKey(name)) {
                    return values.get(name);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Method is not supported: ");
                sb.append(method);
                sb.append(" (args: ");
                if (objArr == null) {
                    objArr = new Object[0];
                }
                sb.append(ArraysKt.m31952b0(objArr));
                sb.append(')');
                throw new KotlinReflectionInternalError(sb.toString());
            }
        });
        if (t != null) {
            return t;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }
}
