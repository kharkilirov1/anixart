package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes3.dex */
public abstract class TypeProjectionBase implements TypeProjection {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeProjection)) {
            return false;
        }
        TypeProjection typeProjection = (TypeProjection) obj;
        return mo33672b() == typeProjection.mo33672b() && mo33671a() == typeProjection.mo33671a() && getType().equals(typeProjection.getType());
    }

    public int hashCode() {
        return (mo33671a().hashCode() * 31) + (mo33672b() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (mo33672b()) {
            return "*";
        }
        if (mo33671a() == Variance.INVARIANT) {
            return getType().toString();
        }
        return mo33671a() + " " + getType();
    }
}
