package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.jvm.internal.calls.Caller;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CallerImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0006\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "BoundConstructor", "Companion", "Constructor", "FieldGetter", "FieldSetter", "Method", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class CallerImpl<M extends Member> implements Caller<M> {

    /* renamed from: a */
    @NotNull
    public final List<Type> f63672a;

    /* renamed from: b */
    @NotNull
    public final M f63673b;

    /* renamed from: c */
    @NotNull
    public final Type f63674c;

    /* renamed from: d */
    @Nullable
    public final Class<?> f63675d;

    /* compiled from: CallerImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¨\u0006\u0004"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class BoundConstructor extends CallerImpl<java.lang.reflect.Constructor<?>> implements BoundCaller {

        /* renamed from: e */
        public final Object f63676e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public BoundConstructor(@org.jetbrains.annotations.NotNull java.lang.reflect.Constructor<?> r8, @org.jetbrains.annotations.Nullable java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.Intrinsics.m32180i(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.Intrinsics.m32175d(r3, r0)
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.Intrinsics.m32175d(r5, r0)
                r4 = 0
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f63676e = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.CallerImpl.BoundConstructor.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.m32180i(args, "args");
            mo32332b(args);
            java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) this.f63673b;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.f63354a.add(this.f63676e);
            spreadBuilder.m32210a(args);
            return constructor.newInstance(spreadBuilder.f63354a.toArray(new Object[spreadBuilder.m32211b()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Companion;", "", "T", "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Constructor extends CallerImpl<java.lang.reflect.Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Constructor(@org.jetbrains.annotations.NotNull java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.Intrinsics.m32180i(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.Intrinsics.m32175d(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.String r1 = "klass"
                kotlin.jvm.internal.Intrinsics.m32175d(r0, r1)
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L29
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L29
                r4 = r1
                goto L2b
            L29:
                r0 = 0
                r4 = r0
            L2b:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.Intrinsics.m32175d(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.CallerImpl.Constructor.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.m32180i(args, "args");
            mo32332b(args);
            return ((java.lang.reflect.Constructor) this.f63673b).newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static abstract class FieldGetter extends CallerImpl<Field> {

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class BoundInstance extends FieldGetter implements BoundCaller {

            /* renamed from: e */
            public final Object f63677e;

            public BoundInstance(@NotNull Field field, @Nullable Object obj) {
                super(field, false, null);
                this.f63677e = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter, kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.m32180i(args, "args");
                mo32332b(args);
                return ((Field) this.f63673b).get(this.f63677e);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class BoundJvmStaticInObject extends FieldGetter implements BoundCaller {
            public BoundJvmStaticInObject(@NotNull Field field) {
                super(field, false, null);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class Instance extends FieldGetter {
            public Instance(@NotNull Field field) {
                super(field, true, null);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class JvmStaticInObject extends FieldGetter {
            public JvmStaticInObject(@NotNull Field field) {
                super(field, true, null);
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl
            /* renamed from: b */
            public void mo32332b(@NotNull Object[] objArr) {
                Caller.DefaultImpls.m32331a(this, objArr);
                m32333c(ArraysKt.m31927C(objArr));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class Static extends FieldGetter {
            public Static(@NotNull Field field) {
                super(field, false, null);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public FieldGetter(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r7, boolean r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r9 = "field.genericType"
                kotlin.jvm.internal.Intrinsics.m32175d(r2, r9)
                if (r8 == 0) goto L10
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L11
            L10:
                r8 = 0
            L11:
                r3 = r8
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.<init>(java.lang.reflect.Field, boolean, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.m32180i(args, "args");
            mo32332b(args);
            return ((Field) this.f63673b).get(this.f63675d != null ? ArraysKt.m31926B(args) : null);
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static abstract class FieldSetter extends CallerImpl<Field> {

        /* renamed from: e */
        public final boolean f63678e;

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class BoundInstance extends FieldSetter implements BoundCaller {

            /* renamed from: f */
            public final Object f63679f;

            public BoundInstance(@NotNull Field field, boolean z, @Nullable Object obj) {
                super(field, z, false, null);
                this.f63679f = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.m32180i(args, "args");
                mo32332b(args);
                ((Field) this.f63673b).set(this.f63679f, ArraysKt.m31926B(args));
                return Unit.f63088a;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class BoundJvmStaticInObject extends FieldSetter implements BoundCaller {
            public BoundJvmStaticInObject(@NotNull Field field, boolean z) {
                super(field, z, false, null);
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.m32180i(args, "args");
                mo32332b(args);
                ((Field) this.f63673b).set(null, ArraysKt.m31940P(args));
                return Unit.f63088a;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class Instance extends FieldSetter {
            public Instance(@NotNull Field field, boolean z) {
                super(field, z, true, null);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class JvmStaticInObject extends FieldSetter {
            public JvmStaticInObject(@NotNull Field field, boolean z) {
                super(field, z, true, null);
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.CallerImpl
            /* renamed from: b */
            public void mo32332b(@NotNull Object[] objArr) {
                super.mo32332b(objArr);
                m32333c(ArraysKt.m31927C(objArr));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class Static extends FieldSetter {
            public Static(@NotNull Field field, boolean z) {
                super(field, z, false, null);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public FieldSetter(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r7, boolean r8, boolean r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r10 = "Void.TYPE"
                kotlin.jvm.internal.Intrinsics.m32175d(r2, r10)
                if (r9 == 0) goto Le
                java.lang.Class r9 = r7.getDeclaringClass()
                goto Lf
            Le:
                r9 = 0
            Lf:
                r3 = r9
                r9 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r9]
                r9 = 0
                java.lang.reflect.Type r10 = r7.getGenericType()
                java.lang.String r0 = "field.genericType"
                kotlin.jvm.internal.Intrinsics.m32175d(r10, r0)
                r4[r9] = r10
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f63678e = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.<init>(java.lang.reflect.Field, boolean, boolean, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.CallerImpl
        /* renamed from: b */
        public void mo32332b(@NotNull Object[] objArr) {
            Caller.DefaultImpls.m32331a(this, objArr);
            if (this.f63678e && ArraysKt.m31940P(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.m32180i(args, "args");
            mo32332b(args);
            ((Field) this.f63673b).set(this.f63675d != null ? ArraysKt.m31926B(args) : null, ArraysKt.m31940P(args));
            return Unit.f63088a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallerImpl(@NotNull Member member, @NotNull Type type, @Nullable Class cls, @NotNull Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        List<Type> m31952b0;
        this.f63673b = member;
        this.f63674c = type;
        this.f63675d = cls;
        if (cls != null) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.f63354a.add(cls);
            spreadBuilder.m32210a(typeArr);
            m31952b0 = CollectionsKt.m31994G((Type[]) spreadBuilder.f63354a.toArray(new Type[spreadBuilder.m32211b()]));
        } else {
            m31952b0 = ArraysKt.m31952b0(typeArr);
        }
        this.f63672a = m31952b0;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    /* renamed from: a */
    public List<Type> mo32328a() {
        return this.f63672a;
    }

    /* renamed from: b */
    public void mo32332b(@NotNull Object[] objArr) {
        Caller.DefaultImpls.m32331a(this, objArr);
    }

    /* renamed from: c */
    public final void m32333c(@Nullable Object obj) {
        if (obj == null || !this.f63673b.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public final M getMember() {
        return this.f63673b;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    /* renamed from: getReturnType, reason: from getter */
    public final Type getF63674c() {
        return this.f63674c;
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Method;", "BoundInstance", "BoundJvmStaticInObject", "BoundStatic", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static abstract class Method extends CallerImpl<java.lang.reflect.Method> {

        /* renamed from: e */
        public final boolean f63680e;

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class BoundInstance extends Method implements BoundCaller {

            /* renamed from: f */
            public final Object f63681f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(@NotNull java.lang.reflect.Method method, @Nullable Object obj) {
                super(method, false, null, 4);
                Intrinsics.m32180i(method, "method");
                this.f63681f = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.m32180i(args, "args");
                mo32332b(args);
                return m32334d(this.f63681f, args);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class BoundJvmStaticInObject extends Method implements BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundJvmStaticInObject(@NotNull java.lang.reflect.Method method) {
                super(method, false, null, 4);
                Intrinsics.m32180i(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.m32180i(args, "args");
                mo32332b(args);
                return m32334d(null, args);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class BoundStatic extends Method implements BoundCaller {

            /* renamed from: f */
            public final Object f63682f;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public BoundStatic(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r5, @org.jetbrains.annotations.Nullable java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.Intrinsics.m32180i(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "method.genericParameterTypes"
                    kotlin.jvm.internal.Intrinsics.m32175d(r0, r1)
                    int r1 = r0.length
                    r2 = 1
                    r3 = 0
                    if (r1 > r2) goto L16
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r3]
                    goto L1b
                L16:
                    int r1 = r0.length
                    java.lang.Object[] r0 = kotlin.collections.ArraysKt.m31972v(r0, r2, r1)
                L1b:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r4.<init>(r5, r3, r0)
                    r4.f63682f = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundStatic.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.m32180i(args, "args");
                mo32332b(args);
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.f63354a.add(this.f63682f);
                spreadBuilder.m32210a(args);
                return m32334d(null, spreadBuilder.f63354a.toArray(new Object[spreadBuilder.m32211b()]));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class Instance extends Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instance(@NotNull java.lang.reflect.Method method) {
                super(method, false, null, 6);
                Intrinsics.m32180i(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.m32180i(args, "args");
                mo32332b(args);
                return m32334d(args[0], args.length <= 1 ? new Object[0] : ArraysKt.m31972v(args, 1, args.length));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class JvmStaticInObject extends Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JvmStaticInObject(@NotNull java.lang.reflect.Method method) {
                super(method, true, null, 4);
                Intrinsics.m32180i(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.m32180i(args, "args");
                mo32332b(args);
                m32333c(ArraysKt.m31927C(args));
                return m32334d(null, args.length <= 1 ? new Object[0] : ArraysKt.m31972v(args, 1, args.length));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class Static extends Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(@NotNull java.lang.reflect.Method method) {
                super(method, false, null, 6);
                Intrinsics.m32180i(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.m32180i(args, "args");
                mo32332b(args);
                return m32334d(null, args);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ Method(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, int r4) {
            /*
                r0 = this;
                r3 = r4 & 2
                if (r3 == 0) goto Le
                int r2 = r1.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r2 = r2 ^ 1
            Le:
                r3 = r4 & 4
                if (r3 == 0) goto L1c
                java.lang.reflect.Type[] r3 = r1.getGenericParameterTypes()
                java.lang.String r4 = "method.genericParameterTypes"
                kotlin.jvm.internal.Intrinsics.m32175d(r3, r4)
                goto L1d
            L1c:
                r3 = 0
            L1d:
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.CallerImpl.Method.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], int):void");
        }

        @Nullable
        /* renamed from: d */
        public final Object m32334d(@Nullable Object obj, @NotNull Object[] args) {
            Intrinsics.m32180i(args, "args");
            return this.f63680e ? Unit.f63088a : ((java.lang.reflect.Method) this.f63673b).invoke(obj, Arrays.copyOf(args, args.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Method(java.lang.reflect.Method r8, boolean r9, java.lang.reflect.Type[] r10) {
            /*
                r7 = this;
                java.lang.reflect.Type r6 = r8.getGenericReturnType()
                java.lang.String r0 = "method.genericReturnType"
                kotlin.jvm.internal.Intrinsics.m32175d(r6, r0)
                if (r9 == 0) goto L10
                java.lang.Class r9 = r8.getDeclaringClass()
                goto L11
            L10:
                r9 = 0
            L11:
                r3 = r9
                r5 = 0
                r0 = r7
                r1 = r8
                r2 = r6
                r4 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r8 = kotlin.jvm.internal.Intrinsics.m32174c(r6, r8)
                r7.f63680e = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.CallerImpl.Method.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }
    }
}
