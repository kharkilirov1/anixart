package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
/* loaded from: classes.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Credential> CREATOR = new zba();

    /* renamed from: b */
    @Nonnull
    @SafeParcelable.Field
    public final String f15085b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final String f15086c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final Uri f15087d;

    /* renamed from: e */
    @Nonnull
    @SafeParcelable.Field
    public final List f15088e;

    /* renamed from: f */
    @Nullable
    @SafeParcelable.Field
    public final String f15089f;

    /* renamed from: g */
    @Nullable
    @SafeParcelable.Field
    public final String f15090g;

    /* renamed from: h */
    @Nullable
    @SafeParcelable.Field
    public final String f15091h;

    /* renamed from: i */
    @Nullable
    @SafeParcelable.Field
    public final String f15092i;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    @Deprecated
    public static class Builder {
    }

    @SafeParcelable.Constructor
    public Credential(@SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2, @Nullable @SafeParcelable.Param Uri uri, @SafeParcelable.Param List list, @Nullable @SafeParcelable.Param String str3, @Nullable @SafeParcelable.Param String str4, @Nullable @SafeParcelable.Param String str5, @Nullable @SafeParcelable.Param String str6) {
        Boolean bool;
        Preconditions.m8132g(str, "credential identifier cannot be null");
        String trim = str.trim();
        Preconditions.m8130e(trim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            if (TextUtils.isEmpty(str4)) {
                bool = Boolean.FALSE;
            } else {
                Uri parse = Uri.parse(str4);
                if (!parse.isAbsolute() || !parse.isHierarchical() || TextUtils.isEmpty(parse.getScheme()) || TextUtils.isEmpty(parse.getAuthority())) {
                    bool = Boolean.FALSE;
                } else {
                    boolean z = true;
                    if (!"http".equalsIgnoreCase(parse.getScheme()) && !"https".equalsIgnoreCase(parse.getScheme())) {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                }
            }
            if (!bool.booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f15086c = str2;
        this.f15087d = uri;
        this.f15088e = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f15085b = trim;
        this.f15089f = str3;
        this.f15090g = str4;
        this.f15091h = str5;
        this.f15092i = str6;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f15085b, credential.f15085b) && TextUtils.equals(this.f15086c, credential.f15086c) && Objects.m8123a(this.f15087d, credential.f15087d) && TextUtils.equals(this.f15089f, credential.f15089f) && TextUtils.equals(this.f15090g, credential.f15090g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15085b, this.f15086c, this.f15087d, this.f15089f, this.f15090g});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f15085b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f15086c, false);
        SafeParcelWriter.m8167f(parcel, 3, this.f15087d, i2, false);
        SafeParcelWriter.m8172k(parcel, 4, this.f15088e, false);
        SafeParcelWriter.m8168g(parcel, 5, this.f15089f, false);
        SafeParcelWriter.m8168g(parcel, 6, this.f15090g, false);
        SafeParcelWriter.m8168g(parcel, 9, this.f15091h, false);
        SafeParcelWriter.m8168g(parcel, 10, this.f15092i, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
