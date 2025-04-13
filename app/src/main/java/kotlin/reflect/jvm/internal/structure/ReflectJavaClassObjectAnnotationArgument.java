package kotlin.reflect.jvm.internal.structure;

import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaAnnotationArguments.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassObjectAnnotationArgument;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassObjectAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "Ljava/lang/Class;", "klass", "<init>", "(Lorg/jetbrains/kotlin/name/Name;Ljava/lang/Class;)V", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaClassObjectAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaClassObjectAnnotationArgument {

    /* renamed from: c */
    public final Class<?> f66563c;

    public ReflectJavaClassObjectAnnotationArgument(@Nullable Name name, @NotNull Class<?> cls) {
        super(name);
        this.f66563c = cls;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument
    @NotNull
    /* renamed from: c */
    public JavaType mo32814c() {
        return ReflectJavaType.f66573a.m33812a(this.f66563c);
    }
}
