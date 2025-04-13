package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty0;
import kotlin.reflect.jvm.internal.KProperty0Impl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KProperty0Impl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\nB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl;", "R", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Getter", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class KProperty0Impl<R> extends KPropertyImpl<R> implements KProperty0<R> {

    /* renamed from: m */
    public final ReflectProperties.LazyVal<Getter<R>> f63571m;

    /* renamed from: n */
    public final Lazy<Object> f63572n;

    /* compiled from: KProperty0Impl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty0$Getter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Getter<R> extends KPropertyImpl.Getter<R> implements KProperty0.Getter<R> {

        /* renamed from: i */
        @NotNull
        public final KProperty0Impl<R> f63573i;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(@NotNull KProperty0Impl<? extends R> property) {
            Intrinsics.m32180i(property, "property");
            this.f63573i = property;
        }

        @Override // kotlin.jvm.functions.Function0
        public R invoke() {
            return this.f63573i.get();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        /* renamed from: t */
        public KPropertyImpl mo32286t() {
            return this.f63573i;
        }
    }

    public KProperty0Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        this.f63571m = new ReflectProperties.LazyVal<>(new Function0<Getter<? extends R>>() { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$_getter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return new KProperty0Impl.Getter(KProperty0Impl.this);
            }
        });
        this.f63572n = LazyKt.m31880a(LazyThreadSafetyMode.PUBLICATION, new Function0<Object>() { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$delegateFieldValue$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                KProperty0Impl kProperty0Impl = KProperty0Impl.this;
                return kProperty0Impl.m32296t(kProperty0Impl.m32295s(), KProperty0Impl.this.f63592k);
            }
        });
    }

    @Override // kotlin.reflect.KProperty0
    public R get() {
        return getGetter().call(new Object[0]);
    }

    @Override // kotlin.reflect.KProperty0
    @Nullable
    public Object getDelegate() {
        return this.f63572n.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public R invoke() {
        return get();
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    @NotNull
    /* renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Getter<R> mo32290w() {
        Getter<R> m32306a = this.f63571m.m32306a();
        Intrinsics.m32175d(m32306a, "_getter()");
        return m32306a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(@NotNull KDeclarationContainerImpl container, @NotNull String name, @NotNull String signature, @Nullable Object obj) {
        super(container, name, signature, obj);
        Intrinsics.m32180i(container, "container");
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(signature, "signature");
        this.f63571m = new ReflectProperties.LazyVal<>(new Function0<Getter<? extends R>>() { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$_getter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return new KProperty0Impl.Getter(KProperty0Impl.this);
            }
        });
        this.f63572n = LazyKt.m31880a(LazyThreadSafetyMode.PUBLICATION, new Function0<Object>() { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$delegateFieldValue$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                KProperty0Impl kProperty0Impl = KProperty0Impl.this;
                return kProperty0Impl.m32296t(kProperty0Impl.m32295s(), KProperty0Impl.this.f63592k);
            }
        });
    }
}
