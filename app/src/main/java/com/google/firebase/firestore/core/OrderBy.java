package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.FieldPath;

/* loaded from: classes2.dex */
public class OrderBy {

    /* renamed from: a */
    public final Direction f22720a;

    /* renamed from: b */
    public final FieldPath f22721b;

    public enum Direction {
        ASCENDING(1),
        DESCENDING(-1);


        /* renamed from: b */
        public final int f22725b;

        Direction(int i2) {
            this.f22725b = i2;
        }
    }

    public OrderBy(Direction direction, FieldPath fieldPath) {
        this.f22720a = direction;
        this.f22721b = fieldPath;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof OrderBy)) {
            return false;
        }
        OrderBy orderBy = (OrderBy) obj;
        return this.f22720a == orderBy.f22720a && this.f22721b.equals(orderBy.f22721b);
    }

    public int hashCode() {
        return this.f22721b.hashCode() + ((this.f22720a.hashCode() + 899) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22720a == Direction.ASCENDING ? "" : "-");
        sb.append(this.f22721b.mo12428b());
        return sb.toString();
    }
}
