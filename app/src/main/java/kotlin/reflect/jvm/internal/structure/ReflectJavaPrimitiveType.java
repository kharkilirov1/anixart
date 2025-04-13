package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaPrimitiveType.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaPrimitiveType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaPrimitiveType;", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getType", "()Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "type", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaPrimitiveType extends ReflectJavaType implements JavaPrimitiveType {

    /* renamed from: b */
    @NotNull
    public final Class<?> f66572b;

    public ReflectJavaPrimitiveType(@NotNull Class<?> cls) {
        this.f66572b = cls;
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaType
    /* renamed from: I */
    public Type getF66565c() {
        return this.f66572b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType
    @Nullable
    public PrimitiveType getType() {
        if (Intrinsics.m32174c(this.f66572b, Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.m33544a(this.f66572b.getName()).f65954b;
    }
}
