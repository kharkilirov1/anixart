package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@VisibleForTesting
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15859b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final Parcel f15860c;

    /* renamed from: d */
    public final int f15861d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final zan f15862e;

    /* renamed from: f */
    @Nullable
    public final String f15863f;

    /* renamed from: g */
    public int f15864g;

    /* renamed from: h */
    public int f15865h;

    @SafeParcelable.Constructor
    public SafeParcelResponse(@SafeParcelable.Param int i2, @SafeParcelable.Param Parcel parcel, @SafeParcelable.Param zan zanVar) {
        this.f15859b = i2;
        Objects.requireNonNull(parcel, "null reference");
        this.f15860c = parcel;
        this.f15861d = 2;
        this.f15862e = zanVar;
        this.f15863f = zanVar == null ? null : zanVar.f15874d;
        this.f15864g = 2;
    }

    /* renamed from: n */
    public static final void m8218n(StringBuilder sb, int i2, @Nullable Object obj) {
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                Objects.requireNonNull(obj, "null reference");
                sb.append(JsonUtils.m8242a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.m8236a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(Base64Utils.m8237b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                Objects.requireNonNull(obj, "null reference");
                MapUtils.m8243a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(C0576a.m4111j(26, "Unknown type = ", i2));
        }
    }

    /* renamed from: o */
    public static final void m8219o(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (!field.f15850d) {
            m8218n(sb, field.f15849c, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            m8218n(sb, field.f15849c, arrayList.get(i2));
        }
        sb.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @Nullable
    /* renamed from: c */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo7846c() {
        zan zanVar = this.f15862e;
        if (zanVar == null) {
            return null;
        }
        String str = this.f15863f;
        Objects.requireNonNull(str, "null reference");
        return zanVar.f15873c.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    @NonNull
    /* renamed from: f */
    public final Object mo8212f(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: h */
    public final boolean mo8213h(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @NonNull
    /* renamed from: l */
    public final Parcel m8220l() {
        int i2 = this.f15864g;
        if (i2 == 0) {
            int m8162a = SafeParcelWriter.m8162a(this.f15860c);
            this.f15865h = m8162a;
            SafeParcelWriter.m8174m(this.f15860c, m8162a);
            this.f15864g = 2;
        } else if (i2 == 1) {
            SafeParcelWriter.m8174m(this.f15860c, this.f15865h);
            this.f15864g = 2;
        }
        return this.f15860c;
    }

    /* renamed from: m */
    public final void m8221m(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry<String, FastJsonResponse.Field<?, ?>> entry : map.entrySet()) {
            sparseArray.put(entry.getValue().f15854h, entry);
        }
        sb.append('{');
        int m8159v = SafeParcelReader.m8159v(parcel);
        boolean z = false;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) readInt);
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                C0000a.m1B(sb, "\"", str, "\":");
                if (field.f15858l != null) {
                    int i2 = field.f15851e;
                    switch (i2) {
                        case 0:
                            m8219o(sb, field, FastJsonResponse.m8210i(field, Integer.valueOf(SafeParcelReader.m8154q(parcel, readInt))));
                            break;
                        case 1:
                            m8219o(sb, field, FastJsonResponse.m8210i(field, SafeParcelReader.m8139b(parcel, readInt)));
                            break;
                        case 2:
                            m8219o(sb, field, FastJsonResponse.m8210i(field, Long.valueOf(SafeParcelReader.m8155r(parcel, readInt))));
                            break;
                        case 3:
                            m8219o(sb, field, FastJsonResponse.m8210i(field, Float.valueOf(SafeParcelReader.m8152o(parcel, readInt))));
                            break;
                        case 4:
                            SafeParcelReader.m8161x(parcel, readInt, 8);
                            m8219o(sb, field, FastJsonResponse.m8210i(field, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            m8219o(sb, field, FastJsonResponse.m8210i(field, SafeParcelReader.m8138a(parcel, readInt)));
                            break;
                        case 6:
                            m8219o(sb, field, FastJsonResponse.m8210i(field, Boolean.valueOf(SafeParcelReader.m8151n(parcel, readInt))));
                            break;
                        case 7:
                            m8219o(sb, field, FastJsonResponse.m8210i(field, SafeParcelReader.m8145h(parcel, readInt)));
                            break;
                        case 8:
                        case 9:
                            m8219o(sb, field, FastJsonResponse.m8210i(field, SafeParcelReader.m8141d(parcel, readInt)));
                            break;
                        case 10:
                            Bundle m8140c = SafeParcelReader.m8140c(parcel, readInt);
                            HashMap hashMap = new HashMap();
                            for (String str2 : m8140c.keySet()) {
                                String string = m8140c.getString(str2);
                                Objects.requireNonNull(string, "null reference");
                                hashMap.put(str2, string);
                            }
                            m8219o(sb, field, FastJsonResponse.m8210i(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(C0576a.m4111j(36, "Unknown field out type = ", i2));
                    }
                } else if (field.f15852f) {
                    sb.append("[");
                    BigInteger[] bigIntegerArr = null;
                    Parcel[] parcelArr = null;
                    boolean[] zArr = null;
                    BigDecimal[] bigDecimalArr = null;
                    double[] dArr = null;
                    float[] fArr = null;
                    long[] jArr = null;
                    switch (field.f15851e) {
                        case 0:
                            int[] m8142e = SafeParcelReader.m8142e(parcel, readInt);
                            int length = m8142e.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                if (i3 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Integer.toString(m8142e[i3]));
                            }
                            break;
                        case 1:
                            int m8157t = SafeParcelReader.m8157t(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (m8157t != 0) {
                                int readInt2 = parcel.readInt();
                                bigIntegerArr = new BigInteger[readInt2];
                                for (int i4 = 0; i4 < readInt2; i4++) {
                                    bigIntegerArr[i4] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(dataPosition + m8157t);
                            }
                            ArrayUtils.m8235b(sb, bigIntegerArr);
                            break;
                        case 2:
                            int m8157t2 = SafeParcelReader.m8157t(parcel, readInt);
                            int dataPosition2 = parcel.dataPosition();
                            if (m8157t2 != 0) {
                                jArr = parcel.createLongArray();
                                parcel.setDataPosition(dataPosition2 + m8157t2);
                            }
                            int length2 = jArr.length;
                            for (int i5 = 0; i5 < length2; i5++) {
                                if (i5 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Long.toString(jArr[i5]));
                            }
                            break;
                        case 3:
                            int m8157t3 = SafeParcelReader.m8157t(parcel, readInt);
                            int dataPosition3 = parcel.dataPosition();
                            if (m8157t3 != 0) {
                                fArr = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition3 + m8157t3);
                            }
                            int length3 = fArr.length;
                            for (int i6 = 0; i6 < length3; i6++) {
                                if (i6 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Float.toString(fArr[i6]));
                            }
                            break;
                        case 4:
                            int m8157t4 = SafeParcelReader.m8157t(parcel, readInt);
                            int dataPosition4 = parcel.dataPosition();
                            if (m8157t4 != 0) {
                                dArr = parcel.createDoubleArray();
                                parcel.setDataPosition(dataPosition4 + m8157t4);
                            }
                            int length4 = dArr.length;
                            for (int i7 = 0; i7 < length4; i7++) {
                                if (i7 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Double.toString(dArr[i7]));
                            }
                            break;
                        case 5:
                            int m8157t5 = SafeParcelReader.m8157t(parcel, readInt);
                            int dataPosition5 = parcel.dataPosition();
                            if (m8157t5 != 0) {
                                int readInt3 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[readInt3];
                                for (int i8 = 0; i8 < readInt3; i8++) {
                                    bigDecimalArr[i8] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(dataPosition5 + m8157t5);
                            }
                            ArrayUtils.m8235b(sb, bigDecimalArr);
                            break;
                        case 6:
                            int m8157t6 = SafeParcelReader.m8157t(parcel, readInt);
                            int dataPosition6 = parcel.dataPosition();
                            if (m8157t6 != 0) {
                                zArr = parcel.createBooleanArray();
                                parcel.setDataPosition(dataPosition6 + m8157t6);
                            }
                            int length5 = zArr.length;
                            for (int i9 = 0; i9 < length5; i9++) {
                                if (i9 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Boolean.toString(zArr[i9]));
                            }
                            break;
                        case 7:
                            String[] m8146i = SafeParcelReader.m8146i(parcel, readInt);
                            int length6 = m8146i.length;
                            for (int i10 = 0; i10 < length6; i10++) {
                                if (i10 != 0) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(m8146i[i10]);
                                sb.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int m8157t7 = SafeParcelReader.m8157t(parcel, readInt);
                            int dataPosition7 = parcel.dataPosition();
                            if (m8157t7 != 0) {
                                int readInt4 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[readInt4];
                                for (int i11 = 0; i11 < readInt4; i11++) {
                                    int readInt5 = parcel.readInt();
                                    if (readInt5 != 0) {
                                        int dataPosition8 = parcel.dataPosition();
                                        Parcel obtain = Parcel.obtain();
                                        obtain.appendFrom(parcel, dataPosition8, readInt5);
                                        parcelArr2[i11] = obtain;
                                        parcel.setDataPosition(dataPosition8 + readInt5);
                                    } else {
                                        parcelArr2[i11] = null;
                                    }
                                }
                                parcel.setDataPosition(dataPosition7 + m8157t7);
                                parcelArr = parcelArr2;
                            }
                            int length7 = parcelArr.length;
                            for (int i12 = 0; i12 < length7; i12++) {
                                if (i12 > 0) {
                                    sb.append(",");
                                }
                                parcelArr[i12].setDataPosition(0);
                                m8221m(sb, field.m8217p(), parcelArr[i12]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f15851e) {
                        case 0:
                            sb.append(SafeParcelReader.m8154q(parcel, readInt));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.m8139b(parcel, readInt));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.m8155r(parcel, readInt));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.m8152o(parcel, readInt));
                            break;
                        case 4:
                            SafeParcelReader.m8161x(parcel, readInt, 8);
                            sb.append(parcel.readDouble());
                            break;
                        case 5:
                            sb.append(SafeParcelReader.m8138a(parcel, readInt));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.m8151n(parcel, readInt));
                            break;
                        case 7:
                            String m8145h = SafeParcelReader.m8145h(parcel, readInt);
                            sb.append("\"");
                            sb.append(JsonUtils.m8242a(m8145h));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] m8141d = SafeParcelReader.m8141d(parcel, readInt);
                            sb.append("\"");
                            sb.append(Base64Utils.m8236a(m8141d));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] m8141d2 = SafeParcelReader.m8141d(parcel, readInt);
                            sb.append("\"");
                            sb.append(Base64Utils.m8237b(m8141d2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle m8140c2 = SafeParcelReader.m8140c(parcel, readInt);
                            Set<String> keySet = m8140c2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str3 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                C0000a.m1B(sb, "\"", str3, "\":\"");
                                sb.append(JsonUtils.m8242a(m8140c2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel m8143f = SafeParcelReader.m8143f(parcel, readInt);
                            m8143f.setDataPosition(0);
                            m8221m(sb, field.m8217p(), m8143f);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != m8159v) {
            throw new SafeParcelReader.ParseException(C0576a.m4111j(37, "Overread allowed size end=", m8159v), parcel);
        }
        sb.append('}');
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @NonNull
    public final String toString() {
        Preconditions.m8132g(this.f15862e, "Cannot convert to JSON on client side.");
        Parcel m8220l = m8220l();
        m8220l.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        zan zanVar = this.f15862e;
        String str = this.f15863f;
        Objects.requireNonNull(str, "null reference");
        Map<String, FastJsonResponse.Field<?, ?>> map = zanVar.f15873c.get(str);
        Objects.requireNonNull(map, "null reference");
        m8221m(sb, map, m8220l);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15859b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        Parcel m8220l = m8220l();
        if (m8220l != null) {
            int m8173l2 = SafeParcelWriter.m8173l(parcel, 2);
            parcel.appendFrom(m8220l, 0, m8220l.dataSize());
            SafeParcelWriter.m8174m(parcel, m8173l2);
        }
        int i4 = this.f15861d;
        SafeParcelWriter.m8167f(parcel, 3, i4 != 0 ? i4 != 1 ? this.f15862e : this.f15862e : null, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
