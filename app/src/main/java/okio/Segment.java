package okio;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Segment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lokio/Segment;", "", "Companion", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Segment {

    /* renamed from: a */
    @JvmField
    @NotNull
    public final byte[] f68793a;

    /* renamed from: b */
    @JvmField
    public int f68794b;

    /* renamed from: c */
    @JvmField
    public int f68795c;

    /* renamed from: d */
    @JvmField
    public boolean f68796d;

    /* renamed from: e */
    @JvmField
    public boolean f68797e;

    /* renamed from: f */
    @JvmField
    @Nullable
    public Segment f68798f;

    /* renamed from: g */
    @JvmField
    @Nullable
    public Segment f68799g;

    /* compiled from: Segment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lokio/Segment$Companion;", "", "", "SHARE_MINIMUM", "I", "SIZE", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    public Segment() {
        this.f68793a = new byte[RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST];
        this.f68797e = true;
        this.f68796d = false;
    }

    @Nullable
    /* renamed from: a */
    public final Segment m34613a() {
        Segment segment = this.f68798f;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.f68799g;
        Intrinsics.m32176e(segment2);
        segment2.f68798f = this.f68798f;
        Segment segment3 = this.f68798f;
        Intrinsics.m32176e(segment3);
        segment3.f68799g = this.f68799g;
        this.f68798f = null;
        this.f68799g = null;
        return segment;
    }

    @NotNull
    /* renamed from: b */
    public final Segment m34614b(@NotNull Segment segment) {
        segment.f68799g = this;
        segment.f68798f = this.f68798f;
        Segment segment2 = this.f68798f;
        Intrinsics.m32176e(segment2);
        segment2.f68799g = segment;
        this.f68798f = segment;
        return segment;
    }

    @NotNull
    /* renamed from: c */
    public final Segment m34615c() {
        this.f68796d = true;
        return new Segment(this.f68793a, this.f68794b, this.f68795c, true, false);
    }

    /* renamed from: d */
    public final void m34616d(@NotNull Segment segment, int i2) {
        if (!segment.f68797e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i3 = segment.f68795c;
        int i4 = i3 + i2;
        if (i4 > 8192) {
            if (segment.f68796d) {
                throw new IllegalArgumentException();
            }
            int i5 = segment.f68794b;
            if (i4 - i5 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = segment.f68793a;
            ArraysKt.m31969s(bArr, bArr, 0, i5, i3, 2, null);
            segment.f68795c -= segment.f68794b;
            segment.f68794b = 0;
        }
        byte[] bArr2 = this.f68793a;
        byte[] bArr3 = segment.f68793a;
        int i6 = segment.f68795c;
        int i7 = this.f68794b;
        ArraysKt.m31967q(bArr2, bArr3, i6, i7, i7 + i2);
        segment.f68795c += i2;
        this.f68794b += i2;
    }

    public Segment(@NotNull byte[] data, int i2, int i3, boolean z, boolean z2) {
        Intrinsics.m32179h(data, "data");
        this.f68793a = data;
        this.f68794b = i2;
        this.f68795c = i3;
        this.f68796d = z;
        this.f68797e = z2;
    }
}
