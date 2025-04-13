package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.JvmField;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypeMappingMode.kt */
/* loaded from: classes3.dex */
public final class TypeMappingMode {

    /* renamed from: j */
    @JvmField
    @NotNull
    public static final TypeMappingMode f64809j;

    /* renamed from: a */
    public final boolean f64810a;

    /* renamed from: b */
    public final boolean f64811b;

    /* renamed from: c */
    public final boolean f64812c;

    /* renamed from: d */
    public final boolean f64813d;

    /* renamed from: e */
    public final boolean f64814e;

    /* renamed from: f */
    public final TypeMappingMode f64815f;

    /* renamed from: g */
    public final boolean f64816g;

    /* renamed from: h */
    public final TypeMappingMode f64817h;

    /* renamed from: i */
    public final TypeMappingMode f64818i;

    /* compiled from: TypeMappingMode.kt */
    public static final class Companion {
    }

    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            iArr[Variance.INVARIANT.ordinal()] = 2;
        }
    }

    static {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        TypeMappingMode typeMappingMode = null;
        TypeMappingMode typeMappingMode2 = null;
        f64809j = new TypeMappingMode(z, z2, z3, z4, z5, new TypeMappingMode(z, z2, z3, z4, z5, null, z6, typeMappingMode, typeMappingMode2, 511), z6, typeMappingMode, typeMappingMode2, 476);
    }

    public TypeMappingMode(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TypeMappingMode typeMappingMode, boolean z6, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3) {
        this.f64810a = z;
        this.f64811b = z2;
        this.f64812c = z3;
        this.f64813d = z4;
        this.f64814e = z5;
        this.f64815f = typeMappingMode;
        this.f64816g = z6;
        this.f64817h = typeMappingMode2;
        this.f64818i = typeMappingMode3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ TypeMappingMode(boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode r16, boolean r17, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode r18, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode r19, int r20) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 1
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = r11
        La:
            r3 = r0 & 2
            if (r3 == 0) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = r12
        L11:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L18
            r4 = 0
            goto L19
        L18:
            r4 = r13
        L19:
            r6 = r0 & 8
            if (r6 == 0) goto L1f
            r6 = 0
            goto L20
        L1f:
            r6 = r14
        L20:
            r7 = r0 & 16
            if (r7 == 0) goto L25
            goto L26
        L25:
            r5 = r15
        L26:
            r7 = r0 & 32
            r8 = 0
            if (r7 == 0) goto L2d
            r7 = r8
            goto L2f
        L2d:
            r7 = r16
        L2f:
            r9 = r0 & 64
            if (r9 == 0) goto L34
            goto L36
        L34:
            r2 = r17
        L36:
            r9 = r0 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L3c
            r9 = r7
            goto L3d
        L3c:
            r9 = r8
        L3d:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L42
            r8 = r7
        L42:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r6
            r16 = r5
            r17 = r7
            r18 = r2
            r19 = r9
            r20 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode.<init>(boolean, boolean, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode, boolean, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode, int):void");
    }
}
