package com.google.android.gms.common.server.response;

import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public abstract class FastJsonResponse {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @ShowFirstParty
    public interface FieldConverter<I, O> {
        @NonNull
        /* renamed from: g */
        I mo8209g(@NonNull O o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* renamed from: i */
    public static final <O, I> I m8210i(@NonNull Field<I, O> field, @Nullable Object obj) {
        FieldConverter<I, O> fieldConverter = field.f15858l;
        if (fieldConverter == null) {
            return obj;
        }
        Objects.requireNonNull(fieldConverter, "null reference");
        return field.f15858l.mo8209g(obj);
    }

    /* renamed from: k */
    public static final void m8211k(StringBuilder sb, Field field, Object obj) {
        int i2 = field.f15849c;
        if (i2 == 11) {
            Class<? extends FastJsonResponse> cls = field.f15855i;
            Objects.requireNonNull(cls, "null reference");
            sb.append(cls.cast(obj).toString());
        } else {
            if (i2 != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(JsonUtils.m8242a((String) obj));
            sb.append("\"");
        }
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public abstract Map<String, Field<?, ?>> mo7846c();

    @Nullable
    @KeepForSdk
    /* renamed from: d */
    public Object mo7847d(@NonNull Field field) {
        String str = field.f15853g;
        if (field.f15855i == null) {
            return mo8212f(str);
        }
        boolean z = mo8212f(str) == null;
        Object[] objArr = {field.f15853g};
        if (!z) {
            throw new IllegalStateException(String.format("Concrete field shouldn't be value object: %s", objArr));
        }
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Nullable
    @KeepForSdk
    /* renamed from: f */
    public abstract Object mo8212f(@NonNull String str);

    @KeepForSdk
    /* renamed from: g */
    public boolean mo7848g(@NonNull Field field) {
        if (field.f15851e != 11) {
            return mo8213h(field.f15853g);
        }
        if (field.f15852f) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    @KeepForSdk
    /* renamed from: h */
    public abstract boolean mo8213h(@NonNull String str);

    @NonNull
    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> mo7846c = mo7846c();
        StringBuilder sb = new StringBuilder(100);
        for (String str : mo7846c.keySet()) {
            Field<?, ?> field = mo7846c.get(str);
            if (mo7848g(field)) {
                Object m8210i = m8210i(field, mo7847d(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                C0000a.m1B(sb, "\"", str, "\":");
                if (m8210i != null) {
                    switch (field.f15851e) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.m8236a((byte[]) m8210i));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.m8237b((byte[]) m8210i));
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.m8243a(sb, (HashMap) m8210i);
                            break;
                        default:
                            if (field.f15850d) {
                                ArrayList arrayList = (ArrayList) m8210i;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    if (i2 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i2);
                                    if (obj != null) {
                                        m8211k(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                m8211k(sb, field, m8210i);
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @VisibleForTesting
    @SafeParcelable.Class
    @ShowFirstParty
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();

        /* renamed from: b */
        @SafeParcelable.VersionField
        public final int f15848b;

        /* renamed from: c */
        @SafeParcelable.Field
        public final int f15849c;

        /* renamed from: d */
        @SafeParcelable.Field
        public final boolean f15850d;

        /* renamed from: e */
        @SafeParcelable.Field
        public final int f15851e;

        /* renamed from: f */
        @SafeParcelable.Field
        public final boolean f15852f;

        /* renamed from: g */
        @NonNull
        @SafeParcelable.Field
        public final String f15853g;

        /* renamed from: h */
        @SafeParcelable.Field
        public final int f15854h;

        /* renamed from: i */
        @Nullable
        public final Class<? extends FastJsonResponse> f15855i;

        /* renamed from: j */
        @Nullable
        @SafeParcelable.Field
        public final String f15856j;

        /* renamed from: k */
        public zan f15857k;

        /* renamed from: l */
        @Nullable
        @SafeParcelable.Field
        public FieldConverter<I, O> f15858l;

        @SafeParcelable.Constructor
        public Field(@SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i4, @SafeParcelable.Param boolean z2, @SafeParcelable.Param String str, @SafeParcelable.Param int i5, @Nullable @SafeParcelable.Param String str2, @Nullable @SafeParcelable.Param com.google.android.gms.common.server.converter.zaa zaaVar) {
            this.f15848b = i2;
            this.f15849c = i3;
            this.f15850d = z;
            this.f15851e = i4;
            this.f15852f = z2;
            this.f15853g = str;
            this.f15854h = i5;
            if (str2 == null) {
                this.f15855i = null;
                this.f15856j = null;
            } else {
                this.f15855i = SafeParcelResponse.class;
                this.f15856j = str2;
            }
            if (zaaVar == null) {
                this.f15858l = null;
                return;
            }
            StringToIntConverter stringToIntConverter = zaaVar.f15844c;
            if (stringToIntConverter == null) {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
            this.f15858l = stringToIntConverter;
        }

        @NonNull
        @KeepForSdk
        /* renamed from: m */
        public static <T extends FastJsonResponse> Field<T, T> m8214m(@NonNull String str, int i2, @NonNull Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i2, cls, null);
        }

        @NonNull
        @KeepForSdk
        /* renamed from: n */
        public static Field<String, String> m8215n(@NonNull String str, int i2) {
            return new Field<>(7, false, 7, false, str, i2, null, null);
        }

        @NonNull
        @KeepForSdk
        /* renamed from: o */
        public static Field<ArrayList<String>, ArrayList<String>> m8216o(@NonNull String str, int i2) {
            return new Field<>(7, true, 7, true, str, i2, null, null);
        }

        @NonNull
        /* renamed from: p */
        public final Map<String, Field<?, ?>> m8217p() {
            Objects.requireNonNull(this.f15856j, "null reference");
            Objects.requireNonNull(this.f15857k, "null reference");
            Map<String, Field<?, ?>> m8222m = this.f15857k.m8222m(this.f15856j);
            Objects.requireNonNull(m8222m, "null reference");
            return m8222m;
        }

        @NonNull
        public final String toString() {
            Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
            toStringHelper.m8124a("versionCode", Integer.valueOf(this.f15848b));
            toStringHelper.m8124a("typeIn", Integer.valueOf(this.f15849c));
            toStringHelper.m8124a("typeInArray", Boolean.valueOf(this.f15850d));
            toStringHelper.m8124a("typeOut", Integer.valueOf(this.f15851e));
            toStringHelper.m8124a("typeOutArray", Boolean.valueOf(this.f15852f));
            toStringHelper.m8124a("outputFieldName", this.f15853g);
            toStringHelper.m8124a("safeParcelFieldId", Integer.valueOf(this.f15854h));
            String str = this.f15856j;
            if (str == null) {
                str = null;
            }
            toStringHelper.m8124a("concreteTypeName", str);
            Class<? extends FastJsonResponse> cls = this.f15855i;
            if (cls != null) {
                toStringHelper.m8124a("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.f15858l;
            if (fieldConverter != null) {
                toStringHelper.m8124a("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return toStringHelper.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i2) {
            int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
            int i3 = this.f15848b;
            parcel.writeInt(262145);
            parcel.writeInt(i3);
            int i4 = this.f15849c;
            parcel.writeInt(262146);
            parcel.writeInt(i4);
            boolean z = this.f15850d;
            parcel.writeInt(262147);
            parcel.writeInt(z ? 1 : 0);
            int i5 = this.f15851e;
            parcel.writeInt(262148);
            parcel.writeInt(i5);
            boolean z2 = this.f15852f;
            parcel.writeInt(262149);
            parcel.writeInt(z2 ? 1 : 0);
            SafeParcelWriter.m8168g(parcel, 6, this.f15853g, false);
            int i6 = this.f15854h;
            parcel.writeInt(262151);
            parcel.writeInt(i6);
            String str = this.f15856j;
            com.google.android.gms.common.server.converter.zaa zaaVar = null;
            if (str == null) {
                str = null;
            }
            SafeParcelWriter.m8168g(parcel, 8, str, false);
            FieldConverter<I, O> fieldConverter = this.f15858l;
            if (fieldConverter != null) {
                if (!(fieldConverter instanceof StringToIntConverter)) {
                    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
                }
                zaaVar = new com.google.android.gms.common.server.converter.zaa((StringToIntConverter) fieldConverter);
            }
            SafeParcelWriter.m8167f(parcel, 9, zaaVar, i2, false);
            SafeParcelWriter.m8174m(parcel, m8173l);
        }

        public Field(int i2, boolean z, int i3, boolean z2, @NonNull String str, int i4, @Nullable Class<? extends FastJsonResponse> cls, @Nullable FieldConverter<I, O> fieldConverter) {
            this.f15848b = 1;
            this.f15849c = i2;
            this.f15850d = z;
            this.f15851e = i3;
            this.f15852f = z2;
            this.f15853g = str;
            this.f15854h = i4;
            this.f15855i = cls;
            if (cls == null) {
                this.f15856j = null;
            } else {
                this.f15856j = cls.getCanonicalName();
            }
            this.f15858l = null;
        }
    }
}
