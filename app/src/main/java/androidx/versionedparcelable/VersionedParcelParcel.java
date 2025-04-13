package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.lang.reflect.Method;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
class VersionedParcelParcel extends VersionedParcel {

    /* renamed from: d */
    public final SparseIntArray f6481d;

    /* renamed from: e */
    public final Parcel f6482e;

    /* renamed from: f */
    public final int f6483f;

    /* renamed from: g */
    public final int f6484g;

    /* renamed from: h */
    public final String f6485h;

    /* renamed from: i */
    public int f6486i;

    /* renamed from: j */
    public int f6487j;

    /* renamed from: k */
    public int f6488k;

    public VersionedParcelParcel(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: a */
    public void mo4311a() {
        int i2 = this.f6486i;
        if (i2 >= 0) {
            int i3 = this.f6481d.get(i2);
            int dataPosition = this.f6482e.dataPosition();
            this.f6482e.setDataPosition(i3);
            this.f6482e.writeInt(dataPosition - i3);
            this.f6482e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: b */
    public VersionedParcel mo4312b() {
        Parcel parcel = this.f6482e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f6487j;
        if (i2 == this.f6483f) {
            i2 = this.f6484g;
        }
        return new VersionedParcelParcel(parcel, dataPosition, i2, C0000a.m20q(new StringBuilder(), this.f6485h, "  "), this.f6478a, this.f6479b, this.f6480c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: g */
    public boolean mo4317g() {
        return this.f6482e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: h */
    public byte[] mo4318h() {
        int readInt = this.f6482e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f6482e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: i */
    public CharSequence mo4319i() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f6482e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: j */
    public boolean mo4320j(int i2) {
        while (this.f6487j < this.f6484g) {
            int i3 = this.f6488k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f6482e.setDataPosition(this.f6487j);
            int readInt = this.f6482e.readInt();
            this.f6488k = this.f6482e.readInt();
            this.f6487j += readInt;
        }
        return this.f6488k == i2;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: k */
    public int mo4321k() {
        return this.f6482e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: m */
    public <T extends Parcelable> T mo4323m() {
        return (T) this.f6482e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: o */
    public String mo4325o() {
        return this.f6482e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: q */
    public void mo4327q(int i2) {
        mo4311a();
        this.f6486i = i2;
        this.f6481d.put(i2, this.f6482e.dataPosition());
        this.f6482e.writeInt(0);
        this.f6482e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: s */
    public void mo4329s(boolean z) {
        this.f6482e.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: t */
    public void mo4330t(byte[] bArr) {
        if (bArr == null) {
            this.f6482e.writeInt(-1);
        } else {
            this.f6482e.writeInt(bArr.length);
            this.f6482e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: u */
    public void mo4331u(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f6482e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: v */
    public void mo4332v(int i2) {
        this.f6482e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: w */
    public void mo4333w(Parcelable parcelable) {
        this.f6482e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: x */
    public void mo4334x(String str) {
        this.f6482e.writeString(str);
    }

    public VersionedParcelParcel(Parcel parcel, int i2, int i3, String str, ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.f6481d = new SparseIntArray();
        this.f6486i = -1;
        this.f6487j = 0;
        this.f6488k = -1;
        this.f6482e = parcel;
        this.f6483f = i2;
        this.f6484g = i3;
        this.f6487j = i2;
        this.f6485h = str;
    }
}
