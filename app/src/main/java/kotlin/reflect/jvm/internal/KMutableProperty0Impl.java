package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.jvm.internal.KMutableProperty0Impl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KProperty0Impl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\nB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "R", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "Lkotlin/reflect/KMutableProperty0;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Setter", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class KMutableProperty0Impl<R> extends KProperty0Impl<R> implements KMutableProperty0<R> {

    /* renamed from: o */
    public final ReflectProperties.LazyVal<Setter<R>> f63539o;

    /* compiled from: KProperty0Impl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty0$Setter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Setter<R> extends KPropertyImpl.Setter<R> implements KMutableProperty0.Setter<R> {

        /* renamed from: i */
        @NotNull
        public final KMutableProperty0Impl<R> f63540i;

        public Setter(@NotNull KMutableProperty0Impl<R> property) {
            Intrinsics.m32180i(property, "property");
            this.f63540i = property;
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(Object obj) {
            Setter<R> m32306a = this.f63540i.f63539o.m32306a();
            Intrinsics.m32175d(m32306a, "_setter()");
            m32306a.call(obj);
            return Unit.f63088a;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        /* renamed from: t */
        public KPropertyImpl mo32286t() {
            return this.f63540i;
        }
    }

    public KMutableProperty0Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        this.f63539o = new ReflectProperties.LazyVal<>(new Function0<Setter<R>>() { // from class: kotlin.reflect.jvm.internal.KMutableProperty0Impl$_setter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return new KMutableProperty0Impl.Setter(KMutableProperty0Impl.this);
            }
        });
    }

    @Override // kotlin.reflect.KMutableProperty0
    public KMutableProperty0.Setter getSetter() {
        Setter<R> m32306a = this.f63539o.m32306a();
        Intrinsics.m32175d(m32306a, "_setter()");
        return m32306a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(@NotNull KDeclarationContainerImpl container, @NotNull String name, @NotNull String signature, @Nullable Object obj) {
        super(container, name, signature, obj);
        Intrinsics.m32180i(container, "container");
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(signature, "signature");
        this.f63539o = new ReflectProperties.LazyVal<>(new Function0<Setter<R>>() { // from class: kotlin.reflect.jvm.internal.KMutableProperty0Impl$_setter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return new KMutableProperty0Impl.Setter(KMutableProperty0Impl.this);
            }
        });
    }
}
