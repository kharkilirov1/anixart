package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty2;
import kotlin.reflect.jvm.internal.KProperty2Impl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: KProperty2Impl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl;", "D", "E", "R", "Lkotlin/reflect/KProperty2;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Getter", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class KProperty2Impl<D, E, R> extends KPropertyImpl<R> implements KProperty2<D, E, R> {

    /* renamed from: m */
    public final ReflectProperties.LazyVal<Getter<D, E, R>> f63581m;

    /* renamed from: n */
    public final Lazy<Field> f63582n;

    /* compiled from: KProperty2Impl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "D", "E", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty2$Getter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Getter<D, E, R> extends KPropertyImpl.Getter<R> implements KProperty2.Getter<D, E, R> {

        /* renamed from: i */
        @NotNull
        public final KProperty2Impl<D, E, R> f63583i;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(@NotNull KProperty2Impl<D, E, ? extends R> property) {
            Intrinsics.m32180i(property, "property");
            this.f63583i = property;
        }

        @Override // kotlin.jvm.functions.Function2
        public R invoke(D d, E e2) {
            return this.f63583i.m32293x(d, e2);
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        /* renamed from: t */
        public KPropertyImpl mo32286t() {
            return this.f63583i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(@NotNull KDeclarationContainerImpl container, @NotNull String name, @NotNull String signature) {
        super(container, name, signature, CallableReference.NO_RECEIVER);
        Intrinsics.m32180i(container, "container");
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(signature, "signature");
        this.f63581m = new ReflectProperties.LazyVal<>(new Function0<Getter<D, E, ? extends R>>() { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$_getter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return new KProperty2Impl.Getter(KProperty2Impl.this);
            }
        });
        this.f63582n = LazyKt.m31880a(LazyThreadSafetyMode.PUBLICATION, new Function0<Field>() { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$delegateField$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Field invoke() {
                return KProperty2Impl.this.m32295s();
            }
        });
    }

    @Override // kotlin.jvm.functions.Function2
    public R invoke(D d, E e2) {
        return m32293x(d, e2);
    }

    /* renamed from: x */
    public R m32293x(D d, E e2) {
        return getGetter().call(d, e2);
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    @NotNull
    /* renamed from: y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Getter<D, E, R> mo32290w() {
        Getter<D, E, R> m32306a = this.f63581m.m32306a();
        Intrinsics.m32175d(m32306a, "_getter()");
        return m32306a;
    }

    public KProperty2Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        this.f63581m = new ReflectProperties.LazyVal<>(new Function0<Getter<D, E, ? extends R>>() { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$_getter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return new KProperty2Impl.Getter(KProperty2Impl.this);
            }
        });
        this.f63582n = LazyKt.m31880a(LazyThreadSafetyMode.PUBLICATION, new Function0<Field>() { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$delegateField$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Field invoke() {
                return KProperty2Impl.this.m32295s();
            }
        });
    }
}
