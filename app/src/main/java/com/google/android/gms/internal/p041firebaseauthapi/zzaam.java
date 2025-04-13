package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzaam extends zzaaq {

    /* renamed from: c */
    public static final Class f16278c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public zzaam() {
    }

    public /* synthetic */ zzaam(zzaal zzaalVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static List m8594d(Object obj, long j2, int i2) {
        zzaaj zzaajVar;
        List list = (List) zzacp.m8790j(obj, j2);
        if (list.isEmpty()) {
            List zzaajVar2 = list instanceof zzaak ? new zzaaj(i2) : ((list instanceof zzabj) && (list instanceof zzaac)) ? ((zzaac) list).mo8572c(i2) : new ArrayList(i2);
            zzacp.f16357c.m8780p(obj, j2, zzaajVar2);
            return zzaajVar2;
        }
        if (f16278c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i2);
            arrayList.addAll(list);
            zzacp.f16357c.m8780p(obj, j2, arrayList);
            zzaajVar = arrayList;
        } else {
            if (!(list instanceof zzack)) {
                if (!(list instanceof zzabj) || !(list instanceof zzaac)) {
                    return list;
                }
                zzaac zzaacVar = (zzaac) list;
                if (zzaacVar.mo8573v()) {
                    return list;
                }
                zzaac mo8572c = zzaacVar.mo8572c(list.size() + i2);
                zzacp.f16357c.m8780p(obj, j2, mo8572c);
                return mo8572c;
            }
            zzaaj zzaajVar3 = new zzaaj(list.size() + i2);
            zzaajVar3.addAll(zzaajVar3.size(), (zzack) list);
            zzacp.f16357c.m8780p(obj, j2, zzaajVar3);
            zzaajVar = zzaajVar3;
        }
        return zzaajVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaaq
    /* renamed from: a */
    public final List mo8595a(Object obj, long j2) {
        return m8594d(obj, j2, 10);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaaq
    /* renamed from: b */
    public final void mo8596b(Object obj, long j2) {
        Object unmodifiableList;
        List list = (List) zzacp.m8790j(obj, j2);
        if (list instanceof zzaak) {
            unmodifiableList = ((zzaak) list).mo8592j();
        } else {
            if (f16278c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzabj) && (list instanceof zzaac)) {
                zzaac zzaacVar = (zzaac) list;
                if (zzaacVar.mo8573v()) {
                    zzaacVar.mo8574w();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzacp.f16357c.m8780p(obj, j2, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaaq
    /* renamed from: c */
    public final void mo8597c(Object obj, Object obj2, long j2) {
        List list = (List) zzacp.m8790j(obj2, j2);
        List m8594d = m8594d(obj, j2, list.size());
        int size = m8594d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            m8594d.addAll(list);
        }
        if (size > 0) {
            list = m8594d;
        }
        zzacp.f16357c.m8780p(obj, j2, list);
    }
}
