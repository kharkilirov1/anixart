package com.swiftsoft.anixartd.utils.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.swiftsoft.anixartd.utils.cropper.CropImageView;
import com.yandex.mobile.ads.C4632R;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new Parcelable.Creator<CropImageOptions>() { // from class: com.swiftsoft.anixartd.utils.cropper.CropImageOptions.1
        @Override // android.os.Parcelable.Creator
        public CropImageOptions createFromParcel(Parcel parcel) {
            return new CropImageOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CropImageOptions[] newArray(int i2) {
            return new CropImageOptions[i2];
        }
    };

    /* renamed from: A */
    public int f30318A;

    /* renamed from: B */
    public int f30319B;

    /* renamed from: C */
    public int f30320C;

    /* renamed from: D */
    public int f30321D;

    /* renamed from: E */
    public CharSequence f30322E;

    /* renamed from: F */
    public int f30323F;

    /* renamed from: G */
    public Uri f30324G;

    /* renamed from: H */
    public Bitmap.CompressFormat f30325H;

    /* renamed from: I */
    public int f30326I;

    /* renamed from: J */
    public int f30327J;

    /* renamed from: K */
    public int f30328K;

    /* renamed from: L */
    public CropImageView.RequestSizeOptions f30329L;

    /* renamed from: M */
    public boolean f30330M;

    /* renamed from: N */
    public Rect f30331N;

    /* renamed from: O */
    public int f30332O;

    /* renamed from: P */
    public boolean f30333P;

    /* renamed from: Q */
    public boolean f30334Q;

    /* renamed from: R */
    public boolean f30335R;

    /* renamed from: S */
    public int f30336S;

    /* renamed from: T */
    public boolean f30337T;

    /* renamed from: U */
    public boolean f30338U;

    /* renamed from: V */
    public CharSequence f30339V;

    /* renamed from: W */
    public int f30340W;

    /* renamed from: b */
    public CropImageView.CropShape f30341b;

    /* renamed from: c */
    public float f30342c;

    /* renamed from: d */
    public float f30343d;

    /* renamed from: e */
    public CropImageView.Guidelines f30344e;

    /* renamed from: f */
    public CropImageView.ScaleType f30345f;

    /* renamed from: g */
    public boolean f30346g;

    /* renamed from: h */
    public boolean f30347h;

    /* renamed from: i */
    public boolean f30348i;

    /* renamed from: j */
    public boolean f30349j;

    /* renamed from: k */
    public int f30350k;

    /* renamed from: l */
    public float f30351l;

    /* renamed from: m */
    public boolean f30352m;

    /* renamed from: n */
    public int f30353n;

    /* renamed from: o */
    public int f30354o;

    /* renamed from: p */
    public float f30355p;

    /* renamed from: q */
    public int f30356q;

    /* renamed from: r */
    public float f30357r;

    /* renamed from: s */
    public float f30358s;

    /* renamed from: t */
    public float f30359t;

    /* renamed from: u */
    public int f30360u;

    /* renamed from: v */
    public float f30361v;

    /* renamed from: w */
    public int f30362w;

    /* renamed from: x */
    public int f30363x;

    /* renamed from: y */
    public int f30364y;

    /* renamed from: z */
    public int f30365z;

    public CropImageOptions() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f30341b = CropImageView.CropShape.RECTANGLE;
        this.f30342c = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f30343d = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f30344e = CropImageView.Guidelines.ON_TOUCH;
        this.f30345f = CropImageView.ScaleType.FIT_CENTER;
        this.f30346g = true;
        this.f30347h = true;
        this.f30348i = true;
        this.f30349j = false;
        this.f30350k = 4;
        this.f30351l = 0.1f;
        this.f30352m = false;
        this.f30353n = 1;
        this.f30354o = 1;
        this.f30355p = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f30356q = Color.argb(170, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE);
        this.f30357r = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f30358s = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.f30359t = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.f30360u = -1;
        this.f30361v = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.f30362w = Color.argb(170, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE);
        this.f30363x = Color.argb(C4632R.styleable.AppCompatTheme_windowActionModeOverlay, 0, 0, 0);
        this.f30364y = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f30365z = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f30318A = 40;
        this.f30319B = 40;
        this.f30320C = 99999;
        this.f30321D = 99999;
        this.f30322E = "";
        this.f30323F = 0;
        this.f30324G = Uri.EMPTY;
        this.f30325H = Bitmap.CompressFormat.JPEG;
        this.f30326I = 90;
        this.f30327J = 0;
        this.f30328K = 0;
        this.f30329L = CropImageView.RequestSizeOptions.NONE;
        this.f30330M = false;
        this.f30331N = null;
        this.f30332O = -1;
        this.f30333P = true;
        this.f30334Q = true;
        this.f30335R = false;
        this.f30336S = 90;
        this.f30337T = false;
        this.f30338U = false;
        this.f30339V = null;
        this.f30340W = 0;
    }

    /* renamed from: c */
    public void m16414c() {
        if (this.f30350k < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        }
        if (this.f30343d < 0.0f) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        float f2 = this.f30351l;
        if (f2 < 0.0f || f2 >= 0.5d) {
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
        if (this.f30353n <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f30354o <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f30355p < 0.0f) {
            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
        }
        if (this.f30357r < 0.0f) {
            throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
        }
        if (this.f30361v < 0.0f) {
            throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
        }
        if (this.f30365z < 0) {
            throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
        }
        int i2 = this.f30318A;
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
        }
        int i3 = this.f30319B;
        if (i3 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
        }
        if (this.f30320C < i2) {
            throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
        }
        if (this.f30321D < i3) {
            throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
        }
        if (this.f30327J < 0) {
            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
        }
        if (this.f30328K < 0) {
            throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
        }
        int i4 = this.f30336S;
        if (i4 < 0 || i4 > 360) {
            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f30341b.ordinal());
        parcel.writeFloat(this.f30342c);
        parcel.writeFloat(this.f30343d);
        parcel.writeInt(this.f30344e.ordinal());
        parcel.writeInt(this.f30345f.ordinal());
        parcel.writeByte(this.f30346g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f30347h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f30348i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f30349j ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f30350k);
        parcel.writeFloat(this.f30351l);
        parcel.writeByte(this.f30352m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f30353n);
        parcel.writeInt(this.f30354o);
        parcel.writeFloat(this.f30355p);
        parcel.writeInt(this.f30356q);
        parcel.writeFloat(this.f30357r);
        parcel.writeFloat(this.f30358s);
        parcel.writeFloat(this.f30359t);
        parcel.writeInt(this.f30360u);
        parcel.writeFloat(this.f30361v);
        parcel.writeInt(this.f30362w);
        parcel.writeInt(this.f30363x);
        parcel.writeInt(this.f30364y);
        parcel.writeInt(this.f30365z);
        parcel.writeInt(this.f30318A);
        parcel.writeInt(this.f30319B);
        parcel.writeInt(this.f30320C);
        parcel.writeInt(this.f30321D);
        TextUtils.writeToParcel(this.f30322E, parcel, i2);
        parcel.writeInt(this.f30323F);
        parcel.writeParcelable(this.f30324G, i2);
        parcel.writeString(this.f30325H.name());
        parcel.writeInt(this.f30326I);
        parcel.writeInt(this.f30327J);
        parcel.writeInt(this.f30328K);
        parcel.writeInt(this.f30329L.ordinal());
        parcel.writeInt(this.f30330M ? 1 : 0);
        parcel.writeParcelable(this.f30331N, i2);
        parcel.writeInt(this.f30332O);
        parcel.writeByte(this.f30333P ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f30334Q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f30335R ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f30336S);
        parcel.writeByte(this.f30337T ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f30338U ? (byte) 1 : (byte) 0);
        TextUtils.writeToParcel(this.f30339V, parcel, i2);
        parcel.writeInt(this.f30340W);
    }

    public CropImageOptions(Parcel parcel) {
        this.f30341b = CropImageView.CropShape.values()[parcel.readInt()];
        this.f30342c = parcel.readFloat();
        this.f30343d = parcel.readFloat();
        this.f30344e = CropImageView.Guidelines.values()[parcel.readInt()];
        this.f30345f = CropImageView.ScaleType.values()[parcel.readInt()];
        this.f30346g = parcel.readByte() != 0;
        this.f30347h = parcel.readByte() != 0;
        this.f30348i = parcel.readByte() != 0;
        this.f30349j = parcel.readByte() != 0;
        this.f30350k = parcel.readInt();
        this.f30351l = parcel.readFloat();
        this.f30352m = parcel.readByte() != 0;
        this.f30353n = parcel.readInt();
        this.f30354o = parcel.readInt();
        this.f30355p = parcel.readFloat();
        this.f30356q = parcel.readInt();
        this.f30357r = parcel.readFloat();
        this.f30358s = parcel.readFloat();
        this.f30359t = parcel.readFloat();
        this.f30360u = parcel.readInt();
        this.f30361v = parcel.readFloat();
        this.f30362w = parcel.readInt();
        this.f30363x = parcel.readInt();
        this.f30364y = parcel.readInt();
        this.f30365z = parcel.readInt();
        this.f30318A = parcel.readInt();
        this.f30319B = parcel.readInt();
        this.f30320C = parcel.readInt();
        this.f30321D = parcel.readInt();
        this.f30322E = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f30323F = parcel.readInt();
        this.f30324G = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f30325H = Bitmap.CompressFormat.valueOf(parcel.readString());
        this.f30326I = parcel.readInt();
        this.f30327J = parcel.readInt();
        this.f30328K = parcel.readInt();
        this.f30329L = CropImageView.RequestSizeOptions.values()[parcel.readInt()];
        this.f30330M = parcel.readByte() != 0;
        this.f30331N = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f30332O = parcel.readInt();
        this.f30333P = parcel.readByte() != 0;
        this.f30334Q = parcel.readByte() != 0;
        this.f30335R = parcel.readByte() != 0;
        this.f30336S = parcel.readInt();
        this.f30337T = parcel.readByte() != 0;
        this.f30338U = parcel.readByte() != 0;
        this.f30339V = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f30340W = parcel.readInt();
    }
}
