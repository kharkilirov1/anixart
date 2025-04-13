package androidx.room.util;

import androidx.annotation.RestrictTo;
import java.util.Objects;

@RestrictTo
/* loaded from: classes.dex */
public final class ViewInfo {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo = (ViewInfo) obj;
        Objects.requireNonNull(viewInfo);
        Objects.requireNonNull(viewInfo);
        return true;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "ViewInfo{name='null', sql='null'}";
    }
}
