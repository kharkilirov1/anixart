package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: InlineClassAwareCaller.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\fB%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "caller", "", "isDefault", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/CallerImpl;Z)V", "BoxUnboxData", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class InlineClassAwareCaller<M extends Member> implements Caller<M> {

    /* renamed from: e */
    public static final /* synthetic */ KProperty[] f63683e = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(InlineClassAwareCaller.class), "data", "getData()Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;"))};

    /* renamed from: a */
    public final Lazy f63684a = LazyKt.m31880a(LazyThreadSafetyMode.PUBLICATION, new Function0<BoxUnboxData>() { // from class: kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller$data$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public InlineClassAwareCaller.BoxUnboxData invoke() {
            Method method;
            InlineClassAwareCaller inlineClassAwareCaller = InlineClassAwareCaller.this;
            int i2 = inlineClassAwareCaller.f63686c instanceof CallerImpl.Method.BoundStatic ? -1 : (inlineClassAwareCaller.f63685b.mo32490f0() == null || (InlineClassAwareCaller.this.f63686c instanceof BoundCaller)) ? 0 : 1;
            InlineClassAwareCaller inlineClassAwareCaller2 = InlineClassAwareCaller.this;
            int i3 = inlineClassAwareCaller2.f63687d ? 2 : 0;
            ReceiverParameterDescriptor mo32492k0 = inlineClassAwareCaller2.f63685b.mo32492k0();
            Method method2 = null;
            List m31995H = CollectionsKt.m31995H(mo32492k0 != null ? mo32492k0.getType() : null);
            List<ValueParameterDescriptor> mo32489f = InlineClassAwareCaller.this.f63685b.mo32489f();
            Intrinsics.m32175d(mo32489f, "descriptor.valueParameters");
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo32489f, 10));
            Iterator<T> it = mo32489f.iterator();
            while (it.hasNext()) {
                arrayList.add(((ValueParameterDescriptor) it.next()).getType());
            }
            List m32002O = CollectionsKt.m32002O(m31995H, arrayList);
            int size = m32002O.size() + i2 + i3;
            if (CallerKt.m32335a(InlineClassAwareCaller.this) != size) {
                StringBuilder m24u = C0000a.m24u("Inconsistent number of parameters in the descriptor and Java reflection object: ");
                m24u.append(CallerKt.m32335a(InlineClassAwareCaller.this));
                m24u.append(" != ");
                m24u.append(size);
                m24u.append('\n');
                m24u.append("Calling: ");
                m24u.append(InlineClassAwareCaller.this.f63685b);
                m24u.append('\n');
                m24u.append("Parameter types: ");
                m24u.append(InlineClassAwareCaller.this.f63686c.f63672a);
                m24u.append(")\n");
                m24u.append("Default: ");
                m24u.append(InlineClassAwareCaller.this.f63687d);
                throw new KotlinReflectionInternalError(m24u.toString());
            }
            IntRange m32243j = RangesKt.m32243j(Math.max(i2, 0), m32002O.size() + i2);
            Method[] methodArr = new Method[size];
            for (int i4 = 0; i4 < size; i4++) {
                if (m32243j.m32232d(i4)) {
                    InlineClassAwareCaller inlineClassAwareCaller3 = InlineClassAwareCaller.this;
                    Object obj = m32002O.get(i4 - i2);
                    Intrinsics.m32175d(obj, "kotlinParameterTypes[i - shift]");
                    Class<?> m32336b = InlineClassAwareCaller.m32336b(inlineClassAwareCaller3, (KotlinType) obj);
                    if (m32336b != null) {
                        method = InlineClassAwareCaller.this.m32337c(m32336b);
                        methodArr[i4] = method;
                    }
                }
                method = null;
                methodArr[i4] = method;
            }
            InlineClassAwareCaller inlineClassAwareCaller4 = InlineClassAwareCaller.this;
            KotlinType returnType = inlineClassAwareCaller4.f63685b.getReturnType();
            if (returnType == null) {
                Intrinsics.m32188q();
                throw null;
            }
            Class<?> m32336b2 = InlineClassAwareCaller.m32336b(inlineClassAwareCaller4, returnType);
            if (m32336b2 != null) {
                InlineClassAwareCaller inlineClassAwareCaller5 = InlineClassAwareCaller.this;
                Objects.requireNonNull(inlineClassAwareCaller5);
                try {
                    method2 = m32336b2.getDeclaredMethod("box-impl", inlineClassAwareCaller5.m32337c(m32336b2).getReturnType());
                    Intrinsics.m32175d(method2, "getDeclaredMethod(\"box\" …UnboxMethod().returnType)");
                } catch (NoSuchMethodException unused) {
                    throw new KotlinReflectionInternalError("No box method found in inline class: " + m32336b2 + " (calling " + inlineClassAwareCaller5.f63685b + ')');
                }
            }
            return new InlineClassAwareCaller.BoxUnboxData(m32243j, methodArr, method2);
        }
    });

    /* renamed from: b */
    public final CallableMemberDescriptor f63685b;

    /* renamed from: c */
    public final CallerImpl<M> f63686c;

    /* renamed from: d */
    public final boolean f63687d;

    /* compiled from: InlineClassAwareCaller.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class BoxUnboxData {

        /* renamed from: a */
        @NotNull
        public final IntRange f63688a;

        /* renamed from: b */
        @NotNull
        public final Method[] f63689b;

        /* renamed from: c */
        @Nullable
        public final Method f63690c;

        public BoxUnboxData(@NotNull IntRange argumentRange, @NotNull Method[] methodArr, @Nullable Method method) {
            Intrinsics.m32180i(argumentRange, "argumentRange");
            this.f63688a = argumentRange;
            this.f63689b = methodArr;
            this.f63690c = method;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InlineClassAwareCaller(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallerImpl<? extends M> callerImpl, boolean z) {
        this.f63685b = callableMemberDescriptor;
        this.f63686c = callerImpl;
        this.f63687d = z;
    }

    @Nullable
    /* renamed from: b */
    public static final Class m32336b(InlineClassAwareCaller inlineClassAwareCaller, @NotNull KotlinType kotlinType) {
        Objects.requireNonNull(inlineClassAwareCaller);
        ClassifierDescriptor mo32449b = kotlinType.mo33515H0().mo32449b();
        if (mo32449b instanceof ClassDescriptor) {
            ClassDescriptor classDescriptor = (ClassDescriptor) mo32449b;
            if (classDescriptor.isInline()) {
                Class<?> m32326i = UtilKt.m32326i(classDescriptor);
                if (m32326i != null) {
                    return m32326i;
                }
                StringBuilder m24u = C0000a.m24u("Class object for the class ");
                m24u.append(classDescriptor.getName());
                m24u.append(" cannot be found (classId=");
                m24u.append(DescriptorUtilsKt.m33535h(mo32449b));
                m24u.append(')');
                throw new KotlinReflectionInternalError(m24u.toString());
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    /* renamed from: a */
    public List<Type> mo32328a() {
        return this.f63686c.f63672a;
    }

    /* renamed from: c */
    public final Method m32337c(@NotNull Class<?> cls) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            Intrinsics.m32175d(declaredMethod, "getDeclaredMethod(\"unbox…FOR_INLINE_CLASS_MEMBERS)");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + this.f63685b + ')');
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @Nullable
    public Object call(@NotNull Object[] args) {
        Object invoke;
        Intrinsics.m32180i(args, "args");
        Lazy lazy = this.f63684a;
        KProperty kProperty = f63683e[0];
        BoxUnboxData boxUnboxData = (BoxUnboxData) lazy.getValue();
        IntRange intRange = boxUnboxData.f63688a;
        Method[] methodArr = boxUnboxData.f63689b;
        Method method = boxUnboxData.f63690c;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        Intrinsics.m32175d(copyOf, "java.util.Arrays.copyOf(this, size)");
        int i2 = intRange.f63380b;
        int i3 = intRange.f63381c;
        if (i2 <= i3) {
            while (true) {
                Method method2 = methodArr[i2];
                Object obj = args[i2];
                if (method2 != null && obj != null) {
                    obj = method2.invoke(obj, new Object[0]);
                }
                copyOf[i2] = obj;
                if (i2 == i3) {
                    break;
                }
                i2++;
            }
        }
        Object call = this.f63686c.call(copyOf);
        return (method == null || (invoke = method.invoke(null, call)) == null) ? call : invoke;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public M getMember() {
        return this.f63686c.f63673b;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    /* renamed from: getReturnType */
    public Type getF63674c() {
        return this.f63686c.f63674c;
    }
}
