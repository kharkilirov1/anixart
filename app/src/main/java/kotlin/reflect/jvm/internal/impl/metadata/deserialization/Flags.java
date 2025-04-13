package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class Flags {

    /* renamed from: A */
    public static final BooleanFlagField f65387A;

    /* renamed from: B */
    public static final BooleanFlagField f65388B;

    /* renamed from: C */
    public static final BooleanFlagField f65389C;

    /* renamed from: D */
    public static final BooleanFlagField f65390D;

    /* renamed from: E */
    public static final BooleanFlagField f65391E;

    /* renamed from: F */
    public static final BooleanFlagField f65392F;

    /* renamed from: G */
    public static final BooleanFlagField f65393G;

    /* renamed from: H */
    public static final BooleanFlagField f65394H;

    /* renamed from: I */
    public static final BooleanFlagField f65395I;

    /* renamed from: a */
    public static final BooleanFlagField f65396a = FlagField.m33116a();

    /* renamed from: b */
    public static final BooleanFlagField f65397b;

    /* renamed from: c */
    public static final FlagField<ProtoBuf.Visibility> f65398c;

    /* renamed from: d */
    public static final FlagField<ProtoBuf.Modality> f65399d;

    /* renamed from: e */
    public static final FlagField<ProtoBuf.Class.Kind> f65400e;

    /* renamed from: f */
    public static final BooleanFlagField f65401f;

    /* renamed from: g */
    public static final BooleanFlagField f65402g;

    /* renamed from: h */
    public static final BooleanFlagField f65403h;

    /* renamed from: i */
    public static final BooleanFlagField f65404i;

    /* renamed from: j */
    public static final BooleanFlagField f65405j;

    /* renamed from: k */
    public static final BooleanFlagField f65406k;

    /* renamed from: l */
    public static final FlagField<ProtoBuf.MemberKind> f65407l;

    /* renamed from: m */
    public static final BooleanFlagField f65408m;

    /* renamed from: n */
    public static final BooleanFlagField f65409n;

    /* renamed from: o */
    public static final BooleanFlagField f65410o;

    /* renamed from: p */
    public static final BooleanFlagField f65411p;

    /* renamed from: q */
    public static final BooleanFlagField f65412q;

    /* renamed from: r */
    public static final BooleanFlagField f65413r;

    /* renamed from: s */
    public static final BooleanFlagField f65414s;

    /* renamed from: t */
    public static final BooleanFlagField f65415t;

    /* renamed from: u */
    public static final BooleanFlagField f65416u;

    /* renamed from: v */
    public static final BooleanFlagField f65417v;

    /* renamed from: w */
    public static final BooleanFlagField f65418w;

    /* renamed from: x */
    public static final BooleanFlagField f65419x;

    /* renamed from: y */
    public static final BooleanFlagField f65420y;

    /* renamed from: z */
    public static final BooleanFlagField f65421z;

    public static class BooleanFlagField extends FlagField<Boolean> {
        public BooleanFlagField(int i2) {
            super(i2, 1, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        @NotNull
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean mo33113b(int i2) {
            return Boolean.valueOf((i2 & (1 << this.f65423a)) != 0);
        }

        /* renamed from: d */
        public int m33115d(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f65423a;
            }
            return 0;
        }
    }

    public static class EnumLiteFlagField<E extends Internal.EnumLite> extends FlagField<E> {

        /* renamed from: c */
        public final E[] f65422c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public EnumLiteFlagField(int r5, E[] r6) {
            /*
                r4 = this;
                int r0 = r6.length
                r1 = 1
                int r0 = r0 - r1
                if (r0 != 0) goto L6
                goto L10
            L6:
                r2 = 31
            L8:
                if (r2 < 0) goto L1a
                int r3 = r1 << r2
                r3 = r3 & r0
                if (r3 == 0) goto L17
                int r1 = r1 + r2
            L10:
                r0 = 0
                r4.<init>(r5, r1, r0)
                r4.f65422c = r6
                return
            L17:
                int r2 = r2 + (-1)
                goto L8
            L1a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "Empty enum: "
                java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
                java.lang.Class r6 = r6.getClass()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.EnumLiteFlagField.<init>(int, kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite[]):void");
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        /* renamed from: b */
        public Object mo33113b(int i2) {
            int i3 = (1 << this.f65424b) - 1;
            int i4 = this.f65423a;
            int i5 = (i2 & (i3 << i4)) >> i4;
            for (E e2 : this.f65422c) {
                if (e2.mo32978x() == i5) {
                    return e2;
                }
            }
            return null;
        }
    }

    public static abstract class FlagField<E> {

        /* renamed from: a */
        public final int f65423a;

        /* renamed from: b */
        public final int f65424b;

        public FlagField(int i2, int i3, C66821 c66821) {
            this.f65423a = i2;
            this.f65424b = i3;
        }

        /* renamed from: a */
        public static BooleanFlagField m33116a() {
            return new BooleanFlagField(0);
        }

        /* renamed from: b */
        public abstract E mo33113b(int i2);
    }

    static {
        BooleanFlagField m33116a = FlagField.m33116a();
        f65397b = m33116a;
        ProtoBuf.Visibility[] values = ProtoBuf.Visibility.values();
        int i2 = m33116a.f65423a + m33116a.f65424b;
        EnumLiteFlagField enumLiteFlagField = new EnumLiteFlagField(i2, values);
        f65398c = enumLiteFlagField;
        ProtoBuf.Modality[] values2 = ProtoBuf.Modality.values();
        int i3 = enumLiteFlagField.f65424b + i2;
        EnumLiteFlagField enumLiteFlagField2 = new EnumLiteFlagField(i3, values2);
        f65399d = enumLiteFlagField2;
        ProtoBuf.Class.Kind[] values3 = ProtoBuf.Class.Kind.values();
        int i4 = enumLiteFlagField2.f65424b + i3;
        EnumLiteFlagField enumLiteFlagField3 = new EnumLiteFlagField(i4, values3);
        f65400e = enumLiteFlagField3;
        int i5 = i4 + enumLiteFlagField3.f65424b;
        f65401f = new BooleanFlagField(i5);
        int i6 = i5 + 1;
        f65402g = new BooleanFlagField(i6);
        int i7 = i6 + 1;
        f65403h = new BooleanFlagField(i7);
        int i8 = i7 + 1;
        f65404i = new BooleanFlagField(i8);
        f65405j = new BooleanFlagField(i8 + 1);
        f65406k = new BooleanFlagField(i2 + enumLiteFlagField.f65424b);
        ProtoBuf.MemberKind[] values4 = ProtoBuf.MemberKind.values();
        int i9 = enumLiteFlagField2.f65424b + i3;
        EnumLiteFlagField enumLiteFlagField4 = new EnumLiteFlagField(i9, values4);
        f65407l = enumLiteFlagField4;
        int i10 = enumLiteFlagField4.f65424b;
        int i11 = i9 + i10;
        f65408m = new BooleanFlagField(i11);
        int i12 = i11 + 1;
        f65409n = new BooleanFlagField(i12);
        int i13 = i12 + 1;
        f65410o = new BooleanFlagField(i13);
        int i14 = i13 + 1;
        f65411p = new BooleanFlagField(i14);
        int i15 = i14 + 1;
        f65412q = new BooleanFlagField(i15);
        int i16 = i15 + 1;
        f65413r = new BooleanFlagField(i16);
        f65414s = new BooleanFlagField(i16 + 1);
        int i17 = i9 + i10;
        f65415t = new BooleanFlagField(i17);
        int i18 = i17 + 1;
        f65416u = new BooleanFlagField(i18);
        int i19 = i18 + 1;
        f65417v = new BooleanFlagField(i19);
        int i20 = i19 + 1;
        f65418w = new BooleanFlagField(i20);
        int i21 = i20 + 1;
        f65419x = new BooleanFlagField(i21);
        int i22 = i21 + 1;
        f65420y = new BooleanFlagField(i22);
        int i23 = i22 + 1;
        f65421z = new BooleanFlagField(i23);
        int i24 = i23 + 1;
        f65387A = new BooleanFlagField(i24);
        f65388B = new BooleanFlagField(i24 + 1);
        int i25 = m33116a.f65423a + m33116a.f65424b;
        f65389C = new BooleanFlagField(i25);
        int i26 = i25 + 1;
        f65390D = new BooleanFlagField(i26);
        f65391E = new BooleanFlagField(i26 + 1);
        int i27 = i3 + enumLiteFlagField2.f65424b;
        f65392F = new BooleanFlagField(i27);
        int i28 = i27 + 1;
        f65393G = new BooleanFlagField(i28);
        f65394H = new BooleanFlagField(i28 + 1);
        f65395I = FlagField.m33116a();
    }

    /* renamed from: a */
    public static int m33112a(boolean z, @NotNull ProtoBuf.Visibility visibility, @NotNull ProtoBuf.Modality modality, boolean z2, boolean z3, boolean z4) {
        int m33115d = f65397b.m33115d(Boolean.valueOf(z));
        EnumLiteFlagField enumLiteFlagField = (EnumLiteFlagField) f65399d;
        Objects.requireNonNull(enumLiteFlagField);
        int i2 = m33115d | (modality.f65093b << enumLiteFlagField.f65423a);
        EnumLiteFlagField enumLiteFlagField2 = (EnumLiteFlagField) f65398c;
        Objects.requireNonNull(enumLiteFlagField2);
        return i2 | (visibility.f65369b << enumLiteFlagField2.f65423a) | f65392F.m33115d(Boolean.valueOf(z2)) | f65393G.m33115d(Boolean.valueOf(z3)) | f65394H.m33115d(Boolean.valueOf(z4));
    }
}
