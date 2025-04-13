package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

@SuppressLint
/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator<FragmentState>() { // from class: androidx.fragment.app.FragmentState.1
        @Override // android.os.Parcelable.Creator
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FragmentState[] newArray(int i2) {
            return new FragmentState[i2];
        }
    };

    /* renamed from: b */
    public final String f4393b;

    /* renamed from: c */
    public final String f4394c;

    /* renamed from: d */
    public final boolean f4395d;

    /* renamed from: e */
    public final int f4396e;

    /* renamed from: f */
    public final int f4397f;

    /* renamed from: g */
    public final String f4398g;

    /* renamed from: h */
    public final boolean f4399h;

    /* renamed from: i */
    public final boolean f4400i;

    /* renamed from: j */
    public final boolean f4401j;

    /* renamed from: k */
    public final Bundle f4402k;

    /* renamed from: l */
    public final boolean f4403l;

    /* renamed from: m */
    public final int f4404m;

    /* renamed from: n */
    public Bundle f4405n;

    public FragmentState(Fragment fragment) {
        this.f4393b = fragment.getClass().getName();
        this.f4394c = fragment.mWho;
        this.f4395d = fragment.mFromLayout;
        this.f4396e = fragment.mFragmentId;
        this.f4397f = fragment.mContainerId;
        this.f4398g = fragment.mTag;
        this.f4399h = fragment.mRetainInstance;
        this.f4400i = fragment.mRemoving;
        this.f4401j = fragment.mDetached;
        this.f4402k = fragment.mArguments;
        this.f4403l = fragment.mHidden;
        this.f4404m = fragment.mMaxState.ordinal();
    }

    @NonNull
    /* renamed from: a */
    public Fragment m3081a(@NonNull FragmentFactory fragmentFactory, @NonNull ClassLoader classLoader) {
        Fragment mo2977a = fragmentFactory.mo2977a(classLoader, this.f4393b);
        Bundle bundle = this.f4402k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        mo2977a.setArguments(this.f4402k);
        mo2977a.mWho = this.f4394c;
        mo2977a.mFromLayout = this.f4395d;
        mo2977a.mRestored = true;
        mo2977a.mFragmentId = this.f4396e;
        mo2977a.mContainerId = this.f4397f;
        mo2977a.mTag = this.f4398g;
        mo2977a.mRetainInstance = this.f4399h;
        mo2977a.mRemoving = this.f4400i;
        mo2977a.mDetached = this.f4401j;
        mo2977a.mHidden = this.f4403l;
        mo2977a.mMaxState = Lifecycle.State.values()[this.f4404m];
        Bundle bundle2 = this.f4405n;
        if (bundle2 != null) {
            mo2977a.mSavedFragmentState = bundle2;
        } else {
            mo2977a.mSavedFragmentState = new Bundle();
        }
        return mo2977a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f4393b);
        sb.append(" (");
        sb.append(this.f4394c);
        sb.append(")}:");
        if (this.f4395d) {
            sb.append(" fromLayout");
        }
        if (this.f4397f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f4397f));
        }
        String str = this.f4398g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f4398g);
        }
        if (this.f4399h) {
            sb.append(" retainInstance");
        }
        if (this.f4400i) {
            sb.append(" removing");
        }
        if (this.f4401j) {
            sb.append(" detached");
        }
        if (this.f4403l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f4393b);
        parcel.writeString(this.f4394c);
        parcel.writeInt(this.f4395d ? 1 : 0);
        parcel.writeInt(this.f4396e);
        parcel.writeInt(this.f4397f);
        parcel.writeString(this.f4398g);
        parcel.writeInt(this.f4399h ? 1 : 0);
        parcel.writeInt(this.f4400i ? 1 : 0);
        parcel.writeInt(this.f4401j ? 1 : 0);
        parcel.writeBundle(this.f4402k);
        parcel.writeInt(this.f4403l ? 1 : 0);
        parcel.writeBundle(this.f4405n);
        parcel.writeInt(this.f4404m);
    }

    public FragmentState(Parcel parcel) {
        this.f4393b = parcel.readString();
        this.f4394c = parcel.readString();
        this.f4395d = parcel.readInt() != 0;
        this.f4396e = parcel.readInt();
        this.f4397f = parcel.readInt();
        this.f4398g = parcel.readString();
        this.f4399h = parcel.readInt() != 0;
        this.f4400i = parcel.readInt() != 0;
        this.f4401j = parcel.readInt() != 0;
        this.f4402k = parcel.readBundle();
        this.f4403l = parcel.readInt() != 0;
        this.f4405n = parcel.readBundle();
        this.f4404m = parcel.readInt();
    }
}
