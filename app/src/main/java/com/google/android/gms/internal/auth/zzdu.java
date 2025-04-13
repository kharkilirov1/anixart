package com.google.android.gms.internal.auth;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzdu implements Comparator<zzeb> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzeb zzebVar, zzeb zzebVar2) {
        int i2;
        zzeb zzebVar3 = zzebVar;
        zzeb zzebVar4 = zzebVar2;
        zzds zzdsVar = new zzds(zzebVar3);
        zzds zzdsVar2 = new zzds(zzebVar4);
        do {
            int i3 = 1;
            i2 = -1;
            if (!zzdsVar.hasNext() || !zzdsVar2.hasNext()) {
                int mo8371d = zzebVar3.mo8371d();
                int mo8371d2 = zzebVar4.mo8371d();
                if (mo8371d == mo8371d2) {
                    i3 = 0;
                } else if (mo8371d < mo8371d2) {
                    return -1;
                }
                return i3;
            }
            int m8368a = zzdsVar.m8368a() & 255;
            int m8368a2 = zzdsVar2.m8368a() & 255;
            if (m8368a == m8368a2) {
                i3 = 0;
            } else if (m8368a < m8368a2) {
            }
            i2 = i3;
        } while (i2 == 0);
        return i2;
    }
}
