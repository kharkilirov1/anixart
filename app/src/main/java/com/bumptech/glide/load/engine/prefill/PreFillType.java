package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class PreFillType {

    public static class Builder {
    }

    static {
        Bitmap.Config config = Bitmap.Config.RGB_565;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PreFillType)) {
            return false;
        }
        Objects.requireNonNull((PreFillType) obj);
        return true;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "PreFillSize{width=0, height=0, config=null, weight=0}";
    }
}
