package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public final class EnumValue extends ConstantValue<Pair<? extends ClassId, ? extends Name>> {

    /* renamed from: b */
    @NotNull
    public final ClassId f65925b;

    /* renamed from: c */
    @NotNull
    public final Name f65926c;

    public EnumValue(@NotNull ClassId classId, @NotNull Name name) {
        super(new Pair(classId, name));
        this.f65925b = classId;
        this.f65926c = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* renamed from: a */
    public KotlinType mo33521a(@NotNull ModuleDescriptor module) {
        SimpleType mo32502r;
        Intrinsics.m32180i(module, "module");
        ClassDescriptor m32519a = FindClassInModuleKt.m32519a(module, this.f65925b);
        if (m32519a != null) {
            if (!DescriptorUtils.m33477m(m32519a)) {
                m32519a = null;
            }
            if (m32519a != null && (mo32502r = m32519a.mo32502r()) != null) {
                return mo32502r;
            }
        }
        StringBuilder m24u = C0000a.m24u("Containing class for error-class based enum entry ");
        m24u.append(this.f65925b);
        m24u.append('.');
        m24u.append(this.f65926c);
        return ErrorUtils.m33652c(m24u.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f65925b.m33193g());
        sb.append('.');
        sb.append(this.f65926c);
        return sb.toString();
    }
}
