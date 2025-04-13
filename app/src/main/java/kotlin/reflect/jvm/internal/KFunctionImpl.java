package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.CallerKt;
import kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: KFunctionImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB7\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0011¨\u0006\u0012"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "", "name", "signature", "descriptorInitialValue", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class KFunctionImpl extends KCallableImpl<Object> implements FunctionBase<Object>, KFunction<Object>, FunctionWithAllInvokes {

    /* renamed from: l */
    public static final /* synthetic */ KProperty[] f63528l = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(KFunctionImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(KFunctionImpl.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(KFunctionImpl.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

    /* renamed from: f */
    @NotNull
    public final ReflectProperties.LazySoftVal f63529f;

    /* renamed from: g */
    @NotNull
    public final ReflectProperties.LazySoftVal f63530g;

    /* renamed from: h */
    @Nullable
    public final ReflectProperties.LazySoftVal f63531h;

    /* renamed from: i */
    @NotNull
    public final KDeclarationContainerImpl f63532i;

    /* renamed from: j */
    public final String f63533j;

    /* renamed from: k */
    public final Object f63534k;

    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, final String str, String str2, FunctionDescriptor functionDescriptor, Object obj) {
        this.f63532i = kDeclarationContainerImpl;
        this.f63533j = str2;
        this.f63534k = obj;
        this.f63529f = new ReflectProperties.LazySoftVal(functionDescriptor, new Function0<FunctionDescriptor>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public FunctionDescriptor invoke() {
                KFunctionImpl kFunctionImpl = KFunctionImpl.this;
                KDeclarationContainerImpl kDeclarationContainerImpl2 = kFunctionImpl.f63532i;
                String name = str;
                String signature = kFunctionImpl.f63533j;
                Objects.requireNonNull(kDeclarationContainerImpl2);
                Intrinsics.m32180i(name, "name");
                Intrinsics.m32180i(signature, "signature");
                Collection<FunctionDescriptor> m32027j0 = Intrinsics.m32174c(name, "<init>") ? CollectionsKt.m32027j0(kDeclarationContainerImpl2.mo32254l()) : kDeclarationContainerImpl2.mo32255n(Name.m33211d(name));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : m32027j0) {
                    if (Intrinsics.m32174c(RuntimeTypeMapper.f63639b.m32316d((FunctionDescriptor) obj2).getF63449a(), signature)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.size() == 1) {
                    return (FunctionDescriptor) CollectionsKt.m32011X(arrayList);
                }
                String m31989B = CollectionsKt.m31989B(m32027j0, "\n", null, null, 0, null, new Function1<FunctionDescriptor, String>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1
                    @Override // kotlin.jvm.functions.Function1
                    public String invoke(FunctionDescriptor functionDescriptor2) {
                        FunctionDescriptor descriptor = functionDescriptor2;
                        Intrinsics.m32180i(descriptor, "descriptor");
                        return DescriptorRenderer.f65767b.mo33363r(descriptor) + " | " + RuntimeTypeMapper.f63639b.m32316d(descriptor);
                    }
                }, 30, null);
                StringBuilder m29z = C0000a.m29z("Function '", name, "' (JVM signature: ", signature, ") not resolved in ");
                m29z.append(kDeclarationContainerImpl2);
                m29z.append(':');
                m29z.append(m31989B.length() == 0 ? " no members found" : '\n' + m31989B);
                throw new KotlinReflectionInternalError(m29z.toString());
            }
        });
        this.f63530g = ReflectProperties.m32304a(new Function0<Caller<? extends Member>>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$caller$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Caller<? extends Member> invoke() {
                Object obj2;
                CallerImpl boundStatic;
                AnnotationConstructorCaller.CallMode callMode = AnnotationConstructorCaller.CallMode.POSITIONAL_CALL;
                JvmFunctionSignature m32316d = RuntimeTypeMapper.f63639b.m32316d(KFunctionImpl.this.mo32264o());
                if (m32316d instanceof JvmFunctionSignature.KotlinConstructor) {
                    if (KFunctionImpl.this.m32265p()) {
                        Class<?> mo32163h = KFunctionImpl.this.f63532i.mo32163h();
                        List<KParameter> parameters = KFunctionImpl.this.getParameters();
                        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(parameters, 10));
                        Iterator<T> it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((KParameter) it.next()).getName();
                            if (name == null) {
                                Intrinsics.m32188q();
                                throw null;
                            }
                            arrayList.add(name);
                        }
                        return new AnnotationConstructorCaller(mo32163h, arrayList, callMode, AnnotationConstructorCaller.Origin.KOTLIN, null, 16);
                    }
                    KFunctionImpl kFunctionImpl = KFunctionImpl.this;
                    KDeclarationContainerImpl kDeclarationContainerImpl2 = kFunctionImpl.f63532i;
                    String desc = ((JvmFunctionSignature.KotlinConstructor) m32316d).f63448b.f65576b;
                    boolean m32323f = UtilKt.m32323f(kFunctionImpl.mo32264o());
                    Objects.requireNonNull(kDeclarationContainerImpl2);
                    Intrinsics.m32180i(desc, "desc");
                    obj2 = kDeclarationContainerImpl2.m32280w(kDeclarationContainerImpl2.mo32163h(), kDeclarationContainerImpl2.m32276s(desc), !m32323f);
                } else if (m32316d instanceof JvmFunctionSignature.KotlinFunction) {
                    KFunctionImpl kFunctionImpl2 = KFunctionImpl.this;
                    KDeclarationContainerImpl kDeclarationContainerImpl3 = kFunctionImpl2.f63532i;
                    JvmMemberSignature.Method method = ((JvmFunctionSignature.KotlinFunction) m32316d).f63450b;
                    obj2 = kDeclarationContainerImpl3.m32273k(method.f65575a, method.f65576b, UtilKt.m32323f(kFunctionImpl2.mo32264o()));
                } else if (m32316d instanceof JvmFunctionSignature.JavaMethod) {
                    obj2 = ((JvmFunctionSignature.JavaMethod) m32316d).f63446a;
                } else {
                    if (!(m32316d instanceof JvmFunctionSignature.JavaConstructor)) {
                        if (!(m32316d instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List<Method> list = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) m32316d).f63442a;
                        Class<?> mo32163h2 = KFunctionImpl.this.f63532i.mo32163h();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(list, 10));
                        for (Method it2 : list) {
                            Intrinsics.m32175d(it2, "it");
                            arrayList2.add(it2.getName());
                        }
                        return new AnnotationConstructorCaller(mo32163h2, arrayList2, callMode, AnnotationConstructorCaller.Origin.JAVA, list);
                    }
                    obj2 = ((JvmFunctionSignature.JavaConstructor) m32316d).f63444a;
                }
                if (obj2 instanceof Constructor) {
                    KFunctionImpl kFunctionImpl3 = KFunctionImpl.this;
                    Constructor constructor = (Constructor) obj2;
                    boundStatic = kFunctionImpl3.mo32266r() ? new CallerImpl.BoundConstructor(constructor, kFunctionImpl3.f63534k) : new CallerImpl.Constructor(constructor);
                } else {
                    if (!(obj2 instanceof Method)) {
                        StringBuilder m24u = C0000a.m24u("Could not compute caller for function: ");
                        m24u.append(KFunctionImpl.this.mo32264o());
                        m24u.append(" (member = ");
                        m24u.append(obj2);
                        m24u.append(')');
                        throw new KotlinReflectionInternalError(m24u.toString());
                    }
                    Method method2 = (Method) obj2;
                    if (!Modifier.isStatic(method2.getModifiers())) {
                        KFunctionImpl kFunctionImpl4 = KFunctionImpl.this;
                        boundStatic = kFunctionImpl4.mo32266r() ? new CallerImpl.Method.BoundInstance(method2, kFunctionImpl4.f63534k) : new CallerImpl.Method.Instance(method2);
                    } else if (KFunctionImpl.this.mo32264o().getAnnotations().mo32593h(UtilKt.f63641a) != null) {
                        boundStatic = KFunctionImpl.this.mo32266r() ? new CallerImpl.Method.BoundJvmStaticInObject(method2) : new CallerImpl.Method.JvmStaticInObject(method2);
                    } else {
                        KFunctionImpl kFunctionImpl5 = KFunctionImpl.this;
                        boundStatic = kFunctionImpl5.mo32266r() ? new CallerImpl.Method.BoundStatic(method2, kFunctionImpl5.f63534k) : new CallerImpl.Method.Static(method2);
                    }
                }
                return InlineClassAwareCallerKt.m32338a(boundStatic, KFunctionImpl.this.mo32264o(), false);
            }
        });
        this.f63531h = ReflectProperties.m32304a(new Function0<Caller<? extends Member>>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$defaultCaller$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.reflect.Member] */
            @Override // kotlin.jvm.functions.Function0
            public Caller<? extends Member> invoke() {
                GenericDeclaration m32280w;
                CallerImpl callerImpl;
                AnnotationConstructorCaller.CallMode callMode = AnnotationConstructorCaller.CallMode.CALL_BY_NAME;
                JvmFunctionSignature m32316d = RuntimeTypeMapper.f63639b.m32316d(KFunctionImpl.this.mo32264o());
                if (m32316d instanceof JvmFunctionSignature.KotlinFunction) {
                    KFunctionImpl kFunctionImpl = KFunctionImpl.this;
                    KDeclarationContainerImpl kDeclarationContainerImpl2 = kFunctionImpl.f63532i;
                    JvmMemberSignature.Method method = ((JvmFunctionSignature.KotlinFunction) m32316d).f63450b;
                    String name = method.f65575a;
                    String desc = method.f65576b;
                    ?? member = kFunctionImpl.mo32261h().getMember();
                    if (member == 0) {
                        Intrinsics.m32188q();
                        throw null;
                    }
                    boolean z = !Modifier.isStatic(member.getModifiers());
                    boolean m32323f = UtilKt.m32323f(KFunctionImpl.this.mo32264o());
                    Objects.requireNonNull(kDeclarationContainerImpl2);
                    Intrinsics.m32180i(name, "name");
                    Intrinsics.m32180i(desc, "desc");
                    if (!Intrinsics.m32174c(name, "<init>")) {
                        ArrayList arrayList = new ArrayList();
                        if (z) {
                            arrayList.add(kDeclarationContainerImpl2.mo32163h());
                        }
                        kDeclarationContainerImpl2.m32272i(arrayList, desc, false);
                        m32280w = kDeclarationContainerImpl2.m32278u(kDeclarationContainerImpl2.mo32275q(), C0000a.m14k(name, "$default"), arrayList, kDeclarationContainerImpl2.m32277t(desc), m32323f);
                    }
                    m32280w = null;
                } else if (!(m32316d instanceof JvmFunctionSignature.KotlinConstructor)) {
                    if (m32316d instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor) {
                        List<Method> list = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) m32316d).f63442a;
                        Class<?> mo32163h = KFunctionImpl.this.f63532i.mo32163h();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(list, 10));
                        for (Method it : list) {
                            Intrinsics.m32175d(it, "it");
                            arrayList2.add(it.getName());
                        }
                        return new AnnotationConstructorCaller(mo32163h, arrayList2, callMode, AnnotationConstructorCaller.Origin.JAVA, list);
                    }
                    m32280w = null;
                } else {
                    if (KFunctionImpl.this.m32265p()) {
                        Class<?> mo32163h2 = KFunctionImpl.this.f63532i.mo32163h();
                        List<KParameter> parameters = KFunctionImpl.this.getParameters();
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.m32032m(parameters, 10));
                        Iterator<T> it2 = parameters.iterator();
                        while (it2.hasNext()) {
                            String name2 = ((KParameter) it2.next()).getName();
                            if (name2 == null) {
                                Intrinsics.m32188q();
                                throw null;
                            }
                            arrayList3.add(name2);
                        }
                        return new AnnotationConstructorCaller(mo32163h2, arrayList3, callMode, AnnotationConstructorCaller.Origin.KOTLIN, null, 16);
                    }
                    KFunctionImpl kFunctionImpl2 = KFunctionImpl.this;
                    KDeclarationContainerImpl kDeclarationContainerImpl3 = kFunctionImpl2.f63532i;
                    String desc2 = ((JvmFunctionSignature.KotlinConstructor) m32316d).f63448b.f65576b;
                    boolean m32323f2 = UtilKt.m32323f(kFunctionImpl2.mo32264o());
                    Objects.requireNonNull(kDeclarationContainerImpl3);
                    Intrinsics.m32180i(desc2, "desc");
                    ArrayList arrayList4 = new ArrayList();
                    kDeclarationContainerImpl3.m32272i(arrayList4, desc2, true);
                    m32280w = kDeclarationContainerImpl3.m32280w(kDeclarationContainerImpl3.mo32163h(), arrayList4, !m32323f2);
                }
                if (m32280w instanceof Constructor) {
                    KFunctionImpl kFunctionImpl3 = KFunctionImpl.this;
                    Constructor constructor = (Constructor) m32280w;
                    callerImpl = kFunctionImpl3.mo32266r() ? new CallerImpl.BoundConstructor(constructor, kFunctionImpl3.f63534k) : new CallerImpl.Constructor(constructor);
                } else if (m32280w instanceof Method) {
                    if (KFunctionImpl.this.mo32264o().getAnnotations().mo32593h(UtilKt.f63641a) != null) {
                        DeclarationDescriptor mo32437b = KFunctionImpl.this.mo32264o().mo32437b();
                        if (mo32437b == null) {
                            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        }
                        if (!((ClassDescriptor) mo32437b).mo32446y()) {
                            Method method2 = (Method) m32280w;
                            callerImpl = KFunctionImpl.this.mo32266r() ? new CallerImpl.Method.BoundJvmStaticInObject(method2) : new CallerImpl.Method.JvmStaticInObject(method2);
                        }
                    }
                    KFunctionImpl kFunctionImpl4 = KFunctionImpl.this;
                    Method method3 = (Method) m32280w;
                    callerImpl = kFunctionImpl4.mo32266r() ? new CallerImpl.Method.BoundStatic(method3, kFunctionImpl4.f63534k) : new CallerImpl.Method.Static(method3);
                } else {
                    callerImpl = null;
                }
                return callerImpl != null ? InlineClassAwareCallerKt.m32338a(callerImpl, KFunctionImpl.this.mo32264o(), true) : null;
            }
        });
    }

    @Override // kotlin.jvm.functions.Function7
    @Nullable
    /* renamed from: A */
    public Object mo32153A(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public boolean equals(@Nullable Object obj) {
        KFunctionImpl m32318a = UtilKt.m32318a(obj);
        return m32318a != null && Intrinsics.m32174c(this.f63532i, m32318a.f63532i) && Intrinsics.m32174c(getF63590i(), m32318a.getF63590i()) && Intrinsics.m32174c(this.f63533j, m32318a.f63533j) && Intrinsics.m32174c(this.f63534k, m32318a.f63534k);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    /* renamed from: getArity */
    public int getF63251c() {
        return CallerKt.m32335a(mo32261h());
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    /* renamed from: getName */
    public String getF63590i() {
        String str = mo32264o().getName().f65606b;
        Intrinsics.m32175d(str, "descriptor.name.asString()");
        return str;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    /* renamed from: h */
    public Caller<?> mo32261h() {
        ReflectProperties.LazySoftVal lazySoftVal = this.f63530g;
        KProperty kProperty = f63528l[1];
        return (Caller) lazySoftVal.m32305a();
    }

    public int hashCode() {
        return this.f63533j.hashCode() + ((getF63590i().hashCode() + (this.f63532i.hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public Object invoke() {
        return call(new Object[0]);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return mo32264o().isSuspend();
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    /* renamed from: k */
    public Object mo16505k(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    /* renamed from: l, reason: from getter */
    public KDeclarationContainerImpl getF63532i() {
        return this.f63532i;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @Nullable
    /* renamed from: m */
    public Caller<?> mo32263m() {
        ReflectProperties.LazySoftVal lazySoftVal = this.f63531h;
        KProperty kProperty = f63528l[2];
        return (Caller) lazySoftVal.m32305a();
    }

    @Override // kotlin.jvm.functions.Function4
    @Nullable
    /* renamed from: n */
    public Object mo1110n(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // kotlin.jvm.functions.Function6
    @Nullable
    /* renamed from: q */
    public Object mo32152q(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* renamed from: r */
    public boolean mo32266r() {
        return !Intrinsics.m32174c(this.f63534k, CallableReference.NO_RECEIVER);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public FunctionDescriptor mo32264o() {
        ReflectProperties.LazySoftVal lazySoftVal = this.f63529f;
        KProperty kProperty = f63528l[0];
        return (FunctionDescriptor) lazySoftVal.m32305a();
    }

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.f63635b.m32310c(mo32264o());
    }

    @Override // kotlin.jvm.functions.Function5
    @Nullable
    /* renamed from: v */
    public Object mo32151v(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public Object invoke(@Nullable Object obj) {
        return call(obj);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2) {
        return call(obj, obj2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public KFunctionImpl(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.KDeclarationContainerImpl r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.m32180i(r8, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.m32180i(r9, r0)
            kotlin.reflect.jvm.internal.impl.name.Name r0 = r9.getName()
            java.lang.String r3 = r0.f65606b
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.jvm.internal.Intrinsics.m32175d(r3, r0)
            kotlin.reflect.jvm.internal.RuntimeTypeMapper r0 = kotlin.reflect.jvm.internal.RuntimeTypeMapper.f63639b
            kotlin.reflect.jvm.internal.JvmFunctionSignature r0 = r0.m32316d(r9)
            java.lang.String r4 = r0.getF63449a()
            java.lang.Object r6 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KFunctionImpl.<init>(kotlin.reflect.jvm.internal.KDeclarationContainerImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor):void");
    }
}
