package androidx.core.graphics;

import java.util.Objects;

/* loaded from: classes.dex */
public final class PathSegment {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathSegment)) {
            return false;
        }
        Objects.requireNonNull((PathSegment) obj);
        if (Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0) {
            throw null;
        }
        return false;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "PathSegment{start=null, startFraction=0.0, end=null, endFraction=0.0}";
    }
}
