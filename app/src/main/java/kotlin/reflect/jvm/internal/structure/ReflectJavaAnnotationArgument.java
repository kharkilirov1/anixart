package kotlin.reflect.jvm.internal.structure;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaAnnotationArguments.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "<init>", "(Lorg/jetbrains/kotlin/name/Name;)V", "Factory", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class ReflectJavaAnnotationArgument implements JavaAnnotationArgument {

    /* renamed from: b */
    public static final Factory f66548b = new Factory(null);

    /* renamed from: a */
    @Nullable
    public final Name f66549a;

    /* compiled from: ReflectJavaAnnotationArguments.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument$Factory;", "", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Factory {
        public Factory() {
        }

        @NotNull
        /* renamed from: a */
        public final ReflectJavaAnnotationArgument m33802a(@NotNull Object value, @Nullable Name name) {
            Intrinsics.m32180i(value, "value");
            Class<?> cls = value.getClass();
            List<KClass<? extends Object>> list = ReflectClassUtilKt.f66541a;
            return Enum.class.isAssignableFrom(cls) ? new ReflectJavaEnumValueAnnotationArgument(name, (Enum) value) : value instanceof Annotation ? new ReflectJavaAnnotationAsAnnotationArgument(name, (Annotation) value) : value instanceof Object[] ? new ReflectJavaArrayAnnotationArgument(name, (Object[]) value) : value instanceof Class ? new ReflectJavaClassObjectAnnotationArgument(name, (Class) value) : new ReflectJavaLiteralAnnotationArgument(name, value);
        }

        public Factory(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ReflectJavaAnnotationArgument(@Nullable Name name) {
        this.f66549a = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument
    @Nullable
    /* renamed from: getName, reason: from getter */
    public Name getF66549a() {
        return this.f66549a;
    }
}
