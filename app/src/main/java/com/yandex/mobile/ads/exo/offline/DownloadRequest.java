package com.yandex.mobile.ads.exo.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.C5220ia;
import com.yandex.mobile.ads.impl.s91;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new C4773a();

    /* renamed from: a */
    public final String f48179a;

    /* renamed from: b */
    public final Uri f48180b;

    /* renamed from: c */
    @Nullable
    public final String f48181c;

    /* renamed from: d */
    public final List<StreamKey> f48182d;

    /* renamed from: e */
    @Nullable
    public final byte[] f48183e;

    /* renamed from: f */
    @Nullable
    public final String f48184f;

    /* renamed from: g */
    public final byte[] f48185g;

    /* renamed from: com.yandex.mobile.ads.exo.offline.DownloadRequest$a */
    public class C4773a implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        public final DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadRequest[] newArray(int i2) {
            return new DownloadRequest[i2];
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.offline.DownloadRequest$b */
    public static class C4774b {

        /* renamed from: a */
        private final String f48186a;

        /* renamed from: b */
        private final Uri f48187b;

        /* renamed from: c */
        @Nullable
        private String f48188c;

        /* renamed from: d */
        @Nullable
        private List<StreamKey> f48189d;

        /* renamed from: e */
        @Nullable
        private byte[] f48190e;

        /* renamed from: f */
        @Nullable
        private String f48191f;

        /* renamed from: g */
        @Nullable
        private byte[] f48192g;

        public C4774b(Uri uri, String str) {
            this.f48186a = str;
            this.f48187b = uri;
        }

        /* renamed from: a */
        public final C4774b m22270a(@Nullable ArrayList arrayList) {
            this.f48189d = arrayList;
            return this;
        }

        /* renamed from: b */
        public final C4774b m22273b(@Nullable String str) {
            this.f48188c = str;
            return this;
        }

        /* renamed from: a */
        public final C4774b m22269a(@Nullable String str) {
            this.f48191f = str;
            return this;
        }

        /* renamed from: b */
        public final C4774b m22274b(@Nullable byte[] bArr) {
            this.f48190e = bArr;
            return this;
        }

        /* renamed from: a */
        public final C4774b m22271a(@Nullable byte[] bArr) {
            this.f48192g = bArr;
            return this;
        }

        /* renamed from: a */
        public final DownloadRequest m22272a() {
            String str = this.f48186a;
            Uri uri = this.f48187b;
            String str2 = this.f48188c;
            List list = this.f48189d;
            if (list == null) {
                list = AbstractC4698p.m22055i();
            }
            return new DownloadRequest(str, uri, str2, list, this.f48190e, this.f48191f, this.f48192g, 0);
        }
    }

    public /* synthetic */ DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, int i2) {
        this(str, uri, str2, list, bArr, str3, bArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* renamed from: a */
    public final DownloadRequest m22268a(DownloadRequest downloadRequest) {
        List emptyList;
        C5220ia.m25473a(this.f48179a.equals(downloadRequest.f48179a));
        if (this.f48182d.isEmpty() || downloadRequest.f48182d.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = new ArrayList(this.f48182d);
            for (int i2 = 0; i2 < downloadRequest.f48182d.size(); i2++) {
                StreamKey streamKey = downloadRequest.f48182d.get(i2);
                if (!emptyList.contains(streamKey)) {
                    emptyList.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.f48179a, downloadRequest.f48180b, downloadRequest.f48181c, emptyList, downloadRequest.f48183e, downloadRequest.f48184f, downloadRequest.f48185g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f48179a.equals(downloadRequest.f48179a) && this.f48180b.equals(downloadRequest.f48180b) && s91.m28112a(this.f48181c, downloadRequest.f48181c) && this.f48182d.equals(downloadRequest.f48182d) && Arrays.equals(this.f48183e, downloadRequest.f48183e) && s91.m28112a(this.f48184f, downloadRequest.f48184f) && Arrays.equals(this.f48185g, downloadRequest.f48185g);
    }

    public final int hashCode() {
        int hashCode = (this.f48180b.hashCode() + (this.f48179a.hashCode() * 31 * 31)) * 31;
        String str = this.f48181c;
        int hashCode2 = (Arrays.hashCode(this.f48183e) + ((this.f48182d.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f48184f;
        return Arrays.hashCode(this.f48185g) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f48181c + ":" + this.f48179a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f48179a);
        parcel.writeString(this.f48180b.toString());
        parcel.writeString(this.f48181c);
        parcel.writeInt(this.f48182d.size());
        for (int i3 = 0; i3 < this.f48182d.size(); i3++) {
            parcel.writeParcelable(this.f48182d.get(i3), 0);
        }
        parcel.writeByteArray(this.f48183e);
        parcel.writeString(this.f48184f);
        parcel.writeByteArray(this.f48185g);
    }

    private DownloadRequest(String str, Uri uri, @Nullable String str2, List<StreamKey> list, @Nullable byte[] bArr, @Nullable String str3, @Nullable byte[] bArr2) {
        int m28091a = s91.m28091a(uri, str2);
        if (m28091a == 0 || m28091a == 2 || m28091a == 1) {
            C5220ia.m25472a("customCacheKey must be null for type: " + m28091a, str3 == null);
        }
        this.f48179a = str;
        this.f48180b = uri;
        this.f48181c = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f48182d = Collections.unmodifiableList(arrayList);
        this.f48183e = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f48184f = str3;
        this.f48185g = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : s91.f54535f;
    }

    public DownloadRequest(Parcel parcel) {
        this.f48179a = (String) s91.m28101a(parcel.readString());
        this.f48180b = Uri.parse((String) s91.m28101a(parcel.readString()));
        this.f48181c = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f48182d = Collections.unmodifiableList(arrayList);
        this.f48183e = parcel.createByteArray();
        this.f48184f = parcel.readString();
        this.f48185g = (byte[]) s91.m28101a(parcel.createByteArray());
    }
}
