package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.room.util.C0576a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public ParseException(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    @NonNull
    /* renamed from: a */
    public static BigDecimal m8138a(@NonNull Parcel parcel, int i2) {
        int m8157t = m8157t(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m8157t == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + m8157t);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    @NonNull
    /* renamed from: b */
    public static BigInteger m8139b(@NonNull Parcel parcel, int i2) {
        int m8157t = m8157t(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m8157t == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m8157t);
        return new BigInteger(createByteArray);
    }

    @NonNull
    /* renamed from: c */
    public static Bundle m8140c(@NonNull Parcel parcel, int i2) {
        int m8157t = m8157t(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m8157t == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m8157t);
        return readBundle;
    }

    @NonNull
    /* renamed from: d */
    public static byte[] m8141d(@NonNull Parcel parcel, int i2) {
        int m8157t = m8157t(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m8157t == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m8157t);
        return createByteArray;
    }

    @NonNull
    /* renamed from: e */
    public static int[] m8142e(@NonNull Parcel parcel, int i2) {
        int m8157t = m8157t(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m8157t == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m8157t);
        return createIntArray;
    }

    @NonNull
    /* renamed from: f */
    public static Parcel m8143f(@NonNull Parcel parcel, int i2) {
        int m8157t = m8157t(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m8157t == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, m8157t);
        parcel.setDataPosition(dataPosition + m8157t);
        return obtain;
    }

    @NonNull
    /* renamed from: g */
    public static <T extends Parcelable> T m8144g(@NonNull Parcel parcel, int i2, @NonNull Parcelable.Creator<T> creator) {
        int m8157t = m8157t(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m8157t == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m8157t);
        return createFromParcel;
    }

    @NonNull
    /* renamed from: h */
    public static String m8145h(@NonNull Parcel parcel, int i2) {
        int m8157t = m8157t(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m8157t == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m8157t);
        return readString;
    }

    @NonNull
    /* renamed from: i */
    public static String[] m8146i(@NonNull Parcel parcel, int i2) {
        int m8157t = m8157t(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m8157t == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m8157t);
        return createStringArray;
    }

    @NonNull
    /* renamed from: j */
    public static ArrayList<String> m8147j(@NonNull Parcel parcel, int i2) {
        int m8157t = m8157t(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m8157t == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m8157t);
        return createStringArrayList;
    }

    @NonNull
    /* renamed from: k */
    public static <T> T[] m8148k(@NonNull Parcel parcel, int i2, @NonNull Parcelable.Creator<T> creator) {
        int m8157t = m8157t(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m8157t == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m8157t);
        return tArr;
    }

    @NonNull
    /* renamed from: l */
    public static <T> ArrayList<T> m8149l(@NonNull Parcel parcel, int i2, @NonNull Parcelable.Creator<T> creator) {
        int m8157t = m8157t(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m8157t == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m8157t);
        return createTypedArrayList;
    }

    /* renamed from: m */
    public static void m8150m(@NonNull Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new ParseException(C0576a.m4111j(37, "Overread allowed size end=", i2), parcel);
        }
    }

    /* renamed from: n */
    public static boolean m8151n(@NonNull Parcel parcel, int i2) {
        m8161x(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: o */
    public static float m8152o(@NonNull Parcel parcel, int i2) {
        m8161x(parcel, i2, 4);
        return parcel.readFloat();
    }

    @NonNull
    /* renamed from: p */
    public static IBinder m8153p(@NonNull Parcel parcel, int i2) {
        int m8157t = m8157t(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m8157t == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m8157t);
        return readStrongBinder;
    }

    /* renamed from: q */
    public static int m8154q(@NonNull Parcel parcel, int i2) {
        m8161x(parcel, i2, 4);
        return parcel.readInt();
    }

    /* renamed from: r */
    public static long m8155r(@NonNull Parcel parcel, int i2) {
        m8161x(parcel, i2, 8);
        return parcel.readLong();
    }

    @NonNull
    /* renamed from: s */
    public static Long m8156s(@NonNull Parcel parcel, int i2) {
        int m8157t = m8157t(parcel, i2);
        if (m8157t == 0) {
            return null;
        }
        m8160w(parcel, i2, m8157t, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: t */
    public static int m8157t(@NonNull Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    /* renamed from: u */
    public static void m8158u(@NonNull Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + m8157t(parcel, i2));
    }

    /* renamed from: v */
    public static int m8159v(@NonNull Parcel parcel) {
        int readInt = parcel.readInt();
        int m8157t = m8157t(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new ParseException(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i2 = m8157t + dataPosition;
        if (i2 < dataPosition || i2 > parcel.dataSize()) {
            throw new ParseException(C0576a.m4112k(54, "Size read is invalid start=", dataPosition, " end=", i2), parcel);
        }
        return i2;
    }

    /* renamed from: w */
    public static void m8160w(Parcel parcel, int i2, int i3, int i4) {
        if (i3 == i4) {
            return;
        }
        String hexString = Integer.toHexString(i3);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i4);
        sb.append(" got ");
        sb.append(i3);
        throw new ParseException(C0000a.m21r(sb, " (0x", hexString, ")"), parcel);
    }

    /* renamed from: x */
    public static void m8161x(Parcel parcel, int i2, int i3) {
        int m8157t = m8157t(parcel, i2);
        if (m8157t == i3) {
            return;
        }
        String hexString = Integer.toHexString(m8157t);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(m8157t);
        throw new ParseException(C0000a.m21r(sb, " (0x", hexString, ")"), parcel);
    }
}
