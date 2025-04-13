package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzfc extends zzfe {

    /* renamed from: c */
    public static final Class<?> f16110c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public zzfc() {
    }

    public /* synthetic */ zzfc(zzfb zzfbVar) {
    }

    @Override // com.google.android.gms.internal.auth.zzfe
    /* renamed from: a */
    public final void mo8422a(Object obj, long j2) {
        Object unmodifiableList;
        List list = (List) zzgz.m8513f(obj, j2);
        if (list instanceof zzfa) {
            unmodifiableList = ((zzfa) list).mo8421j();
        } else {
            if (f16110c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzfx) && (list instanceof zzeu)) {
                zzeu zzeuVar = (zzeu) list;
                if (zzeuVar.mo8347v()) {
                    zzeuVar.mo8348w();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzgz.f16181c.m8507o(obj, j2, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzfe
    /* renamed from: b */
    public final <E> void mo8423b(Object obj, Object obj2, long j2) {
        zzez zzezVar;
        List list = (List) zzgz.m8513f(obj2, j2);
        int size = list.size();
        List list2 = (List) zzgz.m8513f(obj, j2);
        if (list2.isEmpty()) {
            list2 = list2 instanceof zzfa ? new zzez(size) : ((list2 instanceof zzfx) && (list2 instanceof zzeu)) ? ((zzeu) list2).mo8364c(size) : new ArrayList(size);
            zzgz.f16181c.m8507o(obj, j2, list2);
        } else {
            if (f16110c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzgz.f16181c.m8507o(obj, j2, arrayList);
                zzezVar = arrayList;
            } else if (list2 instanceof zzgu) {
                zzez zzezVar2 = new zzez(list2.size() + size);
                zzezVar2.addAll(zzezVar2.size(), (zzgu) list2);
                zzgz.f16181c.m8507o(obj, j2, zzezVar2);
                zzezVar = zzezVar2;
            } else if ((list2 instanceof zzfx) && (list2 instanceof zzeu)) {
                zzeu zzeuVar = (zzeu) list2;
                if (!zzeuVar.mo8347v()) {
                    list2 = zzeuVar.mo8364c(list2.size() + size);
                    zzgz.f16181c.m8507o(obj, j2, list2);
                }
            }
            list2 = zzezVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzgz.f16181c.m8507o(obj, j2, list);
    }
}
