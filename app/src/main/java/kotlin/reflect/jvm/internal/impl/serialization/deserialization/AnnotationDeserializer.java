package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnnotationDeserializer.kt */
/* loaded from: classes3.dex */
public final class AnnotationDeserializer {

    /* renamed from: a */
    public final ModuleDescriptor f66033a;

    /* renamed from: b */
    public final NotFoundClasses f66034b;

    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            iArr[4] = 5;
            iArr[5] = 6;
            iArr[6] = 7;
            iArr[7] = 8;
            iArr[8] = 9;
            iArr[9] = 10;
            iArr[10] = 11;
            iArr[11] = 12;
            iArr[12] = 13;
            int[] iArr2 = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
            iArr2[0] = 1;
            iArr2[1] = 2;
            iArr2[2] = 3;
            iArr2[3] = 4;
            iArr2[4] = 5;
            iArr2[5] = 6;
            iArr2[6] = 7;
            iArr2[7] = 8;
            iArr2[8] = 9;
            iArr2[9] = 10;
            iArr2[10] = 11;
            iArr2[11] = 12;
            iArr2[12] = 13;
        }
    }

    public AnnotationDeserializer(@NotNull ModuleDescriptor module, @NotNull NotFoundClasses notFoundClasses) {
        Intrinsics.m32180i(module, "module");
        Intrinsics.m32180i(notFoundClasses, "notFoundClasses");
        this.f66033a = module;
        this.f66034b = notFoundClasses;
    }

    @NotNull
    /* renamed from: a */
    public final AnnotationDescriptor m33555a(@NotNull ProtoBuf.Annotation proto, @NotNull NameResolver nameResolver) {
        Map map;
        Pair pair;
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(nameResolver, "nameResolver");
        ClassDescriptor m32520b = FindClassInModuleKt.m32520b(this.f66033a, NameResolverUtilKt.m33584a(nameResolver, proto.f64857d), this.f66034b);
        map = EmptyMap.f63145b;
        if (proto.f64858e.size() != 0 && !ErrorUtils.m33654e(m32520b) && DescriptorUtils.m33473i(m32520b)) {
            Collection<ClassConstructorDescriptor> mo32442l = m32520b.mo32442l();
            Intrinsics.m32175d(mo32442l, "annotationClass.constructors");
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) CollectionsKt.m32012Y(mo32442l);
            if (classConstructorDescriptor != null) {
                List<ValueParameterDescriptor> mo32489f = classConstructorDescriptor.mo32489f();
                Intrinsics.m32175d(mo32489f, "constructor.valueParameters");
                int m32062g = MapsKt.m32062g(CollectionsKt.m32032m(mo32489f, 10));
                if (m32062g < 16) {
                    m32062g = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(m32062g);
                for (Object obj : mo32489f) {
                    ValueParameterDescriptor it = (ValueParameterDescriptor) obj;
                    Intrinsics.m32175d(it, "it");
                    linkedHashMap.put(it.getName(), obj);
                }
                List<ProtoBuf.Annotation.Argument> list = proto.f64858e;
                Intrinsics.m32175d(list, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Annotation.Argument it2 : list) {
                    Intrinsics.m32175d(it2, "it");
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) linkedHashMap.get(Name.m33210c(nameResolver.getString(it2.f64865d)));
                    if (valueParameterDescriptor != null) {
                        Name m33210c = Name.m33210c(nameResolver.getString(it2.f64865d));
                        KotlinType type = valueParameterDescriptor.getType();
                        Intrinsics.m32175d(type, "parameter.type");
                        ProtoBuf.Annotation.Argument.Value value = it2.f64866e;
                        Intrinsics.m32175d(value, "proto.value");
                        pair = new Pair(m33210c, m33557c(type, value, nameResolver));
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                map = MapsKt.m32067l(arrayList);
            }
        }
        return new AnnotationDescriptorImpl(m32520b.mo32502r(), map, SourceElement.f63979a);
    }

    /* renamed from: b */
    public final KotlinBuiltIns m33556b() {
        return this.f66033a.mo32547n();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> m33557c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.KotlinType r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r11) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer.m33557c(kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver):kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue");
    }
}
