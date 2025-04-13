package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.customview.view.AbsSavedState;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new Parcelable.ClassLoaderCreator<ExtendableSavedState>() { // from class: com.google.android.material.stateful.ExtendableSavedState.1
        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        public ExtendableSavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public Object[] newArray(int i2) {
            return new ExtendableSavedState[i2];
        }

        @Override // android.os.Parcelable.Creator
        @Nullable
        public Object createFromParcel(@NonNull Parcel parcel) {
            return new ExtendableSavedState(parcel, null, null);
        }
    };

    /* renamed from: d */
    @NonNull
    public final SimpleArrayMap<String, Bundle> f18878d;

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f18878d = new SimpleArrayMap<>();
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ExtendableSavedState{");
        m24u.append(Integer.toHexString(System.identityHashCode(this)));
        m24u.append(" states=");
        m24u.append(this.f18878d);
        m24u.append("}");
        return m24u.toString();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeParcelable(this.f3875b, i2);
        int size = this.f18878d.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = this.f18878d.m1122i(i3);
            bundleArr[i3] = this.f18878d.m1126m(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader, C13951 c13951) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f18878d = new SimpleArrayMap<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f18878d.put(strArr[i2], bundleArr[i2]);
        }
    }
}
