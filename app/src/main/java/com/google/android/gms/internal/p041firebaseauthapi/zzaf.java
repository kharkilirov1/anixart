package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzaf {

    /* renamed from: a */
    public final zzae f16380a;

    public zzaf(zzae zzaeVar) {
        this.f16380a = zzaeVar;
    }

    /* renamed from: a */
    public static zzaf m8812a(char c2) {
        return new zzaf(new zzaa(new zzk()));
    }

    /* renamed from: b */
    public static zzaf m8813b(String str) {
        int i2 = zzx.f16988a;
        zzt zztVar = new zzt(Pattern.compile("[.-]"));
        if (!new zzs(zztVar.f16811b.matcher("")).f16799a.matches()) {
            return new zzaf(new zzac(zztVar));
        }
        throw new IllegalArgumentException(zzag.m8815a("The pattern may not match the empty string: %s", zztVar));
    }

    /* renamed from: c */
    public final List m8814c(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Iterator mo8570a = this.f16380a.mo8570a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (mo8570a.hasNext()) {
            arrayList.add((String) mo8570a.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
