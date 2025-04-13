package kotlin.reflect;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: KTypeProjection.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/KTypeProjection;", "", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final /* data */ class KTypeProjection {

    /* renamed from: c */
    @NotNull
    public static final Companion f63415c = new Companion(null);

    /* renamed from: d */
    @JvmField
    @NotNull
    public static final KTypeProjection f63416d = new KTypeProjection(null, null);

    /* renamed from: a */
    @Nullable
    public final KVariance f63417a;

    /* renamed from: b */
    @Nullable
    public final KType f63418b;

    /* compiled from: KTypeProjection.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "Lkotlin/reflect/KTypeProjection;", "star", "Lkotlin/reflect/KTypeProjection;", "getStar$annotations", "()V", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: KTypeProjection.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63419a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63419a = iArr;
        }
    }

    public KTypeProjection(@Nullable KVariance kVariance, @Nullable KType kType) {
        String str;
        this.f63417a = kVariance;
        this.f63418b = kType;
        if ((kVariance == null) == (kType == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.f63417a == kTypeProjection.f63417a && Intrinsics.m32174c(this.f63418b, kTypeProjection.f63418b);
    }

    public int hashCode() {
        KVariance kVariance = this.f63417a;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        KType kType = this.f63418b;
        return hashCode + (kType != null ? kType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        KVariance kVariance = this.f63417a;
        int i2 = kVariance == null ? -1 : WhenMappings.f63419a[kVariance.ordinal()];
        if (i2 == -1) {
            return "*";
        }
        if (i2 == 1) {
            return String.valueOf(this.f63418b);
        }
        if (i2 == 2) {
            StringBuilder m24u = C0000a.m24u("in ");
            m24u.append(this.f63418b);
            return m24u.toString();
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder m24u2 = C0000a.m24u("out ");
        m24u2.append(this.f63418b);
        return m24u2.toString();
    }
}
