package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes3.dex */
public final class JavaAnnotationTargetMapper {

    /* renamed from: c */
    public static final JavaAnnotationTargetMapper f64401c = new JavaAnnotationTargetMapper();

    /* renamed from: a */
    public static final Map<String, EnumSet<KotlinTarget>> f64399a = MapsKt.m32064i(new Pair("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), new Pair("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), new Pair("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), new Pair("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), new Pair("FIELD", EnumSet.of(KotlinTarget.FIELD)), new Pair("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), new Pair("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), new Pair("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), new Pair("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), new Pair("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    /* renamed from: b */
    public static final Map<String, KotlinRetention> f64400b = MapsKt.m32064i(new Pair("RUNTIME", KotlinRetention.RUNTIME), new Pair("CLASS", KotlinRetention.BINARY), new Pair("SOURCE", KotlinRetention.SOURCE));

    @NotNull
    /* renamed from: a */
    public final ConstantValue<?> m32701a(@NotNull List<? extends JavaAnnotationArgument> arguments) {
        Intrinsics.m32180i(arguments, "arguments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof JavaEnumValueAnnotationArgument) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Name mo32822d = ((JavaEnumValueAnnotationArgument) it.next()).mo32822d();
            Iterable iterable = (EnumSet) f64399a.get(mo32822d != null ? mo32822d.f65606b : null);
            if (iterable == null) {
                iterable = EmptySet.f63146b;
            }
            CollectionsKt.m32020g(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.m32032m(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new EnumValue(ClassId.m33188i(KotlinBuiltIns.f63730l.f63742A), Name.m33211d(((KotlinTarget) it2.next()).name())));
        }
        return new ArrayValue(arrayList3, new Function1<ModuleDescriptor, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper$mapJavaTargetArguments$1
            @Override // kotlin.jvm.functions.Function1
            public KotlinType invoke(ModuleDescriptor moduleDescriptor) {
                KotlinType type;
                ModuleDescriptor module = moduleDescriptor;
                Intrinsics.m32180i(module, "module");
                JavaAnnotationMapper javaAnnotationMapper = JavaAnnotationMapper.f64398k;
                ValueParameterDescriptor m32695a = DescriptorResolverUtils.m32695a(JavaAnnotationMapper.f64394g, module.mo32547n().m32401i(KotlinBuiltIns.f63730l.f63799z));
                return (m32695a == null || (type = m32695a.getType()) == null) ? ErrorUtils.m33652c("Error: AnnotationTarget[]") : type;
            }
        });
    }
}
