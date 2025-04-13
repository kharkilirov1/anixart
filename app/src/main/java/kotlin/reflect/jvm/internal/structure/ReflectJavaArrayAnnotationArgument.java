package kotlin.reflect.jvm.internal.structure;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationArgument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaAnnotationArguments.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaArrayAnnotationArgument;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaArrayAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "values", "<init>", "(Lorg/jetbrains/kotlin/name/Name;[Ljava/lang/Object;)V", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaArrayAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaArrayAnnotationArgument {

    /* renamed from: c */
    public final Object[] f66551c;

    public ReflectJavaArrayAnnotationArgument(@Nullable Name name, @NotNull Object[] objArr) {
        super(name);
        this.f66551c = objArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument
    @NotNull
    /* renamed from: e */
    public List<ReflectJavaAnnotationArgument> mo32801e() {
        Object[] objArr = this.f66551c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            ReflectJavaAnnotationArgument.Factory factory = ReflectJavaAnnotationArgument.f66548b;
            if (obj == null) {
                Intrinsics.m32188q();
                throw null;
            }
            arrayList.add(factory.m33802a(obj, null));
        }
        return arrayList;
    }
}
