package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.jvm.ReflectLambdaKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.pcollections.HashPMap;

/* loaded from: classes3.dex */
public class ReflectionFactoryImpl extends ReflectionFactory {
    /* renamed from: l */
    public static KDeclarationContainerImpl m32307l(CallableReference callableReference) {
        KDeclarationContainer owner = callableReference.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : EmptyContainerForLocal.f63441d;
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* renamed from: a */
    public KFunction mo32199a(FunctionReference functionReference) {
        KDeclarationContainerImpl container = m32307l(functionReference);
        String name = functionReference.getF63590i();
        String signature = functionReference.getSignature();
        Object boundReceiver = functionReference.getBoundReceiver();
        Intrinsics.m32180i(container, "container");
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(signature, "signature");
        return new KFunctionImpl(container, name, signature, null, boundReceiver);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* renamed from: b */
    public KClass mo32200b(Class jClass) {
        HashPMap<String, Object> hashPMap = KClassCacheKt.f63475a;
        Intrinsics.m32180i(jClass, "jClass");
        String name = jClass.getName();
        Object m33791a = KClassCacheKt.f63475a.m33791a(name);
        if (m33791a instanceof WeakReference) {
            KClassImpl kClassImpl = (KClassImpl) ((WeakReference) m33791a).get();
            if (Intrinsics.m32174c(kClassImpl != null ? kClassImpl.f63478e : null, jClass)) {
                return kClassImpl;
            }
        } else if (m33791a != null) {
            for (WeakReference weakReference : (WeakReference[]) m33791a) {
                KClassImpl kClassImpl2 = (KClassImpl) weakReference.get();
                if (Intrinsics.m32174c(kClassImpl2 != null ? kClassImpl2.f63478e : null, jClass)) {
                    return kClassImpl2;
                }
            }
            int length = ((Object[]) m33791a).length;
            WeakReference[] weakReferenceArr = new WeakReference[length + 1];
            System.arraycopy(m33791a, 0, weakReferenceArr, 0, length);
            KClassImpl kClassImpl3 = new KClassImpl(jClass);
            weakReferenceArr[length] = new WeakReference(kClassImpl3);
            KClassCacheKt.f63475a = KClassCacheKt.f63475a.m33792b(name, weakReferenceArr);
            return kClassImpl3;
        }
        KClassImpl kClassImpl4 = new KClassImpl(jClass);
        KClassCacheKt.f63475a = KClassCacheKt.f63475a.m33792b(name, new WeakReference(kClassImpl4));
        return kClassImpl4;
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* renamed from: c */
    public KDeclarationContainer mo32201c(Class cls, String str) {
        return new KPackageImpl(cls, str);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* renamed from: d */
    public KMutableProperty0 mo32202d(MutablePropertyReference0 mutablePropertyReference0) {
        return new KMutableProperty0Impl(m32307l(mutablePropertyReference0), mutablePropertyReference0.getF63590i(), mutablePropertyReference0.getSignature(), mutablePropertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* renamed from: e */
    public KMutableProperty1 mo32203e(MutablePropertyReference1 mutablePropertyReference1) {
        return new KMutableProperty1Impl(m32307l(mutablePropertyReference1), mutablePropertyReference1.getF63590i(), mutablePropertyReference1.getSignature(), mutablePropertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* renamed from: f */
    public KMutableProperty2 mo32204f(MutablePropertyReference2 mutablePropertyReference2) {
        return new KMutableProperty2Impl(m32307l(mutablePropertyReference2), mutablePropertyReference2.getF63590i(), mutablePropertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* renamed from: g */
    public KProperty0 mo32205g(PropertyReference0 propertyReference0) {
        return new KProperty0Impl(m32307l(propertyReference0), propertyReference0.getF63590i(), propertyReference0.getSignature(), propertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* renamed from: h */
    public KProperty1 mo32206h(PropertyReference1 propertyReference1) {
        return new KProperty1Impl(m32307l(propertyReference1), propertyReference1.getF63590i(), propertyReference1.getSignature(), propertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* renamed from: i */
    public KProperty2 mo32207i(PropertyReference2 propertyReference2) {
        return new KProperty2Impl(m32307l(propertyReference2), propertyReference2.getF63590i(), propertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* renamed from: j */
    public String mo32208j(FunctionBase functionBase) {
        KFunctionImpl m32318a;
        KFunction m32253a = ReflectLambdaKt.m32253a(functionBase);
        if (m32253a == null || (m32318a = UtilKt.m32318a(m32253a)) == null) {
            return super.mo32208j(functionBase);
        }
        ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.f63635b;
        FunctionDescriptor invoke = m32318a.mo32264o();
        Intrinsics.m32180i(invoke, "invoke");
        StringBuilder sb = new StringBuilder();
        reflectionObjectRenderer.m32309b(sb, invoke);
        List<ValueParameterDescriptor> mo32489f = invoke.mo32489f();
        Intrinsics.m32175d(mo32489f, "invoke.valueParameters");
        CollectionsKt.m32049z(mo32489f, sb, ", ", "(", ")", 0, null, new Function1<ValueParameterDescriptor, String>() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$renderLambda$1$1
            @Override // kotlin.jvm.functions.Function1
            public String invoke(ValueParameterDescriptor valueParameterDescriptor) {
                ValueParameterDescriptor it = valueParameterDescriptor;
                ReflectionObjectRenderer reflectionObjectRenderer2 = ReflectionObjectRenderer.f63635b;
                Intrinsics.m32175d(it, "it");
                KotlinType type = it.getType();
                Intrinsics.m32175d(type, "it.type");
                return reflectionObjectRenderer2.m32312e(type);
            }
        }, 48, null);
        sb.append(" -> ");
        KotlinType returnType = invoke.getReturnType();
        if (returnType == null) {
            Intrinsics.m32188q();
            throw null;
        }
        sb.append(reflectionObjectRenderer.m32312e(returnType));
        String sb2 = sb.toString();
        Intrinsics.m32175d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    /* renamed from: k */
    public String mo32209k(Lambda lambda) {
        return mo32208j(lambda);
    }
}
