package kotlin.reflect.jvm.internal.structure;

import androidx.room.util.C0576a;
import java.lang.annotation.Annotation;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaValueParameter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaValueParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "name", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaValueParameter extends ReflectJavaElement implements JavaValueParameter {

    /* renamed from: a */
    @NotNull
    public final ReflectJavaType f66575a;

    /* renamed from: b */
    public final Annotation[] f66576b;

    /* renamed from: c */
    public final String f66577c;

    /* renamed from: d */
    public final boolean f66578d;

    public ReflectJavaValueParameter(@NotNull ReflectJavaType reflectJavaType, @NotNull Annotation[] reflectAnnotations, @Nullable String str, boolean z) {
        Intrinsics.m32180i(reflectAnnotations, "reflectAnnotations");
        this.f66575a = reflectJavaType;
        this.f66576b = reflectAnnotations;
        this.f66577c = str;
        this.f66578d = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection getAnnotations() {
        return ReflectJavaAnnotationOwnerKt.m33807b(this.f66576b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    @Nullable
    public Name getName() {
        String str = this.f66577c;
        if (str != null) {
            return Name.m33210c(str);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public JavaType getType() {
        return this.f66575a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* renamed from: h */
    public JavaAnnotation mo32799h(FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        return ReflectJavaAnnotationOwnerKt.m33806a(this.f66576b, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* renamed from: k */
    public boolean mo32800k() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    /* renamed from: q, reason: from getter */
    public boolean getF66578d() {
        return this.f66578d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        C0576a.m4126y(ReflectJavaValueParameter.class, sb, ": ");
        sb.append(this.f66578d ? "vararg " : "");
        String str = this.f66577c;
        sb.append(str != null ? Name.m33210c(str) : null);
        sb.append(": ");
        sb.append(this.f66575a);
        return sb.toString();
    }
}
