package com.google.firebase.firestore;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.model.mutation.FieldMask;

/* loaded from: classes2.dex */
public final class SetOptions {

    /* renamed from: a */
    public final boolean f22665a;

    /* renamed from: b */
    @Nullable
    public final FieldMask f22666b = null;

    static {
        new SetOptions(false, null);
        new SetOptions(true, null);
    }

    public SetOptions(boolean z, @Nullable FieldMask fieldMask) {
        this.f22665a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SetOptions.class != obj.getClass()) {
            return false;
        }
        SetOptions setOptions = (SetOptions) obj;
        if (this.f22665a != setOptions.f22665a) {
            return false;
        }
        FieldMask fieldMask = this.f22666b;
        FieldMask fieldMask2 = setOptions.f22666b;
        return fieldMask != null ? fieldMask.equals(fieldMask2) : fieldMask2 == null;
    }

    public int hashCode() {
        int i2 = (this.f22665a ? 1 : 0) * 31;
        FieldMask fieldMask = this.f22666b;
        return i2 + (fieldMask != null ? fieldMask.hashCode() : 0);
    }
}
