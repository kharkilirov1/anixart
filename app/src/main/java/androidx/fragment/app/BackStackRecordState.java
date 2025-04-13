package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

@SuppressLint
/* loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new Parcelable.Creator<BackStackRecordState>() { // from class: androidx.fragment.app.BackStackRecordState.1
        @Override // android.os.Parcelable.Creator
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BackStackRecordState[] newArray(int i2) {
            return new BackStackRecordState[i2];
        }
    };

    /* renamed from: b */
    public final int[] f4201b;

    /* renamed from: c */
    public final ArrayList<String> f4202c;

    /* renamed from: d */
    public final int[] f4203d;

    /* renamed from: e */
    public final int[] f4204e;

    /* renamed from: f */
    public final int f4205f;

    /* renamed from: g */
    public final String f4206g;

    /* renamed from: h */
    public final int f4207h;

    /* renamed from: i */
    public final int f4208i;

    /* renamed from: j */
    public final CharSequence f4209j;

    /* renamed from: k */
    public final int f4210k;

    /* renamed from: l */
    public final CharSequence f4211l;

    /* renamed from: m */
    public final ArrayList<String> f4212m;

    /* renamed from: n */
    public final ArrayList<String> f4213n;

    /* renamed from: o */
    public final boolean f4214o;

    public BackStackRecordState(BackStackRecord backStackRecord) {
        int size = backStackRecord.f4426a.size();
        this.f4201b = new int[size * 6];
        if (!backStackRecord.f4432g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f4202c = new ArrayList<>(size);
        this.f4203d = new int[size];
        this.f4204e = new int[size];
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            FragmentTransaction.C0373Op c0373Op = backStackRecord.f4426a.get(i2);
            int i4 = i3 + 1;
            this.f4201b[i3] = c0373Op.f4442a;
            ArrayList<String> arrayList = this.f4202c;
            Fragment fragment = c0373Op.f4443b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f4201b;
            int i5 = i4 + 1;
            iArr[i4] = c0373Op.f4444c ? 1 : 0;
            int i6 = i5 + 1;
            iArr[i5] = c0373Op.f4445d;
            int i7 = i6 + 1;
            iArr[i6] = c0373Op.f4446e;
            int i8 = i7 + 1;
            iArr[i7] = c0373Op.f4447f;
            iArr[i8] = c0373Op.f4448g;
            this.f4203d[i2] = c0373Op.f4449h.ordinal();
            this.f4204e[i2] = c0373Op.f4450i.ordinal();
            i2++;
            i3 = i8 + 1;
        }
        this.f4205f = backStackRecord.f4431f;
        this.f4206g = backStackRecord.f4434i;
        this.f4207h = backStackRecord.f4199s;
        this.f4208i = backStackRecord.f4435j;
        this.f4209j = backStackRecord.f4436k;
        this.f4210k = backStackRecord.f4437l;
        this.f4211l = backStackRecord.f4438m;
        this.f4212m = backStackRecord.f4439n;
        this.f4213n = backStackRecord.f4440o;
        this.f4214o = backStackRecord.f4441p;
    }

    /* renamed from: a */
    public final void m2950a(@NonNull BackStackRecord backStackRecord) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f4201b;
            boolean z = true;
            if (i2 >= iArr.length) {
                backStackRecord.f4431f = this.f4205f;
                backStackRecord.f4434i = this.f4206g;
                backStackRecord.f4432g = true;
                backStackRecord.f4435j = this.f4208i;
                backStackRecord.f4436k = this.f4209j;
                backStackRecord.f4437l = this.f4210k;
                backStackRecord.f4438m = this.f4211l;
                backStackRecord.f4439n = this.f4212m;
                backStackRecord.f4440o = this.f4213n;
                backStackRecord.f4441p = this.f4214o;
                return;
            }
            FragmentTransaction.C0373Op c0373Op = new FragmentTransaction.C0373Op();
            int i4 = i2 + 1;
            c0373Op.f4442a = iArr[i2];
            if (FragmentManager.m2992Q(2)) {
                Log.v("FragmentManager", "Instantiate " + backStackRecord + " op #" + i3 + " base fragment #" + this.f4201b[i4]);
            }
            c0373Op.f4449h = Lifecycle.State.values()[this.f4203d[i3]];
            c0373Op.f4450i = Lifecycle.State.values()[this.f4204e[i3]];
            int[] iArr2 = this.f4201b;
            int i5 = i4 + 1;
            if (iArr2[i4] == 0) {
                z = false;
            }
            c0373Op.f4444c = z;
            int i6 = i5 + 1;
            int i7 = iArr2[i5];
            c0373Op.f4445d = i7;
            int i8 = i6 + 1;
            int i9 = iArr2[i6];
            c0373Op.f4446e = i9;
            int i10 = i8 + 1;
            int i11 = iArr2[i8];
            c0373Op.f4447f = i11;
            int i12 = iArr2[i10];
            c0373Op.f4448g = i12;
            backStackRecord.f4427b = i7;
            backStackRecord.f4428c = i9;
            backStackRecord.f4429d = i11;
            backStackRecord.f4430e = i12;
            backStackRecord.m3114b(c0373Op);
            i3++;
            i2 = i10 + 1;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f4201b);
        parcel.writeStringList(this.f4202c);
        parcel.writeIntArray(this.f4203d);
        parcel.writeIntArray(this.f4204e);
        parcel.writeInt(this.f4205f);
        parcel.writeString(this.f4206g);
        parcel.writeInt(this.f4207h);
        parcel.writeInt(this.f4208i);
        TextUtils.writeToParcel(this.f4209j, parcel, 0);
        parcel.writeInt(this.f4210k);
        TextUtils.writeToParcel(this.f4211l, parcel, 0);
        parcel.writeStringList(this.f4212m);
        parcel.writeStringList(this.f4213n);
        parcel.writeInt(this.f4214o ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f4201b = parcel.createIntArray();
        this.f4202c = parcel.createStringArrayList();
        this.f4203d = parcel.createIntArray();
        this.f4204e = parcel.createIntArray();
        this.f4205f = parcel.readInt();
        this.f4206g = parcel.readString();
        this.f4207h = parcel.readInt();
        this.f4208i = parcel.readInt();
        this.f4209j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4210k = parcel.readInt();
        this.f4211l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4212m = parcel.createStringArrayList();
        this.f4213n = parcel.createStringArrayList();
        this.f4214o = parcel.readInt() != 0;
    }
}
