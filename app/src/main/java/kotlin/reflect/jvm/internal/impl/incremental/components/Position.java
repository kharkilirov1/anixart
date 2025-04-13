package kotlin.reflect.jvm.internal.impl.incremental.components;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: LookupLocation.kt */
/* loaded from: classes3.dex */
public final class Position implements Serializable {

    /* renamed from: d */
    @NotNull
    public static final Position f64282d = new Position(-1, -1);

    /* renamed from: b */
    public final int f64283b;

    /* renamed from: c */
    public final int f64284c;

    /* compiled from: LookupLocation.kt */
    public static final class Companion {
    }

    public Position(int i2, int i3) {
        this.f64283b = i2;
        this.f64284c = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof Position) {
                Position position = (Position) obj;
                if (this.f64283b == position.f64283b) {
                    if (this.f64284c == position.f64284c) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f64283b * 31) + this.f64284c;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Position(line=");
        m24u.append(this.f64283b);
        m24u.append(", column=");
        return C0000a.m18o(m24u, this.f64284c, ")");
    }
}
