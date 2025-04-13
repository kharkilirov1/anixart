package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "FakeJavaAnnotationConstructor", "JavaConstructor", "JavaMethod", "KotlinConstructor", "KotlinFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class JvmFunctionSignature {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {

        /* renamed from: a */
        @NotNull
        public final List<Method> f63442a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeJavaAnnotationConstructor(@NotNull Class<?> jClass) {
            super(null);
            Intrinsics.m32180i(jClass, "jClass");
            Method[] declaredMethods = jClass.getDeclaredMethods();
            Intrinsics.m32175d(declaredMethods, "jClass.declaredMethods");
            this.f63442a = ArraysKt.m31950Z(declaredMethods, new Comparator<T>() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$$special$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    Method it = (Method) t;
                    Intrinsics.m32175d(it, "it");
                    String name = it.getName();
                    Method it2 = (Method) t2;
                    Intrinsics.m32175d(it2, "it");
                    return ComparisonsKt.m32109b(name, it2.getName());
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* renamed from: a */
        public String getF63449a() {
            return CollectionsKt.m31989B(this.f63442a, "", "<init>(", ")V", 0, null, new Function1<Method, String>() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1
                @Override // kotlin.jvm.functions.Function1
                public String invoke(Method method) {
                    Method it = method;
                    Intrinsics.m32175d(it, "it");
                    Class<?> returnType = it.getReturnType();
                    Intrinsics.m32175d(returnType, "it.returnType");
                    return ReflectClassUtilKt.m33799c(returnType);
                }
            }, 24, null);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class JavaConstructor extends JvmFunctionSignature {

        /* renamed from: a */
        @NotNull
        public final Constructor<?> f63444a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaConstructor(@NotNull Constructor<?> constructor) {
            super(null);
            Intrinsics.m32180i(constructor, "constructor");
            this.f63444a = constructor;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* renamed from: a */
        public String getF63449a() {
            Class<?>[] parameterTypes = this.f63444a.getParameterTypes();
            Intrinsics.m32175d(parameterTypes, "constructor.parameterTypes");
            return ArraysKt.m31939O(parameterTypes, "", "<init>(", ")V", 0, null, new Function1<Class<?>, String>() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$JavaConstructor$asString$1
                @Override // kotlin.jvm.functions.Function1
                public String invoke(Class<?> cls) {
                    Class<?> it = cls;
                    Intrinsics.m32175d(it, "it");
                    return ReflectClassUtilKt.m33799c(it);
                }
            }, 24, null);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class JavaMethod extends JvmFunctionSignature {

        /* renamed from: a */
        @NotNull
        public final Method f63446a;

        public JavaMethod(@NotNull Method method) {
            super(null);
            this.f63446a = method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* renamed from: a */
        public String getF63449a() {
            return RuntimeTypeMapperKt.m32317a(this.f63446a);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class KotlinConstructor extends JvmFunctionSignature {

        /* renamed from: a */
        public final String f63447a;

        /* renamed from: b */
        @NotNull
        public final JvmMemberSignature.Method f63448b;

        public KotlinConstructor(@NotNull JvmMemberSignature.Method method) {
            super(null);
            this.f63448b = method;
            this.f63447a = method.mo33173a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* renamed from: a, reason: from getter */
        public String getF63449a() {
            return this.f63447a;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class KotlinFunction extends JvmFunctionSignature {

        /* renamed from: a */
        public final String f63449a;

        /* renamed from: b */
        @NotNull
        public final JvmMemberSignature.Method f63450b;

        public KotlinFunction(@NotNull JvmMemberSignature.Method method) {
            super(null);
            this.f63450b = method;
            this.f63449a = method.mo33173a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* renamed from: a, reason: from getter */
        public String getF63449a() {
            return this.f63449a;
        }
    }

    public JvmFunctionSignature() {
    }

    @NotNull
    /* renamed from: a */
    public abstract String getF63449a();

    public JvmFunctionSignature(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
