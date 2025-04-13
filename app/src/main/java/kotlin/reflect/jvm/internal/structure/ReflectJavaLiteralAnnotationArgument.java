package kotlin.reflect.jvm.internal.structure;

import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaAnnotationArguments.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaLiteralAnnotationArgument;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaLiteralAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "value", "<init>", "(Lorg/jetbrains/kotlin/name/Name;Ljava/lang/Object;)V", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaLiteralAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaLiteralAnnotationArgument {

    /* renamed from: c */
    @NotNull
    public final Object f66569c;

    public ReflectJavaLiteralAnnotationArgument(@Nullable Name name, @NotNull Object obj) {
        super(name);
        this.f66569c = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument
    @NotNull
    /* renamed from: getValue, reason: from getter */
    public Object getF66569c() {
        return this.f66569c;
    }
}
