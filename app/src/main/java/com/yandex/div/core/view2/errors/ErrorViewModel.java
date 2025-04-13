package com.yandex.div.core.view2.errors;

import androidx.room.util.C0576a;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ErrorViewModel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/errors/ErrorViewModel;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final /* data */ class ErrorViewModel {

    /* renamed from: a */
    public final boolean f32901a;

    /* renamed from: b */
    public final int f32902b;

    /* renamed from: c */
    public final int f32903c;

    /* renamed from: d */
    @NotNull
    public final String f32904d;

    /* renamed from: e */
    @NotNull
    public final String f32905e;

    public ErrorViewModel() {
        this(false, 0, 0, null, null, 31);
    }

    public ErrorViewModel(boolean z, int i2, int i3, @NotNull String errorDetails, @NotNull String warningDetails) {
        Intrinsics.m32179h(errorDetails, "errorDetails");
        Intrinsics.m32179h(warningDetails, "warningDetails");
        this.f32901a = z;
        this.f32902b = i2;
        this.f32903c = i3;
        this.f32904d = errorDetails;
        this.f32905e = warningDetails;
    }

    /* renamed from: a */
    public static ErrorViewModel m17118a(ErrorViewModel errorViewModel, boolean z, int i2, int i3, String str, String str2, int i4) {
        if ((i4 & 1) != 0) {
            z = errorViewModel.f32901a;
        }
        boolean z2 = z;
        if ((i4 & 2) != 0) {
            i2 = errorViewModel.f32902b;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = errorViewModel.f32903c;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            str = errorViewModel.f32904d;
        }
        String errorDetails = str;
        if ((i4 & 16) != 0) {
            str2 = errorViewModel.f32905e;
        }
        String warningDetails = str2;
        Objects.requireNonNull(errorViewModel);
        Intrinsics.m32179h(errorDetails, "errorDetails");
        Intrinsics.m32179h(warningDetails, "warningDetails");
        return new ErrorViewModel(z2, i5, i6, errorDetails, warningDetails);
    }

    @NotNull
    /* renamed from: b */
    public final String m17119b() {
        int i2 = this.f32902b;
        if (i2 <= 0 || this.f32903c <= 0) {
            int i3 = this.f32903c;
            return i3 > 0 ? String.valueOf(i3) : i2 > 0 ? String.valueOf(i2) : "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32902b);
        sb.append(JsonPointer.SEPARATOR);
        sb.append(this.f32903c);
        return sb.toString();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorViewModel)) {
            return false;
        }
        ErrorViewModel errorViewModel = (ErrorViewModel) obj;
        return this.f32901a == errorViewModel.f32901a && this.f32902b == errorViewModel.f32902b && this.f32903c == errorViewModel.f32903c && Intrinsics.m32174c(this.f32904d, errorViewModel.f32904d) && Intrinsics.m32174c(this.f32905e, errorViewModel.f32905e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.f32901a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.f32905e.hashCode() + C0576a.m4107f(this.f32904d, ((((r0 * 31) + this.f32902b) * 31) + this.f32903c) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ErrorViewModel(showDetails=");
        m24u.append(this.f32901a);
        m24u.append(", errorCount=");
        m24u.append(this.f32902b);
        m24u.append(", warningCount=");
        m24u.append(this.f32903c);
        m24u.append(", errorDetails=");
        m24u.append(this.f32904d);
        m24u.append(", warningDetails=");
        return C0576a.m4118q(m24u, this.f32905e, ')');
    }

    public /* synthetic */ ErrorViewModel(boolean z, int i2, int i3, String str, String str2, int i4) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? "" : null, (i4 & 16) != 0 ? "" : null);
    }
}
