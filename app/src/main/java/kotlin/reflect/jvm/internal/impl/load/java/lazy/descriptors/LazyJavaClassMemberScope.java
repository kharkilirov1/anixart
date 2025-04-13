package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: LazyJavaClassMemberScope.kt */
/* loaded from: classes3.dex */
public final class LazyJavaClassMemberScope extends LazyJavaScope {

    /* renamed from: k */
    @NotNull
    public final NotNullLazyValue<List<ClassConstructorDescriptor>> f64532k;

    /* renamed from: l */
    public final NotNullLazyValue<Set<Name>> f64533l;

    /* renamed from: m */
    public final NotNullLazyValue<Map<Name, JavaField>> f64534m;

    /* renamed from: n */
    public final MemoizedFunctionToNullable<Name, ClassDescriptorBase> f64535n;

    /* renamed from: o */
    @NotNull
    public final ClassDescriptor f64536o;

    /* renamed from: p */
    public final JavaClass f64537p;

    public LazyJavaClassMemberScope(@NotNull final LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull JavaClass javaClass) {
        super(lazyJavaResolverContext);
        this.f64536o = classDescriptor;
        this.f64537p = javaClass;
        this.f64532k = lazyJavaResolverContext.f64479c.f64446a.mo33623c(new Function0<List<? extends ClassConstructorDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$constructors$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
            @Override // kotlin.jvm.functions.Function0
            public List<? extends ClassConstructorDescriptor> invoke() {
                List<ValueParameterDescriptor> emptyList;
                Pair pair;
                CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.DECLARATION;
                Collection<JavaConstructor> mo32810l = LazyJavaClassMemberScope.this.f64537p.mo32810l();
                ArrayList arrayList = new ArrayList(mo32810l.size());
                Iterator<JavaConstructor> it = mo32810l.iterator();
                while (true) {
                    JavaClassConstructorDescriptor javaClassConstructorDescriptor = null;
                    if (!it.hasNext()) {
                        LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaResolverContext;
                        SignatureEnhancement signatureEnhancement = lazyJavaResolverContext2.f64479c.f64463r;
                        boolean isEmpty = arrayList.isEmpty();
                        ArrayList arrayList2 = arrayList;
                        if (isEmpty) {
                            LazyJavaClassMemberScope lazyJavaClassMemberScope = LazyJavaClassMemberScope.this;
                            boolean mo32811p = lazyJavaClassMemberScope.f64537p.mo32811p();
                            if (!lazyJavaClassMemberScope.f64537p.mo32803A() || mo32811p) {
                                ClassDescriptor classDescriptor2 = lazyJavaClassMemberScope.f64536o;
                                int i2 = Annotations.f64023H1;
                                JavaClassConstructorDescriptor javaClassConstructorDescriptor2 = new JavaClassConstructorDescriptor(classDescriptor2, null, Annotations.Companion.f64024a, true, kind, lazyJavaClassMemberScope.f64582i.f64479c.f64455j.mo32360a(lazyJavaClassMemberScope.f64537p));
                                if (mo32811p) {
                                    Collection<JavaMethod> mo32806F = lazyJavaClassMemberScope.f64537p.mo32806F();
                                    emptyList = new ArrayList<>(mo32806F.size());
                                    JavaTypeAttributes m32782c = JavaTypeResolverKt.m32782c(TypeUsage.COMMON, true, null, 2);
                                    ArrayList arrayList3 = new ArrayList();
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj : mo32806F) {
                                        if (Intrinsics.m32174c(((JavaMethod) obj).getName(), JvmAnnotationNames.f64349b)) {
                                            arrayList3.add(obj);
                                        } else {
                                            arrayList4.add(obj);
                                        }
                                    }
                                    arrayList3.size();
                                    JavaMethod javaMethod = (JavaMethod) CollectionsKt.m32046w(arrayList3);
                                    if (javaMethod != null) {
                                        JavaType returnType = javaMethod.getReturnType();
                                        if (returnType instanceof JavaArrayType) {
                                            JavaArrayType javaArrayType = (JavaArrayType) returnType;
                                            pair = new Pair(lazyJavaClassMemberScope.f64582i.f64478b.m32776c(javaArrayType, m32782c, true), lazyJavaClassMemberScope.f64582i.f64478b.m32777d(javaArrayType.mo32802m(), m32782c));
                                        } else {
                                            pair = new Pair(lazyJavaClassMemberScope.f64582i.f64478b.m32777d(returnType, m32782c), null);
                                        }
                                        lazyJavaClassMemberScope.m32762w(emptyList, javaClassConstructorDescriptor2, 0, javaMethod, (KotlinType) pair.f63055b, (KotlinType) pair.f63056c);
                                    }
                                    int i3 = javaMethod != null ? 1 : 0;
                                    Iterator it2 = arrayList4.iterator();
                                    int i4 = 0;
                                    while (it2.hasNext()) {
                                        JavaMethod javaMethod2 = (JavaMethod) it2.next();
                                        lazyJavaClassMemberScope.m32762w(emptyList, javaClassConstructorDescriptor2, i4 + i3, javaMethod2, lazyJavaClassMemberScope.f64582i.f64478b.m32777d(javaMethod2.getReturnType(), m32782c), null);
                                        i4++;
                                    }
                                } else {
                                    emptyList = Collections.emptyList();
                                }
                                javaClassConstructorDescriptor2.mo32627J0(false);
                                Visibility visibility = classDescriptor2.getVisibility();
                                Intrinsics.m32175d(visibility, "classDescriptor.visibility");
                                if (Intrinsics.m32174c(visibility, JavaVisibilities.f64345b)) {
                                    visibility = JavaVisibilities.f64346c;
                                    Intrinsics.m32175d(visibility, "JavaVisibilities.PROTECTED_AND_PACKAGE");
                                }
                                javaClassConstructorDescriptor2.m32610L0(emptyList, visibility);
                                javaClassConstructorDescriptor2.mo32626I0(true);
                                javaClassConstructorDescriptor2.f64123g = classDescriptor2.mo32502r();
                                lazyJavaClassMemberScope.f64582i.f64479c.f64452g.mo32704b(lazyJavaClassMemberScope.f64537p, javaClassConstructorDescriptor2);
                                javaClassConstructorDescriptor = javaClassConstructorDescriptor2;
                            }
                            arrayList2 = CollectionsKt.m31995H(javaClassConstructorDescriptor);
                        }
                        return CollectionsKt.m32027j0(signatureEnhancement.m32846a(lazyJavaResolverContext2, arrayList2));
                    }
                    JavaConstructor next = it.next();
                    LazyJavaClassMemberScope lazyJavaClassMemberScope2 = LazyJavaClassMemberScope.this;
                    ClassDescriptor classDescriptor3 = lazyJavaClassMemberScope2.f64536o;
                    JavaClassConstructorDescriptor javaClassConstructorDescriptor3 = new JavaClassConstructorDescriptor(classDescriptor3, null, LazyJavaAnnotationsKt.m32722a(lazyJavaClassMemberScope2.f64582i, next), false, kind, lazyJavaClassMemberScope2.f64582i.f64479c.f64455j.mo32360a(next));
                    LazyJavaResolverContext m32717b = ContextKt.m32717b(lazyJavaClassMemberScope2.f64582i, javaClassConstructorDescriptor3, next, classDescriptor3.mo32443t().size());
                    LazyJavaScope.ResolvedValueParameters m32771t = lazyJavaClassMemberScope2.m32771t(m32717b, javaClassConstructorDescriptor3, next.mo32820f());
                    List<TypeParameterDescriptor> mo32443t = classDescriptor3.mo32443t();
                    Intrinsics.m32175d(mo32443t, "classDescriptor.declaredTypeParameters");
                    List<JavaTypeParameter> typeParameters = next.getTypeParameters();
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.m32032m(typeParameters, 10));
                    Iterator it3 = typeParameters.iterator();
                    while (it3.hasNext()) {
                        TypeParameterDescriptor mo32725a = m32717b.f64480d.mo32725a((JavaTypeParameter) it3.next());
                        if (mo32725a == null) {
                            Intrinsics.m32188q();
                            throw null;
                        }
                        arrayList5.add(mo32725a);
                    }
                    javaClassConstructorDescriptor3.m32611M0(m32771t.f64589a, next.getVisibility(), CollectionsKt.m32002O(mo32443t, arrayList5));
                    javaClassConstructorDescriptor3.mo32626I0(false);
                    javaClassConstructorDescriptor3.mo32627J0(m32771t.f64590b);
                    javaClassConstructorDescriptor3.f64123g = classDescriptor3.mo32502r();
                    m32717b.f64479c.f64452g.mo32704b(next, javaClassConstructorDescriptor3);
                    arrayList.add(javaClassConstructorDescriptor3);
                }
            }
        });
        this.f64533l = lazyJavaResolverContext.f64479c.f64446a.mo33623c(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClassIndex$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Set<? extends Name> invoke() {
                return CollectionsKt.m32035n0(LazyJavaClassMemberScope.this.f64537p.mo32805D());
            }
        });
        this.f64534m = lazyJavaResolverContext.f64479c.f64446a.mo33623c(new Function0<Map<Name, ? extends JavaField>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$enumEntryIndex$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Map<Name, ? extends JavaField> invoke() {
                Collection<JavaField> mo32813x = LazyJavaClassMemberScope.this.f64537p.mo32813x();
                ArrayList arrayList = new ArrayList();
                for (Object obj : mo32813x) {
                    if (((JavaField) obj).mo32824z()) {
                        arrayList.add(obj);
                    }
                }
                int m32062g = MapsKt.m32062g(CollectionsKt.m32032m(arrayList, 10));
                if (m32062g < 16) {
                    m32062g = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(m32062g);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((JavaField) next).getName(), next);
                }
                return linkedHashMap;
            }
        });
        this.f64535n = lazyJavaResolverContext.f64479c.f64446a.mo33627g(new LazyJavaClassMemberScope$nestedClasses$1(this, lazyJavaResolverContext));
    }

    @NotNull
    /* renamed from: u */
    public static final Collection m32736u(LazyJavaClassMemberScope lazyJavaClassMemberScope, @NotNull Name name) {
        Collection<JavaMethod> mo32730d = lazyJavaClassMemberScope.f64576c.invoke().mo32730d(name);
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo32730d, 10));
        Iterator<T> it = mo32730d.iterator();
        while (it.hasNext()) {
            arrayList.add(lazyJavaClassMemberScope.m32770s((JavaMethod) it.next()));
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: v */
    public static final Collection m32737v(LazyJavaClassMemberScope lazyJavaClassMemberScope, @NotNull Name name) {
        Set<SimpleFunctionDescriptor> m32747J = lazyJavaClassMemberScope.m32747J(name);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m32747J) {
            SimpleFunctionDescriptor receiver$0 = (SimpleFunctionDescriptor) obj;
            Intrinsics.m32180i(receiver$0, "receiver$0");
            boolean z = true;
            if (!(SpecialBuiltinMembers.m32692e(receiver$0) != null) && BuiltinMethodsWithSpecialGenericSignature.m32670a(receiver$0) == null) {
                z = false;
            }
            if (!z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public final SimpleFunctionDescriptor m32738A(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor, CallableDescriptor callableDescriptor, Collection<? extends SimpleFunctionDescriptor> collection) {
        boolean z = false;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : collection) {
                if ((Intrinsics.m32174c(simpleFunctionDescriptor, simpleFunctionDescriptor2) ^ true) && simpleFunctionDescriptor2.mo32523d0() == null && m32742E(simpleFunctionDescriptor2, callableDescriptor)) {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return simpleFunctionDescriptor;
        }
        SimpleFunctionDescriptor mo32527A = simpleFunctionDescriptor.mo32524s().mo32539l().mo32527A();
        if (mo32527A != null) {
            return mo32527A;
        }
        Intrinsics.m32188q();
        throw null;
    }

    /* renamed from: B */
    public final SimpleFunctionDescriptor m32739B(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor, Name name) {
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> mo32524s = simpleFunctionDescriptor.mo32524s();
        mo32524s.mo32542o(name);
        mo32524s.mo32543p();
        mo32524s.mo32532e();
        SimpleFunctionDescriptor mo32527A = mo32524s.mo32527A();
        if (mo32527A != null) {
            return mo32527A;
        }
        Intrinsics.m32188q();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor m32740C(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.mo32489f()
            java.lang.String r1 = "valueParameters"
            kotlin.jvm.internal.Intrinsics.m32175d(r0, r1)
            java.lang.Object r0 = kotlin.collections.CollectionsKt.m31992E(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r0
            r2 = 0
            if (r0 == 0) goto L86
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r0.getType()
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r3 = r3.mo33515H0()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r3 = r3.mo32449b()
            if (r3 == 0) goto L38
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r3 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.m33468d(r3)
            java.lang.String r4 = "DescriptorUtils.getFqName(this)"
            kotlin.jvm.internal.Intrinsics.m32175d(r3, r4)
            boolean r4 = r3.m33204d()
            if (r4 == 0) goto L30
            goto L31
        L30:
            r3 = r2
        L31:
            if (r3 == 0) goto L38
            kotlin.reflect.jvm.internal.impl.name.FqName r3 = r3.m33207g()
            goto L39
        L38:
            r3 = r2
        L39:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r4 = r5.f64582i
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r4 = r4.f64479c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings r4 = r4.f64465t
            boolean r4 = r4.mo32720a()
            boolean r3 = kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt.m32423a(r3, r4)
            if (r3 == 0) goto L4a
            goto L4b
        L4a:
            r0 = r2
        L4b:
            if (r0 == 0) goto L86
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r2 = r6.mo32524s()
            java.util.List r6 = r6.mo32489f()
            kotlin.jvm.internal.Intrinsics.m32175d(r6, r1)
            r1 = 1
            java.util.List r6 = kotlin.collections.CollectionsKt.m32040q(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r6 = r2.mo32528a(r6)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            java.util.List r0 = r0.mo33514G0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r0 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) r0
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r6 = r6.mo32533f(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r6 = r6.mo32527A()
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) r6
            r0 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl) r0
            if (r0 == 0) goto L85
            r0.f64137u = r1
        L85:
            return r6
        L86:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.m32740C(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor):kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor");
    }

    /* renamed from: D */
    public final boolean m32741D(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        if (JavaDescriptorUtilKt.m32731a(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor m32745H = m32745H(propertyDescriptor, function1);
        SimpleFunctionDescriptor m32746I = m32746I(propertyDescriptor, function1);
        if (m32745H == null) {
            return false;
        }
        if (propertyDescriptor.mo32575i0()) {
            return m32746I != null && m32746I.mo32441k() == m32745H.mo32441k();
        }
        return true;
    }

    /* renamed from: E */
    public final boolean m32742E(@NotNull CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.f65893c.m33508m(callableDescriptor2, callableDescriptor, true).f65905a;
        Intrinsics.m32175d(result, "OverridingUtil.DEFAULT.i…iptor, this, true).result");
        return result == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !JavaIncompatibilityRulesOverridabilityCondition.f64343a.m32679a(callableDescriptor2, callableDescriptor);
    }

    /* renamed from: F */
    public final boolean m32743F(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        if (BuiltinMethodsWithDifferentJvmName.f64309f.m32669a(simpleFunctionDescriptor)) {
            functionDescriptor = functionDescriptor.mo32487a();
        }
        Intrinsics.m32175d(functionDescriptor, "if (superDescriptor.isRe…iginal else subDescriptor");
        return m32742E(functionDescriptor, simpleFunctionDescriptor);
    }

    /* renamed from: G */
    public final SimpleFunctionDescriptor m32744G(@NotNull PropertyDescriptor propertyDescriptor, String str, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Iterator<T> it = function1.invoke(Name.m33211d(str)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.mo32489f().size() == 0) {
                NewKotlinTypeChecker newKotlinTypeChecker = NewKotlinTypeChecker.f66379b;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType != null ? newKotlinTypeChecker.m33713h(returnType, propertyDescriptor.getType()) : false) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    /* renamed from: H */
    public final SimpleFunctionDescriptor m32745H(@NotNull PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        PropertyGetterDescriptor propertyGetterDescriptor = getter != null ? (PropertyGetterDescriptor) SpecialBuiltinMembers.m32692e(getter) : null;
        String m32674a = propertyGetterDescriptor != null ? BuiltinSpecialProperties.f64334e.m32674a(propertyGetterDescriptor) : null;
        if (m32674a != null && !SpecialBuiltinMembers.m32694g(this.f64536o, propertyGetterDescriptor)) {
            return m32744G(propertyDescriptor, m32674a, function1);
        }
        String m32683a = JvmAbi.m32683a(propertyDescriptor.getName().f65606b);
        Intrinsics.m32175d(m32683a, "JvmAbi.getterName(name.asString())");
        return m32744G(propertyDescriptor, m32683a, function1);
    }

    /* renamed from: I */
    public final SimpleFunctionDescriptor m32746I(@NotNull PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        KotlinType returnType;
        Iterator<T> it = function1.invoke(Name.m33211d(JvmAbi.m32684b(propertyDescriptor.getName().f65606b))).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.mo32489f().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null && KotlinBuiltIns.m32387O(returnType)) {
                NewKotlinTypeChecker newKotlinTypeChecker = NewKotlinTypeChecker.f66379b;
                List<ValueParameterDescriptor> mo32489f = simpleFunctionDescriptor2.mo32489f();
                Intrinsics.m32175d(mo32489f, "descriptor.valueParameters");
                Object m32011X = CollectionsKt.m32011X(mo32489f);
                Intrinsics.m32175d(m32011X, "descriptor.valueParameters.single()");
                if (newKotlinTypeChecker.mo33701a(((ValueParameterDescriptor) m32011X).getType(), propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    /* renamed from: J */
    public final Set<SimpleFunctionDescriptor> m32747J(Name name) {
        TypeConstructor mo32440j = this.f64536o.mo32440j();
        Intrinsics.m32175d(mo32440j, "ownerDescriptor.typeConstructor");
        Collection<KotlinType> mo32602a = mo32440j.mo32602a();
        Intrinsics.m32175d(mo32602a, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = mo32602a.iterator();
        while (it.hasNext()) {
            CollectionsKt.m32020g(linkedHashSet, ((KotlinType) it.next()).mo32791p().mo32614a(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    /* renamed from: K */
    public final Set<PropertyDescriptor> m32748K(Name name) {
        TypeConstructor mo32440j = this.f64536o.mo32440j();
        Intrinsics.m32175d(mo32440j, "ownerDescriptor.typeConstructor");
        Collection<KotlinType> mo32602a = mo32440j.mo32602a();
        Intrinsics.m32175d(mo32602a, "ownerDescriptor.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = mo32602a.iterator();
        while (it.hasNext()) {
            Collection<PropertyDescriptor> mo32617e = ((KotlinType) it.next()).mo32791p().mo32617e(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(mo32617e, 10));
            Iterator<T> it2 = mo32617e.iterator();
            while (it2.hasNext()) {
                arrayList2.add((PropertyDescriptor) it2.next());
            }
            CollectionsKt.m32020g(arrayList, arrayList2);
        }
        return CollectionsKt.m32035n0(arrayList);
    }

    /* renamed from: L */
    public final boolean m32749L(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        String m32928a = MethodSignatureMappingKt.m32928a(simpleFunctionDescriptor, false, false, 2);
        FunctionDescriptor mo32487a = functionDescriptor.mo32487a();
        Intrinsics.m32175d(mo32487a, "builtinWithErasedParameters.original");
        return Intrinsics.m32174c(m32928a, MethodSignatureMappingKt.m32928a(mo32487a, false, false, 2)) && !m32742E(simpleFunctionDescriptor, functionDescriptor);
    }

    /* renamed from: M */
    public final boolean m32750M(final SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Collection collection;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.m32175d(name, "function.name");
        String str = name.f65606b;
        Intrinsics.m32175d(str, "name.asString()");
        FqName fqName = JvmAbi.f64347a;
        if (str.startsWith("get") || str.startsWith("is")) {
            Name m32687b = PropertiesConventionUtilKt.m32687b(name, "get", false, null, 12);
            if (m32687b == null) {
                m32687b = PropertiesConventionUtilKt.m32687b(name, "is", false, null, 8);
            }
            collection = CollectionsKt.m31995H(m32687b);
        } else if (str.startsWith("set")) {
            collection = CollectionsKt.m32042s(CollectionsKt.m31994G(PropertiesConventionUtilKt.m32686a(name, false), PropertiesConventionUtilKt.m32686a(name, true)));
        } else {
            BuiltinSpecialProperties builtinSpecialProperties = BuiltinSpecialProperties.f64334e;
            collection = (List) ((LinkedHashMap) BuiltinSpecialProperties.f64331b).get(name);
            if (collection == null) {
                collection = EmptyList.f63144b;
            }
        }
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Set<PropertyDescriptor> m32748K = m32748K((Name) it.next());
                if (!m32748K.isEmpty()) {
                    for (PropertyDescriptor propertyDescriptor : m32748K) {
                        if (m32741D(propertyDescriptor, new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$$inlined$any$lambda$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public Collection<? extends SimpleFunctionDescriptor> invoke(Name name2) {
                                Name accessorName = name2;
                                Intrinsics.m32180i(accessorName, "accessorName");
                                return Intrinsics.m32174c(simpleFunctionDescriptor.getName(), accessorName) ? CollectionsKt.m31993F(simpleFunctionDescriptor) : CollectionsKt.m32002O(LazyJavaClassMemberScope.m32736u(LazyJavaClassMemberScope.this, accessorName), LazyJavaClassMemberScope.m32737v(LazyJavaClassMemberScope.this, accessorName));
                            }
                        }) && (propertyDescriptor.mo32575i0() || !simpleFunctionDescriptor.getName().f65606b.startsWith("set"))) {
                            z6 = true;
                            break;
                        }
                    }
                }
                z6 = false;
                if (z6) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return false;
        }
        BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName = BuiltinMethodsWithDifferentJvmName.f64309f;
        Name name2 = simpleFunctionDescriptor.getName();
        Intrinsics.m32175d(name2, "name");
        Collection<Name> collection2 = (List) ((LinkedHashMap) BuiltinMethodsWithDifferentJvmName.f64308e).get(name2);
        if (collection2 == null) {
            collection2 = EmptyList.f63144b;
        }
        if (!collection2.isEmpty()) {
            for (Name name3 : collection2) {
                Set<SimpleFunctionDescriptor> m32747J = m32747J(name3);
                ArrayList arrayList = new ArrayList();
                for (Object obj : m32747J) {
                    SimpleFunctionDescriptor receiver$0 = (SimpleFunctionDescriptor) obj;
                    Intrinsics.m32180i(receiver$0, "receiver$0");
                    if (SpecialBuiltinMembers.m32692e(receiver$0) != null) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    SimpleFunctionDescriptor m32739B = m32739B(simpleFunctionDescriptor, name3);
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (m32743F((SimpleFunctionDescriptor) it2.next(), m32739B)) {
                                z5 = true;
                                break;
                            }
                        }
                    }
                }
                z5 = false;
                if (z5) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (!z2) {
            BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.f64317g;
            Name name4 = simpleFunctionDescriptor.getName();
            Intrinsics.m32175d(name4, "name");
            if (builtinMethodsWithSpecialGenericSignature.m32671b(name4)) {
                Name name5 = simpleFunctionDescriptor.getName();
                Intrinsics.m32175d(name5, "name");
                Set<SimpleFunctionDescriptor> m32747J2 = m32747J(name5);
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it3 = m32747J2.iterator();
                while (it3.hasNext()) {
                    FunctionDescriptor m32670a = BuiltinMethodsWithSpecialGenericSignature.m32670a((SimpleFunctionDescriptor) it3.next());
                    if (m32670a != null) {
                        arrayList2.add(m32670a);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        if (m32749L(simpleFunctionDescriptor, (FunctionDescriptor) it4.next())) {
                            z3 = true;
                            break;
                        }
                    }
                }
            }
            z3 = false;
            if (!z3) {
                SimpleFunctionDescriptor m32740C = m32740C(simpleFunctionDescriptor);
                if (m32740C != null) {
                    Name name6 = simpleFunctionDescriptor.getName();
                    Intrinsics.m32175d(name6, "name");
                    Set<SimpleFunctionDescriptor> m32747J3 = m32747J(name6);
                    if (!m32747J3.isEmpty()) {
                        for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : m32747J3) {
                            if (simpleFunctionDescriptor2.isSuspend() && m32742E(m32740C, simpleFunctionDescriptor2)) {
                                z4 = true;
                                break;
                            }
                        }
                    }
                }
                z4 = false;
                if (!z4) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: N */
    public void m32751N(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        UtilsKt.m32659a(this.f64582i.f64479c.f64459n, lookupLocation, this.f64536o, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: a */
    public Collection<SimpleFunctionDescriptor> mo32614a(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        m32751N(name, location);
        return super.mo32614a(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* renamed from: c */
    public ClassifierDescriptor mo32732c(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        m32751N(name, location);
        return this.f64535n.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: e */
    public Collection<PropertyDescriptor> mo32617e(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        m32751N(name, location);
        return super.mo32617e(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* renamed from: g */
    public Set<Name> mo32752g(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        return SetsKt.m32077d(this.f64533l.invoke(), this.f64534m.invoke().keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: i */
    public Set mo32753i(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        TypeConstructor mo32440j = this.f64536o.mo32440j();
        Intrinsics.m32175d(mo32440j, "ownerDescriptor.typeConstructor");
        Collection<KotlinType> mo32602a = mo32440j.mo32602a();
        Intrinsics.m32175d(mo32602a, "ownerDescriptor.typeConstructor.supertypes");
        HashSet hashSet = new HashSet();
        Iterator<T> it = mo32602a.iterator();
        while (it.hasNext()) {
            CollectionsKt.m32020g(hashSet, ((KotlinType) it.next()).mo32791p().mo32615b());
        }
        hashSet.addAll(this.f64576c.invoke().mo32727a());
        hashSet.addAll(mo32752g(kindFilter, function1));
        return hashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: j */
    public DeclaredMemberIndex mo32754j() {
        return new ClassDeclaredMemberIndex(this.f64537p, new Function1<JavaMember, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeMemberIndex$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(JavaMember javaMember) {
                JavaMember it = javaMember;
                Intrinsics.m32180i(it, "it");
                return Boolean.valueOf(!it.mo32828i());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: l */
    public void mo32755l(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        boolean z;
        Set<SimpleFunctionDescriptor> m32747J = m32747J(name);
        BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName = BuiltinMethodsWithDifferentJvmName.f64309f;
        if (!((ArrayList) BuiltinMethodsWithDifferentJvmName.f64307d).contains(name) && !BuiltinMethodsWithSpecialGenericSignature.f64317g.m32671b(name)) {
            if (!m32747J.isEmpty()) {
                Iterator<T> it = m32747J.iterator();
                while (it.hasNext()) {
                    if (((FunctionDescriptor) it.next()).isSuspend()) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : m32747J) {
                    if (m32750M((SimpleFunctionDescriptor) obj)) {
                        arrayList.add(obj);
                    }
                }
                m32763x(collection, name, arrayList, false);
                return;
            }
        }
        Collection<SimpleFunctionDescriptor> m33786a = SmartSet.f66512d.m33786a();
        Collection<? extends SimpleFunctionDescriptor> m32696b = DescriptorResolverUtils.m32696b(name, m32747J, EmptyList.f63144b, this.f64536o, ErrorReporter.f66086a);
        m32764y(name, collection, m32696b, collection, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(this));
        m32764y(name, collection, m32696b, m33786a, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : m32747J) {
            if (m32750M((SimpleFunctionDescriptor) obj2)) {
                arrayList2.add(obj2);
            }
        }
        m32763x(collection, name, CollectionsKt.m32002O(arrayList2, m33786a), true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: m */
    public void mo32756m(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
        JavaMethod javaMethod;
        if (this.f64537p.mo32811p() && (javaMethod = (JavaMethod) CollectionsKt.m32012Y(this.f64576c.invoke().mo32730d(name))) != null) {
            JavaPropertyDescriptor m32713C0 = JavaPropertyDescriptor.m32713C0(this.f64536o, LazyJavaAnnotationsKt.m32722a(this.f64582i, javaMethod), Modality.FINAL, javaMethod.getVisibility(), false, javaMethod.getName(), this.f64582i.f64479c.f64455j.mo32360a(javaMethod), false);
            PropertyGetterDescriptorImpl m33456a = DescriptorFactory.m33456a(m32713C0, Annotations.Companion.f64024a);
            m32713C0.f64228v = m33456a;
            m32713C0.f64229w = null;
            m32713C0.f64231y = null;
            m32713C0.f64232z = null;
            KotlinType m32769k = m32769k(javaMethod, ContextKt.m32717b(this.f64582i, m32713C0, javaMethod, 0));
            EmptyList emptyList = EmptyList.f63144b;
            ReceiverParameterDescriptor mo32758o = mo32758o();
            m32713C0.f64268e = m32769k;
            m32713C0.f64227u = new ArrayList(emptyList);
            m32713C0.f64226t = null;
            m32713C0.f64225s = mo32758o;
            m33456a.f64243m = m32769k;
            collection.add(m32713C0);
        }
        Set<PropertyDescriptor> m32748K = m32748K(name);
        if (m32748K.isEmpty()) {
            return;
        }
        SmartSet m33786a = SmartSet.f66512d.m33786a();
        m32765z(m32748K, collection, new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredProperties$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Collection<? extends SimpleFunctionDescriptor> invoke(Name name2) {
                Name it = name2;
                Intrinsics.m32180i(it, "it");
                return LazyJavaClassMemberScope.m32736u(LazyJavaClassMemberScope.this, it);
            }
        });
        m32765z(m32748K, m33786a, new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredProperties$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Collection<? extends SimpleFunctionDescriptor> invoke(Name name2) {
                Name it = name2;
                Intrinsics.m32180i(it, "it");
                return LazyJavaClassMemberScope.m32737v(LazyJavaClassMemberScope.this, it);
            }
        });
        collection.addAll(DescriptorResolverUtils.m32696b(name, SetsKt.m32077d(m32748K, m33786a), collection, this.f64536o, this.f64582i.f64479c.f64451f));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* renamed from: n */
    public Set<Name> mo32757n(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        if (this.f64537p.mo32811p()) {
            return mo32615b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f64576c.invoke().mo32729c());
        TypeConstructor mo32440j = this.f64536o.mo32440j();
        Intrinsics.m32175d(mo32440j, "ownerDescriptor.typeConstructor");
        Collection<KotlinType> mo32602a = mo32440j.mo32602a();
        Intrinsics.m32175d(mo32602a, "ownerDescriptor.typeConstructor.supertypes");
        Iterator<T> it = mo32602a.iterator();
        while (it.hasNext()) {
            CollectionsKt.m32020g(linkedHashSet, ((KotlinType) it.next()).mo32791p().mo32618f());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @Nullable
    /* renamed from: o */
    public ReceiverParameterDescriptor mo32758o() {
        ClassDescriptor classDescriptor = this.f64536o;
        Name name = DescriptorUtils.f65875a;
        if (classDescriptor instanceof ClassDescriptor) {
            return classDescriptor.mo32504F0();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: p */
    public DeclarationDescriptor mo32759p() {
        return this.f64536o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: q */
    public boolean mo32760q(@NotNull JavaMethodDescriptor javaMethodDescriptor) {
        if (this.f64537p.mo32811p()) {
            return false;
        }
        return m32750M(javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* renamed from: r */
    public LazyJavaScope.MethodSignatureData mo32761r(@NotNull JavaMethod javaMethod, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> valueParameters) {
        Intrinsics.m32180i(valueParameters, "valueParameters");
        SignaturePropagator.PropagatedSignature mo32708a = this.f64582i.f64479c.f64450e.mo32708a(javaMethod, this.f64536o, kotlinType, null, valueParameters, list);
        Intrinsics.m32175d(mo32708a, "c.components.signaturePr…dTypeParameters\n        )");
        KotlinType kotlinType2 = mo32708a.f64416a;
        Intrinsics.m32175d(kotlinType2, "propagated.returnType");
        KotlinType kotlinType3 = mo32708a.f64417b;
        List<ValueParameterDescriptor> list2 = mo32708a.f64418c;
        Intrinsics.m32175d(list2, "propagated.valueParameters");
        List<TypeParameterDescriptor> list3 = mo32708a.f64419d;
        Intrinsics.m32175d(list3, "propagated.typeParameters");
        boolean z = mo32708a.f64421f;
        List<String> list4 = mo32708a.f64420e;
        Intrinsics.m32175d(list4, "propagated.errors");
        return new LazyJavaScope.MethodSignatureData(kotlinType2, kotlinType3, list2, list3, z, list4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Lazy Java member scope for ");
        m24u.append(this.f64537p.mo32808d());
        return m24u.toString();
    }

    /* renamed from: w */
    public final void m32762w(@NotNull List<ValueParameterDescriptor> list, ConstructorDescriptor constructorDescriptor, int i2, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        Annotations annotations = Annotations.Companion.f64024a;
        Name name = javaMethod.getName();
        SimpleType simpleType = TypeUtils.f66355a;
        UnwrappedType mo32787K0 = kotlinType.mo33662J0().mo32787K0(false);
        Intrinsics.m32175d(mo32787K0, "TypeUtils.makeNotNullable(returnType)");
        list.add(new ValueParameterDescriptorImpl(constructorDescriptor, null, i2, annotations, name, mo32787K0, javaMethod.mo32826E(), false, false, kotlinType2 != null ? kotlinType2.mo33662J0().mo32787K0(false) : null, this.f64582i.f64479c.f64455j.mo32360a(javaMethod)));
    }

    /* renamed from: x */
    public final void m32763x(Collection<SimpleFunctionDescriptor> collection, Name name, Collection<? extends SimpleFunctionDescriptor> collection2, boolean z) {
        Collection<? extends SimpleFunctionDescriptor> m32696b = DescriptorResolverUtils.m32696b(name, collection2, collection, this.f64536o, this.f64582i.f64479c.f64451f);
        if (!z) {
            collection.addAll(m32696b);
            return;
        }
        List m32002O = CollectionsKt.m32002O(collection, m32696b);
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m32696b, 10));
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : m32696b) {
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.m32693f(simpleFunctionDescriptor);
            if (simpleFunctionDescriptor2 != null) {
                simpleFunctionDescriptor = m32738A(simpleFunctionDescriptor, simpleFunctionDescriptor2, m32002O);
            }
            arrayList.add(simpleFunctionDescriptor);
        }
        collection.addAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x000c A[SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m32764y(kotlin.reflect.jvm.internal.impl.name.Name r17, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> r18, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> r19, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> r20, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> r21) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.m32764y(kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection, java.util.Collection, java.util.Collection, kotlin.jvm.functions.Function1):void");
    }

    /* renamed from: z */
    public final void m32765z(Set<? extends PropertyDescriptor> set, Collection<PropertyDescriptor> collection, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        for (PropertyDescriptor propertyDescriptor : set) {
            JavaPropertyDescriptor javaPropertyDescriptor = null;
            if (m32741D(propertyDescriptor, function1)) {
                SimpleFunctionDescriptor m32745H = m32745H(propertyDescriptor, function1);
                if (m32745H == null) {
                    Intrinsics.m32188q();
                    throw null;
                }
                if (propertyDescriptor.mo32575i0()) {
                    simpleFunctionDescriptor = m32746I(propertyDescriptor, function1);
                    if (simpleFunctionDescriptor == null) {
                        Intrinsics.m32188q();
                        throw null;
                    }
                } else {
                    simpleFunctionDescriptor = null;
                }
                if (simpleFunctionDescriptor != null) {
                    simpleFunctionDescriptor.mo32441k();
                    m32745H.mo32441k();
                }
                JavaPropertyDescriptor m32713C0 = JavaPropertyDescriptor.m32713C0(this.f64536o, Annotations.Companion.f64024a, m32745H.mo32441k(), m32745H.getVisibility(), simpleFunctionDescriptor != null, propertyDescriptor.getName(), m32745H.mo32439i(), false);
                KotlinType returnType = m32745H.getReturnType();
                if (returnType == null) {
                    Intrinsics.m32188q();
                    throw null;
                }
                EmptyList emptyList = EmptyList.f63144b;
                ReceiverParameterDescriptor mo32758o = mo32758o();
                m32713C0.f64268e = returnType;
                m32713C0.f64227u = new ArrayList(emptyList);
                m32713C0.f64226t = null;
                m32713C0.f64225s = mo32758o;
                PropertyGetterDescriptorImpl m33461f = DescriptorFactory.m33461f(m32713C0, m32745H.getAnnotations(), false, false, false, m32745H.mo32439i());
                m33461f.f64213l = m32745H;
                m33461f.m32644Z(m32713C0.f64268e);
                if (simpleFunctionDescriptor != null) {
                    List<ValueParameterDescriptor> mo32489f = simpleFunctionDescriptor.mo32489f();
                    Intrinsics.m32175d(mo32489f, "setterMethod.valueParameters");
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.m32046w(mo32489f);
                    if (valueParameterDescriptor == null) {
                        throw new AssertionError("No parameter found for " + simpleFunctionDescriptor);
                    }
                    propertySetterDescriptorImpl = DescriptorFactory.m33463h(m32713C0, simpleFunctionDescriptor.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, false, false, simpleFunctionDescriptor.getVisibility(), simpleFunctionDescriptor.mo32439i());
                    propertySetterDescriptorImpl.f64213l = simpleFunctionDescriptor;
                } else {
                    propertySetterDescriptorImpl = null;
                }
                m32713C0.f64228v = m33461f;
                m32713C0.f64229w = propertySetterDescriptorImpl;
                m32713C0.f64231y = null;
                m32713C0.f64232z = null;
                javaPropertyDescriptor = m32713C0;
            }
            if (javaPropertyDescriptor != null) {
                collection.add(javaPropertyDescriptor);
                return;
            }
        }
    }
}
