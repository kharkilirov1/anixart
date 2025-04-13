package com.google.firebase.firestore.model.mutation;

import com.google.firestore.p012v1.Value;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ArrayTransformOperation implements TransformOperation {

    /* renamed from: a */
    public final List<Value> f22887a;

    public static class Remove extends ArrayTransformOperation {
    }

    public static class Union extends ArrayTransformOperation {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f22887a.equals(((ArrayTransformOperation) obj).f22887a);
    }

    public int hashCode() {
        return this.f22887a.hashCode() + (getClass().hashCode() * 31);
    }
}
