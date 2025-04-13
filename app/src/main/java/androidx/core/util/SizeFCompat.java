package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* loaded from: classes.dex */
public final class SizeFCompat {

    /* renamed from: a */
    public final float f3557a;

    /* renamed from: b */
    public final float f3558b;

    @RequiresApi
    public static final class Api21Impl {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static SizeF m2034a(@NonNull SizeFCompat sizeFCompat) {
            Objects.requireNonNull(sizeFCompat);
            return new SizeF(sizeFCompat.f3557a, sizeFCompat.f3558b);
        }

        @NonNull
        @DoNotInline
        /* renamed from: b */
        public static SizeFCompat m2035b(@NonNull SizeF sizeF) {
            Objects.requireNonNull(sizeF);
            return new SizeFCompat(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public SizeFCompat(float f2, float f3) {
        Preconditions.m2029b(f2, "width");
        this.f3557a = f2;
        Preconditions.m2029b(f3, "height");
        this.f3558b = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeFCompat)) {
            return false;
        }
        SizeFCompat sizeFCompat = (SizeFCompat) obj;
        return sizeFCompat.f3557a == this.f3557a && sizeFCompat.f3558b == this.f3558b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f3557a) ^ Float.floatToIntBits(this.f3558b);
    }

    @NonNull
    public String toString() {
        return this.f3557a + "x" + this.f3558b;
    }
}
