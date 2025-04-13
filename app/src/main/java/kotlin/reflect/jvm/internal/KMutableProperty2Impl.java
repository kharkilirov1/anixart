package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.jvm.internal.KMutableProperty2Impl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: KProperty2Impl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty2Impl;", "D", "E", "R", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "Lkotlin/reflect/KMutableProperty2;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Setter", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class KMutableProperty2Impl<D, E, R> extends KProperty2Impl<D, E, R> implements KMutableProperty2<D, E, R> {

    /* renamed from: o */
    public final ReflectProperties.LazyVal<Setter<D, E, R>> f63545o;

    /* compiled from: KProperty2Impl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty2Impl$Setter;", "D", "E", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty2$Setter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Setter<D, E, R> extends KPropertyImpl.Setter<R> implements KMutableProperty2.Setter<D, E, R> {

        /* renamed from: i */
        @NotNull
        public final KMutableProperty2Impl<D, E, R> f63546i;

        public Setter(@NotNull KMutableProperty2Impl<D, E, R> property) {
            Intrinsics.m32180i(property, "property");
            this.f63546i = property;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Unit mo16505k(Object obj, Object obj2, Object obj3) {
            Setter<D, E, R> m32306a = this.f63546i.f63545o.m32306a();
            Intrinsics.m32175d(m32306a, "_setter()");
            m32306a.call(obj, obj2, obj3);
            return Unit.f63088a;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        /* renamed from: t */
        public KPropertyImpl mo32286t() {
            return this.f63546i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty2Impl(@NotNull KDeclarationContainerImpl container, @NotNull String name, @NotNull String signature) {
        super(container, name, signature);
        Intrinsics.m32180i(container, "container");
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(signature, "signature");
        this.f63545o = new ReflectProperties.LazyVal<>(new Function0<Setter<D, E, R>>() { // from class: kotlin.reflect.jvm.internal.KMutableProperty2Impl$_setter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return new KMutableProperty2Impl.Setter(KMutableProperty2Impl.this);
            }
        });
    }

    public KMutableProperty2Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        this.f63545o = new ReflectProperties.LazyVal<>(new Function0<Setter<D, E, R>>() { // from class: kotlin.reflect.jvm.internal.KMutableProperty2Impl$_setter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return new KMutableProperty2Impl.Setter(KMutableProperty2Impl.this);
            }
        });
    }
}
