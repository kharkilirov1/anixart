package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint
/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: b */
    public final Parcelable f3875b;

    /* renamed from: c */
    public static final AbsSavedState f3874c = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new Parcelable.ClassLoaderCreator<AbsSavedState>() { // from class: androidx.customview.view.AbsSavedState.2
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return AbsSavedState.f3874c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i2) {
            return new AbsSavedState[i2];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f3874c;
            }
            throw new IllegalStateException("superState must be null");
        }
    };

    public AbsSavedState() {
        this.f3875b = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f3875b, i2);
    }

    public AbsSavedState(C02801 c02801) {
        this.f3875b = null;
    }

    public AbsSavedState(@NonNull Parcelable parcelable) {
        if (parcelable != null) {
            this.f3875b = parcelable == f3874c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3875b = readParcelable == null ? f3874c : readParcelable;
    }
}
