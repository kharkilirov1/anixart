package androidx.room.util;

import androidx.annotation.RestrictTo;
import java.util.Objects;

@RestrictTo
/* loaded from: classes.dex */
public final class FtsTableInfo {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo = (FtsTableInfo) obj;
        Objects.requireNonNull(ftsTableInfo);
        Objects.requireNonNull(ftsTableInfo);
        Objects.requireNonNull(ftsTableInfo);
        return true;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "FtsTableInfo{name='null', columns=null, options=null}";
    }
}
