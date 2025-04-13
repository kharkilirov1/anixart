package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntersectionType.kt */
/* loaded from: classes3.dex */
public final class TypeIntersector {

    /* renamed from: a */
    public static final TypeIntersector f66404a = new TypeIntersector();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IntersectionType.kt */
    public static final class ResultNullability {

        /* renamed from: b */
        public static final ResultNullability f66405b;

        /* renamed from: c */
        public static final ResultNullability f66406c;

        /* renamed from: d */
        public static final ResultNullability f66407d;

        /* renamed from: e */
        public static final ResultNullability f66408e;

        /* renamed from: f */
        public static final /* synthetic */ ResultNullability[] f66409f;

        /* compiled from: IntersectionType.kt */
        public static final class ACCEPT_NULL extends ResultNullability {
            public ACCEPT_NULL(String str, int i2) {
                super(str, i2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            @NotNull
            /* renamed from: a */
            public ResultNullability mo33742a(@NotNull UnwrappedType nextType) {
                Intrinsics.m32180i(nextType, "nextType");
                return m33743b(nextType);
            }
        }

        /* compiled from: IntersectionType.kt */
        public static final class NOT_NULL extends ResultNullability {
            public NOT_NULL(String str, int i2) {
                super(str, i2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            /* renamed from: a */
            public ResultNullability mo33742a(UnwrappedType nextType) {
                Intrinsics.m32180i(nextType, "nextType");
                return this;
            }
        }

        /* compiled from: IntersectionType.kt */
        public static final class START extends ResultNullability {
            public START(String str, int i2) {
                super(str, i2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            @NotNull
            /* renamed from: a */
            public ResultNullability mo33742a(@NotNull UnwrappedType nextType) {
                Intrinsics.m32180i(nextType, "nextType");
                return m33743b(nextType);
            }
        }

        /* compiled from: IntersectionType.kt */
        public static final class UNKNOWN extends ResultNullability {
            public UNKNOWN(String str, int i2) {
                super(str, i2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            @NotNull
            /* renamed from: a */
            public ResultNullability mo33742a(@NotNull UnwrappedType nextType) {
                Intrinsics.m32180i(nextType, "nextType");
                ResultNullability m33743b = m33743b(nextType);
                return m33743b == ResultNullability.f66406c ? this : m33743b;
            }
        }

        static {
            START start = new START("START", 0);
            f66405b = start;
            ACCEPT_NULL accept_null = new ACCEPT_NULL("ACCEPT_NULL", 1);
            f66406c = accept_null;
            UNKNOWN unknown = new UNKNOWN("UNKNOWN", 2);
            f66407d = unknown;
            NOT_NULL not_null = new NOT_NULL("NOT_NULL", 3);
            f66408e = not_null;
            f66409f = new ResultNullability[]{start, accept_null, unknown, not_null};
        }

        public ResultNullability(String str, int i2) {
        }

        public static ResultNullability valueOf(String str) {
            return (ResultNullability) Enum.valueOf(ResultNullability.class, str);
        }

        public static ResultNullability[] values() {
            return (ResultNullability[]) f66409f.clone();
        }

        @NotNull
        /* renamed from: a */
        public abstract ResultNullability mo33742a(@NotNull UnwrappedType unwrappedType);

        @NotNull
        /* renamed from: b */
        public final ResultNullability m33743b(@NotNull UnwrappedType unwrappedType) {
            return unwrappedType.mo32838I0() ? f66406c : NullabilityChecker.f66380a.m33720b(unwrappedType) ? f66408e : f66407d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[LOOP:5: B:54:0x00e3->B:77:?, LOOP_END, SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType m33741a(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.SimpleType> r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.m33741a(java.util.List):kotlin.reflect.jvm.internal.impl.types.SimpleType");
    }
}
