package kotlin.reflect.jvm.internal.structure;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaAnnotationArguments.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0010\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaEnumValueAnnotationArgument;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaEnumValueAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getEntryName", "()Lorg/jetbrains/kotlin/name/Name;", "entryName", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getEnumClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "enumClassId", "name", "", "value", "<init>", "(Lorg/jetbrains/kotlin/name/Name;Ljava/lang/Enum;)V", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaEnumValueAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaEnumValueAnnotationArgument {

    /* renamed from: c */
    public final Enum<?> f66567c;

    public ReflectJavaEnumValueAnnotationArgument(@Nullable Name name, @NotNull Enum<?> r2) {
        super(name);
        this.f66567c = r2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    @Nullable
    /* renamed from: b */
    public ClassId mo32821b() {
        Class<?> enumClass = this.f66567c.getClass();
        if (!enumClass.isEnum()) {
            enumClass = enumClass.getEnclosingClass();
        }
        Intrinsics.m32175d(enumClass, "enumClass");
        return ReflectClassUtilKt.m33798b(enumClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    @Nullable
    /* renamed from: d */
    public Name mo32822d() {
        return Name.m33211d(this.f66567c.name());
    }
}
