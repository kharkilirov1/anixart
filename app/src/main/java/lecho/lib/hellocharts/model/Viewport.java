package lecho.lib.hellocharts.model;

import android.os.Parcel;
import android.os.Parcelable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class Viewport implements Parcelable {
    public static final Parcelable.Creator<Viewport> CREATOR = new Parcelable.Creator<Viewport>() { // from class: lecho.lib.hellocharts.model.Viewport.1
        @Override // android.os.Parcelable.Creator
        public Viewport createFromParcel(Parcel parcel) {
            Viewport viewport = new Viewport();
            viewport.f68643b = parcel.readFloat();
            viewport.f68644c = parcel.readFloat();
            viewport.f68645d = parcel.readFloat();
            viewport.f68646e = parcel.readFloat();
            return viewport;
        }

        @Override // android.os.Parcelable.Creator
        public Viewport[] newArray(int i2) {
            return new Viewport[i2];
        }
    };

    /* renamed from: b */
    public float f68643b;

    /* renamed from: c */
    public float f68644c;

    /* renamed from: d */
    public float f68645d;

    /* renamed from: e */
    public float f68646e;

    /* renamed from: c */
    public final float m34466c() {
        return this.f68644c - this.f68646e;
    }

    /* renamed from: d */
    public void m34467d(float f2, float f3, float f4, float f5) {
        this.f68643b = f2;
        this.f68644c = f3;
        this.f68645d = f4;
        this.f68646e = f5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Viewport viewport = (Viewport) obj;
        return Float.floatToIntBits(this.f68646e) == Float.floatToIntBits(viewport.f68646e) && Float.floatToIntBits(this.f68643b) == Float.floatToIntBits(viewport.f68643b) && Float.floatToIntBits(this.f68645d) == Float.floatToIntBits(viewport.f68645d) && Float.floatToIntBits(this.f68644c) == Float.floatToIntBits(viewport.f68644c);
    }

    /* renamed from: f */
    public void m34468f(Viewport viewport) {
        this.f68643b = viewport.f68643b;
        this.f68644c = viewport.f68644c;
        this.f68645d = viewport.f68645d;
        this.f68646e = viewport.f68646e;
    }

    /* renamed from: g */
    public final float m34469g() {
        return this.f68645d - this.f68643b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f68644c) + ((Float.floatToIntBits(this.f68645d) + ((Float.floatToIntBits(this.f68643b) + ((Float.floatToIntBits(this.f68646e) + 31) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Viewport [left=");
        m24u.append(this.f68643b);
        m24u.append(", top=");
        m24u.append(this.f68644c);
        m24u.append(", right=");
        m24u.append(this.f68645d);
        m24u.append(", bottom=");
        m24u.append(this.f68646e);
        m24u.append("]");
        return m24u.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.f68643b);
        parcel.writeFloat(this.f68644c);
        parcel.writeFloat(this.f68645d);
        parcel.writeFloat(this.f68646e);
    }
}
