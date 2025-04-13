package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* compiled from: annotationUtil.kt */
/* loaded from: classes3.dex */
public final class AnnotationUtilKt {

    /* renamed from: a */
    public static final Name f64016a = Name.m33211d(ThrowableDeserializer.PROP_NAME_MESSAGE);

    /* renamed from: b */
    public static final Name f64017b = Name.m33211d("replaceWith");

    /* renamed from: c */
    public static final Name f64018c = Name.m33211d("level");

    /* renamed from: d */
    public static final Name f64019d = Name.m33211d("expression");

    /* renamed from: e */
    public static final Name f64020e = Name.m33211d("imports");

    /* renamed from: f */
    public static final FqName f64021f = new FqName("kotlin.internal.InlineOnly");

    @NotNull
    /* renamed from: a */
    public static AnnotationDescriptor m32590a(final KotlinBuiltIns receiver$0, String str, String str2, String str3, int i2) {
        String replaceWith = (i2 & 2) != 0 ? "" : null;
        String level = (i2 & 4) != 0 ? "WARNING" : null;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(replaceWith, "replaceWith");
        Intrinsics.m32180i(level, "level");
        KotlinBuiltIns.FqNames fqNames = KotlinBuiltIns.f63730l;
        FqName fqName = fqNames.f63795v;
        Intrinsics.m32175d(fqName, "KotlinBuiltIns.FQ_NAMES.replaceWith");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(receiver$0, fqName, MapsKt.m32064i(new Pair(f64019d, new StringValue(replaceWith)), new Pair(f64020e, new ArrayValue(EmptyList.f63144b, new Function1<ModuleDescriptor, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public SimpleType invoke(ModuleDescriptor moduleDescriptor) {
                ModuleDescriptor module = moduleDescriptor;
                Intrinsics.m32180i(module, "module");
                return module.mo32547n().m32399g(Variance.INVARIANT, KotlinBuiltIns.this.m32413y());
            }
        }))));
        FqName fqName2 = fqNames.f63793t;
        Intrinsics.m32175d(fqName2, "KotlinBuiltIns.FQ_NAMES.deprecated");
        return new BuiltInAnnotationDescriptor(receiver$0, fqName2, MapsKt.m32064i(new Pair(f64016a, new StringValue(str)), new Pair(f64017b, new AnnotationValue(builtInAnnotationDescriptor)), new Pair(f64018c, new EnumValue(ClassId.m33188i(fqNames.f63794u), Name.m33211d(level)))));
    }

    /* renamed from: b */
    public static final boolean m32591b(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        List<TypeParameterDescriptor> typeParameters = callableMemberDescriptor.getTypeParameters();
        Intrinsics.m32175d(typeParameters, "typeParameters");
        if (!typeParameters.isEmpty()) {
            for (TypeParameterDescriptor it : typeParameters) {
                Intrinsics.m32175d(it, "it");
                if (it.mo32497A()) {
                    return true;
                }
            }
        }
        return false;
    }
}
