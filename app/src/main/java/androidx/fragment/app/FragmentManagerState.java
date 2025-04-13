package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint
/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator<FragmentManagerState>() { // from class: androidx.fragment.app.FragmentManagerState.1
        @Override // android.os.Parcelable.Creator
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FragmentManagerState[] newArray(int i2) {
            return new FragmentManagerState[i2];
        }
    };

    /* renamed from: b */
    public ArrayList<String> f4377b;

    /* renamed from: c */
    public ArrayList<String> f4378c;

    /* renamed from: d */
    public BackStackRecordState[] f4379d;

    /* renamed from: e */
    public int f4380e;

    /* renamed from: f */
    public String f4381f;

    /* renamed from: g */
    public ArrayList<String> f4382g;

    /* renamed from: h */
    public ArrayList<BackStackState> f4383h;

    /* renamed from: i */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f4384i;

    public FragmentManagerState() {
        this.f4381f = null;
        this.f4382g = new ArrayList<>();
        this.f4383h = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f4377b);
        parcel.writeStringList(this.f4378c);
        parcel.writeTypedArray(this.f4379d, i2);
        parcel.writeInt(this.f4380e);
        parcel.writeString(this.f4381f);
        parcel.writeStringList(this.f4382g);
        parcel.writeTypedList(this.f4383h);
        parcel.writeTypedList(this.f4384i);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f4381f = null;
        this.f4382g = new ArrayList<>();
        this.f4383h = new ArrayList<>();
        this.f4377b = parcel.createStringArrayList();
        this.f4378c = parcel.createStringArrayList();
        this.f4379d = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f4380e = parcel.readInt();
        this.f4381f = parcel.readString();
        this.f4382g = parcel.createStringArrayList();
        this.f4383h = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f4384i = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
