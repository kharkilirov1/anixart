package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class ProgramInformation {

    /* renamed from: a */
    @Nullable
    public final String f12965a;

    /* renamed from: b */
    @Nullable
    public final String f12966b;

    /* renamed from: c */
    @Nullable
    public final String f12967c;

    /* renamed from: d */
    @Nullable
    public final String f12968d;

    /* renamed from: e */
    @Nullable
    public final String f12969e;

    public ProgramInformation(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f12965a = str;
        this.f12966b = str2;
        this.f12967c = str3;
        this.f12968d = str4;
        this.f12969e = str5;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramInformation)) {
            return false;
        }
        ProgramInformation programInformation = (ProgramInformation) obj;
        return Util.m7728a(this.f12965a, programInformation.f12965a) && Util.m7728a(this.f12966b, programInformation.f12966b) && Util.m7728a(this.f12967c, programInformation.f12967c) && Util.m7728a(this.f12968d, programInformation.f12968d) && Util.m7728a(this.f12969e, programInformation.f12969e);
    }

    public int hashCode() {
        String str = this.f12965a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12966b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12967c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f12968d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f12969e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
