package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;
import kotlin.reflect.jvm.internal.KProperty1Impl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KProperty1Impl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl;", "T", "R", "Lkotlin/reflect/KProperty1;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Getter", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class KProperty1Impl<T, R> extends KPropertyImpl<R> implements KProperty1<T, R> {

    /* renamed from: m */
    public final ReflectProperties.LazyVal<Getter<T, R>> f63576m;

    /* renamed from: n */
    public final Lazy<Field> f63577n;

    /* compiled from: KProperty1Impl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "T", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty1$Getter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Getter<T, R> extends KPropertyImpl.Getter<R> implements KProperty1.Getter<T, R> {

        /* renamed from: i */
        @NotNull
        public final KProperty1Impl<T, R> f63578i;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(@NotNull KProperty1Impl<T, ? extends R> property) {
            Intrinsics.m32180i(property, "property");
            this.f63578i = property;
        }

        @Override // kotlin.jvm.functions.Function1
        public R invoke(T t) {
            return this.f63578i.get(t);
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        /* renamed from: t */
        public KPropertyImpl mo32286t() {
            return this.f63578i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(@NotNull KDeclarationContainerImpl container, @NotNull String name, @NotNull String signature, @Nullable Object obj) {
        super(container, name, signature, obj);
        Intrinsics.m32180i(container, "container");
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(signature, "signature");
        this.f63576m = new ReflectProperties.LazyVal<>(new Function0<Getter<T, ? extends R>>() { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$_getter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return new KProperty1Impl.Getter(KProperty1Impl.this);
            }
        });
        this.f63577n = LazyKt.m31880a(LazyThreadSafetyMode.PUBLICATION, new Function0<Field>() { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$delegateField$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Field invoke() {
                return KProperty1Impl.this.m32295s();
            }
        });
    }

    @Override // kotlin.reflect.KProperty1
    public R get(T t) {
        return getGetter().call(t);
    }

    @Override // kotlin.reflect.KProperty1
    @Nullable
    public Object getDelegate(T t) {
        return m32296t(this.f63577n.getValue(), t);
    }

    @Override // kotlin.jvm.functions.Function1
    public R invoke(T t) {
        return get(t);
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    @NotNull
    /* renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Getter<T, R> mo32290w() {
        Getter<T, R> m32306a = this.f63576m.m32306a();
        Intrinsics.m32175d(m32306a, "_getter()");
        return m32306a;
    }

    public KProperty1Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        this.f63576m = new ReflectProperties.LazyVal<>(new Function0<Getter<T, ? extends R>>() { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$_getter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return new KProperty1Impl.Getter(KProperty1Impl.this);
            }
        });
        this.f63577n = LazyKt.m31880a(LazyThreadSafetyMode.PUBLICATION, new Function0<Field>() { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$delegateField$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Field invoke() {
                return KProperty1Impl.this.m32295s();
            }
        });
    }
}
