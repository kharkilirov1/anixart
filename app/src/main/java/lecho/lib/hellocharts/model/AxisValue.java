package lecho.lib.hellocharts.model;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class AxisValue {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Float.compare(0.0f, 0.0f) == 0 && Arrays.equals((char[]) null, (char[]) null);
    }

    public int hashCode() {
        return 0;
    }
}
