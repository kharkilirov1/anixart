package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p000a.C0000a;

/* compiled from: KClassImpl.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m31884d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "T", "", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class KClassImpl$Data$supertypes$2 extends Lambda implements Function0<List<? extends KTypeImpl>> {

    /* renamed from: b */
    public final /* synthetic */ KClassImpl.Data f63510b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$supertypes$2(KClassImpl.Data data) {
        super(0);
        this.f63510b = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public List<? extends KTypeImpl> invoke() {
        TypeConstructor mo32440j = this.f63510b.m32271a().mo32440j();
        Intrinsics.m32175d(mo32440j, "descriptor.typeConstructor");
        Collection<KotlinType> mo32602a = mo32440j.mo32602a();
        Intrinsics.m32175d(mo32602a, "descriptor.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList(mo32602a.size());
        for (final KotlinType kotlinType : mo32602a) {
            Intrinsics.m32175d(kotlinType, "kotlinType");
            arrayList.add(new KTypeImpl(kotlinType, new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Type invoke() {
                    ClassifierDescriptor mo32449b = KotlinType.this.mo33515H0().mo32449b();
                    if (!(mo32449b instanceof ClassDescriptor)) {
                        throw new KotlinReflectionInternalError("Supertype not a class: " + mo32449b);
                    }
                    Class<?> m32326i = UtilKt.m32326i((ClassDescriptor) mo32449b);
                    if (m32326i == null) {
                        StringBuilder m24u = C0000a.m24u("Unsupported superclass of ");
                        m24u.append(this.f63510b);
                        m24u.append(": ");
                        m24u.append(mo32449b);
                        throw new KotlinReflectionInternalError(m24u.toString());
                    }
                    if (Intrinsics.m32174c(KClassImpl.this.f63478e.getSuperclass(), m32326i)) {
                        Type genericSuperclass = KClassImpl.this.f63478e.getGenericSuperclass();
                        Intrinsics.m32175d(genericSuperclass, "jClass.genericSuperclass");
                        return genericSuperclass;
                    }
                    Class<?>[] interfaces = KClassImpl.this.f63478e.getInterfaces();
                    Intrinsics.m32175d(interfaces, "jClass.interfaces");
                    int m31935K = ArraysKt.m31935K(interfaces, m32326i);
                    if (m31935K >= 0) {
                        Type type = KClassImpl.this.f63478e.getGenericInterfaces()[m31935K];
                        Intrinsics.m32175d(type, "jClass.genericInterfaces[index]");
                        return type;
                    }
                    StringBuilder m24u2 = C0000a.m24u("No superclass of ");
                    m24u2.append(this.f63510b);
                    m24u2.append(" in Java reflection for ");
                    m24u2.append(mo32449b);
                    throw new KotlinReflectionInternalError(m24u2.toString());
                }
            }));
        }
        if (!KotlinBuiltIns.m32384L(this.f63510b.m32271a())) {
            boolean z = true;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ClassDescriptor classDescriptor = (ClassDescriptor) ((KTypeImpl) it.next()).f63615e.mo33515H0().mo32449b();
                    Intrinsics.m32175d(classDescriptor, "DescriptorUtils.getClassDescriptorForType(it.type)");
                    ClassKind mo32438g = classDescriptor.mo32438g();
                    Intrinsics.m32175d(mo32438g, "DescriptorUtils.getClass…ptorForType(it.type).kind");
                    if (!(mo32438g == ClassKind.INTERFACE || mo32438g == ClassKind.ANNOTATION_CLASS)) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                SimpleType m32397e = DescriptorUtilsKt.m33534g(this.f63510b.m32271a()).m32397e();
                Intrinsics.m32175d(m32397e, "descriptor.builtIns.anyType");
                arrayList.add(new KTypeImpl(m32397e, new Function0<Class<Object>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2.3
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Class<Object> invoke() {
                        return Object.class;
                    }
                }));
            }
        }
        return CollectionsKt.m33772b(arrayList);
    }
}
