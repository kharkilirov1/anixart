package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.structure.ReflectJavaType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReflectJavaField.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaField;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaField;", "", "getInitializerValue", "()Ljava/lang/Void;", "initializerValue", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaField extends ReflectJavaMember implements JavaField {

    /* renamed from: a */
    @NotNull
    public final Field f66568a;

    public ReflectJavaField(@NotNull Field field) {
        this.f66568a = field;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    /* renamed from: G */
    public boolean mo32823G() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public JavaType getType() {
        ReflectJavaType.Factory factory = ReflectJavaType.f66573a;
        Type genericType = this.f66568a.getGenericType();
        Intrinsics.m32175d(genericType, "member.genericType");
        return factory.m33812a(genericType);
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaMember
    /* renamed from: m */
    public Member mo33809m() {
        return this.f66568a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    /* renamed from: z */
    public boolean mo32824z() {
        return this.f66568a.isEnumConstant();
    }
}
