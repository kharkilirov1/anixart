package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class CCTDestination implements EncodedDestination {

    /* renamed from: c */
    public static final String f8955c = StringMerger.m5408a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d */
    public static final Set<Encoding> f8956d;

    /* renamed from: e */
    public static final CCTDestination f8957e;

    /* renamed from: a */
    @NonNull
    public final String f8958a;

    /* renamed from: b */
    @Nullable
    public final String f8959b;

    static {
        String m5408a = StringMerger.m5408a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String m5408a2 = StringMerger.m5408a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f8956d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Encoding("proto"), new Encoding("json"))));
        f8957e = new CCTDestination(m5408a, m5408a2);
    }

    public CCTDestination(@NonNull String str, @Nullable String str2) {
        this.f8958a = str;
        this.f8959b = str2;
    }

    @NonNull
    /* renamed from: b */
    public static CCTDestination m5402b(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new CCTDestination(str2, str3);
    }

    @Override // com.google.android.datatransport.runtime.EncodedDestination
    /* renamed from: a */
    public Set<Encoding> mo5403a() {
        return f8956d;
    }

    @Nullable
    /* renamed from: c */
    public byte[] m5404c() {
        String str = this.f8959b;
        if (str == null && this.f8958a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f8958a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
