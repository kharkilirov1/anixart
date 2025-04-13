package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class FontRequest {

    /* renamed from: a */
    public final String f3473a;

    /* renamed from: b */
    public final String f3474b;

    /* renamed from: c */
    public final String f3475c;

    /* renamed from: d */
    public final List<List<byte[]>> f3476d;

    /* renamed from: e */
    public final String f3477e;

    public FontRequest(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        Objects.requireNonNull(str);
        this.f3473a = str;
        Objects.requireNonNull(str2);
        this.f3474b = str2;
        this.f3475c = str3;
        Objects.requireNonNull(list);
        this.f3476d = list;
        this.f3477e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder m24u = C0000a.m24u("FontRequest {mProviderAuthority: ");
        m24u.append(this.f3473a);
        m24u.append(", mProviderPackage: ");
        m24u.append(this.f3474b);
        m24u.append(", mQuery: ");
        m24u.append(this.f3475c);
        m24u.append(", mCertificates:");
        sb.append(m24u.toString());
        for (int i2 = 0; i2 < this.f3476d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f3476d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        return C0000a.m20q(sb, "}", "mCertificatesArray: 0");
    }
}
