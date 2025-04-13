package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import java.io.InputStream;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzce extends zzdg {

    /* renamed from: c */
    public final int f19817c;

    /* renamed from: d */
    public final long f19818d;

    /* renamed from: e */
    public final String f19819e;

    /* renamed from: f */
    public final String f19820f;

    /* renamed from: g */
    public final int f19821g;

    /* renamed from: h */
    public final int f19822h;

    /* renamed from: i */
    public final int f19823i;

    /* renamed from: j */
    public final long f19824j;

    /* renamed from: k */
    @AssetPackStatus
    public final int f19825k;

    /* renamed from: l */
    public final InputStream f19826l;

    public zzce(int i2, String str, int i3, long j2, String str2, String str3, int i4, int i5, int i6, long j3, @AssetPackStatus int i7, InputStream inputStream) {
        super(i2, str);
        this.f19817c = i3;
        this.f19818d = j2;
        this.f19819e = str2;
        this.f19820f = str3;
        this.f19821g = i4;
        this.f19822h = i5;
        this.f19823i = i6;
        this.f19824j = j3;
        this.f19825k = i7;
        this.f19826l = inputStream;
    }

    /* renamed from: a */
    public final boolean m10769a() {
        return this.f19822h + 1 == this.f19823i;
    }
}
