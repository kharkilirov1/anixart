package kotlin.reflect.jvm.internal;

import com.yandex.div2.C3033a;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: KCallableImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class KCallableImpl<R> implements KCallable<R> {

    /* renamed from: b */
    public final ReflectProperties.LazySoftVal<List<Annotation>> f63462b = ReflectProperties.m32304a(new Function0<List<? extends Annotation>>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_annotations$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public List<? extends Annotation> invoke() {
            return UtilKt.m32319b(KCallableImpl.this.mo32264o());
        }
    });

    /* renamed from: c */
    public final ReflectProperties.LazySoftVal<ArrayList<KParameter>> f63463c = ReflectProperties.m32304a(new Function0<ArrayList<KParameter>>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public ArrayList<KParameter> invoke() {
            int i2;
            final CallableMemberDescriptor mo32264o = KCallableImpl.this.mo32264o();
            ArrayList<KParameter> arrayList = new ArrayList<>();
            final int i3 = 0;
            if (KCallableImpl.this.mo32266r()) {
                i2 = 0;
            } else {
                final ReceiverParameterDescriptor m32321d = UtilKt.m32321d(mo32264o);
                if (m32321d != null) {
                    arrayList.add(new KParameterImpl(KCallableImpl.this, 0, KParameter.Kind.INSTANCE, new Function0<ReceiverParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public ReceiverParameterDescriptor invoke() {
                            return ReceiverParameterDescriptor.this;
                        }
                    }));
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                final ReceiverParameterDescriptor mo32492k0 = mo32264o.mo32492k0();
                if (mo32492k0 != null) {
                    arrayList.add(new KParameterImpl(KCallableImpl.this, i2, KParameter.Kind.EXTENSION_RECEIVER, new Function0<ReceiverParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.2
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public ReceiverParameterDescriptor invoke() {
                            return ReceiverParameterDescriptor.this;
                        }
                    }));
                    i2++;
                }
            }
            List<ValueParameterDescriptor> mo32489f = mo32264o.mo32489f();
            Intrinsics.m32175d(mo32489f, "descriptor.valueParameters");
            int size = mo32489f.size();
            while (i3 < size) {
                arrayList.add(new KParameterImpl(KCallableImpl.this, i2, KParameter.Kind.VALUE, new Function0<ValueParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public ValueParameterDescriptor invoke() {
                        ValueParameterDescriptor valueParameterDescriptor = CallableMemberDescriptor.this.mo32489f().get(i3);
                        Intrinsics.m32175d(valueParameterDescriptor, "descriptor.valueParameters[i]");
                        return valueParameterDescriptor;
                    }
                }));
                i3++;
                i2++;
            }
            if (KCallableImpl.this.m32265p() && (mo32264o instanceof JavaCallableMemberDescriptor) && arrayList.size() > 1) {
                CollectionsKt.m32015b0(arrayList, new Comparator<T>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1$$special$$inlined$sortBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.m32109b(((KParameter) t).getName(), ((KParameter) t2).getName());
                    }
                });
            }
            arrayList.trimToSize();
            return arrayList;
        }
    });

    /* renamed from: d */
    public final ReflectProperties.LazySoftVal<KTypeImpl> f63464d = ReflectProperties.m32304a(new Function0<KTypeImpl>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public KTypeImpl invoke() {
            KotlinType returnType = KCallableImpl.this.mo32264o().getReturnType();
            if (returnType != null) {
                return new KTypeImpl(returnType, new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1.1
                    @Override // kotlin.jvm.functions.Function0
                    public Type invoke() {
                        Type[] lowerBounds;
                        KCallableImpl kCallableImpl = KCallableImpl.this;
                        CallableMemberDescriptor mo32264o = kCallableImpl.mo32264o();
                        Type type = null;
                        if (!(mo32264o instanceof FunctionDescriptor)) {
                            mo32264o = null;
                        }
                        FunctionDescriptor functionDescriptor = (FunctionDescriptor) mo32264o;
                        if (functionDescriptor != null && functionDescriptor.isSuspend()) {
                            Object m31992E = CollectionsKt.m31992E(kCallableImpl.mo32261h().mo32328a());
                            if (!(m31992E instanceof ParameterizedType)) {
                                m31992E = null;
                            }
                            ParameterizedType parameterizedType = (ParameterizedType) m31992E;
                            if (Intrinsics.m32174c(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
                                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                                Intrinsics.m32175d(actualTypeArguments, "continuationType.actualTypeArguments");
                                Object m31949Y = ArraysKt.m31949Y(actualTypeArguments);
                                if (!(m31949Y instanceof WildcardType)) {
                                    m31949Y = null;
                                }
                                WildcardType wildcardType = (WildcardType) m31949Y;
                                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                                    type = (Type) ArraysKt.m31926B(lowerBounds);
                                }
                            }
                        }
                        return type != null ? type : KCallableImpl.this.mo32261h().getF63674c();
                    }
                });
            }
            Intrinsics.m32188q();
            throw null;
        }
    });

    /* renamed from: e */
    public final ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> f63465e = ReflectProperties.m32304a(new Function0<List<? extends KTypeParameterImpl>>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_typeParameters$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public List<? extends KTypeParameterImpl> invoke() {
            List<TypeParameterDescriptor> typeParameters = KCallableImpl.this.mo32264o().getTypeParameters();
            Intrinsics.m32175d(typeParameters, "descriptor.typeParameters");
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(typeParameters, 10));
            Iterator<T> it = typeParameters.iterator();
            while (it.hasNext()) {
                arrayList.add(new KTypeParameterImpl((TypeParameterDescriptor) it.next()));
            }
            return arrayList;
        }
    });

    @Override // kotlin.reflect.KCallable
    public R call(@NotNull Object... args) {
        Intrinsics.m32180i(args, "args");
        try {
            return (R) mo32261h().call(args);
        } catch (IllegalAccessException e2) {
            throw new IllegalCallableAccessException(e2);
        }
    }

    @Override // kotlin.reflect.KCallable
    public R callBy(@NotNull Map<KParameter, ? extends Object> args) {
        Object obj;
        Object obj2;
        Intrinsics.m32180i(args, "args");
        if (m32265p()) {
            List<KParameter> parameters = getParameters();
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(parameters, 10));
            for (KParameter kParameter : parameters) {
                if (args.containsKey(kParameter)) {
                    obj2 = args.get(kParameter);
                    if (obj2 == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + ')');
                    }
                } else {
                    if (!kParameter.mo32245j()) {
                        throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
                    }
                    obj2 = null;
                }
                arrayList.add(obj2);
            }
            Caller<?> mo32263m = mo32263m();
            if (mo32263m == null) {
                StringBuilder m24u = C0000a.m24u("This callable does not support a default call: ");
                m24u.append(mo32264o());
                throw new KotlinReflectionInternalError(m24u.toString());
            }
            try {
                Object[] array = arrayList.toArray(new Object[0]);
                if (array != null) {
                    return (R) mo32263m.call(array);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        List<KParameter> parameters2 = getParameters();
        ArrayList arrayList2 = new ArrayList(parameters2.size());
        ArrayList arrayList3 = new ArrayList(1);
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        for (KParameter kParameter2 : parameters2) {
            if (i2 != 0 && i2 % 32 == 0) {
                arrayList3.add(Integer.valueOf(i3));
                i3 = 0;
            }
            if (args.containsKey(kParameter2)) {
                arrayList2.add(args.get(kParameter2));
            } else {
                if (!kParameter2.mo32245j()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter2);
                }
                KType receiver$0 = kParameter2.getType();
                Intrinsics.m32180i(receiver$0, "receiver$0");
                Type m32302i = ((KTypeImpl) receiver$0).m32302i();
                if (!(m32302i instanceof Class) || !((Class) m32302i).isPrimitive()) {
                    obj = null;
                } else if (Intrinsics.m32174c(m32302i, Boolean.TYPE)) {
                    obj = Boolean.FALSE;
                } else if (Intrinsics.m32174c(m32302i, Character.TYPE)) {
                    obj = Character.valueOf((char) 0);
                } else if (Intrinsics.m32174c(m32302i, Byte.TYPE)) {
                    obj = Byte.valueOf((byte) 0);
                } else if (Intrinsics.m32174c(m32302i, Short.TYPE)) {
                    obj = Short.valueOf((short) 0);
                } else if (Intrinsics.m32174c(m32302i, Integer.TYPE)) {
                    obj = 0;
                } else if (Intrinsics.m32174c(m32302i, Float.TYPE)) {
                    obj = Float.valueOf(0.0f);
                } else if (Intrinsics.m32174c(m32302i, Long.TYPE)) {
                    obj = 0L;
                } else {
                    if (!Intrinsics.m32174c(m32302i, Double.TYPE)) {
                        if (Intrinsics.m32174c(m32302i, Void.TYPE)) {
                            throw new IllegalStateException("Parameter with void type is illegal");
                        }
                        throw new UnsupportedOperationException(C3033a.m17744f("Unknown primitive: ", m32302i));
                    }
                    obj = Double.valueOf(0.0d);
                }
                arrayList2.add(obj);
                i3 = (1 << (i2 % 32)) | i3;
                z = true;
            }
            if (kParameter2.mo32244g() == KParameter.Kind.VALUE) {
                i2++;
            }
        }
        if (!z) {
            Object[] array2 = arrayList2.toArray(new Object[0]);
            if (array2 != null) {
                return call(Arrays.copyOf(array2, array2.length));
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        arrayList3.add(Integer.valueOf(i3));
        Caller<?> mo32263m2 = mo32263m();
        if (mo32263m2 == null) {
            StringBuilder m24u2 = C0000a.m24u("This callable does not support a default call: ");
            m24u2.append(mo32264o());
            throw new KotlinReflectionInternalError(m24u2.toString());
        }
        arrayList2.addAll(arrayList3);
        arrayList2.add(null);
        try {
            Object[] array3 = arrayList2.toArray(new Object[0]);
            if (array3 != null) {
                return (R) mo32263m2.call(array3);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalAccessException e3) {
            throw new IllegalCallableAccessException(e3);
        }
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        List<Annotation> m32305a = this.f63462b.m32305a();
        Intrinsics.m32175d(m32305a, "_annotations()");
        return m32305a;
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public List<KParameter> getParameters() {
        ArrayList<KParameter> m32305a = this.f63463c.m32305a();
        Intrinsics.m32175d(m32305a, "_parameters()");
        return m32305a;
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public KType getReturnType() {
        KTypeImpl m32305a = this.f63464d.m32305a();
        Intrinsics.m32175d(m32305a, "_returnType()");
        return m32305a;
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        List<KTypeParameterImpl> m32305a = this.f63465e.m32305a();
        Intrinsics.m32175d(m32305a, "_typeParameters()");
        return m32305a;
    }

    @Override // kotlin.reflect.KCallable
    @Nullable
    public KVisibility getVisibility() {
        Visibility visibility = mo32264o().getVisibility();
        Intrinsics.m32175d(visibility, "descriptor.visibility");
        FqName fqName = UtilKt.f63641a;
        if (Intrinsics.m32174c(visibility, Visibilities.f63988e)) {
            return KVisibility.PUBLIC;
        }
        if (Intrinsics.m32174c(visibility, Visibilities.f63986c)) {
            return KVisibility.PROTECTED;
        }
        if (Intrinsics.m32174c(visibility, Visibilities.f63987d)) {
            return KVisibility.INTERNAL;
        }
        if (Intrinsics.m32174c(visibility, Visibilities.f63984a) || Intrinsics.m32174c(visibility, Visibilities.f63985b)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    @NotNull
    /* renamed from: h */
    public abstract Caller<?> mo32261h();

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return mo32264o().mo32441k() == Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return mo32264o().mo32441k() == Modality.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return mo32264o().mo32441k() == Modality.OPEN;
    }

    @NotNull
    /* renamed from: l */
    public abstract KDeclarationContainerImpl getF63589h();

    @Nullable
    /* renamed from: m */
    public abstract Caller<?> mo32263m();

    @NotNull
    /* renamed from: o */
    public abstract CallableMemberDescriptor mo32264o();

    /* renamed from: p */
    public final boolean m32265p() {
        return Intrinsics.m32174c(getF63590i(), "<init>") && getF63589h().mo32163h().isAnnotation();
    }

    /* renamed from: r */
    public abstract boolean mo32266r();
}
