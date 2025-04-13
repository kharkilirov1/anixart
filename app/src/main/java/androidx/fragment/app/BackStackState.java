package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.List;

@SuppressLint
/* loaded from: classes.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() { // from class: androidx.fragment.app.BackStackState.1
        @Override // android.os.Parcelable.Creator
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BackStackState[] newArray(int i2) {
            return new BackStackState[i2];
        }
    };

    /* renamed from: b */
    public final List<String> f4215b;

    /* renamed from: c */
    public final List<BackStackRecordState> f4216c;

    public BackStackState(@NonNull Parcel parcel) {
        this.f4215b = parcel.createStringArrayList();
        this.f4216c = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeStringList(this.f4215b);
        parcel.writeTypedList(this.f4216c);
    }
}
