package com.airbnb.epoxy;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public class StringAttributeData {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringAttributeData)) {
            return false;
        }
        Objects.requireNonNull((StringAttributeData) obj);
        return Arrays.equals((Object[]) null, (Object[]) null);
    }

    public int hashCode() {
        return Arrays.hashCode((Object[]) null) + 0;
    }
}
