package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class FlagSet {

    /* renamed from: a */
    public final SparseBooleanArray f14637a;

    public static final class Builder {

        /* renamed from: a */
        public final SparseBooleanArray f14638a = new SparseBooleanArray();

        /* renamed from: b */
        public boolean f14639b;

        /* renamed from: a */
        public Builder m7552a(int i2) {
            Assertions.m7516d(!this.f14639b);
            this.f14638a.append(i2, true);
            return this;
        }

        /* renamed from: b */
        public FlagSet m7553b() {
            Assertions.m7516d(!this.f14639b);
            this.f14639b = true;
            return new FlagSet(this.f14638a, null);
        }
    }

    public FlagSet(SparseBooleanArray sparseBooleanArray, C11721 c11721) {
        this.f14637a = sparseBooleanArray;
    }

    /* renamed from: a */
    public boolean m7549a(int i2) {
        return this.f14637a.get(i2);
    }

    /* renamed from: b */
    public int m7550b(int i2) {
        Assertions.m7515c(i2, 0, m7551c());
        return this.f14637a.keyAt(i2);
    }

    /* renamed from: c */
    public int m7551c() {
        return this.f14637a.size();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagSet)) {
            return false;
        }
        FlagSet flagSet = (FlagSet) obj;
        if (Util.f14736a >= 24) {
            return this.f14637a.equals(flagSet.f14637a);
        }
        if (m7551c() != flagSet.m7551c()) {
            return false;
        }
        for (int i2 = 0; i2 < m7551c(); i2++) {
            if (m7550b(i2) != flagSet.m7550b(i2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (Util.f14736a >= 24) {
            return this.f14637a.hashCode();
        }
        int m7551c = m7551c();
        for (int i2 = 0; i2 < m7551c(); i2++) {
            m7551c = (m7551c * 31) + m7550b(i2);
        }
        return m7551c;
    }
}
