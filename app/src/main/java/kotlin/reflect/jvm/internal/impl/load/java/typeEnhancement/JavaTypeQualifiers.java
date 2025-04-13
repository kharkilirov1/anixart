package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: typeQualifiers.kt */
/* loaded from: classes3.dex */
public final class JavaTypeQualifiers {

    /* renamed from: a */
    @Nullable
    public final NullabilityQualifier f64648a;

    /* renamed from: b */
    @Nullable
    public final MutabilityQualifier f64649b;

    /* renamed from: c */
    public final boolean f64650c;

    /* renamed from: d */
    public final boolean f64651d;

    /* renamed from: f */
    public static final Companion f64647f = new Companion(null);

    /* renamed from: e */
    @NotNull
    public static final JavaTypeQualifiers f64646e = new JavaTypeQualifiers(null, null, false, false, 8);

    /* compiled from: typeQualifiers.kt */
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public JavaTypeQualifiers(@Nullable NullabilityQualifier nullabilityQualifier, @Nullable MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        this.f64648a = nullabilityQualifier;
        this.f64649b = mutabilityQualifier;
        this.f64650c = z;
        this.f64651d = z2;
    }

    public JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i2) {
        z2 = (i2 & 8) != 0 ? false : z2;
        this.f64648a = nullabilityQualifier;
        this.f64649b = mutabilityQualifier;
        this.f64650c = z;
        this.f64651d = z2;
    }
}
